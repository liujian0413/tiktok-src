package com.p280ss.android.ugc.aweme.tools.beauty.manager;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.BeautyExclusiveFlag */
public enum BeautyExclusiveFlag {
    NONE(0),
    OVER(1),
    EXCLUDE(-1);
    
    private final int flag;

    public final int getFlag() {
        return this.flag;
    }

    private BeautyExclusiveFlag(int i) {
        this.flag = i;
    }
}
