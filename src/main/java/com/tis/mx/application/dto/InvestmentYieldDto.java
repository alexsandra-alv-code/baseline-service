package com.tis.mx.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class InvestmentYieldDto.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentYieldDto {
  
  /** The investment year. */
  private Integer investmentYear;
  
  /** The initial investment. */
  private Double initialInvestment;
  
  /** The yearly input. */
  private Double yearlyInput;
  
  /** The investment yield. */
  private Double investmentYield;
  
  /** The final balance. */
  private Double finalBalance;

public InvestmentYieldDto(int andIncrement, Double initialInvestment2, Double yearlyInput2, double d, double e) {
	// TODO Auto-generated constructor stub
}

public InvestmentYieldDto() {
	// TODO Auto-generated constructor stub
}

public Integer getInvestmentYear() {
	return investmentYear;
}

public void setInvestmentYear(Integer investmentYear) {
	this.investmentYear = investmentYear;
}

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

public Double getInvestmentYield() {
	return investmentYield;
}

public void setInvestmentYield(Double investmentYield) {
	this.investmentYield = investmentYield;
}

public Double getFinalBalance() {
	return finalBalance;
}

public void setFinalBalance(Double finalBalance) {
	this.finalBalance = finalBalance;
}

public void setFinalBalance(Float saldoFinal) {
	// TODO Auto-generated method stub
	
}

public void setInvestmentYield(Float rendimientoAnual) {
	// TODO Auto-generated method stub
	
}

public void setYearlyInput(Float aportacion) {
	// TODO Auto-generated method stub
	
}
  
  
}
