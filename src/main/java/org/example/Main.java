package org.example;
//----------разберем работу со статическими переменными и методами в Java на примере вычисления элементов окружности и круга
// 1. Создадим класс Circle c переменными диаметр, радиус,
// 2. и стаиической переменной pi
// 3. Создадим блок нициализации, который будет выполняться каждый раз перед созданием конструктора нового экземпляра класса
//4. Создадим конструктор класса Circle
//5. Создадим статический блок инициализации, который будет выполняться только один раз при создании класса
//6. Создадим два экземпляра класса Circle и убедимся, что статический блок вызывается только один раз, а нестатический каждый раз
//7. Создадим методы-сеттеры, чтобы можно было получать значения радиуса и диаметра
//8. Выведем в консоль значения радиуса и диаметра каждого круга
// В результате получим подтверждение, что статический блок выполняется только один раз
    /*
    this text print one, when create class Circle
    Create new instance of class Circle
    Create new instance of class Circle
    radius: 5 diametr: 10
    radius: 10 diametr: 20
    */
//9. Создадим статический метод вычисления длины окружности и нестатический метод вычисления площади круга
//10. Вызовем статический метод без использования экземпляра класса (с помощью точечной нотации имени класса)---->
    //-----> и нестатический, используя экземпляр
//11. Переопределим метод toString для вывода информации об объекте окружность
//12. Выведем информацию об окружностях
    //circle radius 10 diametr 20
    //circle radius 5 diametr 10
//13. Создадим статический массив как поле класса Circle и заполним его
//14. Попытка изменить статический массив в цикле создания икружностей путём увеличения значения элементов массива не прошла
public class Main {
    public static void main(String[] args) {
//6.
    Circle circle1 = new Circle(10);
    Circle circle2 = new Circle(20);
//8.
        System.out.println(String.format("radius: %d diametr: %d ", circle1.getRadius(),circle1.getDiametr()));
        System.out.println(String.format("radius: %d diametr: %d ", circle2.getRadius(),circle2.getDiametr()));
//10.
        Circle.lengthCircle(circle1);
        circle2.areaCircle();
//12.
        System.out.println(circle2);
        System.out.println(circle1);
//14.

        for (int i:Circle.array) {
            System.out.println(new Circle(i));
            i++;
        }
        System.out.println("----------после попытки изменения статического массива в классе Circle");
        for (int i:Circle.array) {
            System.out.println(new Circle(i));
        }

        }
    }
