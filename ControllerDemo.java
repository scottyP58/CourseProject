package ProtoTypeDemo;

import java.util.Scanner;

public class ControllerDemo {

/*	private char action;

	public char getAction() {
		return action;
	}

	public void setAction(char action) {
		this.action = action;
	}
*/
	public ControllerDemo(){
		
	}
	
//	public ControllerDemo(char action) {
	//	super();
		//this.action = action;
	//}
	

	public void invokeseacrh(char action){
		
		Scanner s = new Scanner(System.in);
		SearchFilesDemo sf1 = new SearchFilesDemo();
		WriteFileDemo wf1 = new WriteFileDemo();
		DeleteFileDemo df1 = new DeleteFileDemo();
		DisplayFilesDemo ds1 = new DisplayFilesDemo();
		int cnt = 0;
		
		do
		{
		
		if(action == 'o' || cnt > 0){
			
			cnt++;
			System.out.println("\nAdd File[a], Delete File[d], Search File[s], Exit[x]");
			action = s.next().charAt(0);
			
		}
		
	    switch (action) {

	    //Display Files
	     case 'l':
	    	 if(cnt == 0){
	    		    		 
	    	 ds1.Displayfiles();
	    	 action = 'x';
	    	 }
	    	 else{
	    		 System.out.println("Invalid Selection!");
	    	 }
	    	 break;
	    
	    // Add file
	      case 'a':
		//System.out.println("Not implemented");
	    	  wf1.writefile();
	        break;

	      // Delete file
	      case 'd':
		//System.out.println("Not implemented");
	    	  df1.Deletefile();
	        break;

	      // search files
	      case 's':
	    	  sf1.searchfiles();
	        break;

		 // search files
		   case 'x':
			   System.out.println("Exiting...");
		   break;
	        
	      default:
	        System.out.println("Invalid Selection!");
	        break;
	    }
		
		}while (action != 'x');
		
		
	}
	
	
}
