package facade;

import facade.Calculater;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculaterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void testAdd(){
        System.out.println("testAdd");
        Calculater calculater = new Calculater();
        int actuel = calculater.add(1,2);
        int expected = 3;
        assertEquals(expected,actuel);

    }
}
