package com.slava_bull.cft_shift.service.impl;

import com.slava_bull.cft_shift.dao.HardDiskDao;
import com.slava_bull.cft_shift.model.HardDisk;
import com.slava_bull.cft_shift.service.DeviceService;
import org.springframework.stereotype.Service;

@Service
public class HardDiskService
        extends DeviceService<HardDisk, HardDiskDao> {
    protected HardDiskService(HardDiskDao repository) {
        super(repository);
    }
}
