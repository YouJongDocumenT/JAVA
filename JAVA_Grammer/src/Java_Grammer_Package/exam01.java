package Java_Grammer_Package;

public class exam01 {

	public static void main(String[] args) {


			// ���� ���
			// 1. String.format(String ���Ĺ���, Object ... ����) // Object �ǹ̴� ��� ���ǹ�
			String result = String.format("�̸�:%s, ����:%d, Ű:%f, ����:%c, ��ȥ:%b", "ȫ�浿", 20, 167.2389652, '��', true);
			System.out.println(result);
			
			System.out.printf("�̸�:%s, ����:%d, Ű:%.2f, ����:%c, ��ȥ:%b", "ȫ�浿", 20, 167.2389652, '��', true);
			System.out.printf("�̸�:%s, ����:%d, Ű:%f, ����:%c, ��ȥ:%b", "ȫ�浿", 20, 167.2389652, '��', true);
	}

}
