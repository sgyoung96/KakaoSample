package com.sgy.kakaouiv3.adapter.item;

public class ChatListItem {
    private String name;

    public ChatListItem(String name) { // Constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChatListItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
