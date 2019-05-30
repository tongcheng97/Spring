package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * ���дһ����������
 * 1.����ʵ��Controller�ӿ�
 * 2.�����ڴ�����������Ӷ��������ÿ����������һ�����͵�����
 * 3.����������Ҫ��,�������Ϳ�����ModelAndView��Ҳ������String
 * 4.ʹ��@Controller�����ô����������������й���
 * 5.ʹ��@RequestMapping������ǰ�˿�������DispatcherServlet����
 *   ����·���봦�����ķ�����Ӧ��ϵ��spring�����ļ���������HandlerMapping�ˣ�
 * 
 */

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("hello()");
		return "hello";
	}
	
	@RequestMapping("/toLogin.do")
	public String toLoogin() {
		System.out.println("toLogin()");
		return "login";
	}
	
	@RequestMapping("/login.do")
	public String loogin() {
		System.out.println("login()");
		return "logining";
	}
}
