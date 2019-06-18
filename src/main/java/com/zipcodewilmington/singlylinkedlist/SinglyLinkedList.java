package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private class Node{
        private Object thePackage;
        private Node next;

        public Node(){
            this.thePackage=null;
            this.next=this;
        }

        public Node(Object obj){
            this.thePackage=obj;
            this.next=this;
        }

        public Node(Object obj,Node next){
            this.thePackage=obj;
            this.next=next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getThePackage() {
            return thePackage;
        }

        public void setThePackage(Object thePackage) {
            this.thePackage = thePackage;
        }
    }

    private Node first;

    public SinglyLinkedList(){
        this.first=new Node();
        this.first.next = this.first;
    }

    public SinglyLinkedList(Object obj){
        this.first=new Node(obj);
        this.first.next = this.first;
    }

    public void add(Object obj){

    }


    public void remove(Object obj){

    }

    public Boolean contains(Object obj){

        return false;
    }

    public Integer find(Object obj){

        return -1;
    }

    public Integer size(){

        return -1;
    }

    public Object get(Integer i){

        return null;
    }

    public SinglyLinkedList copy(){

        return null;
    }

    public void sort(){


    }

    public void reverse(){

    }

    public SinglyLinkedList slice(Integer start, Integer stop){

        return null;
    }

}
