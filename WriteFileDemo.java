package ProtoTypeDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileDemo {

		
	
	WriteFileDemo(){
		
	}
	
	
	public void writefile(){	
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter in some text for the file you want to add.");
		String data = s.nextLine();
		data = data + "\n";
		System.out.println("\nThis is the text you entered: "+data);
		
		try {
			//Create a writer object using the FileWriter class
			System.out.println("Now please enter in the name of the file to add.\n");
			//Scanner s = new Scanner(System.in);
			
			String fName = s.next(); 
			
			File file = new File(fName);
			
			boolean check = file.createNewFile();
			if(check){
			System.out.println("The new file is created");
			}
			else{
			System.out.println("The file is already exists!");
			}
			
			
			
			FileWriter output = new FileWriter(fName);
			//output = new FileWriter("myfile.txt");
			
			
			//output.write(data);
			output.append(data);
			System.out.println("Data is written to the file.");
			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			//output.close();
			System.out.println("File operation complete.");
			
		}
				
				
	}

}
