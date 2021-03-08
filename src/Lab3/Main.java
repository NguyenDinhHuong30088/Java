package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        r.setName("Phong 1");
        r.setPosition("Ha Noi");
        r.addUser("Huong");
        r.addUser("Thinh");
        r.addUser("Dat");
        r.removeUser(2);
        r.printRoom();
    }
}
