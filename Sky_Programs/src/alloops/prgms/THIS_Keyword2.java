package alloops.prgms;

class Employee {
	private String name;
	private int id;

	// Constructor with parameters
	public Employee(String name, int id) {
		this.name = name; // 'this.name' refers to the instance variable
		this.id = id; // 'this.id' refers to the instance variable
	}

	// Method to display employee details
	public void displayInfo() {
		System.out.println("Name: " + this.name); // 'this' refers to the current object
		System.out.println("ID: " + this.id);
	}
}

class THIS_Keyword2 {
	public static void main(String[] args) {
		Employee emp = new Employee("Syam", 101);
		emp.displayInfo();
	}
}
