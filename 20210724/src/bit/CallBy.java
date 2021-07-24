package bit;

import java.util.Date;

public class CallBy {

    public void me1(Date d) {
        d.setYear(2025 - 1900);
    }

    public void me2(int a) {
        a = 2025;
    }


    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        int a = 20;

        CallBy ref = new CallBy();
        ref.me1(today);
        System.out.println("ref.me1(today); ==> " + today);

        System.out.println(a);
        ref.me2(a);
        System.out.println("ref.me2(a); 후 ==> " + a);
    }
}
