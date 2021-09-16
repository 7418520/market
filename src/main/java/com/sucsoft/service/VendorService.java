package com.sucsoft.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sucsoft.mapper.StallDao;
import com.sucsoft.mapper.VendorDao;
import com.sucsoft.po.Stall;
import com.sucsoft.po.Vendor;
import com.sucsoft.vo.VendorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Service
public class VendorService extends ServiceImpl<VendorDao, Vendor> {
    /**
     * 增加摊位的摊主信息
     * @param vendorVO
     * @throws Exception
     */
    @Autowired
    private StallDao stallDao;
   public void addVendor( VendorVO vendorVO) throws Exception {
       //摊主的图片
        if (vendorVO.getPhoto() != null) {
            writeFile(vendorVO.getMarketId(), vendorVO.getStallId(), "photo.", vendorVO.getPhoto());
        }
        //营业执照
        if (vendorVO.getBusinessCertificate() != null) {
            writeFile(vendorVO.getMarketId(), vendorVO.getStallId(), "businessCertificate.", vendorVO.getBusinessCertificate());
        }
        //合同附则
        if (vendorVO.getContract() != null) {
            writeFile(vendorVO.getMarketId(), vendorVO.getStallId(), "contract.", vendorVO.getContract());
        }
        //将摊主信息写入数据库
        Vendor vendor = new Vendor(vendorVO.getId(),vendorVO.getName(),vendorVO.getTelphone(),vendorVO.getSigning(),
                vendorVO.getExpire(),vendorVO.getRental(),vendorVO.getMode(),vendorVO.getChargingTime(), vendorVO.getShunt(), vendorVO.getBank(), vendorVO.getCardNo(),
                vendorVO.getMarketId(), vendorVO.getStallId());
       Stall stall = stallDao.selectById(2);
       stall.setStatu("已租");
       stallDao.updateById(stall);
       save(vendor);
    }

    /**
     * 上传图片
     * @param marketId
     * @param stallId
     * @param type
     * @param photo
     */
    public void writeFile(int marketId, int stallId, String type, MultipartFile photo) {
        //拼接路径和文件名
        String path = "D:\\SpringMVC\\market\\src\\main\\resources\\images\\";
        String[] split = photo.getContentType().split("/");
        String photoPath = path + marketId + stallId + type + split[1];
        File file = new File(photoPath);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(photoPath);
            fileOutputStream.write(photo.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
