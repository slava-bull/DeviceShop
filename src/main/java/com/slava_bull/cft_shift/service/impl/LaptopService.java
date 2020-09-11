package com.slava_bull.cft_shift.service.impl;

import com.slava_bull.cft_shift.dao.LaptopDao;
import com.slava_bull.cft_shift.model.Laptop;
import com.slava_bull.cft_shift.service.DeviceService;
import org.springframework.stereotype.Service;

@Service
public class LaptopService
        extends DeviceService<Laptop, LaptopDao> {
    protected LaptopService(LaptopDao repository) {
        super(repository);
    }
}
