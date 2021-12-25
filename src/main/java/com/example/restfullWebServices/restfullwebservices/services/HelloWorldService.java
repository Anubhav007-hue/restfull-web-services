package com.example.restfullWebServices.restfullwebservices.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

  public ResponseEntity<?> getHelloWorld(String answer) {
    if (answer.equalsIgnoreCase("print")) {
      return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
    return new ResponseEntity<>("Something Went Wrong", HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
