import java.util.Arrays;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {


		int[] arr = { 6,9,7,3,5 };

		for(int i = 0; i<arr.length-1; i++) {

			int index = i;

			for(int j = 0; j<arr.length; j++) { // 0~5   

				if(arr[index] > arr[j]) 
					index = j;
			}

			if(index != i) {
				int tmp = arr[index];
				arr[index] = arr[i];
				arr[i] =tmp;
			}
			System.out.println(i+1+"회전" +Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	
	}//end
}
			//( //0과 1자리 값 비교 조건, 총 4번  ) {

//						int tmp =0; // 빈 통 준비

//					값을 옆자리로  바꾸기 
//					arr[tmp] = arr[i];
//					arr[i]= arr[j];
//					arr[j]=arr[tmp];
//				
 