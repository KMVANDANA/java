public class StaticMethod {
    public static void main(String[] args) {
        int result=MathUtility.add(12,45);
        System.out.println(result);

    }
}
class MathUtility{
    public static  int add(int f,int s){
        return f+s;
    }
}
