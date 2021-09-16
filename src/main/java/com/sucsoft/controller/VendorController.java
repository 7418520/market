package com.sucsoft.controller;

import com.sucsoft.service.VendorService;
import com.sucsoft.vo.VendorVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "摊主")
public class VendorController {
    @Autowired
    private VendorService vendorService;
    @PostMapping("/addVendor")
    @ApiOperation("增加摊主信息")
    private void addVendor( VendorVO vendorVO) throws Exception {
        vendorService.addVendor(vendorVO);
    }
}
