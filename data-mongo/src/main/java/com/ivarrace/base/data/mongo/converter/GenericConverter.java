package com.ivarrace.base.data.mongo.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class GenericConverter {

    private ModelMapper modelMapper = new ModelMapper();

    public <T> T convert(Object toConvert, Class<T> toClass) {
        return modelMapper.map(toConvert, toClass);
    }
}
