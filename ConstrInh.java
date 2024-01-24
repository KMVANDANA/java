public class ConstrInh {
    public int x;
    ConstrInh()
    {
        System.out.println("constrInt constructor:::");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

    class You  extends ConstrInh{
    public int y;
    You()
    {
        System.out.println("you");
    }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }


        public static void main(String[] args) {
            ConstrInh ci=new ConstrInh();
            You y=new You();

        }}