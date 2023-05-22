package org.example.lab4.Dop6_3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import java.time.LocalDateTime;
import java.util.Arrays;

// Интерфейс, определяющий операции, которые могут быть выполнены над объектом
interface Image {
    void display();
}

// Реальный объект
class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка изображения: " + filename);
    }

    public void display() {
        System.out.println("Отображение изображения: " + filename);
    }
}

// Обработчик вызовов для прокси-объекта
class ImageInvocationHandler implements InvocationHandler {
    private final Object realObject;

    public ImageInvocationHandler(Object realObject) {
        this.realObject = realObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(LocalDateTime.now() + " " + realObject.getClass().getName() + "."
                + method.getName() + "(" + Arrays.toString(args) + ")");

        return method.invoke(realObject, args);
    }
}

public class ProxyExample {
    public static void main(String[] args) {
        Image realImage = new RealImage("image.jpg");

        Image proxyImage = (Image) Proxy.newProxyInstance(
                realImage.getClass().getClassLoader(),
                realImage.getClass().getInterfaces(),
                new ImageInvocationHandler(realImage)
        );

        proxyImage.display();
    }
}

