package lizardn.project_pll.repositories.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class CharacterInfo {
	@Id 
	@Column("id_character") 
	private int id_character;
	
	@Column("nickname")
	private String nickname;
	
	@Column("begin_naming")
	private LocalDateTime begin_naming;	
	
	public int getIdCharacter() {
		return id_character;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public LocalDateTime getBegin_naming() {
		return begin_naming;
	}
	public void setBegin_naming(LocalDateTime begin_naming) {
		this.begin_naming = begin_naming;
	}
}
