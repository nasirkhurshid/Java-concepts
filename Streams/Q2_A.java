import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q2_A {
	public static void main(String[] args) {
		String originalFile = "java.jpg", copiedFile = "java-copy.jpg";
		System.out.println("File size: " + new File(originalFile).length()/1000 + " kilobytes");
		
		long startTime, endTime;
		try (FileInputStream  file_in  = new FileInputStream(originalFile); FileOutputStream file_out = new FileOutputStream(copiedFile)) {
			startTime = System.currentTimeMillis();
			int byteRead;
			while ((byteRead = file_in.read()) != -1) {
				file_out.write(byteRead);
			}
			endTime = System.currentTimeMillis() - startTime;
			System.out.println("Time taken using simple copying " + (endTime / 1000.0) + " sec");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try (BufferedInputStream file_in = new BufferedInputStream(new 	FileInputStream(originalFile)); BufferedOutputStream file_out = new 	BufferedOutputStream(new FileOutputStream(copiedFile))) {
			startTime = System.currentTimeMillis();
			int byteRead;
			while ((byteRead = file_in.read()) != -1) {
				file_out.write(byteRead);
			}
			endTime = System.currentTimeMillis() - startTime;
			System.out.println("Time taken using Buffered copying " + (endTime / 1000.0) + " sec");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
