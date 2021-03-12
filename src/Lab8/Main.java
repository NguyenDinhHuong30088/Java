package Lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList ds =  new ArrayList();
        KhachVietNam khvn = new KhachVietNam();
        khvn.setSoluong(217);
        ds.add(khvn);

        KhachNuocNgoai khnn = new KhachNuocNgoai();
        khnn.setSoluong(20);
        ds.add(khnn);

        for (int i=0;i<ds.size();i++){
            if(ds.get(i) instanceof KhachVietNam){
                System.out.println("tong tien: "+((KhachVietNam) ds.get(i)).thanhTien());
            }else if(ds.get(i) instanceof KhachNuocNgoai) {
                System.out.println("tong tien: "+((KhachNuocNgoai) ds.get(i)).thanhTien());
            }
        }
    }
}
