package com.slava_bull.cft_shift.dao;

import com.slava_bull.cft_shift.model.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DeviceDao<E extends DeviceEntity> extends JpaRepository<E, Long> {
}