package com.slava_bull.cft_shift.rest;

import com.slava_bull.cft_shift.exception.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface CommonController<T> {

    @PostMapping
    ResponseEntity<T> save(@RequestBody @Valid T item, BindingResult bindingResult) throws BadRequestException;

    @PutMapping("/{id}")
    ResponseEntity<T> edit(@PathVariable("id") long id, @RequestBody @Valid T item, BindingResult bindingResult) throws BadRequestException;

    @GetMapping("/list")
    ResponseEntity<List<T>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<T> getById(@PathVariable("id") long id);
}
