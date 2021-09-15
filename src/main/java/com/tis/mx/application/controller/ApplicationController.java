package com.tis.mx.application.controller;

import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;
import java.util.List;

/**
 * The Class ApplicationController.
 */
public class ApplicationController {

  /** The calculator. */
  private CompoundInterestCalculator calculator;

  /**
   * Instantiates a new application controller.
   *
   * @param calculator the calculator
   */
  public ApplicationController(CompoundInterestCalculator calculator) {
    this.calculator = calculator;
  }

  /**
   * Creates the table yield.
   *
   * @param initialInvestment the initial investment
   * @return the list
   */
  public List<InvestmentYieldDto> createTableYield(InitialInvestmentDto initialInvestment) {

    if (calculator.validateInput(initialInvestment)) {
      return calculator.createRevenueGrid(initialInvestment);
    }

    throw new CalculatorInputException("El cálculo no puede ser ejecutado");
  }
}
