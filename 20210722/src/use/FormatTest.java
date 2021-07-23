package use;

public class FormatTest {
    public static void main(String[] args) {
        long a = 1000000000;
        double rate = 7.8;
        System.out.printf("%,d  %4.1f%%",a,rate);
    }
}
