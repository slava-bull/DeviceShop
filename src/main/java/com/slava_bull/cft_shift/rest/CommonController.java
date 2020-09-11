package com.slava_bull.cft_shift.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommonController<T> {

    @PostMapping
    ResponseEntity<T> save(@RequestBody T item);

    @PutMapping("/{id}")
    ResponseEntity<T> edit(@PathVariable("id") long id, @RequestBody T item);

    @GetMapping("/list")
    ResponseEntity<List<T>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<T> getById(@PathVariable("id") long id);
}
