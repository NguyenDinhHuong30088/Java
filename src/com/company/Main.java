package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello world!");
//        int x;
//        x= 10;
//        if (x>5){
//            System.out.println(x+" la so duong");
//        }else{
//            System.out.println(x+" <=5");
//        }
//        for (int i=0;i<10;i++){
//            System.out.println("i="+i);
//        }
        Student st ; //khai bao 1 bien co kieu du lieu Student
        st = new Student();//tao doi tuong-> st se co 1 o nho
        Student st2 = new Student();
        st.name = "Nguyen Dinh Huong";
        st2.name = "Nguyen Dinh Nam";
        st.run();
        st2.run();

    }
}
