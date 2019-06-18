package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void sllNullaryConstructorTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertNull(sll.get(0));
    }

    @Test
    public void sllConstructorTest(){
        SinglyLinkedList sll = new SinglyLinkedList(5);
        Object expeccted = 5;
        Object actual = sll.get(0);

        Assert.assertEquals(expeccted,actual);
    }

    @Test
    public void sllAddTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllRemoveTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllRemoveNotThereTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllContainsTrueTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllContainsFalseTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllFindTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllFindNotThereTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllFindMultipleTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllSizeTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllSize0Test(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllGetTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllGetNotThereTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllCopyTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllCopyEmptyTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

    @Test
    public void sllSortTest(){
        SinglyLinkedList sll = new SinglyLinkedList();
        Assert.assertTrue(false);
    }

}
