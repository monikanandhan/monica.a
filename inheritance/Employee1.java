public class Employee1 {
    int id;  
    String name;  
    Address ad;

    public Employee1(int id, String name, Address ad) {
        this.id = id;
        this.name = name;
        this.ad = ad;
    }  
    void display()
    {
        System.out.println(id+""+name);
        System.out.println(ad.city+""+ad.country+""+ad.state);
    }
}
    class DemoMain
    {
    public static void main(String args[])
    {
        Address a1=new Address("sathy", "tn", "india");
        Employee1 e1=new Employee1(1, "Monica", a1);
        e1.display();
        
    }
}


