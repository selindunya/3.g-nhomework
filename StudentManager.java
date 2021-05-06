
public class StudentManager {
public void PrintCompletedPercentage(Student student) {
	System.out.println(student.getName()+ " "+ student.getLastName()+ " Kullanýcýsýnýn kursu tamamlanma yüzdesi: %"+ student.getGetPercentage());
	
}
public void PrintAssignments (Student student) {
	System.out.println("Bu sistemdeki ödevler: ");
	for (String Assignment : student.getAssignments()) {
		System.out.println(Assignment);
	}
}

}
