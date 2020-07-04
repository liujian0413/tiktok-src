package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface bcl extends Closeable {
    /* renamed from: a */
    int mo39633a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: a */
    long mo39634a() throws IOException;

    /* renamed from: a */
    ByteBuffer mo39635a(long j, long j2) throws IOException;

    /* renamed from: a */
    void mo39636a(long j) throws IOException;

    /* renamed from: b */
    long mo39637b() throws IOException;

    void close() throws IOException;
}
