package com.example.restfullWebServices.restfullwebservices.controllers;

import com.example.restfullWebServices.restfullwebservices.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(method = RequestMethod.GET , value = "/print-hello-world")
    public ResponseEntity<?> printHelloWorld(@RequestParam String answer){
        try{
            return helloWorldService.getHelloWorld(answer);
        }catch (Exception exception){
            exception.printStackTrace();
            return new ResponseEntity<String>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
