package com.org.controller;

import com.org.entity.DataEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CalculatorController {

	@RequestMapping("/")
	public String showWelcomePage(Model model){
		DataEntry dataEntry = new DataEntry();
		model.addAttribute("dataEntry", dataEntry);
		return "welcomePage";
	}

	@RequestMapping("/showFutureValue")
	public String showFutureValue(Model model,
	                              @Valid @ModelAttribute("dataEntry") DataEntry dataEntry,
	                              BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "welcomePage";
		}
		double futureValue = dataEntry.computeFutureValue();
		model.addAttribute("futureValue", futureValue);
		return "futureValueConfirmation";
	}
}
