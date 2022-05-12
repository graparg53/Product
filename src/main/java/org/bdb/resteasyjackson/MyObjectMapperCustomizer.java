package org.bdb.resteasyjackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.jackson.ObjectMapperCustomizer;

import javax.inject.Singleton;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Singleton
public class MyObjectMapperCustomizer  implements ObjectMapperCustomizer {

    @Override
    public void customize(ObjectMapper objectMapper){
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }
}
