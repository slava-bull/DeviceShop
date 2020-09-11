package com.slava_bull.cft_shift.service.impl;

import com.slava_bull.cft_shift.dao.MonitorDao;
import com.slava_bull.cft_shift.model.Monitor;
import com.slava_bull.cft_shift.service.DeviceService;
import org.springframework.stereotype.Service;

@Service
public class MonitorService
        extends DeviceService<Monitor, MonitorDao> {
    protected MonitorService(MonitorDao repository) {
        super(repository);
    }
}
