package guru.springframework.demo.controllers;

import guru.springframework.demo.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }
}
