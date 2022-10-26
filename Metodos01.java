package Poo;

import java.util.Scanner;

public class Metodos01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second value:");
        float num2 = sc.nextFloat();
        System.out.println("Enter the third value:");
        float num3 = sc.nextFloat();

        calculate_average(num1,num2,num3);

    }

    public static void calculate_average(float num1, float num2, float num3){
        float promedio = (num1 + num2 + num3)/3;
        System.out.println("The value average is : " + promedio);

    }
}
