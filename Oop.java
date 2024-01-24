public class Oop {
    int id;
    String name;
    public void printD()

    {
        System.out.println("id:--"+id);
        System.out.println("name:--"+name);


    }

    public static void main(String[] args) {
        Oop n1=new Oop();
        Oop n2=new Oop();

        n1.id=12;
        n1.name="vandana";


        n2.id=12;
        n2.name="vansika";


        n1.printD();
        n2.printD();
    }
}
