public class Account {
    int acc_no;
    String name;
    float amount;
    void insert(int acc_no,String name,float amount)
    {
        this.acc_no=acc_no;
        this.name=name;
        this.amount=amount;
    }
void deposit(float amt)
{
    amount=amount+amt;
    System.out.println(amt+"is deposited");
}
void withdraw(float amt)
{
    if(amount<amt)
    {
        System.out.println("insufficient balance");
    }
    else{
        amount=amount-amt;
        System.out.print(amt+"withdrawn");
    }
}
void BalanceCheck()
{
    System.out.println(amount+"is balance");
}
void display()
{
    System.out.println(acc_no+""+name+""+amount);
}
}
class AccountMain
{
    public static void main(String args[])
    {
        Account acc=new Account();
        acc.deposit(1000);
        acc.withdraw(200);
        acc.BalanceCheck();
        acc.insert(1, "Monica", 1000);
        acc.display();
    }
}
