public class Emp {
    private int salary;
    private String  name;
    public int getSalary()
    {
      return salary;
    }
    public void  setSalary(int n)
    {
         salary=n;
    }
    public String getName()
    {
       return  name;
    }
    public void   setName(String na)
    {

      name=na;
    }

    public static void main(String[] args) {
        Emp van =new Emp();
        van.setName("vandana");
        System.out.println(van.getName());
        van.setSalary(20000);
        System.out.println(van.getSalary());




    }
}
