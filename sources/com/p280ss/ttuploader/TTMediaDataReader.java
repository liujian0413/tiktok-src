package com.p280ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTMediaDataReader */
public interface TTMediaDataReader {
    int close(int i);

    long getValue(int i, int i2);

    int open(int i);

    int read(int i, long j, byte[] bArr, int i2);
}
