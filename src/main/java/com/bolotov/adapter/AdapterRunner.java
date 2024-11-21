package com.bolotov.adapter;

public class AdapterRunner {

    public static void main(String[] args) {
        Computer computer= new Computer();
        MemoryCard memoryCard= new MemoryCard();
        MemoryCardAdapter memoryCardAdapter = new MemoryCardAdapter(memoryCard);
        computer.readDataFromUSB(memoryCardAdapter);
    }
}
