package nextProject;

import java.io.*; //for file
import java.util.*; // to use scanner

public class FileManagement {

	public static void main(String[] args) throws FileNotFoundException{
		read();
		write();
	}
	
	//class to read a file
	public static void read() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("moby.txt"));
		
		while(scan.hasNext()) {
			String words = scan.nextLine();
			System.out.println(words);
		}
	}
	
	//class to write a file
	public static void write() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("moby.txt"));
		PrintStream out = new PrintStream(new File("empty.txt"));
		
		while(scan.hasNext()) {
			String words = scan.nextLine(); //reads file
			System.out.println(words);  //prints file
			out.println(words);  //writes file
		}
	}

}
