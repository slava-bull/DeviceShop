package com.slava_bull.cft_shift.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "desktop_computers")
public final class DesktopComputer extends DeviceEntity {

    @NotNull(message = "Enter form factor of computer (DESKTOP | NETTOP | MONOBLOCK)")
    @Column(name = "form_factor")
    @Enumerated(EnumType.STRING)
    private DesktopComputerFromFactor formFactor;
}
