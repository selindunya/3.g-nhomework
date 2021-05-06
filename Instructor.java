
public class Instructor extends User {
	 private String[] classDownloadPercentage;
	private int numberofStudents;
	public Instructor(String name, String lastName, String eMail, String password) {
		super(name, lastName, eMail, password);
	//	this.classDownloadPercentage=  classDownloadPercentage;
		
	}

	public int getNumberofStudents() {
		return numberofStudents;
	}

	public void setNumberofStudents(int numberofStudents) {
		this.numberofStudents = numberofStudents;
	}



	public String[] getClassDownloadPercentage() {
		return classDownloadPercentage;
	}

	public void setClassDownloadPercentage(String[] classDownloadPercentage) {
		this.classDownloadPercentage = classDownloadPercentage;
	}

}
