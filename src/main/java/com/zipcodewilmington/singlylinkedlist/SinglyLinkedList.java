package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <ObjectType>{

    private class Node{
        private ObjectType thePackage;
        private Node next;

        public Node(){
            this.thePackage=null;
            this.next=null;
        }

        public Node(ObjectType obj){
            this.thePackage=obj;
            this.next=null;
        }

        public Node(ObjectType obj,Node next){
            this.thePackage=obj;
            this.next=next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public ObjectType getThePackage() {
            return thePackage;
        }

        public void setThePackage(ObjectType thePackage) {
            this.thePackage = thePackage;
        }
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    private Node first;

    public SinglyLinkedList(){
        this.first=null;
    }

    public SinglyLinkedList(ObjectType obj){
        this.first=new Node(obj);
        this.first.next = null;
    }

    public void add(ObjectType obj){

    }


    public void remove(ObjectType obj){

    }

    public Boolean contains(ObjectType obj){

        return false;
    }

    public Integer find(ObjectType obj){

        return -1;
    }

    public Integer size(){

        return -1;
    }

    public Object get(Integer i){

        return null;
    }

    public SinglyLinkedList<ObjectType> copy(){

        return null;
    }

    public void sort(){


    }

    public void reverse(){

    }

    public SinglyLinkedList<ObjectType> slice(Integer start, Integer stop){

        return null;
    }
}
