package com.kakao.auth.helper;

import com.C1642a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Base64 {
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final byte PAD;
    private final int chunkSeparatorLength;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final int encodedBlockSize;
    private final int lineLength;
    private final byte[] lineSeparator;
    private final int unencodedBlockSize;

    static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        Context() {
        }

        public String toString() {
            return C1642a.m8034a("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos)});
        }
    }

    /* access modifiers changed from: 0000 */
    public int getDefaultBufferSize() {
        return VideoCacheReadBuffersizeExperiment.DEFAULT;
    }

    private Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    private static String newStringUtf8(byte[] bArr) {
        return newString(bArr, UTF_8);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false, true));
    }

    /* access modifiers changed from: 0000 */
    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean isInAlphabet(byte b) {
        if (b < 0 || b >= this.decodeTable.length || this.decodeTable[b] == -1) {
            return false;
        }
        return true;
    }

    private byte[] resizeBuffer(Context context) {
        if (context.buffer == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr = new byte[(context.buffer.length * 2)];
            System.arraycopy(context.buffer, 0, bArr, 0, context.buffer.length);
            context.buffer = bArr;
        }
        return context.buffer;
    }

    /* access modifiers changed from: 0000 */
    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        byte[] bArr2 = new byte[(context.pos - context.readPos)];
        readResults(bArr2, 0, bArr2.length, context);
        return bArr2;
    }

    /* access modifiers changed from: 0000 */
    public long getEncodedLength(byte[] bArr) {
        long length = ((long) (((bArr.length + this.unencodedBlockSize) - 1) / this.unencodedBlockSize)) * ((long) this.encodedBlockSize);
        if (this.lineLength > 0) {
            return length + ((((((long) this.lineLength) + length) - 1) / ((long) this.lineLength)) * ((long) this.chunkSeparatorLength));
        }
        return length;
    }

    private static String newString(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, charset.name());
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public byte[] ensureBufferSize(int i, Context context) {
        if (context.buffer == null || context.buffer.length < context.pos + i) {
            return resizeBuffer(context);
        }
        return context.buffer;
    }

    private static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    private Base64(int i, byte[] bArr, boolean z) {
        int i2;
        boolean z2;
        int i3;
        byte[] bArr2;
        this.PAD = 61;
        this.decodeTable = DECODE_TABLE;
        this.unencodedBlockSize = 3;
        this.encodedBlockSize = 4;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        this.chunkSeparatorLength = i2;
        if (i <= 0 || this.chunkSeparatorLength <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i3 = (i / this.encodedBlockSize) * this.encodedBlockSize;
        } else {
            i3 = 0;
        }
        this.lineLength = i3;
        if (bArr == null) {
            this.encodeSize = 4;
            this.lineSeparator = null;
        } else if (containsAlphabetOrPad(bArr)) {
            String newStringUtf8 = newStringUtf8(bArr);
            StringBuilder sb = new StringBuilder("lineSeparator must not contain base64 characters: [");
            sb.append(newStringUtf8);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        } else if (i > 0) {
            this.encodeSize = bArr.length + 4;
            this.lineSeparator = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.lineSeparator, 0, bArr.length);
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        if (z) {
            bArr2 = URL_SAFE_ENCODE_TABLE;
        } else {
            bArr2 = STANDARD_ENCODE_TABLE;
        }
        this.encodeTable = bArr2;
    }

    /* access modifiers changed from: 0000 */
    public int readResults(byte[] bArr, int i, int i2, Context context) {
        if (context.buffer != null) {
            int min = Math.min(available(context), i2);
            System.arraycopy(context.buffer, context.readPos, bArr, i, min);
            context.readPos += min;
            if (context.readPos >= context.pos) {
                context.buffer = null;
            }
            return min;
        } else if (context.eof) {
            return -1;
        } else {
            return 0;
        }
    }

    private static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        Base64 base64;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (z) {
            base64 = new Base64(z2);
        } else {
            base64 = new Base64(0, CHUNK_SEPARATOR, z2);
        }
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= ((long) i)) {
            return base64.encode(bArr);
        }
        StringBuilder sb = new StringBuilder("Input array too big, the output array would be bigger (");
        sb.append(encodedLength);
        sb.append(") than the specified maximum size of ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r2v38 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v2, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void encode(byte[] r8, int r9, int r10, com.kakao.auth.helper.Base64.Context r11) {
        /*
            r7 = this;
            boolean r0 = r11.eof
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto L_0x00db
            r11.eof = r1
            int r8 = r11.modulus
            if (r8 != 0) goto L_0x0014
            int r8 = r7.lineLength
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            int r8 = r7.encodeSize
            byte[] r8 = r7.ensureBufferSize(r8, r11)
            int r9 = r11.pos
            int r10 = r11.modulus
            r1 = 61
            switch(r10) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x007e;
                case 2: goto L_0x0039;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Impossible modulus "
            r9.<init>(r10)
            int r10 = r11.modulus
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0039:
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r3 = r3 >> 10
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r3 = r3 >> 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r3 = r3 << 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            byte[] r10 = r7.encodeTable
            byte[] r2 = STANDARD_ENCODE_TABLE
            if (r10 != r2) goto L_0x00b8
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            r8[r10] = r1
            goto L_0x00b8
        L_0x007e:
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r3 = r3 >> 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            byte[] r10 = r7.encodeTable
            byte[] r2 = STANDARD_ENCODE_TABLE
            if (r10 != r2) goto L_0x00b8
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            r8[r10] = r1
            int r10 = r11.pos
            int r2 = r10 + 1
            r11.pos = r2
            r8[r10] = r1
        L_0x00b8:
            int r10 = r11.currentLinePos
            int r1 = r11.pos
            int r1 = r1 - r9
            int r10 = r10 + r1
            r11.currentLinePos = r10
            int r9 = r7.lineLength
            if (r9 <= 0) goto L_0x00da
            int r9 = r11.currentLinePos
            if (r9 <= 0) goto L_0x00da
            byte[] r9 = r7.lineSeparator
            int r10 = r11.pos
            byte[] r1 = r7.lineSeparator
            int r1 = r1.length
            java.lang.System.arraycopy(r9, r0, r8, r10, r1)
            int r8 = r11.pos
            byte[] r9 = r7.lineSeparator
            int r9 = r9.length
            int r8 = r8 + r9
            r11.pos = r8
        L_0x00da:
            return
        L_0x00db:
            r2 = r9
            r9 = 0
        L_0x00dd:
            if (r9 >= r10) goto L_0x016e
            int r3 = r7.encodeSize
            byte[] r3 = r7.ensureBufferSize(r3, r11)
            int r4 = r11.modulus
            int r4 = r4 + r1
            int r4 = r4 % 3
            r11.modulus = r4
            int r4 = r2 + 1
            byte r2 = r8[r2]
            if (r2 >= 0) goto L_0x00f4
            int r2 = r2 + 256
        L_0x00f4:
            int r5 = r11.ibitWorkArea
            int r5 = r5 << 8
            int r5 = r5 + r2
            r11.ibitWorkArea = r5
            int r2 = r11.modulus
            if (r2 != 0) goto L_0x0169
            int r2 = r11.pos
            int r5 = r2 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            int r6 = r6 >> 18
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.pos
            int r5 = r2 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            int r6 = r6 >> 12
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.pos
            int r5 = r2 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            int r6 = r6 >> 6
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.pos
            int r5 = r2 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.currentLinePos
            int r2 = r2 + 4
            r11.currentLinePos = r2
            int r2 = r7.lineLength
            if (r2 <= 0) goto L_0x0169
            int r2 = r7.lineLength
            int r5 = r11.currentLinePos
            if (r2 > r5) goto L_0x0169
            byte[] r2 = r7.lineSeparator
            int r5 = r11.pos
            byte[] r6 = r7.lineSeparator
            int r6 = r6.length
            java.lang.System.arraycopy(r2, r0, r3, r5, r6)
            int r2 = r11.pos
            byte[] r3 = r7.lineSeparator
            int r3 = r3.length
            int r2 = r2 + r3
            r11.pos = r2
            r11.currentLinePos = r0
        L_0x0169:
            int r9 = r9 + 1
            r2 = r4
            goto L_0x00dd
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.auth.helper.Base64.encode(byte[], int, int, com.kakao.auth.helper.Base64$Context):void");
    }
}
