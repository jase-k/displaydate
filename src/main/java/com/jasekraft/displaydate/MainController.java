package com.jasekraft.displaydate;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String showDate(Model model) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEEEEE, 'the' d 'of'  MMMM, yyyy");
		model.addAttribute("date", formatter.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String showTime(Model model) {
		Date time = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
		model.addAttribute("time", formatter.format(time));
		return "time.jsp";
	}
}
