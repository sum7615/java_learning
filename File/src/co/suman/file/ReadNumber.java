package co.suman.file;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
public class ReadNumber {
	public static void main(String[] args) throws Exception{
		FileInputStream file = new FileInputStream("number.dat");
		BufferedInputStream bf = new BufferedInputStream(file);
		DataInputStream in = new DataInputStream(bf);
		while(true) {
			try {
				double d=in.readDouble();
				System.out.println(d);
			}catch(EOFException e) {
				break;
			}
		}
		in.close();
		bf.close();
		file.close();
		System.out.println("End of Demo");
	}

}
