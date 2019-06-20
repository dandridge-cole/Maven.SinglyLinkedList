package com.zipcodewilmington.singlylinkedlist;

import javafx.scene.Node;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void sllNullaryConstructorTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        Assert.assertNull(sll.get(0));
    }

    @Test
    public void sllConstructorTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>(5);
        Object expected = 5;
        Object actual = sll.get(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllFirstIsNull(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        Assert.assertNull(sll.get(0));
    }

    @Test
    public void sllSizeTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>(5);
        int expected = 1;
        int actual = sll.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sllSize0Test(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        int expected = 0;
        int actual = sll.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sllAddFirstTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        Integer expected = 1;
        Integer actual = sll.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllAddSecondTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>(25);
        sll.add(5);
        Integer expected = 2;
        Integer actual = sll.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllContainsTrueTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        Assert.assertTrue(sll.contains(6));
    }

    @Test
    public void sllContainsFalseTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        Assert.assertFalse(sll.contains(9));
    }

    @Test
    public void sllRemoveTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.remove(6);
        Assert.assertFalse(sll.contains(6));
    }

    @Test
    public void sllRemoveNotThereTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.remove(9);
        int expected = 3;
        int actual = sll.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllFindTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        int expected = 2;
        int actual = sll.find(7);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllFindNotThereTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        int expected = -1;
        int actual = sll.find(9);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllFindMultipleTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(6);
        int expected = 1;
        int actual = sll.find(6);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllGetTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(6);
        Object expected = 7;
        Object actual = sll.get(2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sllGetNotThereTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(6);
        Assert.assertNull(sll.get(5));
    }

    @Test
    public void sllCopyTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(6);
        SinglyLinkedList<Integer> sll2 = sll.copy();
        Assert.assertEquals(sll.get(3), sll2.get(3));
   //     Assert.assertNotSame(sll.get(3), sll2.get(3));
    }

    @Test
    public void sllCopyEmptyTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> sll2 = sll.copy();
        Assert.assertNull(sll2.get(0));
    }

    @Test
    public void sllSortTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(3);
        sll.add(9);
        sll.add(3);
        sll.add(8);
        sll.sort();
        Integer expected2 = 8;
        Integer expected3 = 9;
        Integer actual2 = sll.get(2);
        Integer actual3 = sll.get(3);

        Assert.assertEquals(expected3,actual3);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void sllReverseTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(3);
        sll.add(9);
        sll.add(3);
        sll.add(8);
        sll.reverse();
        Integer expected0 = 8;
        Integer expected2 = 9;
        Integer actual0 = sll.get(0);
        Integer actual2 = sll.get(2);

        Assert.assertEquals(expected0,actual0);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void sllSliceTest(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.add(3);
        sll.add(9);
        sll.add(3);
        sll.add(111);
        sll.add(1);
        sll.add(0);
        sll.add(57);
        sll.add(8);

        SinglyLinkedList<Integer> sll2 = sll.slice(2,6);
        Integer expectedSize = 4;
        Integer actualSize = sll2.size();
        Integer expected3 = 0;
        Integer actual3 = sll2.get(3);
        Integer expected1=111;
        Integer actual1=sll2.get(1);

        Assert.assertEquals(expectedSize,actualSize);
        Assert.assertEquals(expected3,actual3);
        Assert.assertEquals(expected1,actual1);
    }

}
