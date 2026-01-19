package lizardn.project_pll.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lizardn.project_pll.services.BugSearchService;


@Controller
public class StartpageController {
	
	private BugSearchService bis;
	
	public StartpageController(BugSearchService bis) {
		this.bis = bis;
	}
	
	@Value("${project.pseudonym}")
	private String projectPseudonym;
	
	@GetMapping({"/", "/startpage", "/home"})
	public String startpage(Model model) 
	{		
		model.addAttribute("pseudonym", projectPseudonym);
		model.addAttribute("bugmsg", bis.getMsg());
		return "startpage";
	}

}
