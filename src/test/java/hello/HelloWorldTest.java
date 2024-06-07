package hello;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class HelloWorldTest {

    public void testMain() {
        // Setup
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call main method
        HelloWorld.main(new String[]{});

        // Assert
        assertEquals("Hello, World!\n", outContent.toString());

        // Clean up
        System.setOut(null);
    }
}
