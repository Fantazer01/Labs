package org.example.lab1;

import java.math.BigInteger;

public class Task6 {
    public void Invoke()
    {
        int n = 1000;
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));

        System.out.println(result);
    }
}
