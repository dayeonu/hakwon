
public class test {

	public static void main(String[] args) {

		// 0~44개
		int[] arr = new int[45];
		for(int i = 0; i<arr.length; i++) 
		 arr[i]	= i+1; // 0~44방의 배열에 순차적으로 1~45값 넣기 
		 
		 int tmp = 0; //빈공간 변수
		 int j = 0; //랜덤값 넣을 변수 
		 // 1~ 45 개 랜덤 숫자 뽑아서 j에 넣기 
		 
		 for(int i=0; i<6; i++) {
			 j= (int)(Math.random()*45);
			tmp = arr[j];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		 for(int i=0; i<6; i++)
			 System.out.println(arr[i]);
	}
	}
