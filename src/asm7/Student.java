package asm7;

public class Student {
    int ID;
    String Name;
    int Age;
    String Address;
    Float Gpa;

    public Student() {

    }

    public Student(int ID, String name, int age, String address, Float gpa) {
        this.ID = ID;
        Name = name;
        Age = age;
        Address = address;
        Gpa = gpa;
    }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

    public int getAge() { return Age; }
    public void setAge(int age) { Age = age; }

    public String getAddress() { return Address; }
    public void setAddress(String address) { Address = address; }

    public Float getGpa() { return Gpa; }
    public void setGpa(Float gpa) { Gpa = gpa; }



}
