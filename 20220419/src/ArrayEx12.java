import java.util.Arrays;

public class ArrayEx12 {

	public static void main(String[] args) {

		//기본형, 참조형
		//기본형 --> int, double  >> 기본형 변수 공간안에는 값이 저장됨
		//참조형 --> string >> 참조형 변수 공간에는 주소값이 저장됨
		
		String[] name = new String[] {"kim", "park", "yi"};
		
		int[] age = new int[3];
		
		age[0]=100;
		name[0]="kim";
		
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(name));
		
	
	}//main의 끝
}

