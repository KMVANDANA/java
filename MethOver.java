public class MethOver {
    public void ret()
    {
        System.out.println("hello ");
    }
    public void ret(int a)
    {
        System.out.println("hello 2");
    }

    public void ret(int a, int b)
    {
        System.out.println("hello 3");
    }
    public static  void main(String args[])
    {
        MethOver mo=new MethOver();
        mo.ret();
        mo.ret(1);
        mo.ret(1,2);
    }

}
