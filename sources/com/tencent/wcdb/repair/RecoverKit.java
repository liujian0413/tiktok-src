package com.tencent.wcdb.repair;

import com.tencent.wcdb.support.C46443a.C46444a;

public class RecoverKit implements C46444a {

    /* renamed from: a */
    private long f119636a;

    private static native void nativeCancel(long j);

    private static native int nativeFailureCount(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, boolean z);

    private static native int nativeSuccessCount(long j);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        m145999a();
        super.finalize();
    }

    /* renamed from: a */
    private void m145999a() {
        if (this.f119636a != 0) {
            nativeFinish(this.f119636a);
            this.f119636a = 0;
        }
    }

    /* renamed from: b */
    public final void mo115436b() {
        if (this.f119636a != 0) {
            nativeCancel(this.f119636a);
        }
    }
}
