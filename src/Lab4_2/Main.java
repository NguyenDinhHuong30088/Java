package Lab4_2;

public class Main{
    public static void main(String[] args) {


        LopHoc lh = new LopHoc();
        lh.setMalop(1);
        lh.setTenlop("T2008M");
        lh.setPhonghoc("Phòng số 1");


        SinhVien r = new SinhVien();
        r.setMaso(1);
        r.setHovaten("Huong");
        r.setDiachi("Ha Noi");
        r.setSdt(12344456);

        SinhVien r1 = new SinhVien();
        r1.setMaso(2);
        r1.setHovaten("Nam");
        r1.setDiachi("hà nội");
        r1.setSdt(2341678);


        lh.addSv(r);
        lh.addSv(r);
        lh.addSv(r);

        lh.addSv(r1);
        lh.addSv(r1);
        lh.addSv(r1);

        System.out.println("danh sach sinh vien trong lop:");
        for (SinhVien p : lh.getDanhsachsinhvien()) {
            System.out.println("Mã SV:"+p.getMaso() + "\n" + "Họ và tên :"+p.getHovaten() + "\n" +"Địa Chỉ :"+ p.getDiachi() + "\n"+"Sdt:"+ p.getSdt());
            System.out.println();
        }
    }
}