import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a starting value: ");
        int startingValue = scanner.nextInt();
        System.out.println("Enter an ending value: ");
        int endingValue = scanner.nextInt();

        PrimeNumGen primeNumGen = new PrimeNumGen();
        List<Integer> list = primeNumGen.generate(startingValue, endingValue);
        System.out.println(list);
    }
}