package br.com.fiap.fmba.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.fmba.controller.payload.LoginRequest;

@RestController
@RequestMapping("/health")
public class HealthController {

	@GetMapping(produces="application/json", consumes="application/json")
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
