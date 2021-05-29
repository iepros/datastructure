package com.xfma.datastructure.list.singlrLinkedList;

import com.alibaba.fastjson.JSONObject;
import com.xfma.datastructure.list.singleLinkedList.CustomLinkedList;
import org.junit.jupiter.api.Test;

/**
 * @author xiangfeng.ma
 * @Desc
 * @date 2021/5/29 下午1:53
 */
public class SingleLinkedListTest {

    @Test
    public void testAdd(){
        CustomLinkedList<String> list = new CustomLinkedList<>();

        list.add("小黑");
        list.add("小白");
        list.add("小红");
        System.out.println(list);
    }

    @Test
    public void testAddIndex(){
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("小黑");
        list.add("小白");
        list.add("小红");
        list.addFirst("小黑2");
        list.addLast("小黑3");
        list.add(1,"小白2");
        list.add("小红1");
        list.add("小白");
        list.add("小白");
        list.remove("小白");
        list.remove(5);
        list.remove(5);
        System.out.println(list);
    }

}
