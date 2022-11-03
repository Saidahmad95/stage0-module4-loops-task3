package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            String temp = "";
            for (int i1 = 0; i1 < i; i1++) {
                temp+=9;
            }
            result+=Integer.parseInt(temp);
        }
        System.out.println(result);
    }
}
