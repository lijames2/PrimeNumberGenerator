import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

public class PrimeNumGenTest {

    @Test
    void primeTest() {
        PrimeNumGen primeNumGen = new PrimeNumGen();
        assertTrue(primeNumGen.isPrime(11));
    }

    @Test
    void generatePrimeNone() {
        List<Integer> list = new ArrayList<>();
        PrimeNumGen primeNumGen = new PrimeNumGen();
        assertEquals(list, primeNumGen.generate(1,1));
    }

    @Test
    void generatePrime() {
        List<Integer> list = new ArrayList<>();
        PrimeNumGen primeNumGen = new PrimeNumGen();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        assertEquals(list, primeNumGen.generate(2,7));
    }

    @Test
    void generatePrimeInverse() {
        List<Integer> list = new ArrayList<>();
        PrimeNumGen primeNumGen = new PrimeNumGen();
        list.add(7901);
        list.add(7907);
        list.add(7919);
        assertEquals(list, primeNumGen.generate(7920,7900));
    }
}
