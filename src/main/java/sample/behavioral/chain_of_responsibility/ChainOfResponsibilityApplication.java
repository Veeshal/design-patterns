package sample.behavioral.chain_of_responsibility;

import java.util.Arrays;
import java.util.Collections;

public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {
        int A = 71045970;
        int B = 41535484;
        int C = 64735492;
        


        long result = 51193764;
        long ans = (result * result * (A % C)) % C;
        System.out.println("=======================================");
        System.out.println(ans);
        System.out.println(result * result);
        System.out.println(A % C);
        System.out.println(result * result * (A % C));
        System.out.println(((result * result) % C) * (A % C));
        System.out.println((((result * result) % C) * (A % C)) % C);

    }
}
