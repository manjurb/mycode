package com.css.corp.epmo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.css.corp.epmo.project.dto.ViewList;
import com.css.corp.epmo.project.service.ListService;

@Controller
public class ListController {
	
	@Autowired
	ListService listService;
	
	@RequestMapping(value = "/getAllView", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllView(Model model) {

		List<ViewList> listofProjects = listService.getAllList();
		model.addAttribute("ViewList", new ViewList());
		model.addAttribute("listofProjects", listofProjects);
		return "projectDetails";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllView";
	}
	
	@RequestMapping(value = "/getView/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ViewList getViewById(@PathVariable int id) {
		return listService.getList(id);
	}
	
	@RequestMapping(value = "/updateView/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateView(@PathVariable("id") int id,Model model) {
		model.addAttribute("ViewList", this.listService.getList(id));
		model.addAttribute("listOfCustomers", this.listService.getAllList());
		return "projectDetails";
	}

	@RequestMapping(value = "/addStatus", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addStatus(@ModelAttribute("ViewList")ViewList viewList)
	{
			listService.updateCustomer(viewList);
			return "redirect:/getAllView";
	}

	@RequestMapping(value = "/updateStatus", method = RequestMethod.POST, headers = "Accept=application/json")
	public String updateStatus(@ModelAttribute("ViewList")ViewList viewList)
	{
			listService.updateCustomer(viewList);
			return "redirect:/getAllView";
	}
	

}
