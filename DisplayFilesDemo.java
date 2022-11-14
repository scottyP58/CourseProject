package ProtoTypeDemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DisplayFilesDemo {

	
	
	DisplayFilesDemo(){
		
	}
	
	
	public void Displayfiles()
	
	{
		
		
	String currentPath = "";
    String[] fileNames;
	

	
	try {
		currentPath = new java.io.File(".").getCanonicalPath();
					
	} 
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//break;
	}
	
	File f = new File(currentPath);
	
	fileNames = f.list();
	
	
	
	//FilenameFilter filter = new FileDemo();
	
	//fileNames = f.list(filter);
	
	System.out.println("Current dir:" + currentPath);
	
	
      ArrayList <String> list = new ArrayList<String>();
      //Instantiating an ArrayList object
      
      
      for (String filename : fileNames) {
            // Print the names of files and directories
            //System.out.println(pathname);

	    list.add(filename);

        }
      

      

      System.out.println("Files list: ");
      
   // Sorting ArrayList in ascending Order   
     Collections.sort(list);
      
      for (String element : list){
       //  if (element.contains("Java")){
         //      System.out.println(element);
        // }
      
    	  System.out.println(element);
    	  
      }
      
      list.clear();
	
	
	}
	
}
