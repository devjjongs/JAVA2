package iotest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharReadTest {
	public static void main(String[] args) throws IOException{
		// readme.txt ==> char stream 으로 변환
		// File Reader 사용 --> 1:1로 불러오기
		// 한번에 읽어오기 위해 BufferReader 개념을 이용

		File file = new File("c:/datas/readme.txt");
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("ok");
			}else {
				System.out.println("얘기치 않은 문제 발생");
			}
		}
		System.out.println("---파일 존재---");
//		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		System.out.println(bufferedReader.readLine()); // 읽은 파일을 화면에 출력
	}
}