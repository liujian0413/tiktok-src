package net.jpountz.lz4;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.jpountz.util.ByteBufferUtils;

enum LZ4ByteBufferUtils {
    ;

    static class Match {
        int len;
        int ref;
        int start;

        Match() {
        }

        /* access modifiers changed from: 0000 */
        public int end() {
            return this.start + this.len;
        }

        /* access modifiers changed from: 0000 */
        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    static int hash(ByteBuffer byteBuffer, int i) {
        return LZ4Utils.hash(ByteBufferUtils.readInt(byteBuffer, i));
    }

    static int hash64k(ByteBuffer byteBuffer, int i) {
        return LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i));
    }

    static boolean readIntEquals(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer.getInt(i) == byteBuffer.getInt(i2)) {
            return true;
        }
        return false;
    }

    static int writeLen(int i, ByteBuffer byteBuffer, int i2) {
        while (i >= 255) {
            int i3 = i2 + 1;
            byteBuffer.put(i2, -1);
            i -= 255;
            i2 = i3;
        }
        int i4 = i2 + 1;
        byteBuffer.put(i2, (byte) i);
        return i4;
    }

    static void safeIncrementalCopy(ByteBuffer byteBuffer, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            byteBuffer.put(i2 + i4, byteBuffer.get(i + i4));
        }
    }

    static int commonBytes(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i2 <= i3 - 8) {
            if (ByteBufferUtils.readLong(byteBuffer, i2) == ByteBufferUtils.readLong(byteBuffer, i)) {
                i5 += 8;
                i += 8;
                i2 += 8;
            } else {
                if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                    i4 = Long.numberOfLeadingZeros(ByteBufferUtils.readLong(byteBuffer, i) ^ ByteBufferUtils.readLong(byteBuffer, i2));
                } else {
                    i4 = Long.numberOfTrailingZeros(ByteBufferUtils.readLong(byteBuffer, i) ^ ByteBufferUtils.readLong(byteBuffer, i2));
                }
                return i5 + (i4 >>> 3);
            }
        }
        while (i2 < i3) {
            int i6 = i + 1;
            int i7 = i2 + 1;
            if (ByteBufferUtils.readByte(byteBuffer, i) != ByteBufferUtils.readByte(byteBuffer, i2)) {
                break;
            }
            i5++;
            i = i6;
            i2 = i7;
        }
        return i5;
    }

    static void wildIncrementalCopy(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 4) {
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                ByteBufferUtils.writeByte(byteBuffer, i2 + i6, ByteBufferUtils.readByte(byteBuffer, i + i6));
            }
            int i7 = i2 + 4;
            int i8 = i + 4;
            switch (i7 - i8) {
                case 1:
                    i8 -= 3;
                    break;
                case 2:
                    i8 -= 2;
                    break;
                case 3:
                    i8 -= 3;
                    i5 = -1;
                    break;
                case 5:
                    i5 = 1;
                    break;
                case 6:
                    i5 = 2;
                    break;
                case 7:
                    i5 = 3;
                    break;
            }
            ByteBufferUtils.writeInt(byteBuffer, i7, ByteBufferUtils.readInt(byteBuffer, i8));
            i2 = i7 + 4;
            i = i8 - i5;
        } else if (i4 < 8) {
            ByteBufferUtils.writeLong(byteBuffer, i2, ByteBufferUtils.readLong(byteBuffer, i));
            i2 += i4;
        }
        while (i2 < i3) {
            ByteBufferUtils.writeLong(byteBuffer, i2, ByteBufferUtils.readLong(byteBuffer, i));
            i2 += 8;
            i += 8;
        }
    }

    static int commonBytesBackward(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (byteBuffer.get(i) != byteBuffer.get(i2)) {
                break;
            }
            i5++;
        }
        return i5;
    }

    static void safeArraycopy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            byteBuffer2.put(i2 + i4, byteBuffer.get(i + i4));
        }
    }

    static void wildArraycopy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            try {
                byteBuffer2.putLong(i2 + i4, byteBuffer.getLong(i + i4));
                i4 += 8;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb = new StringBuilder("Malformed input at offset ");
                sb.append(i);
                throw new LZ4Exception(sb.toString());
            }
        }
    }

    static int lastLiterals(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        if (i3 + i2 + 1 + (((i2 + NormalGiftView.ALPHA_255) - 15) / NormalGiftView.ALPHA_255) <= i4) {
            if (i2 >= 15) {
                int i6 = i3 + 1;
                byteBuffer2.put(i3, -16);
                i5 = writeLen(i2 - 15, byteBuffer2, i6);
            } else {
                int i7 = i3 + 1;
                byteBuffer2.put(i3, (byte) (i2 << 4));
                i5 = i7;
            }
            safeArraycopy(byteBuffer, i, byteBuffer2, i5, i2);
            return i5 + i2;
        }
        throw new LZ4Exception();
    }

    static int encodeSequence(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int i10 = i5 + 1;
        if (i10 + i9 + 8 + (i9 >>> 8) <= i6) {
            if (i9 >= 15) {
                i7 = -16;
                i10 = writeLen(i9 - 15, byteBuffer2, i10);
            } else {
                i7 = i9 << 4;
            }
            wildArraycopy(byteBuffer, i, byteBuffer2, i10, i9);
            int i11 = i10 + i9;
            int i12 = i2 - i3;
            int i13 = i11 + 1;
            byteBuffer2.put(i11, (byte) i12);
            int i14 = i13 + 1;
            byteBuffer2.put(i13, (byte) (i12 >>> 8));
            int i15 = i4 - 4;
            if (i14 + 6 + (i15 >>> 8) <= i6) {
                if (i15 >= 15) {
                    i8 = i7 | 15;
                    i14 = writeLen(i15 - 15, byteBuffer2, i14);
                } else {
                    i8 = i7 | i15;
                }
                byteBuffer2.put(i5, (byte) i8);
                return i14;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        throw new LZ4Exception("maxDestLen is too small");
    }
}
