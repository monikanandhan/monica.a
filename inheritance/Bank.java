public class Bank {
    float getROI()
    {
        return 0;
    }
}
class SBI extends Bank{
    float getROI()
    {
        return 2.8F;
    }
}
class ICICI extends Bank{
    float getROI()
    {
        return 5.5f;
    }
}
class AccountMain
{
    public static void main(String args[])
    {
        Bank b=new SBI();
        System.out.println(b.getROI()) ;
       b=new ICICI();
       System.out.println(b.getROI()) ;
      
      
    }
}
