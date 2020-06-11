package br.unifacisa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Achei disciplina");
	}
}