package WebsiteFactory;
import java.util.*;

import ConcreteWebsite.ContreteWebsite;
import Website.Website;

public class WebsiteFactory {
	HashMap<String, Website> websites = new HashMap<String, Website>();
	public Website getWebsite(String websitetype) {
		Website website = websites.get(websitetype);
		if(website != null) {
			return website;
		}
		else {
			website = new ContreteWebsite(websitetype);
			websites.put(websitetype, website);
			return website;
		}
	}

public int getWebsiteNum() {
	return websites.size();
	}
}
