package com.example.soap_foolball;


import io.spring.guides.gs_producing_web_service.Foolball;
import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.UssdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class EndPoint {


    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private FoolballRepository foolballRepository;

    @Autowired
    public EndPoint(FoolballRepository foolballRepository) {
        this.foolballRepository = foolballRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public UssdResponse getCountry(@RequestPayload GetCountryRequest request) {

       UssdResponse response = new UssdResponse();
       /* response.setFoolballs(foolballRepository.findFoolball(request.getName()));


        Foolball code0= new Foolball();
        code0.setFoolball("match0");

        code0.setValue("code0");

        Foolball code1= new Foolball();
        code1.setFoolball("match1");

        code1.setValue("code1");

        Foolball code2= new Foolball();
        code2.setFoolball("match2");

        code2.setValue("code2");

        List<Foolball> foolballList = response.getFoolballs();//
        foolballList.add(code0);
        foolballList.add(code1);
        foolballList.add(code2);*/

        if (request.getName().equals("all"))
        {return foolballRepository.getResponse();}
        else {
            response.setReturn("Your request is wrong ;;");
            return response;
        }
    }
}
