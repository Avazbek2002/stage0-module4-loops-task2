package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive >= 2)
            System.out.println(2);

        for (int i = 3; i < printToInclusive; i+=2) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public boolean isPrime (int number) {
        for (int i = 3; i < (int)Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
