package com.tencent.wcdb.database;

public class ChunkedCursorWindow extends C46411c {

    /* renamed from: a */
    long f119467a;

    private static native void nativeClear(long j);

    private static native long nativeCreate(int i);

    private static native void nativeDispose(long j);

    private static native void nativeEndRow(long j, long j2);

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native int nativeGetNumChunks(long j);

    private static native long nativeGetRow(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native long nativeRemoveChunk(long j, int i);

    private static native boolean nativeSetNumColumns(long j, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo115353c() {
        m145760a();
    }

    /* renamed from: a */
    private void m145760a() {
        if (this.f119467a != 0) {
            nativeDispose(this.f119467a);
            this.f119467a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            m145760a();
        } finally {
            super.finalize();
        }
    }
}
