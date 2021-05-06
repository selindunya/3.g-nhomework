
public class Main {

	public static void main(String[] args) {
	Instructor instructor1 = new Instructor(null, null, null, null);
	instructor1.setName("Selin");
	instructor1.setLastName("Dünya");
	instructor1.seteMail("dunyaselin@gmail.com");
	instructor1.setPassword("sdsfdf");
	instructor1.setNumberofStudents(1000);
String [] ClassDownloadPercentage= {"Java", "Phyton", "JavaScript","C#"};
instructor1.setClassDownloadPercentage(ClassDownloadPercentage);
Student student1 = new Student(null, null, null, null, 0);
student1.setName("batuhan");
student1.setLastName("abak");
student1.seteMail("sadsj@gmail.com");
student1.setPassword("1233556");
student1.setGetPercentage(80);
String[] Assignments = {"Inheritence", "Methods", "Data types"};
student1.setAssignments(Assignments);
InstructorManager instructormanager = new InstructorManager();
StudentManager studentmanager = new StudentManager();
UserManager userManager= new UserManager();
userManager.add(instructor1);
userManager.add(student1);
userManager.delete(student1);
userManager.update(student1);
instructormanager.downloadCourses(instructor1);
instructormanager.StudentNumber(instructor1);
studentmanager.PrintAssignments(student1);
studentmanager.PrintCompletedPercentage(student1);
	}

}
