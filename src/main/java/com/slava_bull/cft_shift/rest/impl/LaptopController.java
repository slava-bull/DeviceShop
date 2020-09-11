package com.slava_bull.cft_shift.rest.impl;

import com.slava_bull.cft_shift.model.Laptop;
import com.slava_bull.cft_shift.rest.DeviceController;
import com.slava_bull.cft_shift.service.impl.LaptopService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptop")
public class LaptopController
        extends DeviceController<Laptop, LaptopService> {
    protected LaptopController(LaptopService service) {
        super(service);
    }
}
