import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class PlayerInitializerTest {

    @Test
    public void testInputPlayerInfoWithInvalidInput() {
        String input = "mansi\n-10\nabc\n100\n50\n20\n"; // Simulated user input with invalid health and strength
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Scanner scanner = new Scanner(System.in);
        Player player = PlayerInitializer.inputPlayerInfo(scanner);

        String output = out.toString();
        assertTrue(output.contains("Please enter a positive integer."));
        assertTrue(output.contains("Please enter a valid number."));
    }
    
}