package com.sucsoft.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sucsoft.mapper.VendorDao;
import com.sucsoft.po.Vendor;
import com.sucsoft.vo.VendorVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Service
public class VendorService extends ServiceImpl<VendorDao, Vendor> {

    public void addVendor( VendorVO vendorVO) throws Exception {
        if (vendorVO.getPhoto() != null) {
            writeFile(vendorVO.getMarketId(), vendorVO.getStallId(), "photo.", vendorVO.getPhoto());
        }
        if (vendorVO.getBusinessCertificate() != null) {
            writeFile(vendorVO.getMarketId(), vendorVO.getStallId(), "businessCertificate.", vendorVO.getBusinessCertificate());
        }
        if (vendorVO.getContract() != null) {
            writeFile(vendorVO.getMarketId(), vendorVO.getStallId(), "contract.", vendorVO.getContract());
        }
        Vendor vendor = new Vendor(vendorVO.getId(),vendorVO.getName(),vendorVO.getTelphone(),vendorVO.getSigning(),
                vendorVO.getExpire(),vendorVO.getRental(),vendorVO.getMode(),vendorVO.getChargingTime(), vendorVO.getShunt(), vendorVO.getBank(), vendorVO.getCardNo(),
                vendorVO.getMarketId(), vendorVO.getStallId());
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
