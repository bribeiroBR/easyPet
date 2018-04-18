package br.com.easypet.easypet.enums;

import java.util.HashMap;
import java.util.Map;

public enum MembershipStatusEnum {

	DEACTIVE(0), ACTIVE(1);

	public final int value;

	private MembershipStatusEnum(int value) {
		this.value = value;
	}

	// Mapping membership status to membership status id
	private static final Map<Integer, MembershipStatusEnum> _map = new HashMap<Integer, MembershipStatusEnum>();
	static {
		for (MembershipStatusEnum gender : MembershipStatusEnum.values())
			_map.put(gender.value, gender);
	}

	public static MembershipStatusEnum from(int value) {
		return _map.get(value);
	}
}
