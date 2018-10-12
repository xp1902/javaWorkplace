package Test;
import User.User;
import Website.Website;
import WebsiteFactory.WebsiteFactory;

public class Test {
	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website website1 = factory.getWebsite("·þ×°Àà");
		website1.use(new User("tlion"));
	}
}
