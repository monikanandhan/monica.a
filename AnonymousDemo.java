public class AnonymousDemo {
    
   

    void insertData(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println(fact);
        }
      
    }
    
}
class Demo1
{
    public static void main(String args[])
    {
        new AnonymousDemo().insertData(5);
     

    }
}
