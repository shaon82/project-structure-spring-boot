package com.shaon.highscalatondemo.controller;

import com.shaon.highscalatondemo.model.BaseApiResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseController <T>{

    ResponseEntity<BaseApiResponseModel<T>> getById(@PathVariable String id);

    ResponseEntity<List<BaseApiResponseModel<T>>> getAll();

    ResponseEntity<BaseApiResponseModel<T>> create(@RequestBody T entity);

    ResponseEntity<BaseApiResponseModel<T>> update(@PathVariable Long id, @RequestBody T entity);

    ResponseEntity<Void> delete(@PathVariable Long id);
}
