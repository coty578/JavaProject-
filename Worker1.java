package MythirdProgram;

public class Worker1 {
	private String name;
	private double salary;
	private static int counter = 0;
	public Worker1(String name,double salary) {
		this.name = name;
		this.salary = salary;
		counter++;
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setsalary(double salary) {
		if(salary < 0) {
			throw new IllegalArgumentException("salary must be greater than zero");
		}
		this.salary = salary;
		}
	public static int getWorkerCounter() {
		return counter;
	}
	}


