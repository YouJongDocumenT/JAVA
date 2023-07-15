package Java_Grammer_Package;

import java.util.Scanner;
import java.util.Arrays;

public class JAVA_Grammer {

	/*
	 * ����Ű 1. ���� ���� : ctrl + alt + ȭ��ǥ 2. �� �̵� : alt + ȭ��ǥ 3. �� �� ����: ctrl + d 4.
	 * �����Ų ��ɾ� ���: ctrl + z 5. sysout �Է��� ctrl + spacebar 6. �ڵ����� : ctrl + shift +
	 * F
	 */

	int n2; // �ν��Ͻ� ����, 0���� �ڵ��ʱ�ȭ
	static int n3; // Ŭ���� ����(static ����), 0���� �ڵ��ʱ�ȭ

	// �⺻�� ����
	public static void pdt(int n) {
		System.out.println("pdt:" + n);
		n = 20;
	}
	

	// ������ ����
	public static void rdt(int[] x) {
		System.out.println("rdt:" + Arrays.toString(x));
		x[0] = 100;
	}

	public static void main(String[] args) {
		// �ּ���
		// println �޼���� ���� ���ο� �ٿ� ����Ѵ�.
		System.out.println("Hello World");

		// print �޼���� ���� ���� �ٿ� ����Ѵ�.
		System.out.print("Hello World");
		System.out.print("ȫ�浿");

		// + ����ؼ� ���� ���� �����ؼ� ��� ����
		System.out.println("ȫ�浿" + 20);

		// ===========================================

		// �ݺ����� break/ continue
		// break �� , continue ��
		for (int n = 1; n < 6; n++) {
			if (n == 3)
				break;
			System.out.println("hello: " + n);
		}

		for (int n = 1; n < 6; n++) {
			System.out.println("world1: " + n);
			if (n == 3)
				continue; // skip
			System.out.println("world2: " + n);
			System.out.println("world3: " + n);
		}

		// ===========================================

		// ��� : final Ű���� ��� ( �� ������ �Ұ��� ����. )
		final int NUM = 10;
		final int MAX_NUM = 20;

//		NUM = 20;  // �� ���� �Ұ�
		System.out.println(NUM);
		System.out.println(MAX_NUM);

		// ===========================================

		// do~while ��
		int n = 1;
		do {
			System.out.println("hello");
			n++;
		} while (n < 6);

		// ===========================================

		// for ��
		// 1. �⺻
		for (int a = 1; a < 6; a++) {
			System.out.println("hello");
		}

		// 2. Ưȭ�� �ڵ�
		for (int a = 5; a > 0; a--) {
			System.out.println("world1");
		}

		for (int a = 1; a < 10; a += 2) {
			System.out.println("world2");
		}

		for (int a = 1, b = 1; a < 10 && b < 3; n += 2, b++) {
			System.out.println("world3");
		}
		// ��ø
		for (int a = 1; a < 6; a++) {
			for (int b = 1; b < 3; b++) {
				System.out.println("world4");
			}

		}

		// ===========================================

		// 1. ���� if��
		System.out.println("1");
		if (true) {
			System.out.println("2");
			System.out.println("3");
		}

		System.out.println("end");

		// Ű���� �Է� ó�� Ŭ����: Scanner Ŭ����
		// ��ü���� ����: Ŭ������ ������ = new Ŭ������([��]);
		Scanner scan = new Scanner(System.in); // System.in �� Ű���带 ����Ŵ.
		System.out.println("����1 �Է��Ͻÿ�");
		int num = scan.nextInt(); // JS �� prompt ����

		System.out.println("����2 �Է��Ͻÿ�");
		int num2 = scan.nextInt(); // JS �� prompt ����

		// ������ �Է¹ް� ¦���� ��쿡�� ���� ����Ͻÿ�.
		if (num % 2 == 0) {
			System.out.println(num);
		}
		System.out.println(num2);

		// ===========================================

		// 2. if~else��
		System.out.println("1");
		if (true) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		System.out.println("end");

		// ===========================================

		// 3. ���� if��
		System.out.println("1");

		int num1 = 70;
		if (num1 >= 90) {
			System.out.println("A ����");
		} else if (num1 >= 80) {
			System.out.println("B ����");
		} else if (num1 >= 70) {
			System.out.println("C ����");
		} else {
			System.out.println("F ����");
		}

		System.out.println("end");

		// ===========================================

		// 1. ���������
		int n = 10;
		int n2 = 3;

		System.out.println(n + n2);
		System.out.println(n - n2);
		System.out.println(n * n2);
		System.out.println(n / n2); // 3 �� ��ȯ

		System.out.println(n / 3.0); // 3.3333333333333335
		float f = n / n2;
		System.out.println(f); // 3.0

		System.out.println(n % n2);

		// + : ���Ῥ���ڷμ� ��밡��
		String k = 10 + 20 + 30 + "hello";
		String k2 = "hello" + 10 + 20 + 30;
		System.out.println(k);
		System.out.println(k2);

		// ===========================================

		// 2. ���Կ�����
		int n = 10;
		int n2 = 3;

		n += n2; // n = n + n2; ����
		n -= n2; // n = n - n2; ����
		n *= n2; // n = n * n2; ����
		n /= n2; // n = n / n2; ����
		n %= n2; // n = n % n2; ����

		// ===========================================

		// 3. �񱳿����� ( ���� ����� ���� )
		int n = 10;
		int n2 = 3;

		System.out.println(n == n2);
		System.out.println(n > n2);
		System.out.println(n >= n2);
		System.out.println(n < n2);
		System.out.println(n <= n2);
		System.out.println(n != n2);
//				System.out.println(n===n2);    // JS�� identical ������ ���� �ȵ�.

		// ===========================================

		// 4. �������� ( ���� ����� ���� )
		// JS ó�� ������ ���� �������� ��� �Ұ�

		// ��. &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();

		// ��. ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();

		// ��. ! ( ���� )
		System.out.println(!true);
		System.out.println(!false);

		// ===========================================

		// 4. �������� ( ���� ����� ���� ) ������Ʈ ����
		// JS ó�� ������ ���� �������� ��� �Ұ�

		// ��. &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();

		// ��. ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();

		// ��. ! ( ���� )
		System.out.println(!true);
		System.out.println(!false);

		// ===========================================

		// 5. ���������� ( ���� ������: ++ , ���� ������: -- )

		// ��ġ ������
		int n = 10;
		++n;
		System.out.println(n);

		// ��ġ ������
		int n2 = 10;
		n2--;
		System.out.println(n2);

		// ������ ��: �ٸ� �����ڿ� ���� ����� ��
		int m = 10;
		int result = ++m; // ��ġ
		System.out.println(m + "\t" + result); // 11 11

		int m2 = 10;
		int result2 = m2++; // ��ġ
		System.out.println(m2 + "\t" + result2); // 11 10

		// �޼��� ȣ��
		System.out.println(a()); // 11
		System.out.println(a2()); // 10

		// ===========================================

		// 6. 3�� ������ ( ��ø ���� )

		int num = (3 > 2) ? 100 : 200; // 3�� 2���� ũ�� 100 ���
		System.out.println(num);

		String s = (3 > 2) ? "A" : "B";
		System.out.println(s);

		// ===========================================

		// 1) ���� ���ͷ� - char �⺻��
		System.out.println('A');
		System.out.println('ȫ');

		// ���� ���ڿ� - String ������
		System.out.println("ȫ�浿");

		// 2) escape ����
		System.out.println("ȫ��\n��");
		System.out.println("ȫ��\t��");
		System.out.println("ȫ��\'��");
		System.out.println("ȫ��\"��");
		System.out.println("ȫ��\\��");

		// 3) ���� ���ͷ�
		System.out.println(10); // 10����

		System.out.println(0b01); // 2����

		System.out.println(01); // 8����
		System.out.println(07); // 8����

		System.out.println(0x0); // 16����
		System.out.println(0xA); // 16����
		System.out.println(0xF); // 16����

		// 4byte�� int �������: -2147483648 ~ +2147483647
		System.out.println(2147483647); //
		System.out.println(2147483648L); // 4byte�������� ū ������ L �����ؼ� long���� ó���Ѵ�.

		// 4) �Ǽ� ���ͷ�
		System.out.println(3.14); // double�� ó��
		System.out.println(3.14D); // double�� ó��
		System.out.println(3.14d); // double�� ó��

		System.out.println(3.14F); // float�� ó��
		System.out.println(3.14f); // float�� ó��

		System.out.println(3.14e3); // ����ǥ��

		// 5) �� ���ͷ�
		System.out.println(true);
		System.out.println(false);

		// ===========================================

		// 3. switch
		// byte , short , int , char , String , enum �� 6���� ��� ���� ( long�� �Ǽ���� �Ұ�)

		System.out.println("1");
		int num = 10;
		switch (num) {
		case 5:
			System.out.println("5");
			break;
		case 10:
			System.out.println("10");
			break;
		case 15:
			System.out.println("15");
			break;
		default:
			System.out.println("default");
		}
		char c = 'A';
		switch (c) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		default:
			System.out.println("default");
		}

