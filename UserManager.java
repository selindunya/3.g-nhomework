
public class UserManager {
public void add(User user) {
	System.out.println(user.getName()+ " "+ user.getLastName()+ " adlý kullanýcý sisteme eklendi.");
}
public void delete (User user) {
	System.out.println(user.getName()+ " "+ user.getLastName()+ " adlý kullanýcý sistemden silindi.");
}
public void update (User user) {
	
	System.out.println(user.getName()+ " "+ user.getLastName()+ " adlý kullanýcý sistemde güncellendi.");
}
}
