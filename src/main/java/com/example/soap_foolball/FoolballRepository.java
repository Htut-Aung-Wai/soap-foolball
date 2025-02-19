
package com.example.soap_foolball;

import io.spring.guides.gs_producing_web_service.Foolball;
import io.spring.guides.gs_producing_web_service.UssdResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import io.spring.guides.gs_producing_web_service.Foolball;

import java.util.*;

@Component
public class FoolballRepository {


    UssdResponse response = new UssdResponse();


    @PostConstruct
    public void initData() {

        response.setReturn("0|hom nay");

        Foolball code0= new Foolball();
        code0.setFoolball("match0");

        code0.setValue("code0");

        Foolball code1= new Foolball();
        code1.setFoolball("match1");

        code1.setValue("code1");


        Foolball code2= new Foolball();
        code2.setFoolball("match2");

        code2.setValue("code2");


        Foolball code3= new Foolball();
        code3.setFoolball("match3");

        code3.setValue("code3");

        Foolball code4= new Foolball();
        code4.setFoolball("match4");

        code4.setValue("code4");

        List<Foolball> foolballList = response.getFoolballs();//
        foolballList.add(code0);
        foolballList.add(code1);
        foolballList.add(code2);
        foolballList.add(code3);
        foolballList.add(code4);


    }

    public UssdResponse getResponse() {
        return response;
    }
}

