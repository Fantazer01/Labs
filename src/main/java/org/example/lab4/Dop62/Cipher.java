package org.example.lab4.Dop62;

//package com.corejava.crypt;
public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);
    byte[] decrypt(byte[] source, byte[] key);
    String getName();

}
