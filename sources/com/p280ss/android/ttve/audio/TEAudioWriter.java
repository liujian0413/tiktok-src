package com.p280ss.android.ttve.audio;

/* renamed from: com.ss.android.ttve.audio.TEAudioWriter */
public class TEAudioWriter implements C20440a {

    /* renamed from: a */
    long f55187a = nativeCreate();

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d);

    /* renamed from: b */
    public final void mo55010b() {
        if (this.f55187a != 0) {
            nativeDestroy(this.f55187a);
        }
    }

    /* renamed from: a */
    public final int mo55007a() {
        if (this.f55187a == 0) {
            return -112;
        }
        return nativeCloseWavFile(this.f55187a);
    }

    /* renamed from: a */
    public final int mo55009a(byte[] bArr, int i) {
        if (this.f55187a == 0) {
            return -112;
        }
        return nativeAddPCMData(this.f55187a, bArr, i);
    }

    /* renamed from: a */
    public final int mo55008a(String str, int i, int i2, double d, int i3, int i4) {
        if (this.f55187a == 0) {
            return -112;
        }
        return nativeInitWavFile(this.f55187a, str, i, 2, d);
    }
}
