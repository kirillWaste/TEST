

import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        System.out.println("Введите x");
        double x = sc.nextDouble();
        System.out.println("Введите y");
        double y = sc.nextDouble();
        double a = Math.sqrt(((x+y)/Math.log10(x*x))*n);
        System.out.println(a+" git ");
        }

    }
