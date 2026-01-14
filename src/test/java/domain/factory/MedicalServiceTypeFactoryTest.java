package domain.factory;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import domain.model.MedicalServiceType;

class MedicalServiceTypeFactoryTest {

	@Test
	void shouldReturnSameInstanceForSameServiceCode() {
		MedicalServiceTypeFactory flyweight = new MedicalServiceTypeFactory();
		MedicalServiceType first = flyweight.get("XRAY");
		MedicalServiceType second = flyweight.get("XRAY");
		assertSame(first, second);
	}

}
