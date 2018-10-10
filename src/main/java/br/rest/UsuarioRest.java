package br.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioRest {

	@GetMapping
	@PreAuthorize("hasRole('USER')")
	public List<String> usuarios() {
		return Arrays.asList("user1", "user2");
	}
}
