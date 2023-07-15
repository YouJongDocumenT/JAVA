package Java_Grammer_Package;

import java.util.Scanner;
import java.util.Arrays;

public class JAVA_Grammer {

	/*
	 * 단축키 1. 한줄 복사 : ctrl + alt + 화살표 2. 줄 이동 : alt + 화살표 3. 한 줄 삭제: ctrl + d 4.
	 * 실행시킨 명령어 취소: ctrl + z 5. sysout 입력후 ctrl + spacebar 6. 자동정렬 : ctrl + shift +
	 * F
	 */

	int n2; // 인스턴스 변수, 0으로 자동초기화
	static int n3; // 클래스 변수(static 변수), 0으로 자동초기화

	// 기본형 인자
	public static void pdt(int n) {
		System.out.println("pdt:" + n);
		n = 20;
	}
	

	// 참조형 인자
	public static void rdt(int[] x) {
		System.out.println("rdt:" + Arrays.toString(x));
		x[0] = 100;
	}

	public static void main(String[] args) {
		// 주석문
		// println 메서드는 값을 새로운 줄에 출력한다.
		System.out.println("Hello World");

		// print 메서드는 값을 같은 줄에 출력한다.
		System.out.print("Hello World");
		System.out.print("홍길동");

		// + 사용해서 여러 값을 연결해서 출력 가능
		System.out.println("홍길동" + 20);

		// ===========================================

		// 반복문의 break/ continue
		// break 문 , continue 문
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

		// 상수 : final 키워드 사용 ( 값 변경이 불가능 해짐. )
		final int NUM = 10;
		final int MAX_NUM = 20;

//		NUM = 20;  // 값 변경 불가
		System.out.println(NUM);
		System.out.println(MAX_NUM);

		// ===========================================

		// do~while 문
		int n = 1;
		do {
			System.out.println("hello");
			n++;
		} while (n < 6);

		// ===========================================

		// for 문
		// 1. 기본
		for (int a = 1; a < 6; a++) {
			System.out.println("hello");
		}

		// 2. 특화된 코드
		for (int a = 5; a > 0; a--) {
			System.out.println("world1");
		}

		for (int a = 1; a < 10; a += 2) {
			System.out.println("world2");
		}

		for (int a = 1, b = 1; a < 10 && b < 3; n += 2, b++) {
			System.out.println("world3");
		}
		// 중첩
		for (int a = 1; a < 6; a++) {
			for (int b = 1; b < 3; b++) {
				System.out.println("world4");
			}

		}

		// ===========================================

		// 1. 단일 if문
		System.out.println("1");
		if (true) {
			System.out.println("2");
			System.out.println("3");
		}

		System.out.println("end");

		// 키보드 입력 처리 클래스: Scanner 클래스
		// 객체생성 문법: 클래스명 변수명 = new 클래스명([값]);
		Scanner scan = new Scanner(System.in); // System.in 은 키보드를 가리킴.
		System.out.println("정수1 입력하시오");
		int num = scan.nextInt(); // JS 의 prompt 역할

		System.out.println("정수2 입력하시오");
		int num2 = scan.nextInt(); // JS 의 prompt 역할

		// 정수를 입력받고 짝수인 경우에만 값을 출력하시오.
		if (num % 2 == 0) {
			System.out.println(num);
		}
		System.out.println(num2);

		// ===========================================

		// 2. if~else문
		System.out.println("1");
		if (true) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		System.out.println("end");

		// ===========================================

		// 3. 다중 if문
		System.out.println("1");

		int num1 = 70;
		if (num1 >= 90) {
			System.out.println("A 학점");
		} else if (num1 >= 80) {
			System.out.println("B 학점");
		} else if (num1 >= 70) {
			System.out.println("C 학점");
		} else {
			System.out.println("F 학점");
		}

		System.out.println("end");

		// ===========================================

		// 1. 산술연산자
		int n = 10;
		int n2 = 3;

		System.out.println(n + n2);
		System.out.println(n - n2);
		System.out.println(n * n2);
		System.out.println(n / n2); // 3 몫만 반환

		System.out.println(n / 3.0); // 3.3333333333333335
		float f = n / n2;
		System.out.println(f); // 3.0

		System.out.println(n % n2);

		// + : 연결연산자로서 사용가능
		String k = 10 + 20 + 30 + "hello";
		String k2 = "hello" + 10 + 20 + 30;
		System.out.println(k);
		System.out.println(k2);

		// ===========================================

		// 2. 대입연산자
		int n = 10;
		int n2 = 3;

		n += n2; // n = n + n2; 동일
		n -= n2; // n = n - n2; 동일
		n *= n2; // n = n * n2; 동일
		n /= n2; // n = n / n2; 동일
		n %= n2; // n = n % n2; 동일

		// ===========================================

		// 3. 비교연산자 ( 실행 결과는 논리값 )
		int n = 10;
		int n2 = 3;

		System.out.println(n == n2);
		System.out.println(n > n2);
		System.out.println(n >= n2);
		System.out.println(n < n2);
		System.out.println(n <= n2);
		System.out.println(n != n2);
//				System.out.println(n===n2);    // JS의 identical 연산자 지원 안됨.

		// ===========================================

		// 4. 논리연산자 ( 실행 결과는 논리값 )
		// JS 처럼 임의의 값을 논리값으로 사용 불가

		// 가. &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();

		// 나. ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();

		// 다. ! ( 부정 )
		System.out.println(!true);
		System.out.println(!false);

		// ===========================================

		// 4. 논리연산자 ( 실행 결과는 논리값 ) 논리게이트 개념
		// JS 처럼 임의의 값을 논리값으로 사용 불가

		// 가. &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();

		// 나. ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();

		// 다. ! ( 부정 )
		System.out.println(!true);
		System.out.println(!false);

		// ===========================================

		// 5. 증감연산자 ( 증가 연산자: ++ , 감소 연산자: -- )

		// 전치 연산자
		int n = 10;
		++n;
		System.out.println(n);

		// 후치 연산자
		int n2 = 10;
		n2--;
		System.out.println(n2);

		// 주의할 점: 다른 연산자와 같이 사용할 때
		int m = 10;
		int result = ++m; // 전치
		System.out.println(m + "\t" + result); // 11 11

		int m2 = 10;
		int result2 = m2++; // 후치
		System.out.println(m2 + "\t" + result2); // 11 10

		// 메서드 호출
		System.out.println(a()); // 11
		System.out.println(a2()); // 10

		// ===========================================

		// 6. 3항 연산자 ( 중첩 가능 )

		int num = (3 > 2) ? 100 : 200; // 3이 2보다 크면 100 출력
		System.out.println(num);

		String s = (3 > 2) ? "A" : "B";
		System.out.println(s);

		// ===========================================

		// 1) 문자 리터럴 - char 기본형
		System.out.println('A');
		System.out.println('홍');

		// 여러 문자열 - String 참조형
		System.out.println("홍길동");

		// 2) escape 문자
		System.out.println("홍길\n동");
		System.out.println("홍길\t동");
		System.out.println("홍길\'동");
		System.out.println("홍길\"동");
		System.out.println("홍길\\동");

		// 3) 정수 리터럴
		System.out.println(10); // 10진수

		System.out.println(0b01); // 2진수

		System.out.println(01); // 8진수
		System.out.println(07); // 8진수

		System.out.println(0x0); // 16진수
		System.out.println(0xA); // 16진수
		System.out.println(0xF); // 16진수

		// 4byte인 int 저장범위: -2147483648 ~ +2147483647
		System.out.println(2147483647); //
		System.out.println(2147483648L); // 4byte범위보다 큰 정수는 L 지정해서 long으로 처리한다.

		// 4) 실수 리터럴
		System.out.println(3.14); // double로 처리
		System.out.println(3.14D); // double로 처리
		System.out.println(3.14d); // double로 처리

		System.out.println(3.14F); // float로 처리
		System.out.println(3.14f); // float로 처리

		System.out.println(3.14e3); // 지수표현

		// 5) 논리 리터럴
		System.out.println(true);
		System.out.println(false);

		// ===========================================

		// 3. switch
		// byte , short , int , char , String , enum 인 6개만 사용 가능 ( long과 실수사용 불가)

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

		String c2 = "A"; // 한 글자인 경우도 "" 사용하면 문자열로 처리됨.
		switch (c2) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		default: // 어떠한 case문과도 일치하지 않는 경우 실행
			System.out.println("default");
		}

