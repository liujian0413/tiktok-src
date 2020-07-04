package com.p280ss.avframework.processor;

import android.util.AndroidRuntimeException;
import com.p280ss.avframework.engine.AudioProcessor;
import com.p280ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.processor.NativeAudioProcessor */
public class NativeAudioProcessor extends AudioProcessor {
    private static boolean isNativeAudioProcessor(AudioProcessor audioProcessor) {
        return audioProcessor instanceof NativeAudioProcessor;
    }

    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
