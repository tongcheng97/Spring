package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * 执行一个类中所有以test为开头的非静态方法
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		//动态加载类
		Scanner in = new Scanner(System.in);
		System.out.println("输入类名:");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		//动态获取全部方法信息
		Method[] method = cls.getDeclaredMethods();
		//迭代全部方法查找以test为开头的方法
		Object obj = cls.newInstance();
		for(Method md : method) {
			if(md.getName().startsWith("test")) {
				System.out.println(md);
				md.invoke(obj);
			}
				
		}
	}
}
