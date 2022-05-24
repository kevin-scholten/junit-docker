package nl.kvns;

import com.google.gson.Gson;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Gson gson = new Gson();
    int a = 5;
    int b = 2;

    @Test
    public void addNumber() {
        assertEquals(7, a+b);
    }

    @Test
    public void subtractNumber() {
        assertEquals(3, a-b);
    }

    @Test
    public void timesNumber() {
        assertEquals(10, a*b);
    }
}
