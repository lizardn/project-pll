package lizardn.project_pll.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescribtionController {
	
	@Value("${project.pseudonym}")
	private String projectPseudonym;
	
	@GetMapping("/describtion")
	public String describtionPage(Model model) {
		model.addAttribute("pseudonym", projectPseudonym);
		return "describtion";
	}
	
}
