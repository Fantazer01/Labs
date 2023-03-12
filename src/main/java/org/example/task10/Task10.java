package org.example.task10;




import java.util.LinkedList;
import java.util.List;

//Мы можем расширить ArrayList, но модифицировать его нельзя(SOLID). Да и вообще массивы не ответственны за эти задачи.
public class Task10 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7, 8};

        List<Integer> list = new LinkedList<>();
        for (Integer num : arr) {
            list.add(num);
        }

        System.out.println("list = " + RandomNumber.randomElement(list)+"\narray = " + RandomNumber.randomElement(arr));
    }
}