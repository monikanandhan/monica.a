import java.util.ArrayList;
import java.util.Scanner;



public class Login{
    public static void main(String args[])
    {
    ArrayList<String> a=new ArrayList<>();
    a.add("book");
    a.add("books");
    a.add("booking");
    a.add("ticket");

    ArrayList<String> c=new ArrayList<>();
    c.add("jira");
    c.add("worklog");
    c.add("teams");
    c.add("outlook");

   Scanner sc=new Scanner(System.in);
   String b=sc.nextLine();
   System.out.println(b);

  
    if(a.contains(b.toLowerCase()))
{
    System.out.println("kgislhelpdesk.com");
}
else if(c.contains(b.toLowerCase()))
{
    System.out.println("jirahelpdesk.com");
}
else
{
    System.out.println("contact admin");
}
}
    }




