import org.junit.jupiter.api.Test;
import com.example.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testValidInput() {
        String result = Main.processInput("John");
        assertEquals("Hello, John!", result);
    }

    @Test
    void testInvalidInputEmpty() {
        String result = Main.processInput("");
        assertEquals("Invalid input", result);
    }

    @Test
    void testInvalidInputNull() {
        String result = Main.processInput(null);
        assertEquals("Invalid input", result);
    }
}
