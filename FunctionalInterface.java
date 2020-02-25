package Java8;

import java.util.Scanner;

interface function
{
    int func(int a,int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers to be added: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        function f = (n, m) -> {
            return n + m;
        };
        int c = f.func(a,b);
        System.out.println("Output is: "+c);
    }
}
