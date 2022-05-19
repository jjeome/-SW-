package control;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int menu = scan.nextInt();
		int balance = scan.nextInt();
		
		while(run) {
		System.out.println(" ---------------------------- ");
		System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
		System.out.println(" ---------------------------- ");
			if(menu ==1) {
				System.out.println("선택> "+menu);
				System.out.println("예금액> "+balance);
			} else if (menu == 2) {
				System.out.println("선택> "+menu);
				System.out.println("출금액> "+balance);
			} else if (menu == 3) {
				System.out.println("선택> "+menu);
				System.out.println("잔고> "+balance);
			} else {
				System.out.println("프로그램 종료");
			}
		}
		
		/*int result;
		do {
			if (menu == 1) {
				result = balance;
			} else if(menu == 2) {
				result = balance;
			} else if(menu == 3) {
				result = balance;
			} else if(menu == 4) {
				result = balance;
			} else {
				break;
			}
			System.out.println(result);
		} while(true);
		System.out.println("프로그램 종료");
		}
		*/
		
	}

}
