import java.io.IOException;
import java.io.RandomAccessFile;

public class Q3_B {
	public static void main(String[] args) throws IOException {
		EmployeeClass emp1 = new EmployeeClass("Ali", 1, 55441254789654L, "Assistant Professor", "CS"),
				emp2 = new EmployeeClass("Ahmad", 2, 55412369782587L, "Associate Professor", "CS");
		RandomAccessFile file = new RandomAccessFile("EmployeesDataRandom.bin", "rw");
		file.writeUTF(emp1.getName());
		file.writeInt(emp1.getEmpID());
		file.writeLong(emp1.getCNIC());
		file.writeUTF(emp1.getDesignation());
		file.writeUTF(emp1.getDepartment());
		
		file.writeUTF(emp2.getName());
		file.writeInt(emp2.getEmpID());
		file.writeLong(emp2.getCNIC());
		file.writeUTF(emp2.getDesignation());
		file.writeUTF(emp2.getDepartment());
		file.seek(0);
		int input = 0;
		System.out.println("Employees Data:\n");
		while (input++ < 2) {
			EmployeeClass object = new EmployeeClass(file.readUTF(), file.readInt(), file.readLong(), file.readUTF(), file.readUTF());
			System.out.println(object.toString());
		}
		file.close();
	}
}