package bit;

public class TestString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        {
            String s1 = "ghgh";
        }

        char[] chs = new char[]{'g', 'h', 'g', 'h'};
        String s2 = new String(chs);

        String s3 = new String("ghgh");
        String s4 = new String("ghgh");

        {
            String s5 = "ghgh";
            String s6 = "ghgh";

            s5 += "씨";

            System.out.println(s5);

            s5 += "  안녕하세요";
        }
        // Date d1 = 1999.9.9;
    }
}