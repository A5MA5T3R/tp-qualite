package isen.library;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }

    @Test
    public void testSetName() {
        person.setName("Alice");
        assertEquals("Alice", person.getName());
    }

    @Test
    public void testSetYears() {
        person.setYears(30);
        assertEquals(30, person.getYears());
    }
}