import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainCalss {

	public static void main(String[] args) throws IOException {

		int count = 0; 
		{
			File file = new File("data/data1.txt");  // 파일우ㅣ치 경로를 가지고 있음. File입력 후 컨트롤 스페이스 누르면 빠른 생성
			FileInputStream src  = new FileInputStream(file); //예외처리// FileInputStream: 파일을 읽어와서 메모리공간에올려놓는것, 참조는src가 한다. 
			Scanner sc = new Scanner(src); // 스캐너가 src 파일을 읽는 것, 


			while(sc.hasNext())	{ //빈칸 구분해서 가져옴, nextline이랑 다름 // 데이타를 읽어오고 나서 앞의 데이타는 ㅈl워지며 순차적으로 읽어옴. 
				String tmp = sc.next();
				System.out.printf("%s ", tmp);
				count++;

			} 
			System.out.println("\ncount: " + count);

			sc.close(); // 반드시 클로즈 해야 한다. 
			src.close(); // 닫아야 뻑 안남 
		}

//배열 공간 data1.txt 내용 넣기
// 위쪽 영역과 따로 분리되어 사용된다. 
		int[] nums = new int[count];
		{
			File file = new File("data/data1.txt");  // 파일위치 경로를 가지고 있음. File입력 후 컨트롤 스페이스 누르면 빠른 생성
			FileInputStream src  = new FileInputStream(file); //예외처리// FileInputStream: 파일을 읽어와서 메모리공간에올려놓는것, 참조는src가 한다. 
			Scanner sc = new Scanner(src); // 스캐너가 src 파일을 읽는 것, 

			for(int i =0; i<count; i++) {
				String tmp = sc.next();
				nums[i]	= Integer.parseInt(tmp);
			}

			System.out.println("Nums : " + Arrays.toString(nums));

			sc.close(); // 반드시 클로즈 해야 한다. 
			src.close(); // 닫아야 뻑 안남 
		}
	
//배열에서  특정 숫자를 찾기
//	배열의 우ㅣ치 == 찾는 숫자  , 반복해서 찾기 
//	
	{
		int index = -1;
		for(int i = 0; i<count; i++)
			if(88 == nums[i])
				index = i;
			break; 
		} System.out.println(index);
	}
}