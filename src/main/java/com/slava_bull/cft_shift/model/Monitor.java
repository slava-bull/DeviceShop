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
@Table(name = "monitors")
public final class Monitor extends DeviceEntity {

    @Min(value = 0, message = "Enter diagonal of screen")
    @Column(name = "diagonal")
    private double diagonal;
}
