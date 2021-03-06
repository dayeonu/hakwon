
public class ArrayEx10 {

	public static void main(String[] args) {

		int[] numArr= new int[10]; // 10개의 배열 생성 

		for(int i =0; i<numArr.length; i++) { // 10번 반복 
			System.out.print(numArr[i] = (int)(Math.random()*10)); // 0~9까지 난수 발생한것을 배열arr[i]에 복사
		}
		System.out.println("\n----------");//줄바꿈
		
		for(int i =0; i<numArr.length -1; i++) { // 9번 반복 
			boolean changed = false; // changed변수의 값은 false
			
			for(int j=0; j<numArr.length-1-i; j++) { //8 -i(1~9값) -1까지 나옴.  
				if(numArr[j] > numArr[j+1]) { //만약, numArr[j] 가
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			} //end for j
			if(!changed) // if(charged != true) 같은 뜻
				break; 
			
			for(int k=0; k<numArr.length; k++)
				System.out.print(numArr[k]);
			System.out.println();
		} 	//end for i
	} //main 의 끝
}
