package com.qsp.sprigbootnativequery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.sprigbootnativequery.Service.CountryService;
import com.qsp.sprigbootnativequery.dto.Country;
@RestController
public class CountryController {
	@Autowired
	CountryService service;
	@PostMapping("/saveCountry")
	 public Country saveCountry(@RequestBody Country country ) {
		 return service.saveCountry(country);
	 }
	
	@GetMapping("/getAllCountry")
	 public List<Country> getAllCountry(){
		  return service.getAllCountry();
	}
	@DeleteMapping("/deleteCountry/{id}")
	 public String deleteCountry(@PathVariable int id) {
		 return service.deleteCountry( id);
	 }
	
	@PutMapping("/updateCountry/{countryName}/{countryCapital}/{countryCode}")
	 public String updateCountry(@PathVariable String countryName,@PathVariable String countryCapital,@PathVariable int countryCode) {
		 return service.updateCountry(countryName, countryCapital, countryCode);
	 }
	
	
	
}
