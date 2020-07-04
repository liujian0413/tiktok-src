package com.p280ss.avframework.codec;

import com.p280ss.avframework.engine.VideoEncoder;
import com.p280ss.avframework.engine.VideoEncoderFactory;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.codec.DefaultVideoEncoderFactory */
public class DefaultVideoEncoderFactory extends VideoEncoderFactory {
    private VideoEncoderFactory mHWFacotry = new HardwareVideoEncoderFactory();

    private native VideoEncoder nativeDefaultCreateVideoEncoder(long j, String str, boolean z);

    private native String nativeDefaultGetSupportedFormats(long j);

    public String GetSupportedFormats() {
        String GetSupportedFormats = this.mHWFacotry.GetSupportedFormats();
        String nativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats(this.mNativeObj);
        StringBuilder sb = new StringBuilder();
        sb.append(GetSupportedFormats);
        sb.append(":");
        sb.append(nativeDefaultGetSupportedFormats);
        return sb.toString();
    }

    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        VideoEncoder CreateVideoEncoder = this.mHWFacotry.CreateVideoEncoder(str, z);
        if (CreateVideoEncoder == null) {
            return nativeDefaultCreateVideoEncoder(this.mNativeObj, str, z);
        }
        return CreateVideoEncoder;
    }
}
