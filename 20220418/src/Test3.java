import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test3{

	public static void main(String[] args) throws IOException, InterruptedException {

			// 배열의 데이터 갯수 찾기. 
		
		int count=0;
		{
			//1.파일을 생성하는 순서
			File file = new File("data/data1.txt");  //화면에 표시하고자 하는 파일을 선택한다. File file = new File("경로넣기");
			FileInputStream src = new FileInputStream(file);  // 파일 읽어오기. 
			// FileIntputStream을 사용햇으면, close()메소드를 통해 닫아주는 것이 중요한 포인트.!
			
			Scanner sc = new Scanner(src);

			while(sc.hasNext()) { // sc.hasNext는 스캐너 객체로 데이터가 들어왔는지 여부를 반환하는 함수. 입력이 잇으면, true 
				String tmp = sc.next(); 
								/*
								 * sc.next() 다음 토큰을 읽습니다. 
								 * sc.nextLine() 다음 행을 읽습니다.
								 * sc.hasNext() 토큰이 잇는지 확인하여boolean을 리턴합니다. 공백의 경우 무시합니다. 
								 * sc.hasNextLine() 행이 있는지 확인 후 boolean을 리턴합니다.
								 * 줄바뀜이 있으면 true를 리턴합니다.
								 */
			
				System.out.printf("%s " , tmp); //배열에 들어잇는 데이터 출력~ 
					count++; 
			} //항상 중괄호 확인 하기!!!
			
			System.out.println("\ncount : " + count);

			sc.close();
			src.close();
		}
		
		int[] nums = new int[count]; //배열 데이터 카운트 해서 count 10개 인것 까지 확인했으니까  앞으로 count값은 10
		{
// 배열 공간 data1.txt 내용 넣기
			File file = new File("data/data1.txt"); //화면에 표시하고자 하는 파일을 선택한다. File file = new File("경로넣기")
			FileInputStream src = new FileInputStream(file);// 파일 읽어오기. 
			
			Scanner sc = new Scanner(src);

			for(int i=0; i<count; i++) { //0~9까지 회전. 
				String tmp = sc.next(); // 문자열 tmp 변수 이므로 
								/*
								 * sc.next() 다음 토큰을 읽습니다. 
								 * sc.nextLine() 다음 행을 읽습니다.
								 * sc.hasNext() 토큰이 잇는지 확인하여boolean을 리턴합니다. 공백의 경우 무시합니다. 
								 * sc.hasNextLine() 행이 있는지 확인 후 boolean을 리턴합니다.
								 * 줄바뀜이 있으면 true를 리턴합니다.
								 */
				nums[i]  = Integer.parseInt(tmp); //문자열 tmp 변수 이므로  Integer.parseInt 문자열을 숫자로 변환 
			}

			System.out.println("nums : " + Arrays.toString(nums));

			sc.close();
			src.close();
		}
		
		
	}
}