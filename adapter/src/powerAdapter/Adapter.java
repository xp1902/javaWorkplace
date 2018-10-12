package powerAdapter;

import threeH.ThreeH;
import twoH.TwoH;

public class Adapter implements ThreeH{
	private TwoH twoh;
	
	public Adapter(TwoH twoh) {
		this.twoh = twoh;
	}
	
	@Override
	public void request() {
		twoh.request();
		// TODO Auto-generated method stub
		System.out.println("Become a three hole pludge");
	}

}
