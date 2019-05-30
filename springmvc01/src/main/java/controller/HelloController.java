package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Component("helloController")
public class HelloController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, 
			HttpServletResponse resp) throws Exception {
		System.out.println("handleRequest()");
		/*
		 * ModelAndView有两个常用构造器：
		 * 1.ModelAndView(String viewName),viewName是视图名
		 * 2.ModelAndView(String viewName,Map data),Map用于封装处理结果
		 */
		return new ModelAndView("hello");
	}

}	
