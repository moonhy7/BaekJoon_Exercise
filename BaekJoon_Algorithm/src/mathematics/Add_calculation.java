package mathematics;

import java.util.Scanner;

public class Add_calculation {
	public static void main(String[] args) {
		
		// �׽�Ʈ���̽� ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		int numOftestCase = sc.nextInt();
		
		// �׽�Ʈ���̽� ������ŭ ���� �Է� �ޱ�
		for(int testCase = 0; testCase < numOftestCase; testCase++) {
			//
			int numOfnumber = sc.nextInt();
			
			// �Է¹��� ������ �迭 �� sum ���� ����
			int[] arr = new int[numOfnumber];
			int sum = 0;
			
			// ���� ���� ��ŭ  
			for(int num = 0; num < numOfnumber; num++) {
				arr[num] = sc.nextInt();
				sum += arr[num];
			} System.out.println(sum);
		}
	}
}
