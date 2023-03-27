package org.example.lab2.task6;
/**
 * объект <code> класса Point</code> реализует поведение точки
 * @author Крыгин Олег
 * @author Скороходов Данил
 * @version 1.1
 */
public class Point {



    private double x;
    private double y;

    // Конструктор с параметрами
    /**
     * Конструктор с параметрами
     * @param x  координату точки на оси X
     * @param y  координату точки на оси Y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    /**
     * Пустой конструктор
     */
    public Point() {
        this(0, 0);
    }

    // Геттер для x
    /**
     * Геттер для x
     * @return возвращает координату X
     */
    public double getX() {
        return this.x;
    }

    // Геттер для y
    /**
     * Геттер для y
     * @return возвращает координату y
     */
    public double getY() {
        return this.y;
    }

    // Перемещает точку на новые координаты
    /**
     * Перемещает точку на новые координаты
     * @param x  координату точки на оси X
     * @param y  координату точки на оси Y
     * @return  возвращает новые координаты точки
     */
    public Point translate(int x, int y) {
        this.x += x;
        this.y += y;
        return this;
    }

    // Изменяет масшатаб по обеим координатам
    /**
     * Изменяет масшатаб по обеим координатам
     * @param k  маштаб
     * @return  возвращает новые координаты точки
     */
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
    /**
     * Перегруженный метод toString, чтобы можно было выводить
     *  объект Point в System.out.print()
     * @return  возвращает строгу с координатами точки
     */
    @Override
    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }
}
