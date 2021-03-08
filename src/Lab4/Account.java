package Lab4;

public class Account {
    // Các phương thức
    int id;
    String name;
    int balance;
    //Hàm khởi tạo
    public Account(){
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }
    /*credit(amount: int): Nạp tiền vào tài khoản,
    tài khoản sẽ được cộng lên một khoản amount.
     Kiểm tra tham số đầu vào phải là số dương.*/
    public void credit(int amount){
        if(amount>0){
            setBalance(getBalance()+amount);
            return;
        }
        System.out.println("Nap tien that bai");
    }
    /*debit(amount: int): Thanh toán tiền,
     tài khoản sẽ được trừ một số lượng tiền amount.
      Nếu số tiền thanh toán lớn hơn số tiền trong tài khoản thì thông báo thanh toán không thành công.*/
    public void debit(int amount){
        if(amount > this.balance){
            System.out.println("Thanh thanh that bai");
            return;
        }
        this.balance -= amount;
    }
    /*tranferTo(account: Account), chuyển tiền từ tài khoản này cho tài khoản khác.
     Ví dụ Account A có balance = 50,ance B có balance = 10. A.tranferTo(B, 10). A (balance = 40), B (balance = 20).
    Chú ý kiểm tra nếu chuyển số tiền nhiều hơn tài khoản hiện Acó thông báo lỗi chuyển tiền không thành công.*/
    public boolean transferTo(Account account,int amount){
        if(amount >0 && amount <= getBalance()){
            debit(amount);
            account.credit(amount);
            return true;
        }
        return false;
    }

}
