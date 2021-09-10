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

// TODO: Auto-generated Javadoc
/**
 * The Class AplicationControllerTest.
 */
public class AplicationControllerTest {
	
	/** The controller. */
	// crear calculadora
	private ApplicationController controller;
	
	/** The initial investment. */
	private InitialInvestmentDto initialInvestment;
	
	/** The calculator. */
	private CompoundInterestCalculator calculator;

	/**
	 * Creates the values before to test.
	 */
	// crear los valores inicial de la inversion
	@Before
	public void createValuesBeforeToTest() {
		//Creacion de la calculadora
		this.calculator = new CompoundInterestCalculatorImpl();
		this.controller = new ApplicationController(this.calculator);
		//valores iniciales de la inversion
		this.initialInvestment = new InitialInvestmentDto();
		
		this.initialInvestment.setInitialInvestment(5000.00);
		this.initialInvestment.setYearlyInput(Double.valueOf(3000.00));
		this.initialInvestment.setYearlyInputIncrement(Integer.valueOf(1));
		this.initialInvestment.setInvestmentYears(5);
		this.initialInvestment.setInvestmentYield(Float.valueOf(21));
	}

	/**
	 * Should table yield.
	 */
	@Test
	public void shouldTableYield() {
		List<InvestmentYieldDto> tableYield = controller.createTableYield(initialInvestment);

		assertEquals(5, tableYield.size());
		
		InvestmentYieldDto firstYear =  tableYield.get(0);
	    assertEquals(Double.valueOf(5000.00), firstYear.getInitialInvestment());
	    assertEquals(Double.valueOf(3000.00), firstYear.getYearlyInput());
	    assertEquals(Double.valueOf(1680.00), firstYear.getInvestmentYield());
	    assertEquals(Double.valueOf(9680.00), firstYear.getFinalBalance());
	}

}
