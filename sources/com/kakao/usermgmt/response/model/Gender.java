package com.kakao.usermgmt.response.model;

public enum Gender {
    FEMALE("female"),
    MALE("male"),
    OTHER("other"),
    UNKNOWN("N/A");
    
    private String value;

    public final String getValue() {
        return this.value;
    }

    public static Gender getGender(String str) {
        Gender[] values;
        for (Gender gender : values()) {
            if (gender.value.equalsIgnoreCase(str)) {
                return gender;
            }
        }
        return UNKNOWN;
    }

    private Gender(String str) {
        this.value = str;
    }
}
