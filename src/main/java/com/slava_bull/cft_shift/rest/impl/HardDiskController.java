package com.slava_bull.cft_shift.rest.impl;

import com.slava_bull.cft_shift.model.HardDisk;
import com.slava_bull.cft_shift.rest.DeviceController;
import com.slava_bull.cft_shift.service.impl.HardDiskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disk")
public class HardDiskController
        extends DeviceController<HardDisk, HardDiskService> {
    protected HardDiskController(HardDiskService service) {
        super(service);
    }
}
