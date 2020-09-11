package com.slava_bull.cft_shift.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "laptops")
public final class Laptop extends DeviceEntity {

    @Column(name = "size")
    private double size;
}
