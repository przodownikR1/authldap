package pl.scalatech.adauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {

	@GetMapping("/")
	String index() {
		return "Hello world";
	}
}
