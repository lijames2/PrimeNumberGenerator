import java.util.*;

public class PrimeNumGen implements PrimeNumberGenerator {
    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> list = new ArrayList<>();
        int min = Math.min(startingValue, endingValue);
        int max = Math.max(startingValue, endingValue);
        while (min <= max) {
            if (isPrime(min)) {
                list.add(min);
            }
            min++;
        }
        return list;
    }

    public boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
