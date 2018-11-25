package com.eduonix.complaintsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class App {
	
	@RequestMapping("/fileComplaint")
	public String fileComplaint() {
		return "fileComplaint";
	}
	
	@RequestMapping("/submitComplaint")
	public String submitComplaint() {
		return "submitComplaint";
	}
	
	@RequestMapping(name="/showComplaints", method=RequestMethod.GET)
	public String showComplaints() {
		return "showEnterPassword";
	}
	
	@RequestMapping(name="/showComplaints", method=RequestMethod.POST)
	public String showComplaintsPost() {
		return "showComplaints";
	}

}
