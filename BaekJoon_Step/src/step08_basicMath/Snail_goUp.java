package step08_basicMath;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Snail_goUp {
	public static void main(String[] args) throws IOException {
		
		// �� �Է� �ޱ�
//		Scanner sc = new Scanner(System.in);
//		int afternoon = sc.nextInt(); // ���� �ö󰡴� ����
//		int midnight = sc.nextInt(); // �㿡 �̲������� ����
//		int height = sc.nextInt(); // ������ ����
		
		
		
//		�ð� �ʰ� ���� Ǯ�� 1 (while�� �̿�)
//		int count = 0;
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
	
		

//		�ð� �ʰ� ���� Ǯ�� 2 (Scanner �̿�)
//		int day = (height - midnight) / (afternoon - midnight);
//		if((height - midnight) % (afternoon - midnight) != 0) {
//			day++;
//		} System.out.println(day);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int afternoon = Integer.parseInt(st.nextToken()); // ���� �ö󰡴� ����
		int midnight = Integer.parseInt(st.nextToken()); // �㿡 �̲������� ����
		int height = Integer.parseInt(st.nextToken()); // ������ ����
		
		int day = (height - midnight) / (afternoon - midnight);
		if((height - midnight) % (afternoon - midnight) != 0) {
			day++;
		}	System.out.println(day);
	}
}
