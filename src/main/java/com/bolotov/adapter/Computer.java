package com.bolotov.adapter;

public class Computer {

    public void readDataFromUSB(USB usb) {
        System.out.println("Reading data: " + usb.readData());
    }
}
