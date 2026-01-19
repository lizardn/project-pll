package lizardn.project_pll.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lizardn.project_pll.repositories.CharacterInfoRepository;
import lizardn.project_pll.repositories.models.CharacterInfo;

@Service
public class CharacterInfoService {
	
	private final CharacterInfoRepository characterInfoRepository;
	
	public CharacterInfoService(CharacterInfoRepository characterInfoRepository) {
		this.characterInfoRepository = characterInfoRepository;
	}
	
	public List<CharacterInfo> getCharacterInfo(String nickname) {
		return characterInfoRepository.getCharacterInfo(nickname);
	}
	
}
