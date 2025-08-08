package day4;
	abstract class AbstractUser {
	    String username;
	    String password;

	    AbstractUser(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    abstract boolean authenticate();
	}

	class Admin extends AbstractUser {
	    Admin(String username, String password) {
	        super(username, password);
	    }

	    @Override
	    boolean authenticate() {
	        return username.equals("admin") && password.equals("admin123");
	    }
	}

	class User extends AbstractUser {
	    User(String username, String password) {
	        super(username, password);
	    }

	    @Override
	    boolean authenticate() {
	        return password.length() >= 6;
	    }
	}

	public class AUMain {
	    public static void main(String[] args) {
	        AbstractUser admin = new Admin("admin", "admin123");
	        AbstractUser user = new User("john", "secret1");

	        System.out.println("Admin: " + admin.authenticate());
	        System.out.println("User: " + user.authenticate());
	    }
	


}
