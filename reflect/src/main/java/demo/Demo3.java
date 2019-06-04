package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		//动态加载类
		Scanner in = new Scanner(System.in);
		System.out.println("输入类名:");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		
		//1.找到demo方法
		// Class提供了根据方法签名找到指定方法信息的API
		//方法名
		String name = "demo";
		//类型列表Class[]
		//String.class表示字符串的类型
		//int.class表示int型
		//任何.class表示任何的类型
		Class[] types = {String.class,int.class};
		//根据方法签名在cls查找方法信息
		Method method = cls.getDeclaredMethod(name, types);
		System.out.println(method);
		//执行私有方法
		//打开方法的执行权限！！！违反封装
		method.setAccessible(true);
		Object obj = cls.newInstance();
		Object value = method.invoke(obj,"tongc",21);
		System.out.println(value);
		
	}

}