		System.out.println("end");

		// ===========================================

		// 1. 묵시적 형변환

		// 가. btye > short > int > long > float > double, 큰타입 = 작은타입;
		byte b = 10;
		short b2 = b; // 1byte -> 2btye 변경
		int b3 = b2; // 2byte -> 4btye 변경
		long b4 = b3;
		float f = b4;
		double f2 = f;
		double f3 = b;

		// 반대 경우는 에러 (해결: 강제적 형변환 시킨다.), 작은타입=큰타입;
		float x = 3.14F;
//						int x2 = x;

		// 나. char --> int (아스키코드값)
		char c = 'A'; // 65
		char c2 = 'a'; // 97
		int n = c;
		int n2 = c2;
		System.out.println(n + " " + n2);
		System.out.println('A' + 1); // 문자는 연산이 가능하다.

		// 다. int 보다 작은 데이터형의 연산은 int로 반환
		short s = 10;
		short s2 = 10;
//						short s3 = s + s2;  // short = int 형식으로 처리됨.

		// 라. 큰타입과 작은타입의 연산은 큰타입으로 반환
		float ff = 3.14F;
		int mm = 10;
		float ff2 = ff + mm;

		// ===========================================

		// 1. 묵시적 형변환 ( upcasting )

		// 가. btye > short > int > long > float > double, 큰타입 = 작은타입;
		// 나. char --> int (아스키코드값)
		// 다. int 보다 작은 데이터형의 연산은 int로 반환
		// 라. 큰타입과 작은타입의 연산은 큰타입으로 반환

