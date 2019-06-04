package demo;

public class Foo {
	
	private String demo(String name,int age) {
		return name+age;
	}
	
	public void print() {
		System.out.println("Hello,Reflect!");
	}
	
	public void qq() {
		System.out.println("Foo's qq()");
	}
	
	public void ww() {
		System.out.println("Foo's ww()");
	}
	
	public void testee() {
		System.out.println("Foo's testee()");
	}
	
	public int testrr() {
		System.out.println("Foo's testrr()");
		return 0;
	}
	
	public static void testtt() {
		System.out.println("Foo's testtt()");
	}
}
