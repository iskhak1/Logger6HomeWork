package ru.gb.test;


import org.junit.Assert;
import org.junit.Test;
import ru.gb.Main;

public class TestMain {

    private Main main = new Main();
   @Test
    public void test1Method1(){
       int [] actual =  { 1, 2,  2 ,3 ,4, 8, 1, 7, 9, 8, 2};
       int [] expecting =  new int[] { 8, 1, 7, 9, 8, 2};
       Assert.assertArrayEquals(expecting, main.method1(actual));
   }
    @Test
    public void test2Method1(){
        int [] actual =  { 8, 1,  4, 4, 7, 9, 4,  8, 2};
        int [] expecting =  new int[] {  8, 2};
        Assert.assertArrayEquals(expecting, main.method1(actual));
    }
    @Test
    public void test3Method1(){
        int [] actual =  { 1, 3 ,4,  7, 9, 2};
        int [] expecting =  new int[] { 7, 9,  2};
        Assert.assertArrayEquals(expecting, main.method1(actual));
    }

}
