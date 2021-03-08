package LAPs1;

public class Product {
    int Product_code;
    String Product_name;
    float Price;
    int Amount;
    String Unit;

    void run(){
        System.out.println( "Product_code :\t" + Product_code );
        System.out.println( "Product_name :\t" + Product_name );
        System.out.println( "Price :\t" + Price );
        System.out.println( "Amount :\t" + Amount );
        System.out.println( "Unit :\t" + Unit );
    }
    void changeQty(int q){
        Amount += q;
    }

    void changePrice(float p){
        Price = p;
    }

    boolean checkStock(){
        if (Amount > 0) return true;
        return false;
    }
}
