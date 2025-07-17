package com.merzmostafaei.strategy;

public class ChatClient {


    public void send(String message,EncryptionAlgorithm encryptionAlgorithm) {
        encryptionAlgorithm.applyAlgorithm(message);
        System.out.println("Sending the encrypted message...");
    }
}
