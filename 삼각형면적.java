package yedam;

import java.util.Scanner;

public class �ﰢ������ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double w, h, area;
		
		//�غ�
		System.out.println("�غ�: ");
		w = Double.parseDouble(scan.nextLine());
		//����
		System.out.println("����: ");
		h = Double.parseDouble(scan.nextLine());
		//����
		System.out.println("����: ");
		area = w*h;
		
		System.out.printf("�غ�: %2.2f \n����: %2.2f \n����: %3.2f", w,h,area);
	}

}
