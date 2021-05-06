
public class Student extends User {
	private int getPercentage;
private	String Assignments[];

public Student(String name, String lastName, String eMail, String password,int getPercentage) {
	super(name, lastName, eMail, password);
	this.getPercentage= getPercentage;
	
}

	public String[] getAssignments() {
	return Assignments;
}

public void setAssignments(String[] assignments) {
	Assignments = assignments;
}

	

	public int getGetPercentage() {
		return getPercentage;
	}

	public void setGetPercentage(int getPercentage) {
		this.getPercentage = getPercentage;
	}

}
