package org.example;
//1.
public class Circle {
    private int radius;
    private int diametr;
//13.
    public static int[] array = new int[5];

    {
        int i;
        for (i= 0; i<5;i++){
            array[i] = i;
        }
    }

//2.
    private static double pi = Math.PI; //переменная pi является статической и неизменяемой для всех экземпляров класса
//3.
{
    System.out.println("Create new instance of class Circle");
}
//5.
    static {
    System.out.println("this text print one, when create class Circle");
}

    public Circle(int diametr) {
        this.diametr = diametr;
        this.radius = diametr/2;
    }
//7.

    public int getRadius() {
        return radius;
    }

    public int getDiametr() {
        return diametr;
    }
//9.
    public static void lengthCircle(Circle circle){
        System.out.println(String.format("Длина окружности равна: %f ",2*pi*circle.getRadius()));
    }

    public void areaCircle(){
        System.out.println(String.format("Площадь круга равна: %f",pi*getRadius()*getRadius()));
    }
//11.
    @Override
    public String toString() {
        return "circle radius "+this.radius+" diametr "+this.diametr;
    }
}
