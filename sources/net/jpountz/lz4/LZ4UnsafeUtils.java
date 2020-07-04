package net.jpountz.lz4;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.nio.ByteOrder;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.util.Utils;

enum LZ4UnsafeUtils {
    ;

    static int readShortLittleEndian(byte[] bArr, int i) {
        short readShort = UnsafeUtils.readShort(bArr, i);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            readShort = Short.reverseBytes(readShort);
        }
        return readShort & 65535;
    }

    static boolean readIntEquals(byte[] bArr, int i, int i2) {
        if (UnsafeUtils.readInt(bArr, i) == UnsafeUtils.readInt(bArr, i2)) {
            return true;
        }
        return false;
    }

    static void writeShortLittleEndian(byte[] bArr, int i, int i2) {
        short s = (short) i2;
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            s = Short.reverseBytes(s);
        }
        UnsafeUtils.writeShort(bArr, i, s);
    }

    static int writeLen(int i, byte[] bArr, int i2) {
        while (i >= 255) {
            int i3 = i2 + 1;
            UnsafeUtils.writeByte(bArr, i2, (int) NormalGiftView.ALPHA_255);
            i -= 255;
            i2 = i3;
        }
        int i4 = i2 + 1;
        UnsafeUtils.writeByte(bArr, i2, i);
        return i4;
    }

    static void safeIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            int i6 = i + i4;
            bArr[i5] = bArr[i6];
            UnsafeUtils.writeByte(bArr, i5, UnsafeUtils.readByte(bArr, i6));
        }
    }

    static int commonBytes(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i2 <= i3 - 8) {
            if (UnsafeUtils.readLong(bArr, i2) == UnsafeUtils.readLong(bArr, i)) {
                i5 += 8;
                i += 8;
                i2 += 8;
            } else {
                if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
                    i4 = Long.numberOfLeadingZeros(UnsafeUtils.readLong(bArr, i) ^ UnsafeUtils.readLong(bArr, i2));
                } else {
                    i4 = Long.numberOfTrailingZeros(UnsafeUtils.readLong(bArr, i) ^ UnsafeUtils.readLong(bArr, i2));
                }
                return i5 + (i4 >>> 3);
            }
        }
        while (i2 < i3) {
            int i6 = i + 1;
            int i7 = i2 + 1;
            if (UnsafeUtils.readByte(bArr, i) != UnsafeUtils.readByte(bArr, i2)) {
                break;
            }
            i5++;
            i = i6;
            i2 = i7;
        }
        return i5;
    }

    static void wildIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 4) {
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                UnsafeUtils.writeByte(bArr, i2 + i6, UnsafeUtils.readByte(bArr, i + i6));
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
            UnsafeUtils.writeInt(bArr, i7, UnsafeUtils.readInt(bArr, i8));
            i2 = i7 + 4;
            i = i8 - i5;
        } else if (i4 < 8) {
            UnsafeUtils.writeLong(bArr, i2, UnsafeUtils.readLong(bArr, i));
            i2 += i4;
        }
        while (i2 < i3) {
            UnsafeUtils.writeLong(bArr, i2, UnsafeUtils.readLong(bArr, i));
            i2 += 8;
            i += 8;
        }
    }

    static int commonBytesBackward(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (UnsafeUtils.readByte(bArr, i) != UnsafeUtils.readByte(bArr, i2)) {
                break;
            }
            i5++;
        }
        return i5;
    }

    static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 & -8;
        wildArraycopy(bArr, i, bArr2, i2, i4);
        int i5 = i3 & 7;
        for (int i6 = 0; i6 < i5; i6++) {
            UnsafeUtils.writeByte(bArr2, i2 + i4 + i6, UnsafeUtils.readByte(bArr, i + i4 + i6));
        }
    }

    static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            UnsafeUtils.writeLong(bArr2, i2 + i4, UnsafeUtils.readLong(bArr, i + i4));
        }
    }

    static int lastLiterals(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        return LZ4SafeUtils.lastLiterals(bArr, i, i2, bArr2, i3, i4);
    }

    static int encodeSequence(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int i10 = i5 + 1;
        if (i9 >= 15) {
            i7 = -16;
            i10 = writeLen(i9 - 15, bArr2, i10);
        } else {
            i7 = i9 << 4;
        }
        wildArraycopy(bArr, i, bArr2, i10, i9);
        int i11 = i10 + i9;
        int i12 = i2 - i3;
        int i13 = i11 + 1;
        bArr2[i11] = (byte) i12;
        int i14 = i13 + 1;
        bArr2[i13] = (byte) (i12 >>> 8);
        int i15 = i4 - 4;
        if (i14 + 6 + (i15 >>> 8) <= i6) {
            if (i15 >= 15) {
                i8 = i7 | 15;
                i14 = writeLen(i15 - 15, bArr2, i14);
            } else {
                i8 = i7 | i15;
            }
            bArr2[i5] = (byte) i8;
            return i14;
        }
        throw new LZ4Exception("maxDestLen is too small");
    }
}
