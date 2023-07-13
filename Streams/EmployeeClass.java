import java.io.Serializable;

public class EmployeeClass implements Serializable{
	private String name, designation ,department;
	private int empID;
	private long CNIC;
	
	public EmployeeClass(String name, int empID, long CNIC, String designation, String department) {
		this.name = name;
		this.empID = empID;
		this.CNIC = CNIC;
		this.designation = designation;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public int getEmpID() {
		return empID;
	}
	public long getCNIC() {
		return CNIC;
	}
	public String getDesignation() {
		return designation;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nEmployee ID: " + empID + "\nCNIC: " + CNIC + "\nDesignation: " + designation
				+ "\nDepartment: " + department + "\n\n";
	}
}
