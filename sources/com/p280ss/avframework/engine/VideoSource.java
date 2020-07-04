package com.p280ss.avframework.engine;

import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.statics.StaticsReport;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.VideoSource */
public abstract class VideoSource extends MediaSource {
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean isScreenCast();

    /* access modifiers changed from: protected */
    public native void nativeAdaptedOutputFormat(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public native int nativeOnFrame(Buffer buffer, int i, int i2, int i3, long j);

    public void adaptOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }
}
