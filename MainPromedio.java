import java.util.Scanner;

public class MainPromedio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Promedio prom = new Promedio();

        System.out.println("Ingrese el primer valor:");
        prom.setNum1(sc.nextFloat());

        System.out.println("Ingrese el segundo valor:");
        prom.setNum2(sc.nextFloat());

        System.out.println("Ingrese el segundo valor:");
        prom.setNum3(sc.nextFloat());

        prom.calcular_promedio(prom.num1, prom.num2, prom.num3);
    }


}