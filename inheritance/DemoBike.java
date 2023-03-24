abstract class DemoBike {
    abstract void run();
}
class Honda extends DemoBike
{
    void run()
    {
        System.out.println("bike is running");
    }
}
class BikeDemo
{
    public static void main(String args[])
    {
        Honda h=new Honda();
        h.run();
    }
}
