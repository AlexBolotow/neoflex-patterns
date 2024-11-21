package com.bolotov.adapter;

public class MemoryCardAdapter implements USB {

    private final MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public String readData() {
        return memoryCard.getData();
    }
}
