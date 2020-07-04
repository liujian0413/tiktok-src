package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class XXHash64JavaUnsafe extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JavaUnsafe();

    XXHash64JavaUnsafe() {
    }

    public final long hash(ByteBuffer byteBuffer, int i, int i2, long j) {
        long j2;
        int i3;
        long j3;
        long rotateLeft;
        long rotateLeft2;
        long rotateLeft3;
        int i4 = i2;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i + byteBuffer.arrayOffset(), i2, j);
        }
        ByteBufferUtils.checkRange(byteBuffer, i, i2);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i5 = i + i4;
        long j4 = -4417276706812531889L;
        if (i4 >= 32) {
            long j5 = (j - 7046029288634856825L) - 4417276706812531889L;
            long j6 = j - 4417276706812531889L;
            long j7 = j + 0;
            long j8 = j - -7046029288634856825L;
            i3 = i;
            while (true) {
                rotateLeft = Long.rotateLeft(j5 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i3) * j4), 31) * -7046029288634856825L;
                int i6 = i3 + 8;
                rotateLeft2 = Long.rotateLeft(j6 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i6) * j4), 31) * -7046029288634856825L;
                int i7 = i6 + 8;
                rotateLeft3 = Long.rotateLeft(j7 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i7) * j4), 31) * -7046029288634856825L;
                int i8 = i7 + 8;
                j8 = Long.rotateLeft(j8 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i8) * -4417276706812531889L), 31) * -7046029288634856825L;
                i3 = i8 + 8;
                if (i3 > i5 - 32) {
                    break;
                }
                j5 = rotateLeft;
                j6 = rotateLeft2;
                j7 = rotateLeft3;
                j4 = -4417276706812531889L;
            }
            j2 = (((Long.rotateLeft(j8 * -4417276706812531889L, 31) * -7046029288634856825L) ^ ((((((((((((Long.rotateLeft(rotateLeft, 1) + Long.rotateLeft(rotateLeft2, 7)) + Long.rotateLeft(rotateLeft3, 12)) + Long.rotateLeft(j8, 18)) ^ (Long.rotateLeft(rotateLeft * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(rotateLeft2 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(rotateLeft3 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j2 = j + 2870177450012600261L;
            i3 = i;
        }
        long j9 = j2 + ((long) i4);
        while (i3 <= i5 - 8) {
            i3 += 8;
            j9 = (Long.rotateLeft(j9 ^ (Long.rotateLeft(ByteBufferUtils.readLongLE(inLittleEndianOrder, i3) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
        }
        if (i3 <= i5 - 4) {
            j3 = (Long.rotateLeft(j9 ^ ((((long) ByteBufferUtils.readIntLE(inLittleEndianOrder, i3)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i3 += 4;
        } else {
            j3 = j9;
        }
        while (i3 < i5) {
            j3 = Long.rotateLeft(j3 ^ (((long) (ByteBufferUtils.readByte(inLittleEndianOrder, i3) & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i3++;
        }
        long j10 = ((j3 >>> 33) ^ j3) * -4417276706812531889L;
        long j11 = (j10 ^ (j10 >>> 29)) * 1609587929392839161L;
        return j11 ^ (j11 >>> 32);
    }

    public final long hash(byte[] bArr, int i, int i2, long j) {
        int i3;
        long j2;
        long j3;
        long rotateLeft;
        long rotateLeft2;
        long rotateLeft3;
        byte[] bArr2 = bArr;
        int i4 = i2;
        UnsafeUtils.checkRange(bArr, i, i2);
        int i5 = i + i4;
        long j4 = -4417276706812531889L;
        if (i4 >= 32) {
            long j5 = (j - 7046029288634856825L) - 4417276706812531889L;
            long j6 = j - 4417276706812531889L;
            long j7 = j + 0;
            long j8 = j - -7046029288634856825L;
            i3 = i;
            while (true) {
                rotateLeft = Long.rotateLeft(j5 + (UnsafeUtils.readLongLE(bArr2, i3) * j4), 31) * -7046029288634856825L;
                int i6 = i3 + 8;
                rotateLeft2 = Long.rotateLeft(j6 + (UnsafeUtils.readLongLE(bArr2, i6) * j4), 31) * -7046029288634856825L;
                int i7 = i6 + 8;
                rotateLeft3 = Long.rotateLeft(j7 + (UnsafeUtils.readLongLE(bArr2, i7) * j4), 31) * -7046029288634856825L;
                int i8 = i7 + 8;
                j8 = Long.rotateLeft(j8 + (UnsafeUtils.readLongLE(bArr2, i8) * -4417276706812531889L), 31) * -7046029288634856825L;
                i3 = i8 + 8;
                if (i3 > i5 - 32) {
                    break;
                }
                j5 = rotateLeft;
                j6 = rotateLeft2;
                j7 = rotateLeft3;
                j4 = -4417276706812531889L;
            }
            j2 = (((Long.rotateLeft(j8 * -4417276706812531889L, 31) * -7046029288634856825L) ^ ((((((((((((Long.rotateLeft(rotateLeft, 1) + Long.rotateLeft(rotateLeft2, 7)) + Long.rotateLeft(rotateLeft3, 12)) + Long.rotateLeft(j8, 18)) ^ (Long.rotateLeft(rotateLeft * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(rotateLeft2 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(rotateLeft3 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j2 = j + 2870177450012600261L;
            i3 = i;
        }
        long j9 = j2 + ((long) i4);
        while (i3 <= i5 - 8) {
            i3 += 8;
            j9 = (Long.rotateLeft(j9 ^ (Long.rotateLeft(UnsafeUtils.readLongLE(bArr2, i3) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
        }
        if (i3 <= i5 - 4) {
            j3 = (Long.rotateLeft(j9 ^ ((((long) UnsafeUtils.readIntLE(bArr2, i3)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i3 += 4;
        } else {
            j3 = j9;
        }
        while (i3 < i5) {
            j3 = Long.rotateLeft(j3 ^ (((long) (UnsafeUtils.readByte(bArr2, i3) & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i3++;
        }
        long j10 = (j3 ^ (j3 >>> 33)) * -4417276706812531889L;
        long j11 = (j10 ^ (j10 >>> 29)) * 1609587929392839161L;
        return j11 ^ (j11 >>> 32);
    }
}
