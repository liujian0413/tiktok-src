package com.p280ss.ttm.player;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.ss.ttm.player.IMediaDataSource */
public interface IMediaDataSource extends Closeable {
    void close() throws IOException;

    long getSize() throws IOException;

    int readAt(long j, byte[] bArr, int i, int i2) throws IOException;
}
