package com.p280ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTMediaDataReaderBridge */
public class TTMediaDataReaderBridge {
    /* access modifiers changed from: 0000 */
    public int close(Object obj, int i) {
        if (obj == null || i < 0) {
            return 0;
        }
        return ((TTMediaDataReader) obj).close(i);
    }

    /* access modifiers changed from: 0000 */
    public int open(Object obj, int i) {
        if (obj == null) {
            return 0;
        }
        return ((TTMediaDataReader) obj).open(i);
    }

    /* access modifiers changed from: 0000 */
    public long getValue(Object obj, int i, int i2) {
        if (obj == null) {
            return -1;
        }
        return ((TTMediaDataReader) obj).getValue(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public int read(Object obj, int i, long j, byte[] bArr, int i2) {
        if (obj == null || bArr == null || i2 == 0) {
            return 0;
        }
        return ((TTMediaDataReader) obj).read(i, j, bArr, i2);
    }
}
