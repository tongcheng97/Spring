package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * ��ִ̬��һ������ȫ����@Demoע���ע�ķ���
 */
public class Demo4 {

	public static void main(String[] args) throws Exception {
		//��̬������
		Scanner in = new Scanner (System.in);
		System.out.println("����������");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		//��ȡȫ������
		Method[] method = cls.getDeclaredMethods();
		//
		Object obj = cls.newInstance();
		for(Method md : method) {
			//���һ��������ע����Ϣ
			//md.getAnnotation(������ע������),����ע�����ͣ�
			//���Ϊ�ձ�ʾû��ע��
			Demo ann = md.getAnnotation(Demo.class);
			if(ann != null) {
				System.out.println(md);
				md.invoke(obj);
			}
		}
	}

}
