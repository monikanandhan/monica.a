public class Student2 {
    int id;
    String name;
    static String college="Nandha";

        static void change()
        {
            college="kct";
        }
    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // public Student2() {
    // }
    void display()
    {
        System.out.println(id+""+name+""+college);
    } 
}
class Student2main
{
    public static void main(String args[])
    {
        Student2 s1=new Student2(1, "kalai");
        Student2 s2=new Student2(2,"Monica");
        Student2.change();
        // s2.id=s1.id;
        // s2.name=s1.name;
        System.out.println(Student2.college);
        s1.display();
        s2.display();
    }
}
