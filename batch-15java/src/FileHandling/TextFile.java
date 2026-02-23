package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class TextFile {
	public static void main1(String[] args) throws IOException {
		File file=new File("C:\\Users\\mdyas\\OneDrive\\Desktop\\tejait\\test.txt");//file path location
		FileWriter fw=new FileWriter(file);//file path location
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Teja it");
		bw.newLine();
		bw.write("your java stop");
		bw.newLine();
		bw.write("hyd");
		bw.close();
		fw.close();
		System.out.println("created file Successfully");
	
	}
public static void main(String[] args) throws IOException{
	File file=new File("C:\\Users\\mdyas\\OneDrive\\Desktop\\tejait\\test.txt");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	
	while(line!=null) {
		System.out.println(line);
		line=br.readLine();
	}
	br.close();
	fr.close();
}

}
