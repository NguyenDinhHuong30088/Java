package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        r.setName("Phong so 1");
        r.setPosition("Vinh Phuc");
        r.addUser("Truong Quang Huy");
        r.addUser("Dao Minh Giang");
        r.addUser("Hoàng Văn Sơn");
        r.removeUser(2);
        r.printRoom();
    }
}
