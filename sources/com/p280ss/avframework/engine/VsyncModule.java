package com.p280ss.avframework.engine;

import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.TEBundle;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.VsyncModule */
public class VsyncModule extends NativeObject {
    private InternalObserver mInternalObserver;

    /* renamed from: com.ss.avframework.engine.VsyncModule$InternalObserver */
    class InternalObserver extends NativeObject implements Observer {
        private Observer mObserver;

        public InternalObserver() {
        }

        public synchronized void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        public void onEvent(int i, int i2, long j, String str) {
            if (this.mObserver != null) {
                this.mObserver.onEvent(i, i2, j, str);
            }
        }
    }

    /* renamed from: com.ss.avframework.engine.VsyncModule$Observer */
    public interface Observer {
        void onEvent(int i, int i2, long j, String str);
    }

    private native void nativeAdjustLastTimeMills(long j, String str, long j2);

    private native long nativeComputeDiffAtNowMills(long j, String str);

    private native long nativeComputeDiffMs(long j, String str, String str2);

    private native long nativeConvertToNowMills(long j, String str, long j2);

    private native long nativeGetFirstFrameTimestampMs(long j, String str);

    private native long nativeGetMaxIntevalMs(long j, String str);

    private native TEBundle nativeGetOption(long j);

    private native boolean nativeIsEnable(long j);

    private native long nativeLastOriginTimeMills(long j, String str);

    private native long nativeLastTimeMills(long j, String str);

    private static native long nativeNowNanos();

    private native void nativeRegisertObserver(long j, InternalObserver internalObserver);

    private native void nativeRelease(long j);

    private native void nativeReset(long j);

    private native void nativeResetWithTrack(long j, String str);

    private native void nativeSetEnable(long j, boolean z);

    private native void nativeSetOption(long j, TEBundle tEBundle);

    private native void nativeSetupOriginAudioTrackId(long j, String str);

    private native void nativeSetupOriginVideoTrackId(long j, String str);

    private native void nativeUnRegisertObserver(long j, InternalObserver internalObserver);

    private native long nativeUpdateTimeMs(long j, String str, long j2);

    public static long nowNanos() {
        return nativeNowNanos();
    }

    public TEBundle getOption() {
        return nativeGetOption(this.mNativeObj);
    }

    public boolean isEnable() {
        return nativeIsEnable(this.mNativeObj);
    }

    public void reset() {
        nativeReset(this.mNativeObj);
    }

    public String toString() {
        return super.toString();
    }

    public synchronized void release() {
        if (this.mInternalObserver != null) {
            nativeUnRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0;
        if (this.mInternalObserver != null) {
            this.mInternalObserver.release();
            this.mInternalObserver = null;
        }
    }

    public VsyncModule(long j) {
        setNativeObj(j);
    }

    public long computeDiffAtNowMills(String str) {
        return nativeComputeDiffAtNowMills(this.mNativeObj, str);
    }

    public long getFirstFrameTimestampMs(String str) {
        return nativeGetFirstFrameTimestampMs(this.mNativeObj, str);
    }

    public long getMaxIntevalMs(String str) {
        return nativeGetMaxIntevalMs(this.mNativeObj, str);
    }

    public long lastOriginTimeMills(String str) {
        return nativeLastOriginTimeMills(this.mNativeObj, str);
    }

    public long lastTimeMills(String str) {
        return nativeLastTimeMills(this.mNativeObj, str);
    }

    public void setEnable(boolean z) {
        nativeSetEnable(this.mNativeObj, z);
    }

    public void setOption(TEBundle tEBundle) {
        nativeSetOption(this.mNativeObj, tEBundle);
    }

    public void setupOriginAudioTrackId(String str) {
        nativeSetupOriginAudioTrackId(this.mNativeObj, str);
    }

    public void setupOriginVideoTrackId(String str) {
        nativeSetupOriginVideoTrackId(this.mNativeObj, str);
    }

    public void reset(String str) {
        nativeResetWithTrack(this.mNativeObj, str);
    }

    public synchronized void registerObserver(Observer observer) {
        if (this.mInternalObserver == null) {
            this.mInternalObserver = new InternalObserver();
            nativeRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        this.mInternalObserver.registerObserver(observer);
    }

    public long computeDiffMs(String str, String str2) {
        return nativeComputeDiffMs(this.mNativeObj, str, str2);
    }

    public void adjustLastTimeMills(String str, long j) {
        nativeAdjustLastTimeMills(this.mNativeObj, str, j);
    }

    public long convertToNowMills(String str, long j) {
        return nativeConvertToNowMills(this.mNativeObj, str, j);
    }

    /* access modifiers changed from: protected */
    public long updateTimeMs(String str, long j) {
        return nativeUpdateTimeMs(this.mNativeObj, str, j);
    }
}
