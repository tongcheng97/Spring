package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("sb1")
//作用域缺省或singleton为单例
//@Scope("prototype")  
//延迟加载
@Lazy(true)
public class SomeBean {
	//初始化方法
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	//销毁方法
	@PreDestroy
	public void destroy() {
		System.out.println("destroy()");
	}
	public SomeBean() {
		System.out.println("SomeBean()");
	}

}
