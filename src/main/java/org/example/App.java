package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        System.out.println( "Hello World я Александр!" );

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число чтобы вычислить площадь квадрата с произвольными сторонами : ");
        int s_sq = in.nextInt();
        System.out.print("Введите число чтобы вычислить площадь круга c произвольным радиусом : ");
        int s_ci = in.nextInt();
        System.out.print("Введите три числа чтобы вычислить площадь треугольника с произвольными сторонами : ");
        int s_trian_a = in.nextInt();
        int s_trian_b = in.nextInt();
        int s_trian_c = in.nextInt();
        System.out.printf("Введенное вами число для вычисления площади квадрата : %d \n", s_sq);
        System.out.printf("Введенное вами число для вычисления площади круга : %d \n", s_ci);
        System.out.printf("Введенное вами число для вычисления площади треугольника (a): %d \n", s_trian_a);
        System.out.printf("Введенное вами число для вычисления площади треугольника (b): %d \n", s_trian_b);
        System.out.printf("Введенное вами число для вычисления площади треугольника (c): %d \n", s_trian_c);
        in.close();

        s_square(s_sq);
        s_circle(s_ci);
        s_triangle(s_trian_a, s_trian_b, s_trian_c);
    }

    static void s_square(double s_sq){
        double result = s_sq * s_sq;
        System.out.println("площадь квадрата: " + result);
    }
    static void s_circle(double s_ci){
        double result = 3.14 * (s_ci * s_ci);
        System.out.println("площадь круга: " + result);
    }
    static void s_triangle(double s_trian_a, double s_trian_b, double s_trian_c){
        double p = (s_trian_a + s_trian_b + s_trian_c)/2;
        double result = Math.sqrt( p * (p - s_trian_a) * (p - s_trian_b) * (p - s_trian_c) );
        System.out.println("площадь треугольника: " + result);
    }

}
