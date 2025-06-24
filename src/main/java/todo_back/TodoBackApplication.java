package todo_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class TodoBackApplication {

	@RequestMapping("/")
	public String home() {
		return "succeeded";
	}
	public static void main(String[] args) {
		SpringApplication.run(TodoBackApplication.class, args);
	}

}
