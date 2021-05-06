
public class InstructorManager extends UserManager {
	public void StudentNumber(Instructor instructor) {
		System.out.println("eðitmenin öðrenci sayýsý:"+ instructor.getNumberofStudents());
	}
 public void downloadCourses(Instructor instructor) {
	 System.out.println("sisteme yüklenilen kurslar: ");
	 for (String CourseName : instructor.getClassDownloadPercentage()) {
		 System.out.println(CourseName);
	 }
 }
}
