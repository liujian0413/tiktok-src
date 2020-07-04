package com.p280ss.android.ugc.aweme.feed.model;

/* renamed from: com.ss.android.ugc.aweme.feed.model.MaskLayerOption */
public class MaskLayerOption {
    public boolean mDoOrCancel;
    public int mIconResId;
    public int mTextResId;
    public int mType;

    public MaskLayerOption(int i, int i2, int i3) {
        this.mType = i;
        this.mIconResId = i2;
        this.mTextResId = i3;
    }

    public MaskLayerOption(int i, int i2, int i3, boolean z) {
        this.mType = i;
        this.mIconResId = i2;
        this.mTextResId = i3;
        this.mDoOrCancel = z;
    }
}
