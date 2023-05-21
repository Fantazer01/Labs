package org.example.lab4.Dop62;

public class Hashcipher implements Cipher {
    public byte[] encrypt(byte[] source, byte[] key) {
        byte[] result = new byte[source.length*2];
            for (int i = 0; i < source.length*2; i = i + 2) {
                result[i] = (byte) (source[i/2] / key[i/2]);
                result[i + 1] = (byte) (source[i/2] % key[i/2]);
            }

        return result;
    }

    public byte[] decrypt(byte[] source, byte[] key) {
        byte[] original = new byte[source.length/2];
            for (int i = 0; i < source.length; i=i+2) {
                original[i/2] = (byte) (source[i] * key[i/2]+source[i+1]);
            }

        return original;
    }
    public String getName(){ return "Hash"; }

}