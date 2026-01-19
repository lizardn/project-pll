package lizardn.project_pll.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class BugSearchService {
	
	private String msg = "none";
	private Long time = 0L;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		this.time = System.currentTimeMillis();
	}

	public Long getTime() {
		return time;
	}	
	
}
