package com.comarch.szkolenia.enkapsulacja.pakiety.logika;

import com.comarch.szkolenia.enkapsulacja.pakiety.baza.mongo.Connector;
import com.comarch.szkolenia.enkapsulacja.pakiety.model.Client;

public class App {
    public static void main(String[] args) {
        Client c = new Client();
        Connector connector = new Connector();
        java.util.Random random = new java.util.Random();
        com.comarch.szkolenia.enkapsulacja.pakiety.baza.oracle.Connector connector2 = new com.comarch.szkolenia.enkapsulacja.pakiety.baza.oracle.Connector();

        random.nextInt();
    }
}
