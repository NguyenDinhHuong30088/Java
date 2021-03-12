package Lab8;

public class KhachNuocNgoai extends KhachHang{
    public String QuocTich;

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        this.QuocTich = quocTich;
    }

    @Override
    public double thanhTien() {
        return getSoluong() * 2000;
    }
}
