package org.example.lab4.Dop62;

import java.util.ServiceLoader;

public class Main {
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);
    public static Cipher getCipher ( int minStrength){
        for (Cipher cipher : cipherLoader) {  // неявно вызывает итератор

            if (cipher.strength() >= minStrength)
                return cipher;

        }
        return null;
    }
    public static void main(String[] args) {

        Cipher test = getCipher(1);
        byte[] code = new byte[]{1, 2, 3, 4, 5, 6};
        byte[] key = new byte[]{7, 8, 9, 10, 11, 12};
        byte[] newcode;
        printer(code,"Оригинал");
        assert test != null;
        newcode = test.encrypt(code,key);
        printer(newcode,"Закодированный");
        newcode = test.decrypt(newcode,key);
        printer(newcode,"Декодированный");
    }
    private static void printer(byte[] code, String text){
        System.out.print(text+": ");
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]+" ");
        }
        System.out.print("\n");
    }
}
