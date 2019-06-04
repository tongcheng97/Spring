package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * 动态执行一个类中全部以@Demo注解标注的方法
 */
public class Demo4 {

	public static void main(String[] args) throws Exception {
		//动态加载类
		Scanner in = new Scanner (System.in);
		System.out.println("输入类名：");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		//获取全部方法
		Method[] method = cls.getDeclaredMethods();
		//
		Object obj = cls.newInstance();
		for(Method md : method) {
			//检查一个方法的注解信息
			//md.getAnnotation(被检查的注解类型),返回注解类型，
			//如果为空表示没有注解
			Demo ann = md.getAnnotation(Demo.class);
			if(ann != null) {
				System.out.println(md);
				md.invoke(obj);
			}
		}
	}

}
