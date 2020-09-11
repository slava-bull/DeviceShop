package com.slava_bull.cft_shift.rest.impl;

import com.slava_bull.cft_shift.model.Monitor;
import com.slava_bull.cft_shift.rest.DeviceController;
import com.slava_bull.cft_shift.service.impl.MonitorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
public class MonitorController
        extends DeviceController<Monitor, MonitorService> {
    protected MonitorController(MonitorService service) {
        super(service);
    }
}
