package BaiThi;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Hotel> ht = new ArrayList<Hotel>();
        ht.add(new Hotel("Chuong My", "Ha Noi", "Tong Nguyen Giang"));
        ht.add(new Hotel("Phung Chau", "Ha Noi", "Nguyen Phi Cong"));
        ht.add(new Hotel("Tien Phuong", "Ha Noi", "Nguyen Dinh Huong"));
        ht.add(new Hotel("Tan Hoa", "Ha Noi", "Nguyen Dinh Nam"));
        ht.add(new Hotel("Tan Phu", "Ha Noi", "Vu Tri Linh"));
        ht.add(new Hotel("Quoc Oai", "Ha Noi", "Vu Tri Khiem"));
        ht.add(new Hotel("Dai Thanh", "Ha Noi", "Do Duy Thuong"));
        ht.add(new Hotel("Ngoc Hoa", "Ha Noi", "Tong Dinh Minh"));
        ht.add(new Hotel("Dai Yen", "Ha Noi", "Nguyen Van Manh"));
        ht.add(new Hotel("Thanh Oai", "Ha Noi", "Vu Ngoc Quan"));
        Scanner scanner = new Scanner(System.in);
        String ownerName;
        System.out.println("Nhap Ten Chu Khach San:");
        ownerName = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < ht.size(); i++) {
            if (ownerName.equals(ht.get(i).getOwnerName())) {
                System.out.println("Ten Khach San: " + ht.get(i).getName() + "\n Dia Chi: "
                        + ht.get(i).getLocation() + "\n Ten Chu Khach San: " + ht.get(i).getOwnerName());
            }
        }
    }
}