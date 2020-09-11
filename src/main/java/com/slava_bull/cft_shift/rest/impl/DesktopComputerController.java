package com.slava_bull.cft_shift.rest.impl;

import com.slava_bull.cft_shift.model.DesktopComputer;
import com.slava_bull.cft_shift.rest.DeviceController;
import com.slava_bull.cft_shift.service.impl.DesktopComputerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desktop")
public class DesktopComputerController
        extends DeviceController<DesktopComputer, DesktopComputerService> {
    protected DesktopComputerController(DesktopComputerService service) {
        super(service);
    }
}
