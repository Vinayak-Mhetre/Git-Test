package com.company;

import java.io.IOException;

public class ExceptionTest {

    void show()throws  IOException{
        throw new IOException();
    }
       void show2()throws  ArithmeticException{
           throw new ArithmeticException();
       }

    public static void main(String[] args) {
        ExceptionTest obj =new ExceptionTest();
        try{
            obj.show();
            obj.show2();
        }catch (IOException | ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("After try");
    }
}

