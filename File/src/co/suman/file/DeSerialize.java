package co.suman.file;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("product.dat"); 
		BufferedInputStream bis = new BufferedInputStream(file);
		ObjectInputStream in = new ObjectInputStream(bis);
		
		while(true) {
			try {
				Object obj = in.readObject();
				System.out.println(obj);
			}catch(EOFException e){
				break;
			}
		}
		in.close();
		file.close();
		bis.close();
	}


}
