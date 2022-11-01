package Poo;

public class Empleado {

    String name = "";
    float salary = 0;
    int hours = 0;

    Empleado (){

    }

    Empleado (String name, float salary, int hours){
        this.name = name;
        this.salary = salary;
        this.hours = hours;

    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setHours( int hours){
        this.hours = hours;
    }

    public  float agregarSalario(float salary){
        float newSalary = 0;
        if (this.salary < 5000000){
            newSalary = this.salary + 10000;
        }
        return newSalary;
    }

    public float agregarTrabajo(float salary,int hours){
        float newSalary = 0;
        if (this.salary > 6){
            newSalary = this.salary + 50000;
        }
        return newSalary;
    }

    @Override
    public String toString() {
        return name + ", your current salary is " + salary + " now your new salary is " + (agregarTrabajo(salary,hours) + agregarSalario(salary));
    }
}
