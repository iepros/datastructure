package com.xfma.datastructure.list.doubleLinkedList;

import org.junit.jupiter.api.Test;

public class DoubleLinkedListTest {

    @Test
    public void addTest() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.add("123");
        list.add("333");
        list.add(2,"222");
        String s = list.get(2);
        System.out.println(s);
        list.remove(2);
        list.remove("333");
        System.out.println();
    }
}
