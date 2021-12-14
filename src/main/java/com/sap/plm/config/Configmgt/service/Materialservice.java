package com.sap.plm.config.Configmgt.service;

import com.google.gson.GsonBuilder;
import com.sap.plm.config.Configmgt.dto.Materialinfo;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

@Service
public class Materialservice {

    public void upload(Materialinfo materialinfo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(materialinfo);
        System.out.println(json);


    }
}
