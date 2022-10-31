import java.util.Scanner;

public class Promedio {

     float num1 = 0;
     float num2 = 0;
     float num3 = 0;

     Promedio (){

     }
    Promedio(int num1, int num2, int num3){

        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public float getNum3() {
        return num3;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void setNum3(float num3) {
        this.num3 = num3;
    }

    public void calcular_promedio (float num1, float num2, float num3) {
        float promedio = (this.num1 + this.num2 + this.num3) / 3;
        System.out.println("El promedio es: "+ promedio);

    }

}

