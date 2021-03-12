package BaiThi;

import java.util.ArrayList;

public class Hotel {
    String name;
    String location;
    String ownerName;
    ArrayList<Hotel> HotelList;

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addHotel(String name,String location,String ownerName){
        for (Hotel n:HotelList){
            if (n.getName().equals(name)){
                System.out.println("Khach hang da ton tai");
                return;
            }
        }
    }

    public void checkHotel(String name){
        for (Hotel ht: HotelList){
            if (ht.getName().equals(name)){
                System.out.println("Nhap tin khach hang");
                return;
            }else System.out.println("Khong co thong tin khach hang");
            Hotel a = new Hotel();
        }
    }
    public void Output(){
        System.out.println(name+location+ownerName);
    }
}
