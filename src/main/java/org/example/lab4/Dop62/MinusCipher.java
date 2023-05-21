package org.example.lab4.Dop62;

public class MinusCipher implements Cipher {
    public byte[] encrypt(byte[] source, byte[] key) {
        byte[] result = new byte[source.length];
        for (int i = 0; i < source.length; i++)
            result[i] = (byte)(source[i] - key[i]);
        return result;
    }

    public byte[] decrypt(byte[] source, byte[] key) {
        for (int i = 0; i < key.length; i++)
            key[i]=(byte) -key[i];
        return encrypt(source, key);
    }
    public String getName(){ return "Minus"; }

}
