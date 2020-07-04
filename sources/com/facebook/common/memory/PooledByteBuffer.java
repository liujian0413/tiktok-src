package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: a */
    byte mo32574a(int i);

    /* renamed from: a */
    int mo32575a();

    /* renamed from: a */
    int mo32576a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: b */
    long mo32577b();

    /* renamed from: c */
    ByteBuffer mo32578c();

    /* renamed from: d */
    boolean mo32579d();
}
