package co.suman.file;
import java.io.File;
import java.util.Scanner;


public class FileP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter valid directory path to review the files");
		String path= sc.nextLine();
		File file =new File(path);
		if(!file.isDirectory()) {
			System.out.println("Invalid input");
			sc.close();
			return;
		}
		File[] files = file.listFiles();
		System.out.println(files.length);
		for(File f:files) {
			System.out.printf("[%s]%s\n",f.isDirectory()?"Dir":"File",f.getName());
			sc.close();
		}
		
		
	}
}
