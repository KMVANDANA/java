public class LeapYear {
    public  static void leapYear(int n)
    {
      if((n%100==0 && n%4==0) || n%400==0)
      {
          System.out.println("leap year");
      }

      else{
          System.out.println("not Leap Year");
      }
    }

    public static void main(String[] args) {
        LeapYear ly=new LeapYear();
        ly.leapYear(1600);

    }
}
