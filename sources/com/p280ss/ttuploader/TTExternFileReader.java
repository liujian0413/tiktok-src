package com.p280ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTExternFileReader */
public interface TTExternFileReader {
    void cancel();

    long getCrc32ByOffset(long j, int i);

    long getValue(int i);

    int readSlice(int i, byte[] bArr, int i2);

    int readSliceByOffset(long j, byte[] bArr, int i, int i2);
}
