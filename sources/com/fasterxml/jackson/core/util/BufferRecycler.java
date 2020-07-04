package com.fasterxml.jackson.core.util;

import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

public final class BufferRecycler {

    /* renamed from: a */
    protected final byte[][] f37964a = new byte[ByteBufferType.values().length][];

    /* renamed from: b */
    protected final char[][] f37965b = new char[CharBufferType.values().length][];

    public enum ByteBufferType {
        READ_IO_BUFFER(4000),
        WRITE_ENCODING_BUFFER(4000),
        WRITE_CONCAT_BUFFER(AdError.SERVER_ERROR_CODE),
        BASE64_CODEC_BUFFER(AdError.SERVER_ERROR_CODE);
        
        protected final int size;

        private ByteBufferType(int i) {
            this.size = i;
        }
    }

    public enum CharBufferType {
        TOKEN_BUFFER(AdError.SERVER_ERROR_CODE),
        CONCAT_BUFFER(AdError.SERVER_ERROR_CODE),
        TEXT_BUFFER(C34943c.f91127w),
        NAME_COPY_BUFFER(C34943c.f91127w);
        
        protected final int size;

        private CharBufferType(int i) {
            this.size = i;
        }
    }

    /* renamed from: a */
    private static byte[] m42467a(int i) {
        return new byte[i];
    }

    /* renamed from: b */
    private static char[] m42468b(int i) {
        return new char[i];
    }

    /* renamed from: a */
    public final char[] mo37228a(CharBufferType charBufferType) {
        return mo37229a(charBufferType, 0);
    }

    /* renamed from: a */
    public final byte[] mo37227a(ByteBufferType byteBufferType) {
        int ordinal = byteBufferType.ordinal();
        byte[] bArr = this.f37964a[ordinal];
        if (bArr == null) {
            return m42467a(byteBufferType.size);
        }
        this.f37964a[ordinal] = null;
        return bArr;
    }

    /* renamed from: a */
    public final void mo37225a(ByteBufferType byteBufferType, byte[] bArr) {
        this.f37964a[byteBufferType.ordinal()] = bArr;
    }

    /* renamed from: a */
    public final void mo37226a(CharBufferType charBufferType, char[] cArr) {
        this.f37965b[charBufferType.ordinal()] = cArr;
    }

    /* renamed from: a */
    public final char[] mo37229a(CharBufferType charBufferType, int i) {
        if (charBufferType.size > i) {
            i = charBufferType.size;
        }
        int ordinal = charBufferType.ordinal();
        char[] cArr = this.f37965b[ordinal];
        if (cArr == null || cArr.length < i) {
            return m42468b(i);
        }
        this.f37965b[ordinal] = null;
        return cArr;
    }
}
