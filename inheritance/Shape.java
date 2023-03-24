abstract class Shape {
    Shape()
    {
        System.out.println("Constructor");
    }
    
    abstract void shapeModel();
    void draw()
    {
        System.out.println("non abstract class");
    }
    // abstract void drawShape();
}
class Triangle extends Shape{
    void shapeModel()
    {
System.out.println("Triangle");
    }
}
class Hexagon extends Shape
{
    void shapeModel()
    {
        System.out.println("Hexagon");
    }
}
class Cone extends Shape{
    void shapeModel()
    {
        System.out.println("Conefellow");
    }
}

class ShapeDemo 
{
    public static void main(String args[])
    {
        Shape s=new Triangle();
        s.shapeModel();
        s=new Cone();
        s.shapeModel();
        s.draw();
        
    }
}