package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		//��̬������
		Scanner in = new Scanner(System.in);
		System.out.println("��������:");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		
		//1.�ҵ�demo����
		// Class�ṩ�˸��ݷ���ǩ���ҵ�ָ��������Ϣ��API
		//������
		String name = "demo";
		//�����б�Class[]
		//String.class��ʾ�ַ���������
		//int.class��ʾint��
		//�κ�.class��ʾ�κε�����
		Class[] types = {String.class,int.class};
		//���ݷ���ǩ����cls���ҷ�����Ϣ
		Method method = cls.getDeclaredMethod(name, types);
		System.out.println(method);
		//ִ��˽�з���
		//�򿪷�����ִ��Ȩ�ޣ�����Υ����װ
		method.setAccessible(true);
		Object obj = cls.newInstance();
		Object value = method.invoke(obj,"tongc",21);
		System.out.println(value);
		
	}

}
