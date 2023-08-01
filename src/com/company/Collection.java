package com.company;
import  java.util.ArrayList;
public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(4);
        arr.add(42);
        arr.add(14);
        arr.add(40);

        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        for(int e:arr){
            System.out.println(e);
        }


    }
}
