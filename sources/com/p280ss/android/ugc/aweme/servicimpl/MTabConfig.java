package com.p280ss.android.ugc.aweme.servicimpl;

import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.MTabConfig */
public enum MTabConfig {
    RECORD_COMBINE(R.string.dch, R.string.dck),
    RECORD_COMBINE_60(R.string.dc9, R.string.dcj),
    RECORD_COMBINE_15(R.string.dc8, R.string.dci),
    RECORD_STATUS(R.string.alc, R.string.dcw);
    
    private final int nameResId;
    private final int tagResId;

    public final int getNameResId() {
        return this.nameResId;
    }

    public final int getTagResId() {
        return this.tagResId;
    }

    private MTabConfig(int i, int i2) {
        this.nameResId = i;
        this.tagResId = i2;
    }
}
