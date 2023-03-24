public class ArrayDemo {
  static void min(int a[])
  {
    int mini=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(mini>a[i])
        {
            mini=a[i];
            System.out.println(mini);  
        
        }
    }
  }
}

class DemoSample
{
  public static void main(String args[])
  {
    int a[]={10,20,30};
    min(a);
  }
}
