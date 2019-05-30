package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("sb1")
//������ȱʡ��singletonΪ����
//@Scope("prototype")  
//�ӳټ���
@Lazy(true)
public class SomeBean {
	//��ʼ������
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	//���ٷ���
	@PreDestroy
	public void destroy() {
		System.out.println("destroy()");
	}
	public SomeBean() {
		System.out.println("SomeBean()");
	}

}
