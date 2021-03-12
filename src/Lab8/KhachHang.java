package Lab8;

public abstract class KhachHang {
    int maKh;
    String tenKh;
    String ngayraHD;
    int soluong;

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getNgayraHD() {
        return ngayraHD;
    }

    public void setNgayraHD(String ngayraHD) {
        this.ngayraHD = ngayraHD;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public abstract double thanhTien();
}

