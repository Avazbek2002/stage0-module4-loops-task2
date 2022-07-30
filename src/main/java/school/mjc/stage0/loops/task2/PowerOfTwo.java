package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0)
            System.out.println("too much power");
        else {
            for (int i = 0; i <= power; i++) {
                System.out.println((int) Math.pow(2, i));
            }
        }
    }
}
