public class Circle {
   double pi=3.14;
//    Square s;
   double area(int r)
   {
    Square s=new Square();
   int srad=s.square(r);
    return pi*srad;
   }
   public static void main(String args[])
   {
    Circle c=new Circle();
    System.out.println(c.area(5));
   }
}
