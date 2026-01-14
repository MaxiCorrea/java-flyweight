package application.usecase;

import java.time.LocalDate;

import domain.factory.MedicalServiceTypeFactory;
import domain.model.MedicalAuthorization;
import domain.model.MedicalServiceType;

public class AuthorizeMedicalServiceUseCase {

	private final MedicalServiceTypeFactory factory;
	
	public AuthorizeMedicalServiceUseCase(
			final MedicalServiceTypeFactory factory) {
		this.factory = factory;
	}
	
	public MedicalAuthorization authorize(
			final String patientId,
			final String serviceCode) {
		MedicalServiceType type = factory.get(serviceCode);
		return new MedicalAuthorization(patientId, LocalDate.now(), type);
	}
	
}
