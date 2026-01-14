package domain.factory;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import domain.model.MedicalServiceType;

public class MedicalServiceTypeFactory {

	private final Map<String , MedicalServiceType> cache;
	
	public MedicalServiceTypeFactory() {
		this.cache = new ConcurrentHashMap<>();
	}
	
	public MedicalServiceType get(
			final String serviceCode) {
		return cache.computeIfAbsent(serviceCode, this::loadFromCatalog);
	}
	
	private MedicalServiceType loadFromCatalog(
			final String serviceCode) {
		if("XRAY".equals(serviceCode)) {
			return new MedicalServiceType(serviceCode, "X-Ray Imaging", new BigDecimal("0.80"));
		}
		if("MRI".equals(serviceCode)) {
			return new MedicalServiceType(serviceCode, "Magnetic Resonance Imaging", new BigDecimal("0.80"));
		}
		throw new IllegalArgumentException("unknown service code : " + serviceCode);
	}	
	
}
