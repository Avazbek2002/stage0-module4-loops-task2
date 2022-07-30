package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        for (int i = 0; i <= printTillInclusive; i += 2) {
            System.out.println(i);
        }
    }
}
