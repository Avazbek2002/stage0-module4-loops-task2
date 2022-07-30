package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        for (int i = 2; i <= printTillInclusive; i += 2) {
            System.out.println(i);
        }
    }
}
