package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setup(){
        Person p =new Person("bagi","zedjar",23);
    }

    @Test
    @DisplayName("affiche nom complet")
     void getFullName() {
        Person p =new Person("bagi","zedjar",23);
        assertEquals("bagii zedjar", p.getFullName() );
    }

    @Test
    @DisplayName("affiche is adulte")
    void isAdult()
    {
        Person p =new Person("bagi","zedjar",18);
        assertEquals(false, p.isAdult() );
    }
}