		// 2. 명시적 형변환(downcasting): (데이터타입) <= 형변환 연산자 , 작은타입=(작은타입)큰타입;
		int n = 10;
		short n2 = (short) n;

		// ===========================================

		int n; // 로컬변수, 자동 초기화 안됨. 반드시 사용전에 초기화해야 된다.
		n = 0;
		System.out.println(n);

		// ===========================================

		// 기본형 변수
		int num; // 변수 선언
		num = 10; // 변수 초기화

		// 참조형 변수
		String name; // 변수 선언
		name = "홍길동"; // 변수 초기화

		System.out.println(num);
		System.out.println(name);

		// 한번에
		int age = 10, height = 20, weight = 30; // 권장안함
		System.out.println(age);

		// ===========================================

		// 변수 특징

		// 1. 중복 불가 (식별이 불가능하기 때문에)
		int num = 10;
//						int num = 20;

		// 2. 블록 scope
		{
			int num2 = 100;
			System.out.println(num2);
		}
//						System.out.println(num2);

		// 3. 로컬변수 사용시 반드시 초기화해야 된다.
		int num3;
//						System.out.println(num3);

		// 4. 변수 종류

		/*
		 * 교안 p82 참조
		 * 
		 * 가. 로컬변수
		 * 
		 * 나. 인스턴스 변수
		 * 
		 * 다. 클래스 변수(static)
		 * 
		 */

		// ===========================================

		// while 문
		int n = 1;
		while (n < 6) {
			System.out.println("hello");
			n++;
		}

		// ===========================================

		// 1. 1차원 배열 - new 이용

		// 가. 배열 선언

		int[] n; // n: 변수, 참조형 변수, 로컬변수, int 타입의 배열 변수
//						String [] n2; // n2: 변수, 참조형 변수, 로컬변수, String 타입의 배열 변수

		// 나. 배열 생성
		n = new int[2];
//						n2 = new String[3];

		System.out.println(n[0]);
		System.out.println(n[1]);
//						System.out.println(n[2]);  // 에러발생

		// ===========================================

		// 1. 1차원 배열 - new 이용

		// 가. 배열 선언 // String 가본값 : null
		String[] n2; // n2: 변수, 참조형 변수, 로컬변수, String 타입의 배열 변수