		String c2 = "A"; // �� ������ ��쵵 "" ����ϸ� ���ڿ��� ó����.
		switch (c2) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		default: // ��� case������ ��ġ���� �ʴ� ��� ����
			System.out.println("default");
		}

		System.out.println("end");

		// ===========================================

		// 1. ������ ����ȯ

		// ��. btye > short > int > long > float > double, ūŸ�� = ����Ÿ��;
		byte b = 10;
		short b2 = b; // 1byte -> 2btye ����
		int b3 = b2; // 2byte -> 4btye ����
		long b4 = b3;
		float f = b4;
		double f2 = f;
		double f3 = b;

		// �ݴ� ���� ���� (�ذ�: ������ ����ȯ ��Ų��.), ����Ÿ��=ūŸ��;
		float x = 3.14F;
//						int x2 = x;

		// ��. char --> int (�ƽ�Ű�ڵ尪)
		char c = 'A'; // 65
		char c2 = 'a'; // 97
		int n = c;
		int n2 = c2;
		System.out.println(n + " " + n2);
		System.out.println('A' + 1); // ���ڴ� ������ �����ϴ�.

		// ��. int ���� ���� ���������� ������ int�� ��ȯ
		short s = 10;
		short s2 = 10;
//						short s3 = s + s2;  // short = int �������� ó����.

		// ��. ūŸ�԰� ����Ÿ���� ������ ūŸ������ ��ȯ
		float ff = 3.14F;
		int mm = 10;
		float ff2 = ff + mm;

		// ===========================================

		// 1. ������ ����ȯ ( upcasting )

		// ��. btye > short > int > long > float > double, ūŸ�� = ����Ÿ��;
		// ��. char --> int (�ƽ�Ű�ڵ尪)
		// ��. int ���� ���� ���������� ������ int�� ��ȯ
		// ��. ūŸ�԰� ����Ÿ���� ������ ūŸ������ ��ȯ

		// 2. ����� ����ȯ(downcasting): (������Ÿ��) <= ����ȯ ������ , ����Ÿ��=(����Ÿ��)ūŸ��;
		int n = 10;
		short n2 = (short) n;

		// ===========================================

		int n; // ���ú���, �ڵ� �ʱ�ȭ �ȵ�. �ݵ�� ������� �ʱ�ȭ�ؾ� �ȴ�.
		n = 0;
		System.out.println(n);

		// ===========================================

		// �⺻�� ����
		int num; // ���� ����
		num = 10; // ���� �ʱ�ȭ

		// ������ ����
		String name; // ���� ����
		name = "ȫ�浿"; // ���� �ʱ�ȭ

		System.out.println(num);
		System.out.println(name);

		// �ѹ���
		int age = 10, height = 20, weight = 30; // �������
		System.out.println(age);

		// ===========================================

		// ���� Ư¡

		// 1. �ߺ� �Ұ� (�ĺ��� �Ұ����ϱ� ������)
		int num = 10;
