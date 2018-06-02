package com.integrate.dogservice.rest;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogControllerTest {

    @Test
    public void createDog_usesServiceToCreateDog(){

        DogController dogController = new DogController();
        Dog dog = dogController.createDog();


    }

}