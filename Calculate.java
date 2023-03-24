public class Calculate {
    static{System.out.println("static block");}
    static int cube(int n)
    {
        return n*n*n; 
    }
    public static void main(String args[])
    {
       System.out.println(Calculate.cube(10)); 
    }
}
