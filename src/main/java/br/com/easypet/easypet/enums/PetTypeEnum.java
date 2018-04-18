package br.com.easypet.easypet.enums;

import java.util.HashMap;
import java.util.Map;

public enum PetTypeEnum {

	DOG(0), CAT(1);

	public final int value;

	private PetTypeEnum(int value) {
		this.value = value;
	}

	// Mapping pet type to pet type id
	private static final Map<Integer, PetTypeEnum> _map = new HashMap<Integer, PetTypeEnum>();
	static {
		for (PetTypeEnum gender : PetTypeEnum.values())
			_map.put(gender.value, gender);
	}

	public static PetTypeEnum from(int value) {
		return _map.get(value);
	}
}
