package com.slava_bull.cft_shift.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class DeviceEntity {

    @Id
    protected long id;

    @Column(name = "batch_number")
    protected String batchNumber;

    @Column(name = "manufacturer")
    protected String manufacturer;

    @Column(name = "price")
    protected int price;

    @Column(name = "count_in_stock")
    protected int countInStock;
}
