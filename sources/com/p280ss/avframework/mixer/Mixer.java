package com.p280ss.avframework.mixer;

import com.p280ss.avframework.engine.NativeObject;
import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.TEBundle;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.mixer.Mixer */
public abstract class Mixer extends NativeObject {
    private native boolean nativeEnable();

    private native int nativeGetOriginTrackIndex();

    private native void nativeSetEnable(boolean z);

    private native void nativeSetOriginTrackIndex(int i);

    public abstract boolean getParameter(TEBundle tEBundle);

    public abstract boolean isAudioMixer();

    public boolean isNativeMixer() {
        return false;
    }

    public abstract boolean setParameter(TEBundle tEBundle);

    public boolean enable() {
        return nativeEnable();
    }

    public int getOriginTrackIndex() {
        return nativeGetOriginTrackIndex();
    }

    public void setEnable(boolean z) {
        nativeSetEnable(z);
    }

    public void setOriginTrackIndex(int i) {
        nativeSetOriginTrackIndex(i);
    }
}
