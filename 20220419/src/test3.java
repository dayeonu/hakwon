import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		/*
배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 갯수만큼 '*'을 찍어서
그래프를 그리는 프로그램이다. */
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2}; 

		int[] counter = new int[4];
//		System.out.println(Arrays.toString(counter));

		for(int i = 0; i<answer.length; i++) {
			counter[answer[i]-1]++;
		}
		for(int i = 0; i<counter.length; i++) {

			System.out.print(i+1);

			for(int j=0; j<counter[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}}
/*
 * 출력결과는 
 * 
 * 	3***
 *  2** 
 *  2** 
 *  4****
 */
//울엄마김치찌개
//이삭토스트 옆 (저렴)
//상무초밥