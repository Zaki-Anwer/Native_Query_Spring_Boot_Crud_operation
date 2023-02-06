package com.qsp.sprigbootnativequery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.sprigbootnativequery.Dao.CountryDao;
import com.qsp.sprigbootnativequery.dto.Country;
@Service
public class CountryService {
	@Autowired
	CountryDao dao;
	 //save method
	 public Country saveCountry(Country country ) {
		  dao.saveCountry(country);
		  return country;
	  }
	 public List<Country> getAllCountry(){
		return dao.getAllCountry();
	 }
	 public String deleteCountry(int id) {
		 dao.deleteCountry(id);
		 return "Data deleted";
	 }
	 
	 public String updateCountry(String countryName, String countryCapital,int countryCode) {
		 dao.updateCountry(countryName, countryCapital, countryCode);
		 return "Data updated...";
	 }

}
