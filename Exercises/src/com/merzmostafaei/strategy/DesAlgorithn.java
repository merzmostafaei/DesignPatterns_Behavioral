package com.merzmostafaei.strategy;

public class DesAlgorithn implements EncryptionAlgorithm {

    @Override
    public void applyAlgorithm(String message) {
        System.out.println("Encrypting message using DES: "+message);
    }
}
