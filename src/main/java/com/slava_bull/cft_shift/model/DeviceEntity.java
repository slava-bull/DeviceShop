package com.slava_bull.cft_shift.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@Data
public abstract class DeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @NotBlank(message = "Enter batch number of device")
    @Column(name = "batch_number")
    protected String batchNumber;

    @NotBlank(message = "Enter manufacturer of device")
    @Column(name = "manufacturer")
    protected String manufacturer;

    @Min(value = 0, message = "Set the positive price of device")
    @Column(name = "price")
    protected int price;

    @Min(value = 0, message = "Enter the positive quantity of device in stock")
    @Column(name = "count_in_stock")
    protected int countInStock;
}
