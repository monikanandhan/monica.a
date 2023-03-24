public class Student {
    int id;
    String name;
    float marks;
    float total;
    
    // public Student(int id,String name)
    // {
    //     this.id=id;
    //     this.name=name;
    // }

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public Student() {
    }
    Student (int id,String name,float marks,float total)
    {
        // this.id = id;
        // this.name = name;
        // this.marks = marks;
        this(id,name,marks);
        this.total=total;
    }
    void s(Student s)
    {
        id=s.id;
        name=s.name;
        marks=s.marks;
    }
    void p()
    {
        s(this);
    }

    // void insertRecord(int i,String nam,float mark)
    // {
    // id=i;
    // name=nam;
    // marks=mark;

    
    // }
    void display()
    {
        System.out.println(id+""+name+""+marks+""+total);
    }


    public static void main(String args[])
    {
        Student z=new Student();
        // z.s(100,"Sandhiya",200.8F);
        // Student s1=new Student(200 , "monica");
        // Student s1=new Student(100,"monica",200,500);
        // s.id=100;
        // s.name="Monica";
        // s.marks=10.2f;
        // s.insertRecord(200, "AArthi", 100.5F);
        // System.out.println(s.id);
        // System.out.println(s.name);
        // System.out.println(s.marks);
        // s.display();
        z.p();
        // s1.display();

    }
}
