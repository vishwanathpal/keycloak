package com.h24.service.patient.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h24.service.patient.models.Patients;

@RestController
@RequestMapping("/h24")
public class PatientResourecs {

	private List<Patients> patients = Stream.of(

			new Patients(1, "vish", "pal", "vish@gmail.com", "pass123", "97145", "M", "15/11/86", "vadodara"),
			new Patients(2, "vishal", "paul", "pal@gmail.com", "pass012", "62614", "M", "10/12/80", "Surat"),
			new Patients(3, "Dhru", "kota", "dhu@gmail.com", "pass569", "12345", "F", "15/09/75", "Delhi"))
			.collect(Collectors.toList());

	@GetMapping("/patients")
	public List<Patients> getAllPatients() {
		return patients;
	}
	
	@GetMapping(value = "/patients/{id}")
	public ResponseEntity<Patients> getDetails(@PathVariable("id") Integer id) {
		Optional<Patients> patient = patients.stream().filter(p -> id.equals(p.getId())).findFirst();
		if (!patient.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
        return new ResponseEntity<>(patient.get(), HttpStatus.ACCEPTED);
	}
}
