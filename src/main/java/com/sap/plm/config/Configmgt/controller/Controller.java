package com.sap.plm.config.Configmgt.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.sap.plm.config.Configmgt.dto.Materialinfo;
import com.sap.plm.config.Configmgt.service.Materialservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Materialservice materialservice;

    @PostMapping(value = "/material", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Materialinfo requestMaterial(@RequestParam(required = true, value = "matInfo") String matInfo) throws JsonProcessingException {

        Materialinfo materialinfo;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        materialinfo = objectMapper.readValue(matInfo, Materialinfo.class);

        materialservice.upload(materialinfo);
        return materialinfo;
    }

    @GetMapping(value = "/get")
    public void printer() {
        System.out.println("hello");

    }


}
