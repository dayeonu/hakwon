
public class if문구현_테스트2 {

	public static void main(String[] args) {

		int user = (int)(Math.random()*100);
		
		//fee , rate,  age,  등의 변수
		// 최대한 단순하게 처리할 수 있는 방향으로 코딩문을 정리하는것. 
		
		double discount=1.0; 
		int charge = 2500;
		int num=0;
		
		if ( user >= 4 && user <=13 )  
			discount = 0.5;
		
		else if ( user >= 14 && user <=19 ) 
			discount = 0.25;
		
		else if ( user >= 20 && user <=64) 
			discount = 0;
		
		num = (int)(charge *(1-discount)); 
		System.out.println(user +"세 "+ num+"원");
	
	
	} //end of main
}
