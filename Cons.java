import java.util.Scanner;

    class Ret {
    private  int id;
    private String name;
    public Ret()
    {
        id=45;
        name="vina";
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public void setId(int n1)
    {
        this.id=n1;
    }
    public int getId()
    {
      return id;
    }}
    public  class Cons{

    public static void main(String[] args) {

        Ret c=new Ret();

        System.out.println(c.getId());
        System.out.println(c.getName());


    }

}
