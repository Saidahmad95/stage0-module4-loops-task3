package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd=second;
        for (int i = 1; i <= first; i++) {
            if (first%i==0){
                if (second>=i && second%i==0){
                    gcd=i;
                }
            }
        }
        System.out.println(gcd);
    }
}
