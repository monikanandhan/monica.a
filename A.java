public class A {
    A()
    {
        this(10);
        System.out.println("hello a");
    }
    A(int n)
    {
         
        System.out.println(n);
       
    }
    // void m()
    // {
    //     System.out.println("hello m");
    // }
    // void n()
    // {
    //     System.out.println("hello n");
    //     m();
    // }
    public static void  main(String args[])
    {
        A a=new A();
        // a.n();
        // a.m();
    }
}
