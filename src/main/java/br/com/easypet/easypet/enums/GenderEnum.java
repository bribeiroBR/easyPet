package br.com.easypet.easypet.enums;

import java.util.HashMap;
import java.util.Map;

public enum GenderEnum {

	MALE(0), FEMALE(1);

	public final int value;

	private GenderEnum(int value) {
		this.value = value;
	}

	// Mapping gender to gender id
	private static final Map<Integer, GenderEnum> _map = new HashMap<Integer, GenderEnum>();
	static {
		for (GenderEnum gender : GenderEnum.values())
			_map.put(gender.value, gender);
	}

	public static GenderEnum from(int value) {
		return _map.get(value);
	}
}
