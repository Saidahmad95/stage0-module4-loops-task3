package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int l = 2;
        int[] arr = new int[lastFibonacci + 1];
        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0) {
                System.out.println(i);
                arr[i]=i;
            } else if (i == 1 || i == 2){
                System.out.println(1);
                arr[i]=1;
            }
            else {
                arr[i]=arr[i-1]+arr[i-2];
                System.out.println((arr[i]));
            }
        }

    }

    static int fibonacci(int i) {
        if (i == 1 || i == 2) return 1;
        else return fibonacci(i - 1) + fibonacci(i - 2);
    }
}
