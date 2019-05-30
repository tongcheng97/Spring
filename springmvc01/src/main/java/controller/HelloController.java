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
		 * ModelAndView���������ù�������
		 * 1.ModelAndView(String viewName),viewName����ͼ��
		 * 2.ModelAndView(String viewName,Map data),Map���ڷ�װ�������
		 */
		return new ModelAndView("hello");
	}

}	