package lizardn.project_pll.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import lizardn.project_pll.repositories.models.CharacterInfo;

@Repository
public interface CharacterInfoRepository extends CrudRepository<CharacterInfo, Integer>{
	
	@Query("SELECT * FROM get_character_stat(:nickname)")
	List<CharacterInfo> getCharacterInfo(@Param("nickname") String nickname);
	
}
