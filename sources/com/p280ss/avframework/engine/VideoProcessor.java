package com.p280ss.avframework.engine;

import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.VideoProcessor */
public abstract class VideoProcessor extends NativeObject {
    /* access modifiers changed from: protected */
    public abstract VideoFrame process(VideoFrame videoFrame);
}
