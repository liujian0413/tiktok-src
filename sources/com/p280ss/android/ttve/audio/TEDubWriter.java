package com.p280ss.android.ttve.audio;

/* renamed from: com.ss.android.ttve.audio.TEDubWriter */
public class TEDubWriter implements C20440a {

    /* renamed from: a */
    long f55188a = nativeCreate();

    /* renamed from: b */
    public long f55189b;

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native long nativeGetCurrentTime(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d, int i3, int i4);

    /* renamed from: b */
    public final void mo55010b() {
        if (this.f55188a != 0) {
            nativeDestroy(this.f55188a);
        }
    }

    /* renamed from: a */
    public final int mo55007a() {
        if (this.f55188a == 0) {
            return -112;
        }
        return nativeCloseWavFile(this.f55188a);
    }

    /* renamed from: a */
    public final int mo55009a(byte[] bArr, int i) {
        if (this.f55188a == 0) {
            return -112;
        }
        int nativeAddPCMData = nativeAddPCMData(this.f55188a, bArr, i);
        this.f55189b = nativeGetCurrentTime(this.f55188a);
        return nativeAddPCMData;
    }

    /* renamed from: a */
    public final int mo55008a(String str, int i, int i2, double d, int i3, int i4) {
        if (this.f55188a == 0) {
            return -112;
        }
        return nativeInitWavFile(this.f55188a, str, i, 2, d, i3, i4);
    }
}
