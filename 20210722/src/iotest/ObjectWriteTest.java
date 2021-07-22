package iotest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Member member = new Member(123, "Kim malja", "123");
		
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		try {
			fileOutputStream = new FileOutputStream("20210722/20210722.dat");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
													//으로부터 파생된 클래스의 인스턴스
			objectOutputStream.writeObject(member);
			objectOutputStream.flush();
			//System.out.println("1");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}