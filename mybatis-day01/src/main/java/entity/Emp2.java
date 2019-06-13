package entity;

public class Emp2 {
	private int empNo;
	private String eName;
	private Double age;
	
	@Override
	public String toString() {
		return "Emp2 [empNo=" + empNo + ", eName=" + eName + ", age=" + age + "]";
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	
}
