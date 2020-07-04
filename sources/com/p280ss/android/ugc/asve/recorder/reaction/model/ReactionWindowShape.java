package com.p280ss.android.ugc.asve.recorder.reaction.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowShape */
public abstract class ReactionWindowShape implements C20792a, Serializable {
    private final int defaultHeightDP;
    private final int defaultWidthDP;
    @C6593c(mo15949a = "react_window_resource_path")
    private final String mImagePath;
    @C6593c(mo15949a = "react_is_circle_shape")
    private boolean mIsCircle;
    private final int minHeightDP;
    private final int minWidthDP;
    public final int outputVideoHeight;
    public final int outputVideoWidth;

    public final String getMImagePath() {
        return this.mImagePath;
    }

    public final boolean getMIsCircle() {
        return this.mIsCircle;
    }

    public final int getDefaultHeight() {
        return convertDpToHeight(this.defaultHeightDP);
    }

    public final int getDefaultWidth() {
        return convertDpToWidth(this.defaultWidthDP);
    }

    public final int getMinHeight() {
        return convertDpToWidth(this.minHeightDP);
    }

    public final int getMinWidth() {
        return convertDpToWidth(this.minWidthDP);
    }

    public float getWidthHeightRatio() {
        return ((float) this.defaultWidthDP) / ((float) this.defaultHeightDP);
    }

    public final void setMIsCircle(boolean z) {
        this.mIsCircle = z;
    }

    public ReactionWindowShape(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        C7573i.m23587b(str, "mImagePath");
        this.mImagePath = str;
        this.mIsCircle = z;
        this.outputVideoWidth = i;
        this.outputVideoHeight = i2;
        this.defaultWidthDP = i3;
        this.defaultHeightDP = i4;
        this.minWidthDP = i5;
        this.minHeightDP = i6;
    }
}
