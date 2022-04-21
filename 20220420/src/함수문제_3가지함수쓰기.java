import java.util.Scanner;

public class 함수문제_3가지함수쓰기 {

	public static void main(String[] args) {

		int fee = 2500; // 티켓 가격은 2500원 으로 고정. 
		
		int age = input(); // 나이입력받아오기: 호출문
		double rate= feeCalcRate(age); // 할인율받아오기 : 호출문
		output(age, fee, rate); // 출력문 받아오기: 호출문 
	}
	
	

	//		[함수 1,2,3 사용하기]
			static int input() { //입력
				int age=0;
				Scanner sc = new Scanner(System.in);
				System.out.println("나이 입력");
				age = sc.nextInt();
				return age;
			}
		
			static double feeCalcRate(int age) { //할인율계산
				double rate=0.0;
				if(age>=65)
					rate = 0;
				else if(age>=20)
					rate = 1;
				else if(age>=14)
					rate = 0.75;
				else if(age>=4)
					rate = 0.5;
				else if(age<4)
					rate = 0;
				else
					System.out.println("정확한 값 입력요망");
				return rate;
			}	
			
			static void output(int age, int fee, double rate) { //출력문
				System.out.println(age + "세 요금은" +(int)(fee*rate)+"원");
			}
		}
