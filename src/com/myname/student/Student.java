package com.myname.student;

import java.util.Scanner;

class Student1 {
    private String name;
    private int rollno;
    private double cpi;

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void search(Student1[] arr, int rollno){

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student1[] arr= new Student1[2];
        for (int i= 0; i<2; i++) {
            arr[i].setCpi(8.8);
            arr[i].setName("sss");
            arr[i].setRollno(76);
        }
    }

}
