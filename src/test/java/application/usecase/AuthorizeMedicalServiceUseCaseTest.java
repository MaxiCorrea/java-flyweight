package application.usecase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import domain.factory.MedicalServiceTypeFactory;
import domain.model.MedicalAuthorization;

class AuthorizeMedicalServiceUseCaseTest {

	@Test
	void shouldReuseServiceTypeAcrossAuthorizations() {
		MedicalServiceTypeFactory factory = Mockito.mock(MedicalServiceTypeFactory.class);
		AuthorizeMedicalServiceUseCase usecase = new AuthorizeMedicalServiceUseCase(factory);
		MedicalAuthorization autho1 = usecase.authorize("P-1", "XRAY");
		MedicalAuthorization auth02 = usecase.authorize("P-2", "XRAY");
		assertSame(autho1.getServiceType(), auth02.getServiceType());
	}

}
