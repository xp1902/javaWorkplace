package ConcreteWebsite;
import User.User;
import Website.Website;

public class ContreteWebsite extends Website{
	private String type;
	
	public ContreteWebsite(String type) {
		this.type = type;
	}
	
	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println(type + "\t" + user.getName());
	}
	
}
