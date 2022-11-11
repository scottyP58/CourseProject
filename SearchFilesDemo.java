package ProtoTypeDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class SearchFilesDemo {

	private String currentPath;
	private String[] fileNames;
	private String endWith;
	
	SearchFilesDemo(){
		
	}
	
	
	public void searchfiles(){
		
		
		
		try {
			currentPath = new java.io.File(".").getCanonicalPath();
						
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//break;
		}	
	
		File f = new File(currentPath);
		
		System.out.println("Please enter the file search: ");
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		
		
		this.endWith = data;
		
		FilenameFilter filter = new FileDemo(endWith);
		
		
		
		fileNames = f.list(filter);
		
		System.out.println("Current dir:" + currentPath);
		
		ArrayList <String> list = new ArrayList<String>();
	      //Instantiating an ArrayList object
	      
	      
	      for (String filename : fileNames) {
	            // Print the names of files and directories
	            //System.out.println(pathname);

		    list.add(filename);

	        }
	      
	      if (list.isEmpty()) {
	    	  
	    	  System.out.println("\nNo file(s) found that meet your search criteria.");
	    	  
	      }
	      
	      else
	      {
	      
	      System.out.println("\nFile(s) found: ");
	      
		     Collections.sort(list);
		      
		      for (String element : list){
		       //  if (element.contains("Java")){
		         //      System.out.println(element);
		        // }
		      
		    	  System.out.println(element);
		    	  
		      }
		     
	      }  
		      
		      list.clear();
		
		
	}
	
}
