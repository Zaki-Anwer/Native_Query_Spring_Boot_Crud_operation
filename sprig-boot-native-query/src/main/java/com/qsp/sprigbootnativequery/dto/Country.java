package com.qsp.sprigbootnativequery.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="country")
public class Country {
	
	@Id
	@Column(name = "countrycode")
	private  int countryCode;
	@Column(name = "countryname")
	private String countryName;
	@Column(name = "countrycapital")
	private String countryCapital;
	@Column(name = "countrystates")
	private int countryStates;
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	public int getCountryStates() {
		return countryStates;
	}
	public void setCountryStates(int countryStates) {
		this.countryStates = countryStates;
	}
	
	@Override
	public String toString() {
		return "countryCode=" +countryCode + "/n countryName=" + countryName + "/n countryCapital="
				+ countryCapital + "/n countryStates=" + countryStates;
	}
	
	
	
	

}
