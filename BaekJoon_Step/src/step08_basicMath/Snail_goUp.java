package step08_basicMath;

import java.util.Scanner;

public class Snail_goUp {
	public static void main(String[] args) {
		
		// �� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		int afternoon = sc.nextInt(); // ���� �ö󰡴� ����
		int midnight = sc.nextInt(); // �㿡 �̲������� ����
		int height = sc.nextInt(); // ������ ����
		
		int new_height = height - midnight; // ������ �� ��� ������ ������ �� ���������� ��� ����
		int diff = afternoon - midnight; // �����̰� �ö󰡰� ������ �� ��Ż ����
		int count; // ��¥ ���
		
		if(height % diff != 0) {
			count = new_height / diff + 1;
		} else {
			count = new_height / diff;
		}
		
		
		
		
		
		
		
		
	
//		int snail = 0;
//		
//		while(snail < height) {
//			count++;
//			snail += afternoon;
//			if(snail >= height) {
//				break;
//			}
//			snail -= midnight;
//		}
		
		System.out.println(count);
	}
}
