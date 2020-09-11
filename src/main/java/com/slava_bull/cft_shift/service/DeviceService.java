package com.slava_bull.cft_shift.service;

import com.slava_bull.cft_shift.dao.DeviceDao;
import com.slava_bull.cft_shift.exception.DeviceNotFoundException;
import com.slava_bull.cft_shift.model.DeviceEntity;

import java.util.List;

public abstract class DeviceService
        <D extends DeviceEntity, R extends DeviceDao<D>>
        implements CommonService<D> {
    protected final R repository;

    protected DeviceService(R repository) {
        this.repository = repository;
    }

    @Override
    public D save(D item) {
        return repository.save(item);
    }

    @Override
    public D edit(long id, D item) {
        item.setId(id);
        return save(item);
    }

    @Override
    public List<D> findAll() {
        return repository.findAll();
    }

    @Override
    public D getById(long id) {
        return repository.findById(id).orElseThrow(DeviceNotFoundException::new);
    }
}