//						int num = 20;

		// 2. ��� scope
		{
			int num2 = 100;
			System.out.println(num2);
		}
//						System.out.println(num2);

		// 3. ���ú��� ���� �ݵ�� �ʱ�ȭ�ؾ� �ȴ�.
		int num3;
//						System.out.println(num3);

		// 4. ���� ����

		/*
		 * ���� p82 ����
		 * 
		 * ��. ���ú���
		 * 
		 * ��. �ν��Ͻ� ����
		 * 
		 * ��. Ŭ���� ����(static)
		 * 
		 */

		// ===========================================

		// while ��
		int n = 1;
		while (n < 6) {
			System.out.println("hello");
			n++;
		}

		// ===========================================

		// 1. 1���� �迭 - new �̿�

		// ��. �迭 ����

		int[] n; // n: ����, ������ ����, ���ú���, int Ÿ���� �迭 ����
//						String [] n2; // n2: ����, ������ ����, ���ú���, String Ÿ���� �迭 ����

		// ��. �迭 ����
		n = new int[2];
//						n2 = new String[3];

		System.out.println(n[0]);
		System.out.println(n[1]);
//						System.out.println(n[2]);  // �����߻�

		// ===========================================

		// 1. 1���� �迭 - new �̿�

		// ��. �迭 ���� // String ������ : null
		String[] n2; // n2: ����, ������ ����, ���ú���, String Ÿ���� �迭 ����

		// ��. �迭 ����
		n2 = new String[3];

		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);

		// ===========================================

		// 1. 1���� �迭 - literal �̿�

		// �⺻�� �迭
		int[] n = { 10, 20 };

		System.out.println(n.length);

		// �� ����
		n[0] = 100;

		System.out.println(n[0]);
		System.out.println(n[1]);

		// ������ �迭
		String[] n2 = { "ȫ�浿", "�̼���", "������" };
		System.out.println(n2.length);
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);

		// ===========================================

		// 1. 1���� �迭 - new + literal �̿�

		// �⺻��
		int[] n = new int[] { 10, 20 };

		System.out.println(n.length);
		System.out.println(n[0]);
		System.out.println(n[1]);

		// ������
		String[] n2 = new String[] { "A", "B", "C" };
		System.out.println(n2.length);
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);

		// ===========================================

		// 1. 1���� �迭 ���

		int[] n = new int[] { 10, 20, 30, 40 };

		// 1) ���������� idx �̿�
		System.out.println(n[0]);
		System.out.println(n[1]);

		// 2) �Ϲ� for��
		for (int i = 0; i < n.length; i++) {
			System.out.println(">>" + n[i]);
		}
		// 3) foreach��
		/*
		 * for(����:�迭��){ // JS�� for-of ����
		 * 
		 * }
		 * 
		 */
		for (int k : n) {
			System.out.println("$$" + k);
		}

		// 4) �迭==> �ѹ��� ���ڿ��� ��� ( java.util.Arrays Ŭ���� �̿� )
		// Arrays.toString(�迭��);
		System.out.println(Arrays.toString(n)); // "[10, 20, 30, 40]"

		// ===========================================

		// 1. 2���� �迭 ���

		// ��. �迭����
		int[][] n;

		// ��. �迭 ����
		n = new int[3][2];

		System.out.println("���Ǳ���:" + n.length);
		System.out.println("1���� ������:" + n[0].length);

		// 0 ���� �ڵ� �ʱ�ȭ
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);

		for (int i = 0; i < n.length; i++) { // ��
			for (int j = 0; j < n[i].length; j++) { // ��
				System.out.println(">>" + n[i][j]);
			}
		}
		// ����� �ʱ�ȭ
		n[0][0] = 1;
		n[0][1] = 2;
		n[1][0] = 3;
		n[1][1] = 4;
		n[2][0] = 5;
		n[2][1] = 6;

		// foreach��
		/*
		 * for(����:�迭��){ // JS�� for-of ����
		 * 
		 * }
		 * 
		 */
		for (int[] x : n) {
			for (int x2 : x) {
				System.out.println("$$" + x2);
			}
		}

		// ===========================================

		// 1. 2���� �迭 ��� - ��������

		int[][] n = new int[2][]; // ��ũ�⸸ ����

		n[0] = new int[1];
		n[1] = new int[2];

		System.out.println(n[0][0]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);

		System.out.println("�����:" + n.length);
		System.out.println("2�� ������:" + n[1].length);

		// �ʱ�ȭ
		n[0][0] = 1;
		n[1][0] = 2;
		n[1][1] = 3;

		for (int i = 0; i < n.length; i++) { // ��
			for (int j = 0; j < n[i].length; j++) { // ��
				System.out.println(">>" + n[i][j]);
			}
		}
		for (int[] x : n) {
			for (int x2 : x) {
				System.out.println("$$" + x2);
			}
		}

		// ===========================================

		// 2. 2���� �迭 ��� - ���ͷ�

		int[][] n = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3�� 2���� ������

		int[][] n2 = { { 1 }, { 2, 3, 4 }, { 5, 6 } }; // 3�� ��������

		// 3. 2���� �迭 ��� - new + ���ͷ�

		int[][] x = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3�� 2���� ������
		int[][] x2 = new int[][] { { 1 }, { 2, 3, 4 }, { 5, 6 } }; // 3�� ��������

		// ===========================================

		System.out.println(Arrays.toString(args));

		// ===========================================
		
		// �� �ż��� ���� ����
		// �⺻�� ������ ( call by value �� ����. ���� ����Ǳ� ������ ������ ���� �ȵ�.
		int n = 10;
		System.out.println("ȣ���� n��:" + n); // 10
		pdt(n);
		System.out.println("ȣ���� n��:" + n); // 10

		// ������ ������
		int[] n2 = { 10, 20, 30 };
		System.out.println("ȣ���� n2��:" + Arrays.toString(n2));
		rdt(n2);
		System.out.println("ȣ���� n2��:" + Arrays.toString(n2));

		// ===========================================
		// ===========================================
		// ===========================================
		// ===========================================
		// ===========================================

	}

	// ===========================================

	// 5. ���������� �ż���
	public static int a() {
		int x = 10;
		return ++x; // ��ġ
	}

	public static int a2() {
		int x = 10;
		return x++; // ��ġ

	}

}
