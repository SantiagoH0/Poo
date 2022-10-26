package Poo;

import java.util.Scanner;

public class Metodos03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        votacion(age);

    }
    public static void votacion(int age){
        if (age > 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You can´t vote");
        }
    }
}
