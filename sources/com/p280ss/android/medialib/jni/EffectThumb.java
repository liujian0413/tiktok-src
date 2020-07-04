package com.p280ss.android.medialib.jni;

import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.medialib.player.EffectConfig;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.jni.EffectThumb */
public class EffectThumb {
    private long handle = nativeCreate();
    private List<CoverInfo> mCovers = new ArrayList();
    private int mMaxSize;
    private float mSpeed;
    private long mTrimIn;
    private long mTrimOut;
    boolean stopped;
    private C19749a thumbListener;

    /* renamed from: com.ss.android.medialib.jni.EffectThumb$a */
    public interface C19749a {
    }

    static {
        TENativeLibsLoader.m67988e();
    }

    private native long nativeCreate();

    private native long nativeGetDuration(long j);

    private native int nativeInit(long j, String str);

    private native int nativeRenderVideo(long j, long[] jArr, EffectConfig effectConfig, int i, int i2);

    private native void nativeStop(long j);

    public CoverInfo getThumb() {
        return null;
    }

    public long getDuration() {
        return (long) (((float) (this.mTrimOut - this.mTrimIn)) / this.mSpeed);
    }

    public long getSourceVideoDuration() {
        if (this.handle == 0) {
            return -1;
        }
        return nativeGetDuration(this.handle);
    }

    public void stopRender() {
        if (this.handle != 0) {
            this.stopped = true;
            nativeStop(this.handle);
            this.handle = 0;
        }
    }

    public void setThumbListener(C19749a aVar) {
        this.thumbListener = aVar;
    }

    public int init(String str) {
        if (this.handle == 0) {
            return -1;
        }
        int nativeInit = nativeInit(this.handle, str);
        if (nativeInit >= 0) {
            this.mTrimIn = 0;
            this.mTrimOut = getSourceVideoDuration();
            this.mSpeed = 1.0f;
        }
        return nativeInit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(3:12|13|14)|15|16|(1:18)(2:28|20)) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0026 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0028 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p280ss.android.medialib.model.CoverInfo getThumb(int r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L_0x003c
            int r1 = r3.mMaxSize
            if (r4 >= r1) goto L_0x003c
            java.util.List<com.ss.android.medialib.model.CoverInfo> r1 = r3.mCovers
            if (r1 != 0) goto L_0x000c
            goto L_0x003c
        L_0x000c:
            boolean r1 = r3.stopped
            if (r1 != 0) goto L_0x003b
            monitor-enter(r3)
            java.util.List<com.ss.android.medialib.model.CoverInfo> r1 = r3.mCovers     // Catch:{ all -> 0x0038 }
            int r1 = r1.size()     // Catch:{ all -> 0x0038 }
            if (r1 > r4) goto L_0x001e
            r1 = 10
            r3.wait(r1)     // Catch:{ InterruptedException -> 0x001e }
        L_0x001e:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r1 = r3.mCovers     // Catch:{ all -> 0x0038 }
            int r1 = r1.size()     // Catch:{ all -> 0x0038 }
            if (r1 > r4) goto L_0x0028
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            goto L_0x000c
        L_0x0028:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r1 = r3.mCovers     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0038 }
            com.ss.android.medialib.model.CoverInfo r1 = (com.p280ss.android.medialib.model.CoverInfo) r1     // Catch:{ all -> 0x0038 }
            java.util.List<com.ss.android.medialib.model.CoverInfo> r2 = r3.mCovers     // Catch:{ all -> 0x0038 }
            r2.set(r4, r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            r0 = r1
            goto L_0x003b
        L_0x0038:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            throw r4
        L_0x003b:
            return r0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.jni.EffectThumb.getThumb(int):com.ss.android.medialib.model.CoverInfo");
    }

    public void onThumb(int[] iArr, int i, int i2) {
        CoverInfo coverInfo = new CoverInfo(i, i2, iArr);
        synchronized (this) {
            if (!this.stopped) {
                this.mCovers.add(coverInfo);
                notify();
            }
        }
    }

    public int init(String str, long j, long j2, float f) {
        if (this.handle == 0) {
            return -1;
        }
        int nativeInit = nativeInit(this.handle, str);
        if (nativeInit >= 0) {
            this.mTrimIn = j;
            this.mTrimOut = j2;
            this.mSpeed = f;
        }
        return nativeInit;
    }

    public int renderVideo(long j, EffectConfig effectConfig, int i, int i2) {
        if (this.handle == 0) {
            return -1;
        }
        this.mMaxSize = 1;
        long j2 = ((long) (((float) j) * this.mSpeed)) + this.mTrimIn;
        return nativeRenderVideo(this.handle, new long[]{j2}, effectConfig, i, i2);
    }

    public int renderVideo(long[] jArr, EffectConfig effectConfig, int i, int i2) {
        if (this.handle == 0) {
            return -1;
        }
        this.mMaxSize = jArr.length;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3] = ((long) (((float) jArr[i3]) * this.mSpeed)) + this.mTrimIn;
        }
        return nativeRenderVideo(this.handle, jArr, effectConfig, i, i2);
    }
}
