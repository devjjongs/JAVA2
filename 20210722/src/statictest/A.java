package statictest;

public class A {
    public int x;
    public int x2;
    public static int y;
//    public int x;           // instance 적인 멤버 변수
//    public static int y;
    public A(){
        x++;
        y++;
        x2=y;
    }
}
