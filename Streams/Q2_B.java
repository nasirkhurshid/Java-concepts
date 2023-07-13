import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Q2_B {
	public static void main(String[] args) throws IOException {
		try (ZipFile zipFile = new ZipFile("compressedFile.zip")) {
			ZipEntry zipEntry = zipFile.getEntry("assignment.txt");
			try (InputStream  file_in  = zipFile.getInputStream(zipEntry); FileOutputStream file_out = new FileOutputStream("assignmentDecompressed.txt")) {
				int byteRead;
				while ((byteRead = file_in.read()) != -1) {
					file_out.write(byteRead);
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		try (FileInputStream inputStream = new FileInputStream("assignmentDecompressed.txt")) {
			int inputData ;
			while ((inputData=inputStream.read())!=-1)
				System.out.print((char)inputData);
		}
	}
}
