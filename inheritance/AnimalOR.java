public class AnimalOR {
    String color="white";
    void printColor()
    {
        System.out.println("hello parent class");
    }
}
 class Dog extends AnimalOR
 {
    String color="red";
    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
   void demo()
   {
    printColor();
    super.printColor();
   
   }
 }
 class DemoMain2
 {
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.demo();
    }
 } 
