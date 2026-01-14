package domain.model;

import java.time.LocalDate;

public class MedicalAuthorization {

	private final String patientId;
	private final LocalDate authorizationDate;
	private final MedicalServiceType serviceType;
	
	public MedicalAuthorization(
			final String patientId,
			final LocalDate authorizationDate,
			final MedicalServiceType serviceType) {
		this.patientId = patientId;
		this.authorizationDate = authorizationDate;
		this.serviceType = serviceType;
	}
	
	public String getPatientId() {
		return patientId;
	}
	
	public LocalDate getAuthorizationDate() {
		return authorizationDate;
	}
	
	public MedicalServiceType getServiceType() {
		return serviceType;
	}
	
}
