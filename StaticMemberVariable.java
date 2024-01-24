import java.util.function.ObjDoubleConsumer;

//example of declare and use staticc member variable inside a java class
public class StaticMemberVariable {
    public static void main(String[] args) {
     ObjectCounter obj1=new ObjectCounter();
        System.out.println(obj1.getNumberOfObject());
        ObjectCounter obj2=new ObjectCounter();
        System.out.println(obj2.getNumberOfObject());

    }
}
class ObjectCounter{
    static  int counter=0;
    public ObjectCounter()
    {
        counter++;
    }
    public int getNumberOfObject()
    {
        return counter;
    }

}
