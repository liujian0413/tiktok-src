package com.p280ss.avframework.processor;

import android.util.AndroidRuntimeException;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.engine.VideoProcessor;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.processor.NativeVideoProcessor */
public class NativeVideoProcessor extends VideoProcessor {
    private static boolean isNativeVideoProcessor(VideoProcessor videoProcessor) {
        return videoProcessor instanceof NativeVideoProcessor;
    }

    public VideoFrame process(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
