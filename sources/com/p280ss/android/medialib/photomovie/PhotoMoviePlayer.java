package com.p280ss.android.medialib.photomovie;

import android.content.Context;
import android.view.Surface;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.photomovie.PhotoMoviePlayer */
public class PhotoMoviePlayer {

    /* renamed from: a */
    private long f53631a = nativeCreatePlayer();

    /* renamed from: b */
    private Context f53632b;

    private native long nativeCreatePlayer();

    private native long nativeGetDuration(long j);

    private native void nativeOnSizeChanged(long j, int i, int i2);

    private native int nativePause(long j);

    private native void nativePlayCover(long j, int i, int i2);

    private native int nativePrepare(long j, String[] strArr, String str, int i, int i2, int i3, int i4, int i5);

    private static native int nativeRegister();

    private native void nativeRelease(long j);

    private native int nativeReset(long j);

    private native int nativeResume(long j);

    private native void nativeSeekTo(long j, long j2);

    private native void nativeSetFilter(long j, String str, String str2, float f);

    private native void nativeSetLoop(long j, boolean z);

    private native void nativeSetOrientation(long j, int i);

    private native int nativeStart(long j, Surface surface, int i, int i2);

    private native void nativeStop(long j);

    private native void nativeSwitchPlayMode(long j, int i);

    static {
        TENativeLibsLoader.m67988e();
        nativeRegister();
    }

    /* renamed from: a */
    public final int mo52795a() {
        return nativeResume(this.f53631a);
    }

    /* renamed from: b */
    public final int mo52804b() {
        return nativePause(this.f53631a);
    }

    /* renamed from: e */
    public final long mo52809e() {
        return nativeGetDuration(this.f53631a);
    }

    /* renamed from: c */
    public final void mo52807c() {
        synchronized (this) {
            nativeStop(this.f53631a);
        }
    }

    /* renamed from: d */
    public final void mo52808d() {
        mo52807c();
        nativeRelease(this.f53631a);
        this.f53631a = 0;
    }

    public PhotoMoviePlayer(Context context) {
        this.f53632b = context;
    }

    /* renamed from: b */
    public final void mo52805b(int i) {
        nativeSwitchPlayMode(this.f53631a, i);
    }

    /* renamed from: a */
    public final void mo52798a(int i) {
        nativeSetOrientation(this.f53631a, i);
    }

    /* renamed from: a */
    public final void mo52800a(long j) {
        nativeSeekTo(this.f53631a, j);
    }

    /* renamed from: a */
    public final void mo52801a(String str) {
        nativeSetFilter(this.f53631a, str, null, 1.0f);
    }

    /* renamed from: a */
    public final void mo52803a(boolean z) {
        nativeSetLoop(this.f53631a, true);
    }

    /* renamed from: b */
    public final void mo52806b(int i, int i2) {
        nativePlayCover(this.f53631a, i, i2);
    }

    /* renamed from: a */
    public final void mo52799a(int i, int i2) {
        nativeOnSizeChanged(this.f53631a, i, i2);
    }

    /* renamed from: a */
    public final int mo52796a(Surface surface, int i, int i2) {
        int nativeStart;
        synchronized (this) {
            nativeStart = nativeStart(this.f53631a, surface, i, i2);
        }
        return nativeStart;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0064 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52797a(java.util.List<java.lang.String> r12, java.lang.String r13, com.p280ss.android.medialib.photomovie.C19758a r14) {
        /*
            r11 = this;
            int r0 = r12.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r12.toArray(r0)
            if (r14 != 0) goto L_0x001b
            com.ss.android.medialib.photomovie.a r14 = new com.ss.android.medialib.photomovie.a
            r14.<init>()
            r12 = 1
            r14.f53633a = r12
            r12 = 2500(0x9c4, float:3.503E-42)
            r14.f53634b = r12
            r12 = 500(0x1f4, float:7.0E-43)
            r14.f53635c = r12
        L_0x001b:
            monitor-enter(r11)
            android.content.Context r12 = r11.f53632b     // Catch:{ all -> 0x0066 }
            android.util.Pair r12 = com.p280ss.android.medialib.p883d.C19718d.m65016a(r12)     // Catch:{ all -> 0x0066 }
            long r2 = r11.f53631a     // Catch:{ all -> 0x0066 }
            java.lang.Object r1 = r12.first     // Catch:{ all -> 0x0066 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0066 }
            int r6 = r1.intValue()     // Catch:{ all -> 0x0066 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0066 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0066 }
            int r7 = r12.intValue()     // Catch:{ all -> 0x0066 }
            int r8 = r14.f53633a     // Catch:{ all -> 0x0066 }
            int r9 = r14.f53634b     // Catch:{ all -> 0x0066 }
            int r10 = r14.f53635c     // Catch:{ all -> 0x0066 }
            r1 = r11
            r4 = r0
            r5 = r13
            int r12 = r1.nativePrepare(r2, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0066 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r1.<init>()     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r2 = "imageArray"
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ JSONException -> 0x0064 }
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r0 = "audioPath"
            r1.put(r0, r13)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r13 = "transitionParams"
            java.lang.String r14 = r14.toString()     // Catch:{ JSONException -> 0x0064 }
            r1.put(r13, r14)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r13 = "vesdk_event_photo_movie_init"
            java.lang.String r14 = "behavior"
            com.p280ss.android.ttve.monitor.C20469a.m67906a(r13, r1, r14)     // Catch:{ JSONException -> 0x0064 }
        L_0x0064:
            monitor-exit(r11)     // Catch:{ all -> 0x0066 }
            return r12
        L_0x0066:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0066 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.photomovie.PhotoMoviePlayer.mo52797a(java.util.List, java.lang.String, com.ss.android.medialib.photomovie.a):int");
    }

    /* renamed from: a */
    public final void mo52802a(String str, String str2, float f) {
        nativeSetFilter(this.f53631a, str, str2, f);
    }
}
