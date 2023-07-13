import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q3_A {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		EmployeeClass emp1 = new EmployeeClass("Ali", 1, 55441254789654L, "Assistant Professor", "CS"),
				emp2 = new EmployeeClass("Ahmad", 2, 55412369782587L, "Associate Professor", "CS");
		ObjectOutputStream object_out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("EmployeesDataObj.txt")));
		object_out.writeObject(emp1);
		object_out.writeObject(emp2);
		object_out.close();

		ObjectInputStream object_in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("EmployeesDataObj.txt")));
		EmployeeClass object = null;
		int objRead = 0;
		System.out.println("Employees Data:\n");
		while (objRead++ < 2) {
			object = (EmployeeClass) object_in.readObject();
			System.out.println(object.toString());
		}
		object_in.close();
	}
}
