package org.example;

import org.example.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StackTest {
    private Stack s ;




    @Test
    public void testisemptytrue(){
        Assertions.assertTrue(s.isEmpty());
    }



    @Test
    public void testSize(){
        Assertions.assertEquals(0,s.size());
    }
    @Test
    public void testisemptyfalse(){
        s.push(2);
        Assertions.assertFalse(s.isEmpty());
    }



    @Test
    public void testPush(){
        int sizebeforePush = s.size();
        s.push(15);
        int sizeafterPush = s.size();
        Assertions.assertEquals(1 ,sizeafterPush-sizebeforePush );
    }

    @Test
    public  void testPeekwhene_empty(){
        try{
            int head  = s.peek() ;

        }catch (Exception exeption){
            Assertions.fail(exeption.getMessage());

        }
    }

    @Test
    public void testPeekwhen_notempty(){
        s.push(5);
        int head = s.peek();
        Assertions.assertEquals(5,head);
    }

    @Test
    public void testPop(){
        try {
            s.push(8);
            int size1  = s.size();
            s.pop();
            int size2 = s.size();
            Assertions.assertEquals(1,size1-size2);
        } catch (IllegalStateException e) {

            System.out.println("test");
            System.out.println("test2");
            Assertions.fail(e.getMessage());
        }
    }
}
