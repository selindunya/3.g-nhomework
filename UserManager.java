
public class UserManager {
public void add(User user) {
	System.out.println(user.getName()+ " "+ user.getLastName()+ " adl� kullan�c� sisteme eklendi.");
}
public void delete (User user) {
	System.out.println(user.getName()+ " "+ user.getLastName()+ " adl� kullan�c� sistemden silindi.");
}
public void update (User user) {
	
	System.out.println(user.getName()+ " "+ user.getLastName()+ " adl� kullan�c� sistemde g�ncellendi.");
}
}
