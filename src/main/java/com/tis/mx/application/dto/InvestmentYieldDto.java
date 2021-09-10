
package com.tis.mx.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// TODO: Auto-generated Javadoc
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

}
