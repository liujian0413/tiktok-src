package com.tencent.wcdb.repair;

import com.tencent.wcdb.support.C46443a.C46444a;

public class BackupKit implements C46444a {

    /* renamed from: a */
    private long f119635a;

    private static native void nativeCancel(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr, int i);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, String[] strArr);

    private static native int nativeStatementCount(long j);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        m145997a();
        super.finalize();
    }

    /* renamed from: a */
    private void m145997a() {
        if (this.f119635a != 0) {
            nativeFinish(this.f119635a);
            this.f119635a = 0;
        }
    }

    /* renamed from: b */
    public final void mo115436b() {
        if (this.f119635a != 0) {
            nativeCancel(this.f119635a);
        }
    }
}
