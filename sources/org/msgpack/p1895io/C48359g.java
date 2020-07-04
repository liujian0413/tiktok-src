package org.msgpack.p1895io;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: org.msgpack.io.g */
public interface C48359g extends Closeable, Flushable {
    /* renamed from: a */
    void mo121879a(byte b) throws IOException;

    /* renamed from: a */
    void mo121880a(byte b, byte b2) throws IOException;

    /* renamed from: a */
    void mo121881a(byte b, double d) throws IOException;

    /* renamed from: a */
    void mo121882a(byte b, float f) throws IOException;

    /* renamed from: a */
    void mo121883a(byte b, int i) throws IOException;

    /* renamed from: a */
    void mo121884a(byte b, long j) throws IOException;

    /* renamed from: a */
    void mo121885a(byte b, short s) throws IOException;

    /* renamed from: a */
    void mo121886a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: a */
    void mo121887a(byte[] bArr, int i, int i2) throws IOException;
}
