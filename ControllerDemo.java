package ProtoTypeDemo;

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
		
		SearchFilesDemo sf1 = new SearchFilesDemo();
		WriteFileDemo wf1 = new WriteFileDemo();
		DeleteFileDemo df1 = new DeleteFileDemo();
		
	    switch (action) {

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
		
		
		
		
	}
	
	
}
