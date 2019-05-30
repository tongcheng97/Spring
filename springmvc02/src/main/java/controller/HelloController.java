package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 如何写一个处理器：
 * 1.不用实现Controller接口
 * 2.可以在处理器类中添加多个方法，每个方法处理一种类型的请求
 * 3.方法名不做要求,返回类型可以是ModelAndView，也可以是String
 * 4.使用@Controller，将该处理器纳入容器进行管理
 * 5.使用@RequestMapping，告诉前端控制器（DispatcherServlet），
 *   请求路径与处理器的方法对应关系（spring配置文件不用配置HandlerMapping了）
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
