package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class XXHash32JavaUnsafe extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JavaUnsafe();

    XXHash32JavaUnsafe() {
    }

    public final int hash(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i + byteBuffer.arrayOffset(), i2, i3);
        }
        ByteBufferUtils.checkRange(byteBuffer, i, i2);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i5 = i + i2;
        if (i2 >= 16) {
            int i6 = (i3 - 1640531535) - 2048144777;
            int i7 = i3 - 2048144777;
            int i8 = i3 + 0;
            int i9 = i3 - -1640531535;
            do {
                i6 = Integer.rotateLeft(i6 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i) * -2048144777), 13) * -1640531535;
                int i10 = i + 4;
                i7 = Integer.rotateLeft(i7 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i10) * -2048144777), 13) * -1640531535;
                int i11 = i10 + 4;
                i8 = Integer.rotateLeft(i8 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i11) * -2048144777), 13) * -1640531535;
                int i12 = i11 + 4;
                i9 = Integer.rotateLeft(i9 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i12) * -2048144777), 13) * -1640531535;
                i = i12 + 4;
            } while (i <= i5 - 16);
            i4 = Integer.rotateLeft(i6, 1) + Integer.rotateLeft(i7, 7) + Integer.rotateLeft(i8, 12) + Integer.rotateLeft(i9, 18);
        } else {
            i4 = i3 + 374761393;
        }
        int i13 = i4 + i2;
        while (i <= i5 - 4) {
            i13 = Integer.rotateLeft(i13 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i) * -1028477379), 17) * 668265263;
            i += 4;
        }
        while (i < i5) {
            i13 = Integer.rotateLeft(i13 + ((ByteBufferUtils.readByte(inLittleEndianOrder, i) & 255) * 374761393), 11) * -1640531535;
            i++;
        }
        int i14 = ((i13 >>> 15) ^ i13) * -2048144777;
        int i15 = (i14 ^ (i14 >>> 13)) * -1028477379;
        return i15 ^ (i15 >>> 16);
    }

    public final int hash(byte[] bArr, int i, int i2, int i3) {
        int i4;
        UnsafeUtils.checkRange(bArr, i, i2);
        int i5 = i + i2;
        if (i2 >= 16) {
            int i6 = (i3 - 1640531535) - 2048144777;
            int i7 = i3 - 2048144777;
            int i8 = i3 + 0;
            int i9 = i3 - -1640531535;
            do {
                i6 = Integer.rotateLeft(i6 + (UnsafeUtils.readIntLE(bArr, i) * -2048144777), 13) * -1640531535;
                int i10 = i + 4;
                i7 = Integer.rotateLeft(i7 + (UnsafeUtils.readIntLE(bArr, i10) * -2048144777), 13) * -1640531535;
                int i11 = i10 + 4;
                i8 = Integer.rotateLeft(i8 + (UnsafeUtils.readIntLE(bArr, i11) * -2048144777), 13) * -1640531535;
                int i12 = i11 + 4;
                i9 = Integer.rotateLeft(i9 + (UnsafeUtils.readIntLE(bArr, i12) * -2048144777), 13) * -1640531535;
                i = i12 + 4;
            } while (i <= i5 - 16);
            i4 = Integer.rotateLeft(i6, 1) + Integer.rotateLeft(i7, 7) + Integer.rotateLeft(i8, 12) + Integer.rotateLeft(i9, 18);
        } else {
            i4 = i3 + 374761393;
        }
        int i13 = i4 + i2;
        while (i <= i5 - 4) {
            i13 = Integer.rotateLeft(i13 + (UnsafeUtils.readIntLE(bArr, i) * -1028477379), 17) * 668265263;
            i += 4;
        }
        while (i < i5) {
            i13 = Integer.rotateLeft(i13 + ((UnsafeUtils.readByte(bArr, i) & 255) * 374761393), 11) * -1640531535;
            i++;
        }
        int i14 = ((i13 >>> 15) ^ i13) * -2048144777;
        int i15 = (i14 ^ (i14 >>> 13)) * -1028477379;
        return i15 ^ (i15 >>> 16);
    }
}
