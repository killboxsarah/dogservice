package com.integrate.dogservice.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class DogControllerTest {

    @Mock
    private DogService dogService;

    @Test
    public void createDog_usesServiceToCreateDog() {
        Dog dogPassedIn = new Dog(0, 4, "Jim", 3456);
        Dog expectedDog = new Dog(1, 14, "Kevin", 9456);
        DogController dogController = new DogController(dogService);

        when(dogService.createDog(dogPassedIn)).thenReturn(expectedDog);

        Dog dog = dogController.createDog(dogPassedIn);

        verify(dogService).createDog(dogPassedIn);

        assertEquals(expectedDog, dog);
    }

}