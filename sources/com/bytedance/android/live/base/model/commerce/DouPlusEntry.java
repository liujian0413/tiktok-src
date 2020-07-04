package com.bytedance.android.live.base.model.commerce;

import java.io.Serializable;

public class DouPlusEntry implements Serializable {
    public String douPlusEntry;
    public boolean hasDouPlusEntry;

    public static DouPlusEntry defaultOne() {
        return new DouPlusEntry(false, "");
    }

    public DouPlusEntry(boolean z, String str) {
        this.hasDouPlusEntry = z;
        this.douPlusEntry = str;
    }
}
