package com.xfma.datastructure.list.singleLinkedList;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author xiangfeng.ma
 * @Desc 自定义链表实现
 * @date 2021/5/29 下午12:25
 */
public class CustomLinkedList<E> implements Serializable {

    /**
     * 头结点
     */
    private Node<E> head;

    /**
     * 尾结点
     */
    private Node<E> last;

    private int size;

    /**
     * 顺序新增节点
     *
     * @param e
     * @return
     */
    public boolean add(E e) {
        if (Objects.isNull(head)) {
            addFirst(e);
        } else {
            Node<E> next = new Node<>(e, null);
            last.setNext(next);
            //将新增的节点设置为最后一个节点
            last = next;
            size++;
        }
        return true;
    }

    /**
     * 添加到指定位置
     *
     * @param index
     * @param e
     * @return
     */
    public boolean add(int index, E e) {

        if (index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (size == 0) {
            add(e);
            return true;
        } else if (size == index) {
            addLast(e);
            return true;
        }

        Node<E> next = new Node<>(e, null);
        Node<E> node = head.getNext();
        //记录前一个节点
        Node<E> pre = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                next.setNext(node);
                pre.setNext(next);
                break;
            } else {
                pre = node;
                node = node.getNext();
            }
        }

        size++;
        return true;
    }

    /**
     * 添加到第一个
     *
     * @param e
     * @return
     */
    public boolean addFirst(E e) {
        Node<E> next = new Node<>(e, null);
        if (Objects.isNull(head)) {
            head = new Node<>();
            head.setNext(next);
            //将新增的节点设置为最后一个节点
            last = next;
        } else {
            Node<E> eNode = head.getNext();
            next.setNext(eNode);
            head.setNext(next);
        }
        size++;
        return true;
    }

    /**
     * 添加最后一个
     *
     * @param e
     * @return
     */
    public boolean addLast(E e) {
        Node<E> next = new Node<>(e, null);
        last.setNext(next);
        //将新增的节点设置为最后一个节点
        last = next;
        size++;
        return true;
    }

    /**
     * 移除指定元素
     *
     * @param e
     * @return
     */
    public boolean remove(E e) {

        if (size == 0) {
            return true;
        }

        Node<E> next = head.getNext();
        Node<E> pre = head;
        for (int i = 1; ; i++) {
            if (Objects.equals(next.getE(), e)) {
                --size;
                //获取下一个节点
                Node<E> after = next.getNext();
                //删除当前节点
                pre.setNext(after);
                if (Objects.isNull(after)) {
                    //重置最后一个节点
                    last = pre;
                    break;
                }

            } else {
                pre = next;
            }
            next = next.getNext();
        }
        return true;
    }

    /**
     * 移除第几个元素
     *
     * @param index
     * @return
     */
    public boolean remove(int index) {
        if (size == 0) {
            return true;
        }

        Node<E> next = head.getNext();
        Node<E> pre = head;
        for (int i = 1; ; i++) {
            if (i == index) {
                --size;
                //获取下一个节点
                Node<E> after = next.getNext();
                //删除当前节点
                pre.setNext(after);
                if (Objects.isNull(after)) {
                    //重置最后一个节点
                    last = pre;
                    break;
                }
                break;
            } else {
                pre = next;
            }
            next = next.getNext();
        }
        return true;
    }


    public int getSize() {
        return size;
    }

    public CustomLinkedList() {
    }

    public CustomLinkedList(int size) {
        this.size = size;
    }

    public CustomLinkedList(Node<E> head, Node<E> last) {
        this.head = head;
        this.last = last;
    }

}
