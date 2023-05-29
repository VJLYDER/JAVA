package mypack;



class Employee {
	
	int empno = 44;
	String ename = "Asha";
	
	Salary sal;
	
	public Employee(){
		
		System.out.println("from employee constructor");
	
	}
	
	public Employee(int x) {
		
		System.out.println("from Employee constructor" + x);
	}
	
	public String getDetails() {
		
		return(empno + "--" + ename + "--" + sal);
		
		}
}


class Manager extends Employee{
	String dept = "IT";
	
	public Manager() {
		super(888);
		
		System.out.println("from Manager constructor");
		
	}
	
	public String getDetails() {
	return super.getDetails() + "--" + dept;
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println(emp.getDetails());
			
		Manager mgr = new Manager();
		System.out.println(mgr.getDetails());

	}

}
