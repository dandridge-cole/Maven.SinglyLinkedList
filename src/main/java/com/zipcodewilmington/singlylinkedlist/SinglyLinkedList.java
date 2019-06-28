package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <ObjectType extends Comparable/*& Cloneable*/>{

    private class Node{
        private ObjectType thePackage;
        private Node next;

        Node(){
            this.thePackage=null;
            this.next=null;
        }

        Node(ObjectType obj){
            this.thePackage=obj;
            this.next=null;
        }

        Node(ObjectType obj,Node next){
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

    SinglyLinkedList(ObjectType obj){
        emptyHead = new Node();
        this.emptyHead.next=new Node(obj);
        this.emptyHead.next.next = null;
        this.last=this.emptyHead.next;
        this.count=1;
    }

    SinglyLinkedList(){
        emptyHead = new Node();
        this.emptyHead.next=null;
        this.count=0;
    }

    private Node emptyHead;
   // private Node first;
    private Node last;
    private Integer count;

    private Node getFirst() {
        return this.emptyHead.next;
    }

    public void setFirst(Node first) {
        this.emptyHead.next = first;
    }

    private Node getLast() {
        return this.last;
    }

    public void add(ObjectType obj){
        Node newNode = new Node(obj);
        if(this.emptyHead.next==null) this.emptyHead.next = newNode;
        else this.last.next=newNode;
        this.last=newNode;
        this.count++;
    }

    public void remove(ObjectType obj){
        Integer index = this.find(obj);
        if(index>-1){
            Node prev = this.emptyHead.next;
            for(int i=0;i<index-1;i++) prev=prev.next;
            prev.next = prev.next.next;
            if(index == this.count)last=prev;
            this.count--;
        }
    }

    public Boolean contains(ObjectType obj){
        return (this.find(obj)>-1);
    }

    public Integer find(ObjectType obj){
        if(this.count==0)return-1;
        Node toCheck = this.emptyHead.next;
        for(int i=0;i<count;i++) {
            if (toCheck.thePackage.equals(obj)) return i;
            else toCheck = toCheck.next;
        }
        return -1;
    }

    public Integer size(){
        return this.count;
    }

    public ObjectType get(Integer target){
        if(target<this.count){
            Node thisNode=this.emptyHead.next;
            for(int i=0;i<target;i++) {
                thisNode=thisNode.next;
            }
            return thisNode.thePackage;
        }
        return null;
    }

    public void sort(){
        Boolean swapped;
        Node prev;
        for (int i = 0; i < this.count-1; i++) {
            swapped=false;
            prev=this.emptyHead;
            for (int j = 0; j < this.count-1-i; j++) {
                if(prev.next.thePackage.compareTo(prev.next.next.thePackage)>0) {
                    swapNodes(prev);
                    swapped = true;
                }
                prev=prev.next;
            }
            if(!swapped) break;
        }

    }

    private void swapNodes(Node prev){
        Node node1 = prev.next;
        Node node2 = node1.next;
        prev.next=node2;
        node1.next=node2.next;
        node2.next=node1;
    }

    public void reverse(){
        if(this.count>1) {
            Node pointer1;
            Node pointer2 = this.emptyHead.next.next;
            this.emptyHead.next.next=null;
            this.last=this.emptyHead.next;
            while(pointer2!=null){
                pointer1=pointer2;
                pointer2=pointer2.next;
                pointer1.next=this.emptyHead.next;
                this.emptyHead.next=pointer1;
            }
        }
    }

    public SinglyLinkedList<ObjectType> copy(){
        return this.slice(0,this.count);
    }

    public SinglyLinkedList<ObjectType> slice(Integer start, Integer stop){
        SinglyLinkedList<ObjectType> copy = new SinglyLinkedList<>();
        Node thisNode=this.emptyHead.next;
        if(start>this.count)return copy;
        for(int i=0;i<start;i++) thisNode=thisNode.next;
        for(int i=start;i<this.count&&i<stop;i++){
            copy.add(thisNode.thePackage);
            thisNode=thisNode.next;
        }
        return copy;
    }
/*
    public SinglyLinkedList<ObjectType> slice(Integer start, Integer stop){
        SinglyLinkedList<ObjectType> copy = new SinglyLinkedList<>();
        Node thisNode=this.emptyHead.next;
        if(start>this.count)return copy;
        for(int i=0;i<start;i++) thisNode=thisNode.next;
        for(int i=start;i<this.count&&i<stop;i++){
            copy.add(thisNode.clone().thePackage);
            thisNode=thisNode.next;
        }
        return copy;
    }
    */

/*

    public SinglyLinkedList<ObjectType> slice(Integer start, Integer stop){
        SinglyLinkedList<ObjectType> copy = new SinglyLinkedList<>();
        Node thisNode=this.emptyHead.next;
        UnaryOperator<ObjectType> uO = objectType -> null;
        if(start>this.count)return copy;
        for(int i=0;i<start;i++) thisNode=thisNode.next;
        for(int i=start;i<this.count&&i<stop;i++){
            copy.add(this.deepCopy(thisNode,uO));
            thisNode=thisNode.next;
        }
        return copy;
    }

    private ObjectType deepCopy(Node original, UnaryOperator<ObjectType> copyOperator) {
        Node newNode = new Node(copyOperator.apply(original.thePackage));
        return newNode.thePackage;
    }
 */
}
