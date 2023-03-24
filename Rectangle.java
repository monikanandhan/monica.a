public class Rectangle {
    int length;
    int width;

    void insert(int length,int width)
    {
    this.length=length;
    this.width=width;
    }
    void calculate()
    {
        int area = length*width;
        System.out.println(area);
    }
}
class TestMain
{
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle(),r2=new Rectangle();
       
        r1.insert(10, 10);
        r2.insert(20, 20);
        r1.calculate();
        r2.calculate();
}
}
