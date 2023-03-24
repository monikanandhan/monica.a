public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
class TestDemo{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.setId(100);
        s1.setName("Monica");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}