		// 나. 배열 생성
		n2 = new String[3];

		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);

		// ===========================================

		// 1. 1차원 배열 - literal 이용

		// 기본형 배열
		int[] n = { 10, 20 };

		System.out.println(n.length);

		// 값 변경
		n[0] = 100;

		System.out.println(n[0]);
		System.out.println(n[1]);

		// 참조형 배열
		String[] n2 = { "홍길동", "이순신", "유관순" };
		System.out.println(n2.length);
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);

		// ===========================================

		// 1. 1차원 배열 - new + literal 이용

		// 기본형
		int[] n = new int[] { 10, 20 };

		System.out.println(n.length);
		System.out.println(n[0]);
		System.out.println(n[1]);

		// 참조형
		String[] n2 = new String[] { "A", "B", "C" };
		System.out.println(n2.length);
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);

		// ===========================================

		// 1. 1차원 배열 출력

		int[] n = new int[] { 10, 20, 30, 40 };

		// 1) 개별적으로 idx 이용
		System.out.println(n[0]);
		System.out.println(n[1]);

		// 2) 일반 for문
		for (int i = 0; i < n.length; i++) {
			System.out.println(">>" + n[i]);
		}
		// 3) foreach문
		/*
		 * for(변수:배열명){ // JS의 for-of 동일
		 * 
		 * }
		 * 
		 */
		for (int k : n) {
			System.out.println("$$" + k);
		}

		// 4) 배열==> 한번에 문자열로 출력 ( java.util.Arrays 클래스 이용 )
		// Arrays.toString(배열명);
		System.out.println(Arrays.toString(n)); // "[10, 20, 30, 40]"

		// ===========================================

		// 1. 2차원 배열 출력

		// 가. 배열선언
		int[][] n;

		// 나. 배열 생성
		n = new int[3][2];

		System.out.println("행의길이:" + n.length);
		System.out.println("1행의 열길이:" + n[0].length);

		// 0 으로 자동 초기화
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);

		for (int i = 0; i < n.length; i++) { // 행
			for (int j = 0; j < n[i].length; j++) { // 열
				System.out.println(">>" + n[i][j]);
			}
		}
		// 명시적 초기화
		n[0][0] = 1;
		n[0][1] = 2;
		n[1][0] = 3;
		n[1][1] = 4;
		n[2][0] = 5;
		n[2][1] = 6;

		// foreach문
		/*
		 * for(변수:배열명){ // JS의 for-of 동일
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

		// 1. 2차원 배열 출력 - 비정방형

		int[][] n = new int[2][]; // 행크기만 지정

		n[0] = new int[1];
		n[1] = new int[2];

		System.out.println(n[0][0]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);

		System.out.println("행길이:" + n.length);
		System.out.println("2행 열길이:" + n[1].length);

		// 초기화
		n[0][0] = 1;
		n[1][0] = 2;
		n[1][1] = 3;

		for (int i = 0; i < n.length; i++) { // 행
			for (int j = 0; j < n[i].length; j++) { // 열
				System.out.println(">>" + n[i][j]);
			}
		}
		for (int[] x : n) {
			for (int x2 : x) {
				System.out.println("$$" + x2);
			}
		}

		// ===========================================

		// 2. 2차원 배열 출력 - 리터럴

		int[][] n = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3행 2열인 정방형

		int[][] n2 = { { 1 }, { 2, 3, 4 }, { 5, 6 } }; // 3행 비정방형

		// 3. 2차원 배열 출력 - new + 리터럴

		int[][] x = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3행 2열인 정방형
		int[][] x2 = new int[][] { { 1 }, { 2, 3, 4 }, { 5, 6 } }; // 3행 비정방형

		// ===========================================

		System.out.println(Arrays.toString(args));

		// ===========================================
		
		// 위 매서드 인자 참조
		// 기본형 데이터 ( call by value 로 전달. 값이 복사되기 때문에 원본값 변경 안됨.
		int n = 10;
		System.out.println("호출전 n값:" + n); // 10
		pdt(n);
		System.out.println("호출후 n값:" + n); // 10

		// 참조형 데이터
		int[] n2 = { 10, 20, 30 };
		System.out.println("호출전 n2값:" + Arrays.toString(n2));
		rdt(n2);
		System.out.println("호출후 n2값:" + Arrays.toString(n2));

		// ===========================================
		// ===========================================
		// ===========================================
		// ===========================================
		// ===========================================

	}

	// ===========================================

	// 5. 증감연산자 매서드
	public static int a() {
		int x = 10;
		return ++x; // 전치
	}

	public static int a2() {
		int x = 10;
		return x++; // 후치

	}

}
