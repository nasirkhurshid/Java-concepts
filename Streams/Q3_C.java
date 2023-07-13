import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3_C {
	public static void main(String[] args) throws IOException {
		EmployeeClass emp1 = new EmployeeClass("Ali", 1, 55441254789654L, "Assistant Professor", "CS"), 
				emp2 = new EmployeeClass("Ahmad", 2, 55412369782587L, "Associate Professor", "CS");
		FileOutputStream file_out = new FileOutputStream("EmployeesData.txt");
		String data = "Employees Data:\n\n";
		file_out.write(data.toString().getBytes()); 
		file_out.write(emp1.toString().getBytes()); 
		file_out.write(emp2.toString().getBytes());    
		file_out.close();
		
		FileInputStream file_in = new FileInputStream("EmployeesData.txt");    
		int input;
		while((input=file_in.read())!=-1){    
			System.out.print((char)input);    
		}    
		file_in.close();
	}
}
