
public class StudentManager {
public void PrintCompletedPercentage(Student student) {
	System.out.println(student.getName()+ " "+ student.getLastName()+ " Kullan�c�s�n�n kursu tamamlanma y�zdesi: %"+ student.getGetPercentage());
	
}
public void PrintAssignments (Student student) {
	System.out.println("Bu sistemdeki �devler: ");
	for (String Assignment : student.getAssignments()) {
		System.out.println(Assignment);
	}
}

}
