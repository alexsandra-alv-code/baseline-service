package com.tis.mx.aplication.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import java.util.List;
import org.junit.Test;
import com.tis.mx.application.controller.ApplicationController;
import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;
import com.tis.mx.application.service.impl.CompoundInterestCalculatorImpl;

public class AplicationControllerTest {
	//crear calculadora
	private ApplicationController controller;
	private InitialInvestmentDto initialInvestment;
	private CompoundInterestCalculator calculator;
	
	//crear los valores inicial de la inversion
	@Before
	public void createValuesBeforeToTest() {
		this.calculator=new CompoundInterestCalculatorImpl();
		this.controller=new ApplicationController(this.calculator);
		
		this.initialInvestment=new InitialInvestmentDto();
		
		this.initialInvestment.setYearlyInput(Double.valueOf(3000.00));
		this.initialInvestment.setYearlyInputIncrement(Integer.valueOf(1));
		this.initialInvestment.setInvestmentYears(5);
		this.initialInvestment.setInvestmentYield(Float.valueOf(21));
	}
	
	@Test
	public void shouldTableYield() {
		List<InvestmentYieldDto> tableYield=controller.createTableYield(initialInvestment);
		
		assertEquals(5, tableYield.size());
	}
	

}
