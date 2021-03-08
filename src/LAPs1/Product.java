package LAPs1;

public class Product {
    int Product_code;
    String Product_name;
    float Price;
    int Amount;
    String Unit;

    //Hiển thị
    void run(){
        System.out.println( "Product_code :\t" + Product_code );
        System.out.println( "Product_name :\t" + Product_name );
        System.out.println( "Price :\t" + Price );
        System.out.println( "Amount :\t" + Amount );
        System.out.println( "Unit :\t" + Unit );
    }
    //tăng/giảm số lượng
    void changeQty(int q){
        Amount += q;
    }

    //thay đổi giá tiền sản phẩm
    void changePrice(float p){
        Price = p;
    }

    //kiểm tra hàng còn/hết hàng.
    boolean checkStock(){
        if (Amount > 0) return true;
        return false;
    }
}
