
public class Ex01_01 {

	public static void main(String[] args) {
		
		float pi = 3.14159f;
		System.out.printf("%.3g",pi); //%g 표시는 소수점포함7자리까지 나옴, .1 .2 .3을 넣어주면 해당 수까지 출력됨.

		float result = (int)(pi*100) / 100.0f; //형변환을 이용. 
		System.out.println();
		System.out.println(result);
		
		float result2 =(int)(pi);
				System.out.printf("%g",result2);
			
//		float result2 = (int)(pi*1000+0.5f) / 1000.0f;
//
//		System.out.println(result2);

	}

}
