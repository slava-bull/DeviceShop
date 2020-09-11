package com.slava_bull.cft_shift.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "hard_disks")
public final class HardDisk extends DeviceEntity {

    @Column(name = "capacity_gb")
    private int capacity;
}
