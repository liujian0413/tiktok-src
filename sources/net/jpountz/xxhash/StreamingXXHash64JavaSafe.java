package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;

final class StreamingXXHash64JavaSafe extends AbstractStreamingXXHash64Java {

    static class Factory implements Factory {
        public static final Factory INSTANCE = new Factory();

        Factory() {
        }

        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JavaSafe(j);
        }
    }

    public final long getValue() {
        long j;
        if (this.totalLen >= 32) {
            long j2 = this.f123145v1;
            long j3 = this.f123146v2;
            long j4 = this.f123147v3;
            long j5 = this.f123148v4;
            j = ((((((((((((Long.rotateLeft(j2 * -4417276706812531889L, 31) * -7046029288634856825L) ^ (((Long.rotateLeft(j2, 1) + Long.rotateLeft(j3, 7)) + Long.rotateLeft(j4, 12)) + Long.rotateLeft(j5, 18))) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j3 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j4 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j5 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j = this.seed + 2870177450012600261L;
        }
        long j6 = j + this.totalLen;
        int i = 0;
        while (i <= this.memSize - 8) {
            j6 = (Long.rotateLeft(j6 ^ (Long.rotateLeft(SafeUtils.readLongLE(this.memory, i) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i += 8;
        }
        if (i <= this.memSize - 4) {
            j6 = (Long.rotateLeft(j6 ^ ((((long) SafeUtils.readIntLE(this.memory, i)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i += 4;
        }
        while (i < this.memSize) {
            j6 = Long.rotateLeft(j6 ^ (((long) (this.memory[i] & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i++;
        }
        long j7 = (j6 ^ (j6 >>> 33)) * -4417276706812531889L;
        long j8 = (j7 ^ (j7 >>> 29)) * 1609587929392839161L;
        return j8 ^ (j8 >>> 32);
    }

    StreamingXXHash64JavaSafe(long j) {
        super(j);
    }

    public final void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        SafeUtils.checkRange(bArr, i, i2);
        this.totalLen += (long) i4;
        if (this.memSize + i4 < 32) {
            System.arraycopy(bArr2, i3, this.memory, this.memSize, i4);
            this.memSize += i4;
            return;
        }
        int i5 = i4 + i3;
        if (this.memSize > 0) {
            System.arraycopy(bArr2, i3, this.memory, this.memSize, 32 - this.memSize);
            this.f123145v1 += SafeUtils.readLongLE(this.memory, 0) * -4417276706812531889L;
            this.f123145v1 = Long.rotateLeft(this.f123145v1, 31);
            this.f123145v1 *= -7046029288634856825L;
            this.f123146v2 += SafeUtils.readLongLE(this.memory, 8) * -4417276706812531889L;
            this.f123146v2 = Long.rotateLeft(this.f123146v2, 31);
            this.f123146v2 *= -7046029288634856825L;
            this.f123147v3 += SafeUtils.readLongLE(this.memory, 16) * -4417276706812531889L;
            this.f123147v3 = Long.rotateLeft(this.f123147v3, 31);
            this.f123147v3 *= -7046029288634856825L;
            this.f123148v4 += SafeUtils.readLongLE(this.memory, 24) * -4417276706812531889L;
            this.f123148v4 = Long.rotateLeft(this.f123148v4, 31);
            this.f123148v4 *= -7046029288634856825L;
            i3 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i6 = i5 - 32;
        long j = this.f123145v1;
        long j2 = this.f123146v2;
        long j3 = this.f123147v3;
        long j4 = this.f123148v4;
        while (i3 <= i6) {
            j = Long.rotateLeft(j + (SafeUtils.readLongLE(bArr2, i3) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i7 = i3 + 8;
            j2 = Long.rotateLeft(j2 + (SafeUtils.readLongLE(bArr2, i7) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i8 = i7 + 8;
            j3 = Long.rotateLeft(j3 + (SafeUtils.readLongLE(bArr2, i8) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i9 = i8 + 8;
            j4 = Long.rotateLeft(j4 + (SafeUtils.readLongLE(bArr2, i9) * -4417276706812531889L), 31) * -7046029288634856825L;
            i3 = i9 + 8;
        }
        this.f123145v1 = j;
        this.f123146v2 = j2;
        this.f123147v3 = j3;
        this.f123148v4 = j4;
        if (i3 < i5) {
            int i10 = i5 - i3;
            System.arraycopy(bArr2, i3, this.memory, 0, i10);
            this.memSize = i10;
        }
    }
}
