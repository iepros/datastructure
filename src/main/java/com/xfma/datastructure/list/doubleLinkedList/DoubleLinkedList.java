package com.xfma.datastructure.list.doubleLinkedList;

import java.util.Objects;

/**
 * 双向链表
 *
 */
public class DoubleLinkedList <E>{

    private int size;

    private Node<E> header;

    /**
     * 添加
     * @param e
     * @return
     */
    public boolean add(E e){

        if (header == null){
            header = new Node<>(e,null,null);
            size++;
            return true;
        }

        Node<E> currentNode = header;
        //遍历到最后，找到最后一个节点
        while (currentNode.getNext()!=null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new Node<>(e,currentNode,null));
        size++;
        return true;
    }

    /**
     * 添加指定索引
     * @param index
     * @param e
     * @return
     */
    public boolean add(int index,E e){

        if (size < index || index < 0){
            return false;
        }

        Node<E> current = header;

        for (int i=1;i<=size;i++){
            if (size == i){

            }
        }

        return true;
    }

    /**
     * 获取指定索引元素
     * @param index
     * @return
     */
    public E get(int index){

        return null;
    }

    /**
     * 删除指定位置元素
     * @param index
     * @return
     */
    public boolean remove(int index){

        return true;
    }

    /**
     * 删除指定元素
     * @param e
     * @return
     */
    public boolean remove(E e){
        if (header == null){
            return false;
        }
        Node<E> current = header;
        while (current != null){
            if (Objects.equals(current.getE(),e)){
                Node<E> next = current.getNext();
                if (next!= null && current.getPre() == null){
                    next.setPre(null);
                }else {

                }

            }
        }

        return true;
    }

    /**
     * 遍历
     */
    public void list(){

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
