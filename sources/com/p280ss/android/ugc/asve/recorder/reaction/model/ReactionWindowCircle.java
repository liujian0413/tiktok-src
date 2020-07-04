package com.p280ss.android.ugc.asve.recorder.reaction.model;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowCircle */
public final class ReactionWindowCircle extends ReactionWindowShape {
    public final int convertDpToHeight(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertDpToWidth(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertHeightToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public final int convertWidthToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public ReactionWindowCircle(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        String str2 = str;
        C7573i.m23587b(str, "mImagePath");
        super(str2, true, i, i2, i3, i4, i5, i6);
    }
}
