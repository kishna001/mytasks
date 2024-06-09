package selenium_programs.seleniumAssignments;

public class Day7Task2Pojo {
	private int userId;
	private String title;
	private String body;
	
	//Constructors
	public Day7Task2Pojo() {
		
	}
    public Day7Task2Pojo(int userId,String title,String body) {
    	this.userId= userId;
    	this.title=title;
    	this.body=body;
	}
    
    //getters and setters
    public int setUserId(int userId) {
    	return this.userId= userId;
    }
    public int getUserId() {
    	return userId;
    }
    public void setTitle(String title) {
    	this.title=title;
    }
    public String getTitle() {
    	return title;
    }
    public String getBody() {
    	return body;
    }
    public void setBody(String body) {
    	this.body=body;
    }  
}
