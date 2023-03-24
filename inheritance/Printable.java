public interface Printable {
    void print();
    default void draw(){
        System.out.println("drawing");
    }
    static int Cube(int n)
    {
        return n*n*n;
    }
}
interface Showable extends Printable
{
    void show();
}
class Example implements Showable
{
    public void print()
    {
        System.out.println("printable");
    }
    public void show()
    {
        System.out.println("showable");
    }
}
class MainExample 
{
    public static void main(String args[])
    {
        Example e=new Example();
        e.show();
        e.print();
        e.draw();
        System.out.println(Printable.Cube(10)); 
    }
}
