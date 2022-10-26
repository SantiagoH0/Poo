package Poo;

public class Metodos02 {
    public static void main(String[] args) {

        int n[] = {8, 33, 200, 150, 11};
        int sum = sum_array(n);

        System.out.println("The sum is: " + sum);


    }
    public static int sum_array(int n[]){
        int suma = 0;
        for (int i = 0; i < n.length; i++){
            suma += n[i];

        } return suma;

    }
}
