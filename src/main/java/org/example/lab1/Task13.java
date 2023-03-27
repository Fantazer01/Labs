package org.example.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task13 {
    public void Invoke()
    {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 49; ++i)
            array.add(i);

        Random rand = new Random();
        int[] answerCombination = new int[6];
        for (int i = 0; i < answerCombination.length; ++i)
        {
            int index = Math.floorMod(rand.nextInt(), array.size());
            answerCombination[i] = array.get(index);
            array.remove(index);
        }

        Arrays.sort(answerCombination);

        for (int element : answerCombination) System.out.print(element + " ");
        System.out.println();
    }
}
