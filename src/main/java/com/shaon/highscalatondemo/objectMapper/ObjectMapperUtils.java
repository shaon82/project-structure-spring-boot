package com.shaon.highscalatondemo.objectMapper;


import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;


public class ObjectMapperUtils {

    private ModelMapper modelMapper;

    public ObjectMapperUtils() {
        this.modelMapper = new ModelMapper();
    }

    public <S, D> D map(S source, Class<D> destinationType) {
        return modelMapper.map(source, destinationType);
    }

    public <S, D> void addMappings(PropertyMap<S, D> propertyMap) {
        modelMapper.addMappings(propertyMap);
    }
}
