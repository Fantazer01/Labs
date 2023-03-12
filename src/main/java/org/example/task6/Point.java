package org.example.task6;

public class Point {

    /**
     * Все методы - методы доступа
     * param x - координата x
     * param y - координата y
     */

    private double x;
    private double y;

    // Конструктор с параметрами
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Пустой конструктор
    public Point() {
        this(0, 0);
    }

    // Геттер для x
    public double getX() {
        return this.x;
    }

    // Геттер для y
    public double getY() {
        return this.y;
    }

    // Перемещает точку на новые координаты
    public Point translate(int x, int y) {
        this.x += x;
        this.y += y;
        return this;
    }

    // Изменяет масшатаб по обеим координатам
    public Point scale(double k) {
        this.x *= k;
        this.y *= k;
        return this;
    }

    // Перегруженный метод toString, чтобы можно было выводить
    // объект Point в System.out.print()
    // P.S.
    // Он ругаться будет за @Override? (в плане очень сильно дрючить)
    // P.P.S.
    // Надо не забыть удалить эти комменты
    @Override
    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }
}
