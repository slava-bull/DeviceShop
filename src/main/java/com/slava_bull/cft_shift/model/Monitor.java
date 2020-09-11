package com.slava_bull.cft_shift.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "monitors")
public final class Monitor extends DeviceEntity {

    @Column(name = "diagonal")
    private double diagonal;
}
