package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.s */
public interface C13826s {
    void close();

    void copy(int i, C13826s sVar, int i2, int i3);

    ByteBuffer getByteBuffer();

    long getNativePtr() throws UnsupportedOperationException;

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int write(int i, byte[] bArr, int i2, int i3);
}
