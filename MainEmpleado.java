package Poo;

import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empleado employee = new Empleado();

        System.out.println("Enter your name: ");
        employee.setName(sc.nextLine());

        System.out.println("Enter your salary: ");
        employee.setSalary(sc.nextFloat());

        System.out.println("Enter the hours worked per day: ");
        employee.setHours(sc.nextInt());

        System.out.println(employee.toString());



    }

}
