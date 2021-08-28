package step07_string;

import java.util.Arrays;
import java.util.Scanner;

public class Study_word {
	public static void main(String[] args) {

		// ���ڿ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();

		// ���� ������ ���� ���ĺ� �迭 ����
		int max = 0;
		boolean check = false;
		char t = 'a';
		int[] alphabet = new int[26];
		for(char c : str.toCharArray()) {
			alphabet[c - 'A']++;
			if(alphabet[c - 'A'] > max) {
				max = alphabet[c - 'A'];
				check = false;
				t = c;
			}
			else if(alphabet[c - 'A'] == max) {
				check = true;
			}
		}
		if(check == true) {
			System.out.println("?");
		} else {
			System.out.println(t);
		}
	}
}
