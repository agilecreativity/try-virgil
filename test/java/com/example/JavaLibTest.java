package com.example;
import try_virgil.JavaLib;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JavaLibTest {

    @Test
    public void greetingTest() {
        try_virgil.JavaLib app = new try_virgil.JavaLib();
        assertTrue(app.greeting("Burin").equalsIgnoreCase("Greeting from Java : Burin"));
    }
}
