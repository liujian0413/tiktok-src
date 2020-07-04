package com.p280ss.android.ugc.aweme.beauty;

/* renamed from: com.ss.android.ugc.aweme.beauty.BeautyCategoryGender */
public enum BeautyCategoryGender {
    MALE("0"),
    FEMALE("1"),
    ALL("2");
    
    private final String flag;

    public final String getFlag() {
        return this.flag;
    }

    private BeautyCategoryGender(String str) {
        this.flag = str;
    }
}
