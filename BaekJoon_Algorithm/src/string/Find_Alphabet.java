package string;

import java.util.Scanner;

public class Find_Alphabet {
	public static void main(String[] args) {
		
		// ���ĺ� �迭 ����
		int[] alphabet = new int[26];
		
		// ���ĺ� �迭�� ���� �ʱⰪ -1�� ����
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1; 
		}
		
		// ���ڿ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// �Է¹��� ���ڿ��� �迭�� ���
		for(char ch : str.toCharArray()) {
			alphabet[ch - 'a'] = str.indexOf(ch);
		}
		
		// �迭 ���
		for(int a : alphabet) {
			System.out.print(a + " ");
		}

	}
}
