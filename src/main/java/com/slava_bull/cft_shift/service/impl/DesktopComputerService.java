package com.slava_bull.cft_shift.service.impl;

import com.slava_bull.cft_shift.dao.DesktopComputerDao;
import com.slava_bull.cft_shift.model.DesktopComputer;
import com.slava_bull.cft_shift.service.DeviceService;
import org.springframework.stereotype.Service;

@Service
public class DesktopComputerService
        extends DeviceService<DesktopComputer, DesktopComputerDao> {
    protected DesktopComputerService(DesktopComputerDao repository) {
        super(repository);
    }
}
