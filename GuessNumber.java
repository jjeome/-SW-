package game;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random()*10)+1; //컴퓨터 랜덤값
		int num; //내가 입력하는 값
		String result;
		int count = 0;
		// 숫자끼리 비교 맞으면 종료
		do {
			count++;
			
			num = scan.nextInt();
			
			if (random > num) {
				result = "크다";
			} else if (random < num){
				result = "작다";
			} else {
				result ="맞다";
			}
	
			if(count >= 5) {
				break;
			}
			
			System.out.println(result);
		} while(true);	
		System.out.println("프로그램 종료");
	}

}
