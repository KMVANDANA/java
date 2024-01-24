public class GetSet {
    int x;
    public int getX()
    {
        return  x;
    }
    public void setX(int x)
    {
        System.out.println("i am in base class and setting x");
        this.x=x;
    }
    class Drived extends GetSet {
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {

            this.y = y;
        }

    }
    public static void main(String args[])
    {
        GetSet gs=new GetSet();
        //gs.getX();
        gs.setX(9);
        System.out.println(gs.getX());

//        Drived d=new Drived();
//        int v= d.getY();
//        d.setY(12);
//        System.out.println(v);





    }
}
