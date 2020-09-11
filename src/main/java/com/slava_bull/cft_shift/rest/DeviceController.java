package com.slava_bull.cft_shift.rest;

import com.slava_bull.cft_shift.exception.BadRequestException;
import com.slava_bull.cft_shift.model.DeviceEntity;
import com.slava_bull.cft_shift.service.CommonService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.List;

public abstract class DeviceController
        <D extends DeviceEntity, S extends CommonService<D>>
        extends ErrorController implements CommonController<D> {

    private final S service;

    protected DeviceController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<D> save(D item, BindingResult bindingResult) throws BadRequestException {
        handleErrors(bindingResult);
        return ResponseEntity.ok(service.save(item));
    }

    @Override
    public ResponseEntity<D> edit(long id, D item, BindingResult bindingResult) throws BadRequestException {
        handleErrors(bindingResult);
        return ResponseEntity.ok(service.edit(id, item));
    }

    @Override
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    public ResponseEntity<D> getById(long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    protected void handleErrors(BindingResult bindingResult) throws BadRequestException {
        if (bindingResult != null && bindingResult.hasErrors())
            throw new BadRequestException(bindingResult);
    }
}
