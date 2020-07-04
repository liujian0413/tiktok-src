package com.p280ss.avframework.engine;

import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.VideoEncoderFactory */
public abstract class VideoEncoderFactory extends NativeObject {
    public abstract VideoEncoder CreateVideoEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();
}
