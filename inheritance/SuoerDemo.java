public class SuoerDemo {

    public SuoerDemo() {
        System.out.println("Demo");
    }
    
}
class Animal extends SuoerDemo
{
    Animal()
    {
        System.out.println("Animal");
    }
}
class AnimalMain 
{
    public static void main(String args[])
    {
        Animal a=new Animal();
       
    }
}

