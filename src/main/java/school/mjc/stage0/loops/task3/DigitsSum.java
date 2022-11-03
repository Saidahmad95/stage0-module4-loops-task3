package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        if (t < 0) t = t * -1;
        String s = t + "";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int i1 = Integer.parseInt(String.valueOf(s.charAt(i)));
            result += i1;
        }
        System.out.println(result);
    }
}
