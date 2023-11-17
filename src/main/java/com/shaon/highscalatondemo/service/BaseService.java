package com.shaon.highscalatondemo.service;

import java.util.List;

public interface BaseService <T>{

    T getById(String id);

    List<T> findAll();

    T save(T t);
    void delete(T t);
}
