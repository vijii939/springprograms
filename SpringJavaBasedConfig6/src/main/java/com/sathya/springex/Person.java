package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Autowired
	HomeLoneService homeLoneService;
	@Autowired
	RealStateService realStateService;
	
	/*public HomeLoneService getHomeLoneService() {
		return homeLoneService;
	}
	@Autowired
	public void setHomeLoneService(HomeLoneService homeLoneService) {
		this.homeLoneService = homeLoneService;
	}
	public RealStateService getRealStateService() {
		return realStateService;
	}
	@Autowired
	public void setRealStateService(RealStateService realStateService) {
		this.realStateService = realStateService;
	}*/
     public void details()
     {
    	 homeLoneService.loanInfo();
    	 realStateService.realStateInfo();
     }

}
