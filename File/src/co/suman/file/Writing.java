package co.suman.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Writing {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("sample.txt");
		BufferedWriter bf = new BufferedWriter(file);
		PrintWriter out = new PrintWriter(bf);
		
		out.println("Hi Practice is going on");
		
		out.close();
		bf.close();
		file.close();
		System.out.println("End of demo");
	
		
	}
}
