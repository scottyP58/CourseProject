package ProtoTypeDemo;


import java.io.File;
import java.io.FilenameFilter;


public class FileDemo implements FilenameFilter
{
  
	public String endWith = "";
	
	FileDemo()
	{
		
	}
	
		
	public FileDemo(String endWith) {
		super();
		this.endWith = endWith;
	}

	

public String getEndWith() {
		return endWith;
	}


	public void setEndWith(String endWith) {
		this.endWith = endWith;
	}


//@Override
  public boolean accept(File dir, String fileName)
  {
      
	  
	  if(endWith.length() > 0){
	  
	  return fileName.contains(endWith);
	  		  
	  }
	  else{
		  return fileName.endsWith(".txt");
	  }
	
  }
}
