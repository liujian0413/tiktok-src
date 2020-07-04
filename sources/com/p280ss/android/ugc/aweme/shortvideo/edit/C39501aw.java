package com.p280ss.android.ugc.aweme.shortvideo.edit;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.aw */
public final class C39501aw {
    /* renamed from: b */
    public static final boolean m126169b(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        if (videoPublishEditModel.mVideoCanvasWidth == videoPublishEditModel.mOutVideoWidth && videoPublishEditModel.mVideoCanvasHeight == videoPublishEditModel.mOutVideoHeight) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m126167a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        if (videoPublishEditModel.mVideoCanvasWidth <= 0 || videoPublishEditModel.mVideoCanvasHeight <= 0 || (videoPublishEditModel.mVideoCanvasWidth < videoPublishEditModel.videoWidth() && videoPublishEditModel.mVideoCanvasHeight < videoPublishEditModel.videoHeight())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final float[] m126168a(float f, float f2, int i, int i2, int i3, int i4) {
        float f3 = (float) i3;
        float f4 = (float) i;
        float f5 = (f3 * 1.0f) / f4;
        float f6 = (float) i4;
        float f7 = (float) i2;
        float f8 = (1.0f * f6) / f7;
        if (f5 == f8) {
            return new float[]{f, f2};
        }
        float max = Math.max(f5, f8);
        if (max == f5) {
            f2 = (((f2 * f7) * max) - (((f7 * max) - f6) / 2.0f)) / f6;
        } else {
            f = (((f * f4) * max) - (((f4 * max) - f3) / 2.0f)) / f3;
        }
        return new float[]{f, f2};
    }
}
