package com.xfma.datastructure.list.singleLinkedList;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author xiangfeng.ma
 * @Desc 链表节点，内部保存了下一个节点的引用
 * @date 2021/5/29 下午12:26
 */
public class Node<E> implements Serializable {

    /**
     * 数据
     */
    private E e;

    /**
     * 下一个节点
     */
    private Node<E> next;

    public Node() {
    }

    public Node(E e, Node<E> next) {
        this.e = e;
        this.next = next;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        Node<?> node = (Node<?>) o;
        return Objects.equals(getE(), node.getE()) &&
                Objects.equals(getNext(), node.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getE(), getNext());
    }

    @Override
    public String toString() {
        return "Node{" +
                "e=" + e +
                ", next=" + next +
                '}';
    }
}
