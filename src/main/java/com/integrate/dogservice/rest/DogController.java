package com.integrate.dogservice.rest;

public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService){
        this.dogService = dogService;
    }

    public Dog createDog(Dog dogPassedIn) {
        return this.dogService.createDog(dogPassedIn);
    }
}
