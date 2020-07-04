package com.p280ss.avframework.engine;

import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.VideoEncoder */
public abstract class VideoEncoder extends NativeObject {
    public abstract int Encode(VideoFrame videoFrame);

    public abstract boolean InitEncoder(TEBundle tEBundle);

    public abstract void SetBitrate(int i);

    /* access modifiers changed from: protected */
    public native void nativeEncoded(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2);

    public void release() {
    }
}
