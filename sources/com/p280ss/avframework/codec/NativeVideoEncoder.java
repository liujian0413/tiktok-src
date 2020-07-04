package com.p280ss.avframework.codec;

import android.util.AndroidRuntimeException;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.engine.VideoEncoder;
import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.TEBundle;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.codec.NativeVideoEncoder */
public class NativeVideoEncoder extends VideoEncoder {
    private static boolean isNativeVideoEncoderInstence(Object obj) {
        return obj instanceof NativeVideoEncoder;
    }

    private NativeVideoEncoder(long j) {
        this.mNativeObj = j;
    }

    public int Encode(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    public void SetBitrate(int i) {
        throw new AndroidRuntimeException("SetBitrate");
    }
}
