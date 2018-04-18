package br.com.easypet.easypet.enums;

import java.util.HashMap;
import java.util.Map;

public enum PetFoodPackageLevelEnum {

	EMPTY(0), ALMOST_EMPTY(1), LITTLE_BELOW_HALF(2), HALF(3), LITTLE_UP_HALF(4), ALMOST_FULL(5), FULL(6);
	
	public final int value;

	private PetFoodPackageLevelEnum(int value) {
		this.value = value;
	}

	// Mapping package level to package level id
	private static final Map<Integer, PetFoodPackageLevelEnum> _map = new HashMap<Integer, PetFoodPackageLevelEnum>();
	static {
		for (PetFoodPackageLevelEnum gender : PetFoodPackageLevelEnum.values())
			_map.put(gender.value, gender);
	}

	public static PetFoodPackageLevelEnum from(int value) {
		return _map.get(value);
	}
}
