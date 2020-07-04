package com.p280ss.android.vesdk.algorithm;

/* renamed from: com.ss.android.vesdk.algorithm.VEHandModelType */
public enum VEHandModelType {
    HAND_MODEL_DETECT(1),
    HAND_MODEL_BOX_REG(2),
    HAND_MODEL_GESTURE_CLS(4),
    HAND_MODEL_KEY_POINT(8);
    
    private int value;

    public final int getValue() {
        return this.value;
    }

    private VEHandModelType(int i) {
        this.value = i;
    }
}
