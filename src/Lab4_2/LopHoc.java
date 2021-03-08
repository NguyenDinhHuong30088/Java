package Lab4_2;

import java.util.ArrayList;

public class LopHoc {
    int Malop;
    String Tenlop;
    String Phonghoc;
    ArrayList<SinhVien> Danhsachsinhvien;

    public LopHoc() {
        Danhsachsinhvien = new ArrayList<SinhVien>();
    }

    public int getMalop() { return Malop; }
    public void setMalop(int malop) { Malop = malop; }

    public String getTenlop() { return Tenlop; }
    public void setTenlop(String tenlop) { Tenlop = tenlop; }

    public String getPhonghoc() { return Phonghoc; }
    public void setPhonghoc(String phonghoc) { Phonghoc = phonghoc; }

    public ArrayList<SinhVien> getDanhsachsinhvien(){
        return Danhsachsinhvien;
    }
    public void addSv(SinhVien sv){ getDanhsachsinhvien().add(sv); }
    public void removeSV(int index){
        getDanhsachsinhvien().remove(index);
    }
    public void printDS(){
        System.out.println("danh sách sinh viên trong lớp : "+ Danhsachsinhvien);
    }

}
