package org.example.week1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person adult;
    private Person child;
    private List<Person> personList;

    @BeforeEach
    void setUp() {
        adult = new Person(25);
        child = new Person(13);

         personList = new ArrayList<>(Arrays.asList(
                new Person(24),
                new Person(26),
                new Person(21),
                new Person(18),
                new Person(19)
        ));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Completed tests.");
    }

    @Order(2)
    @Test
    void checkIfPersonIsAdult() {
        assertTrue(adult.isAdult(), "The person is an adult.");
    }

    @Test
    void checkIfEveryPersonFromArrayIsAdult() {
        boolean areAdults = true;

        for(Person person : personList) {
            areAdults = person.isAdult();
        }

        assertTrue(areAdults);
    }

    @Test
    void checkIfPersonIsAChild() {
        assertFalse(child.isAdult(), "The person is a child.");
    }

    @Order(1)
    @Test
    void checkIfCanGoToSchool() {
        assertTrue(child.canGoToSchool());
    }

    @Test
    void assertPersonAgeCannotBeLessThanZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Person(-1));

        assertEquals("A person's age cannot be less than 0.", exception.getMessage());
    }
}