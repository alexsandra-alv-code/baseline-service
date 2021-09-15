package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class InitialInvestmentDto.
 */
@Getter
@Setter
public class InitialInvestmentDto {

  /** The initial investment. */
  private Double initialInvestment;
  
  /** The yearly input. */
  private Double yearlyInput;
  
  /** The yearly input increment. */
  private Integer yearlyInputIncrement;
  
  /** The investment yield. */
  private Float investmentYield;
  
  /** The investment years. */
  private Integer investmentYears;

public Double getInitialInvestment() {
	return initialInvestment;
}

public void setInitialInvestment(Double initialInvestment) {
	this.initialInvestment = initialInvestment;
}

public Double getYearlyInput() {
	return yearlyInput;
}

public void setYearlyInput(Double yearlyInput) {
	this.yearlyInput = yearlyInput;
}

public Integer getYearlyInputIncrement() {
	return yearlyInputIncrement;
}

public void setYearlyInputIncrement(Integer yearlyInputIncrement) {
	this.yearlyInputIncrement = yearlyInputIncrement;
}

public Float getInvestmentYield() {
	return investmentYield;
}

public void setInvestmentYield(Float investmentYield) {
	this.investmentYield = investmentYield;
}

public Integer getInvestmentYears() {
	return investmentYears;
}

public void setInvestmentYears(Integer investmentYears) {
	this.investmentYears = investmentYears;
}
  
  
}
