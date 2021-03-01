package lab2;

public class SoNguyenTo {
    private int a;
    public SoNguyenTo(){
        a = 0;
    }
    boolean isSoNguyenTo(int x){
        if (x < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i< squareRoot; i++){
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    int timSoNguyenToTiepTheo(){
        int songuyentotieptheo;
        int i = 0;
        while (true){
            if (isSoNguyenTo(this.a + ++i) == true){
                return this.a + i;
            }
        }
    }
    public SoNguyenTo(int x){
        if (isSoNguyenTo(x) == true){
            this.a = x;
            System.out.printf("%d la so nguyen to \n", x);
            System.out.println("So nguyen to tiep theo la " + timSoNguyenToTiepTheo());
        }else{
            System.out.printf("%d khong phai la so nguyen to", x);
        }
    }
}
