class Employee {
int salary=4000;
 final  void display()
   {
    System.out.println("final block");
   }

}
class Programmer extends Employee
{
 
    int bonus=1000;
    
}

class MainMethod
{
    public static void main(String args[])
    {
        Programmer p=new Programmer();
       System.out.println(p.salary);
       System.out.println(p.bonus);
     

    }
}
