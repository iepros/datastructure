package com.xfma.datastructure.list.doubleLinkedList;

import org.junit.jupiter.api.Test;

public class DoubleLinkedListTest {

    @Test
    public void addTest() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.add("123");
        list.add("333");
    }
}
