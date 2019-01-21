package Fibonacci;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class fb01 {
    //2747
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long result = fibonacci(n);
        System.out.println(result);
    }
    public static long fibonacci(int num) {
        long a = 0;
        long b = 1;
        long tmp;
        if (num == 1) return 1;
        if (num == 0) return 0;
        for (int i = 0; i < num - 1; i++) {
            tmp = b;
            b = a + b;
            a = tmp;
        }
        return b%1000000;
    }
}
