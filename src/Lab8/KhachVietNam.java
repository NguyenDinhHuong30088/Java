package Lab8;

public class KhachVietNam extends KhachHang{
    public String DoiTuong;

    public KhachVietNam() {
    }

    public String getDoiTuong() {
        return DoiTuong;
    }

    public void setDoiTuong(String DoiTuong) {
        this.DoiTuong = DoiTuong;
    }

    public KhachVietNam(String DoiTuong) {
        this.DoiTuong = DoiTuong;
    }


    @Override
    public double thanhTien() {
        if(getSoluong()<50){
            return getSoluong()*1000;
        }else if(getSoluong() >= 50 && getSoluong()<100){
            return (getSoluong()-50)*1200 + 50 * 1000;
        }else if(getSoluong()>=100 && getSoluong() < 200){
            return (getSoluong()-100)*1500+ 50 * 1200 + 50 * 1000;
        }else{
            return (getSoluong()-200)*2000 +  100*1500 + 50 * 1200 + 50 * 1000;
        }
    }
}
