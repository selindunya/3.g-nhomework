
public class InstructorManager extends UserManager {
	public void StudentNumber(Instructor instructor) {
		System.out.println("e�itmenin ��renci say�s�:"+ instructor.getNumberofStudents());
	}
 public void downloadCourses(Instructor instructor) {
	 System.out.println("sisteme y�klenilen kurslar: ");
	 for (String CourseName : instructor.getClassDownloadPercentage()) {
		 System.out.println(CourseName);
	 }
 }
}
