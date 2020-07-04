package com.p280ss.android.ugc.asve.recorder.reaction.model;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowRectangular */
public final class ReactionWindowRectangular extends ReactionWindowShape {
    public final int convertDpToWidth(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertWidthToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public final int convertDpToHeight(int i) {
        double d = (double) ((((float) i) / 375.0f) * ((float) this.outputVideoWidth));
        double d2 = (double) this.outputVideoWidth;
        Double.isNaN(d2);
        double d3 = d2 * 0.010666666666666666d;
        Double.isNaN(d);
        return (int) (d + d3);
    }

    public final int convertHeightToDp(int i) {
        double d = (double) i;
        double d2 = (double) this.outputVideoWidth;
        Double.isNaN(d2);
        double d3 = d2 * 0.010666666666666666d;
        Double.isNaN(d);
        double d4 = d - d3;
        double d5 = (double) this.outputVideoWidth;
        Double.isNaN(d5);
        return (int) ((d4 / d5) * 375.0d);
    }

    public ReactionWindowRectangular(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        String str2 = str;
        C7573i.m23587b(str, "mImagePath");
        super(str2, false, i, i2, i3, i4, i5, i6);
    }
}
