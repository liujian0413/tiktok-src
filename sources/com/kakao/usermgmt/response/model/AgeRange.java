package com.kakao.usermgmt.response.model;

public enum AgeRange {
    AGE_15_19("15~19"),
    AGE_20_29("20~29"),
    AGE_30_39("30~39"),
    AGE_40_49("40~49"),
    AGE_50_59("50~59"),
    AGE_60_69("60~69"),
    AGE_70_79("70~79"),
    AGE_80_89("80~89"),
    AGE_90_ABOVE("90~"),
    AGE_RANGE_UNKNOWN("N/A");
    
    private String value;

    public final String getValue() {
        return this.value;
    }

    public static AgeRange getRange(String str) {
        AgeRange[] values;
        for (AgeRange ageRange : values()) {
            if (ageRange.value.equalsIgnoreCase(str)) {
                return ageRange;
            }
        }
        return AGE_RANGE_UNKNOWN;
    }

    private AgeRange(String str) {
        this.value = str;
    }
}
