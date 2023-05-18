import java.util.*;

public interface PrimeNumberGenerator {
    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);
}
