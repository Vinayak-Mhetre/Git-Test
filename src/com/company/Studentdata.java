package com.company;

public class Studentdata {
    private int id;
    private String name;
    private String city;

//    public Studentdata(int id,String name,String city){
//        System.out.println("Inside constructor");
//        this.id=id;
//        this.name=name;
//        this.city=city;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class student{
    public static void main(String[] args) {

        //Student 1
        Studentdata student1 = new Studentdata();
        student1.setId(1);
        student1.setName("Vinayak");
        student1.setCity("Pune");
        System.out.println(student1.getId()+": "+student1.getName()+": "+student1.getCity());

        //Student 2
        Studentdata student2 = new Studentdata();
        student2.setId(2);
        student2.setName("Abhay");
        student2.setCity("Mumbai");
        System.out.println(student2.getId()+": "+student2.getName()+": "+student2.getCity());

//        Studentdata student1 = new Studentdata(1,"Vinayak","Pune");
//        Studentdata student2 = new Studentdata(2,"Abhay","Mumbai");
//        student2.getId();
//        student2.getName();
//        student2.getCity();
    }
}
