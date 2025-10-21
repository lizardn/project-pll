package lizardn.project_pll.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharacterInfoController {
	
	@Value("${project.pseudonym}")
	private String projectPseudonym;
	
	@GetMapping("/character_info")
	public String describtionPage(Model model) {
		model.addAttribute("pseudonym", projectPseudonym);
		return "character_info";
	}
	
}
