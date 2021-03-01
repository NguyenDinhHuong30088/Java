package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen to : ");
        x = sc.nextInt();
        SoNguyenTo snt = new SoNguyenTo(x);
    }
}
