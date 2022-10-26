package Poo;


import java.util.Scanner;

public class Metodos04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the grade: ");
        int grade = sc.nextInt();

        value(grade);

    }
    public static void value(int grade){

        if (grade >0 && grade <= 40){
            System.out.println("Fail");
        } else if (grade > 40 && grade <= 50) {
            System.out.println("DD");
        } else if (grade > 50 && grade <= 60) {
            System.out.println("CD");
        } else if (grade > 60 && grade <= 70) {
            System.out.println("BC");
        } else if (grade > 70 && grade <= 80){
            System.out.println("BB");
        } else if (grade > 80 && grade <= 90) {
            System.out.println("AB");
        } else if (grade > 90 && grade <= 100) {
            System.out.println("AA");
        }else {
            System.out.println("Value incorrect ");
        }
    }
}
