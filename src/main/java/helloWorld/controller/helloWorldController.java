package helloWorld.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import helloWorld.models.Response;

@RestController
public class helloWorldController {

    @RequestMapping(value = "helloWorld", method = RequestMethod.GET)
    public ResponseEntity<Response<String, Error>> getStatus() {
        final Response<String, Error> response =  new Response<>("ok", null);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
