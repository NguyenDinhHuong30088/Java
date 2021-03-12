package BaiThi;

public class Main {
    public static void main(String[] args){
        Hotel a= new Hotel();
        a.addHotel("Chuong My","Ha Noi","Nguyen Dinh Huong");
        a.addHotel("Quoc Oai","Ha Noi","Nguyen Dinh Nam");
        a.addHotel("My Duc","Ha Noi","Nguyen Phi Cong");
        a.addHotel("Thuong Tin","Ha Noi","Vu Tri Linh");
        a.addHotel("Cao Phong","Ha Noi","Nguyen Van Hieu");
        a.addHotel("Thach That","Ha Noi","Tong Quang Son");
        a.addHotel("Bien Giang","Ha Noi","Tong Dinh Minh");
        a.addHotel("Thanh Oai","Ha Noi","Do Duy Thuong");
        a.addHotel("Ha Dong","Ha Noi","Nguyen Van Manh");
        a.addHotel("Chuc Son","Ha Noi","Tong Nguyen Giang");

        for (Hotel y:a.HotelList){
            System.out.println(a.name+a.location+a.ownerName);
        }
    }
}
