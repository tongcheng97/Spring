package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * ִ��һ������������testΪ��ͷ�ķǾ�̬����
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		//��̬������
		Scanner in = new Scanner(System.in);
		System.out.println("��������:");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		//��̬��ȡȫ��������Ϣ
		Method[] method = cls.getDeclaredMethods();
		//����ȫ������������testΪ��ͷ�ķ���
		Object obj = cls.newInstance();
		for(Method md : method) {
			if(md.getName().startsWith("test")) {
				System.out.println(md);
				md.invoke(obj);
			}
				
		}
	}
}
