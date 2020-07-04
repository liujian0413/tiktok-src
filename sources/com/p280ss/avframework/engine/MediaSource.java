package com.p280ss.avframework.engine;

import com.p280ss.avframework.statics.StaticsReport.StaticReportInterface;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.MediaSource */
public abstract class MediaSource extends NativeObject implements StaticReportInterface {
    public abstract int status();
}
