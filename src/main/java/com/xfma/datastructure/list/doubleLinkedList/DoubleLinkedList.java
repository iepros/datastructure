package com.xfma.datastructure.list.doubleLinkedList;

import java.util.Objects;

/**
 * 双向链表
 *
 * @author mxf
 */
public class DoubleLinkedList<E> {

    private int size;

    private Node<E> header;

    /**
     * 添加
     *
     * @param e
     * @return
     */
    public boolean add(E e) {
        if (header == null) {
            header = new Node<>(e, null, null);
            size++;
            return true;
        }

        Node<E> currentNode = header;
        //遍历到最后，找到最后一个节点
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new Node<>(e, currentNode, null));
        size++;
        return true;
    }

    /**
     * 添加指定索引
     *
     * @param index
     * @param e
     * @return
     */
    public boolean add(int index, E e) {

        if (size < index || index < 0) {
            return false;
        }
        //当前节点
        Node<E> current = header;
        //新节点
        Node<E> newNode = new Node<>(e, null, null);
        for (int i = 1; i <= size; i++) {
            if (index == i) {
                newNode.setPre(current.getPre());
                newNode.setNext(current);
                if (current.getPre() != null) {
                    current.getPre().setNext(newNode);
                }
                current.setPre(newNode);
                size++;
                break;
            }
            current = current.getNext();
        }
        return true;
    }

    /**
     * 获取指定索引元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (header == null) {
            return null;
        }

        Node<E> current = header;

        int i = 0;
        while (current != null) {
            i++;
            if (i == index) {
                return current.getE();
            }
            current = current.getNext();
        }

        return null;
    }

    /**
     * 删除指定位置元素
     *
     * @param index
     * @return
     */
    public boolean remove(int index) {
        if (size < index || index < 0) {
            return false;
        }
        //当前节点
        Node<E> current = header;
        //新节点
        for (int i = 1; i <= size; i++) {
            if (index == i) {
                if (current.getPre() != null) {
                    current.getPre().setNext(current.getNext());
                }

                if (current.getNext() != null) {
                    current.getNext().setPre(current.getPre());
                }

                size--;
                break;
            }
            current = current.getNext();
        }
        return true;
    }

    /**
     * 删除指定元素
     *
     * @param e
     * @return
     */
    public boolean remove(E e) {
        if (header == null) {
            return false;
        }
        Node<E> current = header;
        while (current != null) {
            if (Objects.equals(current.getE(), e)) {
                Node<E> next = current.getNext();
                Node<E> pre = current.getPre();
                if (pre != null && next != null) {
                    pre.setNext(next);
                    next.setPre(pre);
                }else if (next == null){
                    pre.setNext(null);
                }else if (pre==null){
                    next.setPre(null);
                }
                size--;
            }
            current = current.getNext();
        }

        return true;
    }

    /**
     * 遍历
     */
    public void list() {

    }


    public DoubleLinkedList() {
    }

    public DoubleLinkedList(int size, Node<E> header) {
        this.size = size;
        this.header = header;
    }

    public DoubleLinkedList(Node<E> header) {
        this.header = header;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<E> getHeader() {
        return header;
    }

    public void setHeader(Node<E> header) {
        this.header = header;
    }
}
