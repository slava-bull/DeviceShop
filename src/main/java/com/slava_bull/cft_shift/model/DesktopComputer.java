package com.slava_bull.cft_shift.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "desktop_computers")
public final class DesktopComputer extends DeviceEntity {

    @Column(name = "form_factor")
    @Enumerated(EnumType.STRING)
    private DesktopComputerFromFactor formFactor;
}
