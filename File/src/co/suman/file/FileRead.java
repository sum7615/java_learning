package co.suman.file;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileRead {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a valid path to read file");
		String path = sc.nextLine();
		FileReader file = new FileReader(path);
		BufferedReader in = new BufferedReader(file);
		String line;
		while((line=in.readLine())!=null) {
			System.out.println(line);
		}
		file.close();
		in.close();
		sc.close();
	}
}
