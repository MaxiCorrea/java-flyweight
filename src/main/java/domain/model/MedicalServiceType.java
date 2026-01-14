package domain.model;

import java.math.BigDecimal;

public final class MedicalServiceType {

	private final String code;
	private final String description;
	private final BigDecimal baseCoveragePercentage;
	
	public MedicalServiceType(
			final String code,
			final String description,
			final BigDecimal baseCoveragePercentage) {
		this.code = code;
		this.description = description;
		this.baseCoveragePercentage = baseCoveragePercentage;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public BigDecimal getBaseCoveragePercentage() {
		return baseCoveragePercentage;
	}
	
}
