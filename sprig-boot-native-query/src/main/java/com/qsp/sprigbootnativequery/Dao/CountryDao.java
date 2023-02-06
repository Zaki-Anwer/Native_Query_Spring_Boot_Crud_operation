package com.qsp.sprigbootnativequery.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.qsp.sprigbootnativequery.Repositry.CountryRepositry;
import com.qsp.sprigbootnativequery.dto.Country;

@Repository
public class CountryDao {
  @Autowired
  CountryRepositry countryRepositry;
  
  public void saveCountry(Country country ) {
	  countryRepositry.saveCountry(country);
  }
  public List<Country> getAllCountry(){
	    List<Country>  country = countryRepositry.findAll();
	    return country;
  }
  public void deleteCountry(int id) {
	  countryRepositry.deleteCountry(id);
  }
  public void updateCountry(String countryName, String countryCapital,int countryCode) {
	  countryRepositry.updateCountry(countryName, countryCapital, countryCode);
  }
}
