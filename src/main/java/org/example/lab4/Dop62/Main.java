package org.example.lab4.Dop62;

import java.util.ServiceLoader;

public class Main {
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);
    public static Cipher getCipher ( String name){
        for (Cipher cipher : cipherLoader) {  // неявно вызывает итератор
            if (cipher.getName().equals(name))
                return cipher;
        }
        return null;
    }
    public static void main(String[] args) {
        byte[] code = new byte[]{51, 72, 23, 94, 15, 6};
        byte[] key = new byte[]{7, 8, 9, 10, 11, 12};
        cripto(code,key,"Caesar");
        cripto(code,key,"Hash");
        cripto(code,key,"Minus");
    }
    private static void cripto(byte[] code, byte[] key,String x){
        Cipher test = getCipher(x);
        System.out.println(x);
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
