package com.p280ss.android.medialib.jni;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.jni.FrameThumb */
public class FrameThumb {
    private long handle = nativeCreate();

    static {
        TENativeLibsLoader.m67988e();
    }

    private native long nativeCreate();

    private native int[] nativeGetOldFrameThumbnail(long j, int i, int i2);

    private native int[] nativeInitVideoToGraph(long j, String str, int i, int i2, boolean z);

    private native int nativeStart(long j);

    private native void nativeStop(long j);

    private native void nativeStopGetFrameThumbnail(long j);

    private native int nativeUninitVideoToGraph(long j);

    public void stopGetFrameThumbnail() {
        nativeStopGetFrameThumbnail(this.handle);
    }

    public synchronized int start() {
        if (this.handle == 0) {
            return -1;
        }
        return nativeStart(this.handle);
    }

    public synchronized void stop() {
        if (this.handle != 0) {
            nativeStop(this.handle);
        }
    }

    public int unInitVideoToGraph() {
        int nativeUninitVideoToGraph;
        if (this.handle == 0) {
            return -1;
        }
        nativeStopGetFrameThumbnail(this.handle);
        synchronized (this) {
            nativeUninitVideoToGraph = nativeUninitVideoToGraph(this.handle);
            this.handle = 0;
        }
        return nativeUninitVideoToGraph;
    }

    public int[] getFrameThumbnail(int i) {
        return getFrameThumbnail(i, 1);
    }

    public int[] initVideoToGraph(String str) {
        return initVideoToGraph(str, -1, -1);
    }

    public synchronized int[] getFrameThumbnail(int i, int i2) {
        if (this.handle == 0) {
            return null;
        }
        return nativeGetOldFrameThumbnail(this.handle, i, i2);
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2) {
        return initVideoToGraph(str, i, i2, false);
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2, boolean z) {
        if (this.handle == 0) {
            int[] iArr = new int[9];
            iArr[0] = -10000;
            return iArr;
        }
        return nativeInitVideoToGraph(this.handle, str, i, i2, z);
    }
}
