package com.tencent.wcdb.database;

import com.tencent.wcdb.support.C46443a;

public class SQLiteDirectQuery extends C46423k {

    /* renamed from: g */
    private static final int[] f119527g = {3, 1, 2, 3, 4, 0};

    /* renamed from: f */
    private final C46443a f119528f;

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native int nativeStep(long j, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo115353c() {
        synchronized (this) {
            if (this.f119611e != null) {
                this.f119611e.mo115452a(this.f119528f);
                this.f119611e.mo115453a((String) null);
            }
        }
        super.mo115353c();
    }
}
