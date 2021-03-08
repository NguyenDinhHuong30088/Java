package LAPs1;

public class Main {
    // Lab s1
    public static void main(String[] args) {
        Product sp1;
        sp1 = new Product();
        sp1.Product_code = 1;
        sp1.Product_name = "SP so 1";
        sp1.Price = 2000;
        sp1.Amount = 10;
        sp1.Unit = "Chiec";
        sp1.run();
        sp1.changeQty(4);
        sp1.changePrice(20);
        if (sp1.checkStock()){
            System.out.println(sp1.Product_name+" Con " +sp1.Amount+ "SP\n");
        }else{
            System.out.println(sp1.Product_name+" Het Hang\n");
        }




        Product sp2;
        sp2 = new Product();
        sp2.Product_code = 2;
        sp2.Product_name = "SP so 2";
        sp2.Price = 5300;
        sp2.Amount = 50;
        sp2.Unit = "Chiec";
        sp2.run();
        sp2.changeQty(4);
        sp2.changePrice(20);
        if (sp2.checkStock()){
            System.out.println(sp2.Product_name+" Con " +sp2.Amount+ "SP \n");
        }else{
            System.out.println(sp2.Product_name+" Het Hang \n");
        }



        Product sp3;
        sp3 = new Product();
        sp3.Product_code = 3;
        sp3.Product_name = "SP so 3";
        sp3.Price = 45610;
        sp3.Amount = 2;
        sp3.Unit = "Chiec";
        sp3.run();
        sp3.changeQty(4);
        sp3.changePrice(20);
        if (sp3.checkStock()){
            System.out.println(sp3.Product_name+" Con " +sp3.Amount+ "SP\n");
        }else{
            System.out.println(sp3.Product_name+" Het Hang\n");
        }

    }
}
