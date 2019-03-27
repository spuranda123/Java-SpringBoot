package helloWorld.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import helloWorld.models.Greeting.GreetingUser;

@RestController
public class helloUserController {

    Random random = new Random();

    String helloString = "Hello, %s!";

    @RequestMapping("/greeting")
    public GreetingUser getGreeting(@RequestParam(value = "user", defaultValue = "user") String user){
        return new GreetingUser(random.nextInt(), String.format(helloString, user));
    }
}
