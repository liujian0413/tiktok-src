package com.p280ss.avframework.engine;

import com.p280ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.AudioProcessor */
public abstract class AudioProcessor extends NativeObject {
    /* access modifiers changed from: protected */
    public abstract Buffer process(Buffer buffer, int i, int i2, int i3, long j);
}
