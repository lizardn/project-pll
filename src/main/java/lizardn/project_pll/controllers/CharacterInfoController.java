package lizardn.project_pll.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lizardn.project_pll.repositories.models.CharacterInfo;
import lizardn.project_pll.services.BugSearchService;
import lizardn.project_pll.services.CharacterInfoService;

@Controller
public class CharacterInfoController {
	
	@Value("${project.pseudonym}")
	private String projectPseudonym;
	
	private CharacterInfoService characterInfoService;
	private BugSearchService bis;
	
	public CharacterInfoController(CharacterInfoService characterInfoService, BugSearchService bis) {
		this.characterInfoService = characterInfoService;
		this.bis = bis;
	}
	
	@GetMapping("/character_info")
	public String describtionPage(Model model) {
		model.addAttribute("pseudonym", projectPseudonym);
		List<CharacterInfo> list = characterInfoService.getCharacterInfo("Nio");
		bis.setMsg("postList");
		String nickname = "Nio123";
		String id_char = String.valueOf(list.getFirst().getIdCharacter());
		String time_begin = "time_begin123";//String.valueOf(list.getFirst().getBegin_naming());
		model.addAttribute("nickname", nickname);
		model.addAttribute("id_char", id_char);
		model.addAttribute("time_begin", time_begin);
		return "character_info";
	}
	
}
