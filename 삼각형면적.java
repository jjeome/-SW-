package yedam;

import java.util.Scanner;

public class »ï°¢Çü¸éÀû {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double w, h, area;
		
		//¹Øº¯
		System.out.println("¹Øº¯: ");
		w = Double.parseDouble(scan.nextLine());
		//³ôÀÌ
		System.out.println("³ôÀÌ: ");
		h = Double.parseDouble(scan.nextLine());
		//¸éÀû
		System.out.println("¸éÀû: ");
		area = w*h;
		
		System.out.printf("¹Øº¯: %2.2f \n³ôÀÌ: %2.2f \n¸éÀû: %3.2f", w,h,area);
	}

}
