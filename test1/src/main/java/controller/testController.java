package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class testController {
	
	@RequestMapping("index")
	public String index(ModelMap m) {
		m.put("xl", "aaaaaa");
		return "index";
	}
}
