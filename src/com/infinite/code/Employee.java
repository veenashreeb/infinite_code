package com.infinite.code;

import java.util.Scanner;

public class Employee {
    int e_id, age;
    String e_name,address,dept;
    public Employee(){

    }
    public Employee(int e_id,String e_name,String dept,int age,String address){
        this.e_id = e_id;
        this.e_name = e_name;
        this.dept = dept;
        this.age = age;
        this.address = address;
}

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", age=" + age +
                ", e_name='" + e_name + '\'' +
                ", address='" + address + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
    class Tests{
        public void main(String[] args) {
            Tests test = new Tests();

            Employee[] e= new Employee[10];
            for(int i = 1; i<=10;i++){
                e[i] = new Employee();
//                Tests.func(e[i]);
            }
//            void func(){
//                setAge();
//
            }
            void setData(Employee emp){
                Scanner sc = new Scanner(System.in);
//Employee = sc.next();
            }
            void getData(Employee emp) {
                System.out.println();
            }


//      e = new Employee(11, "Veena", "ma",21,"Mysore");
//        System.out.println(e);
        }
    }


