package com.phishing;

import java.util.UUID;

public class IDs {

    public static String generateID() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        System.out.println("Sample ID: " + generateID());
    }
}
