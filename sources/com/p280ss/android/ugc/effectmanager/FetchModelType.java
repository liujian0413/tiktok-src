package com.p280ss.android.ugc.effectmanager;

/* renamed from: com.ss.android.ugc.effectmanager.FetchModelType */
public enum FetchModelType {
    ORIGIN(0),
    ZIP(1);
    
    private int value;

    public final int getValue() {
        return this.value;
    }

    public static FetchModelType fromValue(int i) {
        FetchModelType[] values;
        for (FetchModelType fetchModelType : values()) {
            if (fetchModelType.value == i) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }

    private FetchModelType(int i) {
        this.value = i;
    }
}
