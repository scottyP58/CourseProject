package ProtoTypeDemo;

import java.io.File;
import java.util.Scanner;

public class DeleteFileDemo {

	
	
	DeleteFileDemo(){
		
	}
	
	

public void Deletefile(){

  Scanner s = new Scanner(System.in);

  System.out.println("Enter in filename to delete");

  String fName = s.next();

  File file = new File(fName);

  if (fName.length() > 1){
	  if (file.delete()) { 
      System.out.println("Deleted the file: " + file.getName());
    } else {
      System.out.println("Failed to delete the file.");
    }
  } else {
	  System.out.println("Please enter a valid filename."); 
  }
	  

} 
	
	
}
