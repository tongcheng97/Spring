package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("����������");
		String className = in.nextLine();
		//��̬������
		Class cls = Class.forName(className);
		System.out.println(cls);
		//��̬��������
		Object obj = cls.newInstance();
		System.out.println(obj);
		Method[] arr = cls.getDeclaredMethods();
		for(Method md : arr) {
			String methodName = md.getName();
			if(methodName.startsWith("test")) {
				System.out.println("�ҵ���:");
				System.out.println(md);
//				System.out.println(md.getName());
//				System.out.println(md.getReturnType());
			}
		}
		
	}

}
