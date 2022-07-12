package jana60.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class MainControll {
	
	
	
	@GetMapping
	//creo metodo saluto
	public String Home() {
	return "home";
	}
	
	@GetMapping("/ora")
 	public String orario(Model model) {

 		LocalDateTime now = LocalDateTime.now();
 		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
 		model.addAttribute("Orario", now.format(form));
 		return "ora";

 	}
}
