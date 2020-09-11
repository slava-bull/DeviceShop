package com.slava_bull.cft_shift.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = "hard_disks")
public final class HardDisk extends DeviceEntity {

    @Min(value = 0, message = "Enter positive capacity of hard disk")
    @Column(name = "capacity_gb")
    private int capacity;
}
