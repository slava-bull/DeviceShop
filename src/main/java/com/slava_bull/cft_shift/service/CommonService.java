package com.slava_bull.cft_shift.service;

import java.util.List;

public interface CommonService<T> {
    T save(T item);

    T edit(long id, T item);

    List<T> findAll();

    T getById(long id);
}
