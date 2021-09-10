package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
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
	
}
