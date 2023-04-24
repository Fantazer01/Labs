package org.example.lab4.Task6;

import java.util.Objects;

public class Item {
    private final String description;
    private final double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
        // Быстрая проверка объектов на сходство
        if (this == otherObject) return true;
        // возвратить логическое значение false, если параметр
        // принимает пустое значение null
        if (otherObject == null) return false;
        // проверить, относится ли объект otherObject к типу Item
        if (!(otherObject instanceof Item other)) return false;
        // проверить, содержат ли переменные экземпляра одинаковые значения
        return Objects.equals(description, other.description)
                && price == other.price;
    }
}
