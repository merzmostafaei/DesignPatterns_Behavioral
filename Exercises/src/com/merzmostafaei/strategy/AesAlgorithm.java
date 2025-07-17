package com.merzmostafaei.strategy;

public class AesAlgorithm implements EncryptionAlgorithm {
    @Override
    public void applyAlgorithm(String message) {
        System.out.println("Encrypting using AES: "+message );
    }
}