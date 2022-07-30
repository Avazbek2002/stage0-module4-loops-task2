package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        for (int i = 0; i <= printToInclusive; i++) {
            if (i == 0)
                System.out.println(1);
            else
                System.out.println(factorial(i));
        }
    }

    public int factorial (int i) {
        if (i == 1 || i == 0)
            return 1;

        return i * factorial(i-1);
    }
}
