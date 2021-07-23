package exception;

public class Test1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 4;
        int b = 0;
//		System.out.println(a/b);

        String as = "1234 5";
        try {
            int c = Integer.parseInt(as);
        } catch (NumberFormatException e) {
            //입력하는 방법을 알고 제대로 입력할 수 있도록 유도
            //카운트해서 빠져나가도록
        } catch (Exception e) {
			//예상하지 못한 예외 처리
        }
    }
}