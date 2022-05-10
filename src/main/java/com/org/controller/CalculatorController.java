package com.org.controller;

import com.org.entity.DataEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {

	@RequestMapping("/")
	public String showWelcomePage(Model model){
		DataEntry dataEntry = new DataEntry();
		model.addAttribute("dataEntry", dataEntry);
		return "welcomePage";
	}

	@RequestMapping("/futureValue")
	public String showFutureValue(Model model, @ModelAttribute("dataEntry") DataEntry dataEntry){
	}
}
