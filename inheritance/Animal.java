public class Animal {
    void eat(){
        System.out.println("super class");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("dog class");
    }
}
class Cat extends Animal{
    void meow()
    {
        System.out.println("cat class");
    }
}
class Cow extends Animal{
    void sound()
    {
        System.out.println("cow class");
    }
}

class Testmain
{
    public static void main(String args[])
    {
        Cow c=new Cow();
        c.eat();
        // c.bark();
        // c.meow();
        c.sound();
    }
}
