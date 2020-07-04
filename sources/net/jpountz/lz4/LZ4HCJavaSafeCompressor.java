package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4HCJavaSafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaSafeCompressor();
    final int compressionLevel;
    public final int maxAttempts;

    class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int base;
        private final short[] chainTable;
        private final int[] hashTable = new int[32768];
        int nextToUpdate;

        static {
            Class<LZ4HCJavaSafeCompressor> cls = LZ4HCJavaSafeCompressor.class;
        }

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        private int next(int i) {
            return i - (this.chainTable[i & 65535] & 65535);
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i), i);
        }

        private void addHash(byte[] bArr, int i) {
            addHash(SafeUtils.readInt(bArr, i), i);
        }

        HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            Arrays.fill(this.hashTable, -1);
            this.chainTable = new short[65536];
        }

        private void addHash(int i, int i2) {
            int hashHC = LZ4Utils.hashHC(i);
            int i3 = i2 - this.hashTable[hashHC];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.chainTable[65535 & i2] = (short) i3;
            this.hashTable[hashHC] = i2;
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i));
        }

        /* access modifiers changed from: 0000 */
        public void insert(int i, ByteBuffer byteBuffer) {
            while (this.nextToUpdate < i) {
                addHash(byteBuffer, this.nextToUpdate);
                this.nextToUpdate++;
            }
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(SafeUtils.readInt(bArr, i));
        }

        /* access modifiers changed from: 0000 */
        public void insert(int i, byte[] bArr) {
            while (this.nextToUpdate < i) {
                addHash(bArr, this.nextToUpdate);
                this.nextToUpdate++;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i, int i2, Match match) {
            int i3;
            int i4;
            match.start = i;
            match.len = 0;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i4 = 0;
                i3 = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i)) {
                    i4 = i - hashPointer;
                    i3 = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i2) + 4;
                    match.len = i3;
                    match.ref = hashPointer;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                hashPointer = next(hashPointer);
            }
            int i5 = hashPointer;
            for (int i6 = 0; i6 < LZ4HCJavaSafeCompressor.this.maxAttempts && i5 >= Math.max(this.base, (i - 65536) + 1) && i5 <= i; i6++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, i5, i)) {
                    int commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, i5 + 4, i + 4, i2) + 4;
                    if (commonBytes > match.len) {
                        match.ref = i5;
                        match.len = commonBytes;
                    }
                }
                i5 = next(i5);
            }
            if (i3 != 0) {
                int i7 = (i3 + i) - 3;
                while (i < i7 - i4) {
                    this.chainTable[65535 & i] = (short) i4;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i4;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i))] = i;
                    i++;
                } while (i < i7);
                this.nextToUpdate = i7;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean insertAndFindBestMatch(byte[] bArr, int i, int i2, Match match) {
            int i3;
            int i4;
            match.start = i;
            match.len = 0;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i4 = 0;
                i3 = 0;
            } else {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i)) {
                    i4 = i - hashPointer;
                    i3 = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i2) + 4;
                    match.len = i3;
                    match.ref = hashPointer;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                hashPointer = next(hashPointer);
            }
            int i5 = hashPointer;
            for (int i6 = 0; i6 < LZ4HCJavaSafeCompressor.this.maxAttempts && i5 >= Math.max(this.base, (i - 65536) + 1) && i5 <= i; i6++) {
                if (LZ4SafeUtils.readIntEquals(bArr, i5, i)) {
                    int commonBytes = LZ4SafeUtils.commonBytes(bArr, i5 + 4, i + 4, i2) + 4;
                    if (commonBytes > match.len) {
                        match.ref = i5;
                        match.len = commonBytes;
                    }
                }
                i5 = next(i5);
            }
            if (i3 != 0) {
                int i7 = (i3 + i) - 3;
                while (i < i7 - i4) {
                    this.chainTable[65535 & i] = (short) i4;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i4;
                    this.hashTable[LZ4Utils.hashHC(SafeUtils.readInt(bArr, i))] = i;
                    i++;
                } while (i < i7);
                this.nextToUpdate = i7;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, Match match) {
            match.len = i4;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i)) {
                    int commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i3) + 4;
                    int commonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, hashPointer, i, this.base, i2);
                    int i6 = commonBytes + commonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = hashPointer - commonBytesBackward;
                        match.start = i - commonBytesBackward;
                    }
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i4) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i2, int i3, int i4, Match match) {
            match.len = i4;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i)) {
                    int commonBytes = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i3) + 4;
                    int commonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, hashPointer, i, this.base, i2);
                    int i6 = commonBytes + commonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = hashPointer - commonBytesBackward;
                        match.start = i - commonBytesBackward;
                    }
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i4) {
                return true;
            }
            return false;
        }
    }

    LZ4HCJavaSafeCompressor() {
        this(9);
    }

    LZ4HCJavaSafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0260, code lost:
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r10, r0, r1.start, r1.ref, r1.len, r11, r16, r13);
        r3 = r1.end();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(java.nio.ByteBuffer r26, int r27, int r28, java.nio.ByteBuffer r29, int r30, int r31) {
        /*
            r25 = this;
            r0 = r27
            r3 = r28
            r1 = r30
            r6 = r31
            boolean r2 = r26.hasArray()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r29.hasArray()
            if (r2 == 0) goto L_0x0036
            byte[] r2 = r26.array()
            int r4 = r26.arrayOffset()
            int r4 = r4 + r0
            byte[] r5 = r29.array()
            int r0 = r29.arrayOffset()
            int r7 = r1 + r0
            r0 = r25
            r1 = r2
            r2 = r4
            r3 = r28
            r4 = r5
            r5 = r7
            r6 = r31
            int r0 = r0.compress(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0036:
            java.nio.ByteBuffer r10 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r26)
            java.nio.ByteBuffer r11 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r29)
            net.jpountz.util.ByteBufferUtils.checkRange(r10, r0, r3)
            net.jpountz.util.ByteBufferUtils.checkRange(r11, r1, r6)
            int r12 = r0 + r3
            int r13 = r1 + r6
            int r14 = r12 + -12
            int r15 = r12 + -5
            int r2 = r0 + 1
            net.jpountz.lz4.LZ4HCJavaSafeCompressor$HashTable r9 = new net.jpountz.lz4.LZ4HCJavaSafeCompressor$HashTable
            r8 = r25
            r9.<init>(r0)
            net.jpountz.lz4.LZ4Utils$Match r7 = new net.jpountz.lz4.LZ4Utils$Match
            r7.<init>()
            net.jpountz.lz4.LZ4Utils$Match r6 = new net.jpountz.lz4.LZ4Utils$Match
            r6.<init>()
            net.jpountz.lz4.LZ4Utils$Match r5 = new net.jpountz.lz4.LZ4Utils$Match
            r5.<init>()
            net.jpountz.lz4.LZ4Utils$Match r4 = new net.jpountz.lz4.LZ4Utils$Match
            r4.<init>()
            r3 = r0
            r0 = r1
        L_0x006b:
            if (r2 >= r14) goto L_0x0286
            boolean r16 = r9.insertAndFindBestMatch(r10, r2, r15, r6)
            if (r16 != 0) goto L_0x0076
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0076:
            net.jpountz.lz4.LZ4Utils.copyTo(r6, r7)
            r16 = r0
            r0 = r3
        L_0x007c:
            int r2 = r6.end()
            if (r2 >= r14) goto L_0x0255
            int r2 = r6.end()
            int r17 = r2 + -2
            int r2 = r6.start
            int r18 = r2 + 1
            int r3 = r6.len
            r2 = r9
            r19 = r3
            r3 = r10
            r20 = r4
            r4 = r17
            r21 = r5
            r5 = r18
            r1 = r6
            r6 = r15
            r22 = r12
            r12 = r7
            r7 = r19
            r8 = r21
            boolean r2 = r2.insertAndFindWiderMatch(r3, r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x00b3
            r17 = r9
            r24 = r14
            r19 = r20
            r14 = r21
            goto L_0x0260
        L_0x00b3:
            int r2 = r12.start
            int r3 = r1.start
            if (r2 >= r3) goto L_0x00c8
            r8 = r21
            int r2 = r8.start
            int r3 = r1.start
            int r4 = r12.len
            int r3 = r3 + r4
            if (r2 >= r3) goto L_0x00ca
            net.jpountz.lz4.LZ4Utils.copyTo(r12, r1)
            goto L_0x00ca
        L_0x00c8:
            r8 = r21
        L_0x00ca:
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            r7 = 3
            if (r2 >= r7) goto L_0x00e1
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r1)
            r6 = r1
            r5 = r8
            r7 = r12
            r4 = r20
            r12 = r22
            r1 = r30
            r8 = r25
            goto L_0x007c
        L_0x00e1:
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            r6 = 4
            r5 = 18
            if (r2 >= r5) goto L_0x010f
            int r2 = r1.len
            if (r2 <= r5) goto L_0x00f1
            r2 = 18
        L_0x00f1:
            int r3 = r1.start
            int r3 = r3 + r2
            int r4 = r8.end()
            int r4 = r4 - r6
            if (r3 <= r4) goto L_0x0104
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            int r3 = r8.len
            int r2 = r2 + r3
            int r2 = r2 - r6
        L_0x0104:
            int r3 = r8.start
            int r4 = r1.start
            int r3 = r3 - r4
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x010f
            r8.fix(r2)
        L_0x010f:
            int r2 = r8.start
            int r3 = r8.len
            int r2 = r2 + r3
            if (r2 >= r14) goto L_0x021c
            int r2 = r8.end()
            int r4 = r2 + -3
            int r3 = r8.start
            int r2 = r8.len
            r17 = r2
            r2 = r9
            r18 = r3
            r3 = r10
            r23 = r9
            r9 = 18
            r5 = r18
            r9 = 4
            r6 = r15
            r18 = 3
            r7 = r17
            r9 = r8
            r8 = r20
            boolean r2 = r2.insertAndFindWiderMatch(r3, r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x0144
            r24 = r14
            r19 = r20
            r17 = r23
            r14 = r9
            goto L_0x0223
        L_0x0144:
            r8 = r20
            int r2 = r8.start
            int r3 = r1.end()
            int r3 = r3 + 3
            if (r2 >= r3) goto L_0x01b6
            int r2 = r8.start
            int r3 = r1.end()
            if (r2 < r3) goto L_0x01a3
            int r2 = r9.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x0172
            int r2 = r1.end()
            int r3 = r9.start
            int r2 = r2 - r3
            r9.fix(r2)
            int r2 = r9.len
            r3 = 4
            if (r2 >= r3) goto L_0x0172
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r9)
        L_0x0172:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r0 = r8
            r8 = r16
            r24 = r14
            r17 = r23
            r14 = r9
            r9 = r13
            int r16 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r1.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r1)
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r12)
            r8 = r25
            r4 = r0
            r6 = r1
            r0 = r2
            r7 = r12
            r5 = r14
            r9 = r17
            r12 = r22
            r14 = r24
            r1 = r30
            goto L_0x007c
        L_0x01a3:
            r24 = r14
            r17 = r23
            r14 = r9
            r9 = r8
            net.jpountz.lz4.LZ4Utils.copyTo(r9, r14)
            r20 = r9
        L_0x01ae:
            r8 = r14
            r9 = r17
            r14 = r24
            r7 = 3
            goto L_0x00e1
        L_0x01b6:
            r24 = r14
            r17 = r23
            r14 = r9
            r9 = r8
            int r2 = r14.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x01fd
            int r2 = r14.start
            int r3 = r1.start
            int r2 = r2 - r3
            r3 = 15
            if (r2 >= r3) goto L_0x01f6
            int r2 = r1.len
            r3 = 18
            if (r2 <= r3) goto L_0x01d5
            r1.len = r3
        L_0x01d5:
            int r2 = r1.end()
            int r3 = r14.end()
            r4 = 4
            int r3 = r3 - r4
            if (r2 <= r3) goto L_0x01eb
            int r2 = r14.end()
            int r3 = r1.start
            int r2 = r2 - r3
            int r2 = r2 - r4
            r1.len = r2
        L_0x01eb:
            int r2 = r1.end()
            int r3 = r14.start
            int r2 = r2 - r3
            r14.fix(r2)
            goto L_0x01fd
        L_0x01f6:
            int r2 = r14.start
            int r3 = r1.start
            int r2 = r2 - r3
            r1.len = r2
        L_0x01fd:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r0 = r9
            r9 = r13
            int r16 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r1.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r1)
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r14)
            r20 = r0
            r0 = r2
            goto L_0x01ae
        L_0x021c:
            r17 = r9
            r24 = r14
            r19 = r20
            r14 = r8
        L_0x0223:
            int r2 = r14.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x0232
            int r2 = r14.start
            int r3 = r1.start
            int r2 = r2 - r3
            r1.len = r2
        L_0x0232:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r9 = r13
            int r8 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r1.end()
            int r4 = r14.start
            int r5 = r14.ref
            int r6 = r14.len
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r14.end()
            goto L_0x0274
        L_0x0255:
            r19 = r4
            r1 = r6
            r17 = r9
            r22 = r12
            r24 = r14
            r14 = r5
            r12 = r7
        L_0x0260:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r9 = r13
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r1.end()
        L_0x0274:
            r8 = r25
            r6 = r1
            r2 = r3
            r7 = r12
            r5 = r14
            r9 = r17
            r4 = r19
            r12 = r22
            r14 = r24
            r1 = r30
            goto L_0x006b
        L_0x0286:
            r22 = r12
            int r4 = r22 - r3
            r2 = r10
            r5 = r11
            r6 = r0
            r7 = r13
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r2, r3, r4, r5, r6, r7)
            r1 = r30
            int r0 = r0 - r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0226, code lost:
        r11 = r9;
        r0 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r24, r0, r14.start, r14.ref, r14.len, r27, r15, r10);
        r3 = r14.end();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(byte[] r24, int r25, int r26, byte[] r27, int r28, int r29) {
        /*
            r23 = this;
            r0 = r25
            net.jpountz.util.SafeUtils.checkRange(r24, r25, r26)
            net.jpountz.util.SafeUtils.checkRange(r27, r28, r29)
            int r1 = r0 + r26
            int r10 = r28 + r29
            int r11 = r1 + -12
            int r12 = r1 + -5
            int r2 = r0 + 1
            net.jpountz.lz4.LZ4HCJavaSafeCompressor$HashTable r13 = new net.jpountz.lz4.LZ4HCJavaSafeCompressor$HashTable
            r14 = r23
            r13.<init>(r0)
            net.jpountz.lz4.LZ4Utils$Match r9 = new net.jpountz.lz4.LZ4Utils$Match
            r9.<init>()
            net.jpountz.lz4.LZ4Utils$Match r8 = new net.jpountz.lz4.LZ4Utils$Match
            r8.<init>()
            net.jpountz.lz4.LZ4Utils$Match r7 = new net.jpountz.lz4.LZ4Utils$Match
            r7.<init>()
            net.jpountz.lz4.LZ4Utils$Match r6 = new net.jpountz.lz4.LZ4Utils$Match
            r6.<init>()
            r3 = r0
            r0 = r28
        L_0x0030:
            if (r2 >= r11) goto L_0x024a
            r5 = r24
            boolean r4 = r13.insertAndFindBestMatch(r5, r2, r12, r8)
            if (r4 != 0) goto L_0x003d
            int r2 = r2 + 1
            goto L_0x0030
        L_0x003d:
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r9)
            r15 = r0
            r0 = r3
        L_0x0042:
            int r2 = r8.end()
            if (r2 >= r11) goto L_0x021e
            int r2 = r8.end()
            int r4 = r2 + -2
            int r2 = r8.start
            int r16 = r2 + 1
            int r3 = r8.len
            r2 = r13
            r17 = r3
            r3 = r24
            r5 = r16
            r18 = r6
            r6 = r12
            r19 = r7
            r7 = r17
            r14 = r8
            r8 = r19
            boolean r2 = r2.insertAndFindWiderMatch(r3, r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x0075
            r21 = r11
            r22 = r12
            r16 = r18
            r12 = r19
            goto L_0x0226
        L_0x0075:
            int r2 = r9.start
            int r3 = r14.start
            if (r2 >= r3) goto L_0x008a
            r8 = r19
            int r2 = r8.start
            int r3 = r14.start
            int r4 = r9.len
            int r3 = r3 + r4
            if (r2 >= r3) goto L_0x008c
            net.jpountz.lz4.LZ4Utils.copyTo(r9, r14)
            goto L_0x008c
        L_0x008a:
            r8 = r19
        L_0x008c:
            int r2 = r8.start
            int r3 = r14.start
            int r2 = r2 - r3
            r7 = 3
            if (r2 >= r7) goto L_0x00a0
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r14)
            r5 = r24
            r7 = r8
            r8 = r14
            r6 = r18
        L_0x009d:
            r14 = r23
            goto L_0x0042
        L_0x00a0:
            int r2 = r8.start
            int r3 = r14.start
            int r2 = r2 - r3
            r6 = 4
            r5 = 18
            if (r2 >= r5) goto L_0x00ce
            int r2 = r14.len
            if (r2 <= r5) goto L_0x00b0
            r2 = 18
        L_0x00b0:
            int r3 = r14.start
            int r3 = r3 + r2
            int r4 = r8.end()
            int r4 = r4 - r6
            if (r3 <= r4) goto L_0x00c3
            int r2 = r8.start
            int r3 = r14.start
            int r2 = r2 - r3
            int r3 = r8.len
            int r2 = r2 + r3
            int r2 = r2 - r6
        L_0x00c3:
            int r3 = r8.start
            int r4 = r14.start
            int r3 = r3 - r4
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x00ce
            r8.fix(r2)
        L_0x00ce:
            int r2 = r8.start
            int r3 = r8.len
            int r2 = r2 + r3
            if (r2 >= r11) goto L_0x01e3
            int r2 = r8.end()
            int r4 = r2 + -3
            int r3 = r8.start
            int r2 = r8.len
            r16 = r2
            r2 = r13
            r17 = r3
            r3 = r24
            r20 = r9
            r9 = 18
            r5 = r17
            r9 = 4
            r6 = r12
            r17 = 3
            r7 = r16
            r9 = r8
            r8 = r18
            boolean r2 = r2.insertAndFindWiderMatch(r3, r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x0106
            r21 = r11
            r22 = r12
            r16 = r18
            r11 = r20
            r12 = r9
            goto L_0x01eb
        L_0x0106:
            r8 = r18
            int r2 = r8.start
            int r3 = r14.end()
            int r3 = r3 + 3
            if (r2 >= r3) goto L_0x017a
            int r2 = r8.start
            int r3 = r14.end()
            if (r2 < r3) goto L_0x0164
            int r2 = r9.start
            int r3 = r14.end()
            if (r2 >= r3) goto L_0x0134
            int r2 = r14.end()
            int r3 = r9.start
            int r2 = r2 - r3
            r9.fix(r2)
            int r2 = r9.len
            r3 = 4
            if (r2 >= r3) goto L_0x0134
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r9)
        L_0x0134:
            int r4 = r14.start
            int r5 = r14.ref
            int r6 = r14.len
            r2 = r24
            r3 = r0
            r7 = r27
            r0 = r8
            r8 = r15
            r21 = r11
            r22 = r12
            r11 = r20
            r12 = r9
            r9 = r10
            int r15 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r14.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r14)
            net.jpountz.lz4.LZ4Utils.copyTo(r12, r11)
            r5 = r24
            r6 = r0
            r0 = r2
            r9 = r11
            r7 = r12
            r8 = r14
            r11 = r21
            r12 = r22
            goto L_0x009d
        L_0x0164:
            r21 = r11
            r22 = r12
            r11 = r20
            r12 = r9
            r9 = r8
            net.jpountz.lz4.LZ4Utils.copyTo(r9, r12)
            r18 = r9
        L_0x0171:
            r9 = r11
            r8 = r12
            r11 = r21
            r12 = r22
            r7 = 3
            goto L_0x00a0
        L_0x017a:
            r21 = r11
            r22 = r12
            r11 = r20
            r12 = r9
            r9 = r8
            int r2 = r12.start
            int r3 = r14.end()
            if (r2 >= r3) goto L_0x01c3
            int r2 = r12.start
            int r3 = r14.start
            int r2 = r2 - r3
            r3 = 15
            if (r2 >= r3) goto L_0x01bc
            int r2 = r14.len
            r3 = 18
            if (r2 <= r3) goto L_0x019b
            r14.len = r3
        L_0x019b:
            int r2 = r14.end()
            int r3 = r12.end()
            r4 = 4
            int r3 = r3 - r4
            if (r2 <= r3) goto L_0x01b1
            int r2 = r12.end()
            int r3 = r14.start
            int r2 = r2 - r3
            int r2 = r2 - r4
            r14.len = r2
        L_0x01b1:
            int r2 = r14.end()
            int r3 = r12.start
            int r2 = r2 - r3
            r12.fix(r2)
            goto L_0x01c3
        L_0x01bc:
            int r2 = r12.start
            int r3 = r14.start
            int r2 = r2 - r3
            r14.len = r2
        L_0x01c3:
            int r4 = r14.start
            int r5 = r14.ref
            int r6 = r14.len
            r2 = r24
            r3 = r0
            r7 = r27
            r8 = r15
            r0 = r9
            r9 = r10
            int r15 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r14.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r12, r14)
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r12)
            r18 = r0
            r0 = r2
            goto L_0x0171
        L_0x01e3:
            r21 = r11
            r22 = r12
            r16 = r18
            r12 = r8
            r11 = r9
        L_0x01eb:
            int r2 = r12.start
            int r3 = r14.end()
            if (r2 >= r3) goto L_0x01fa
            int r2 = r12.start
            int r3 = r14.start
            int r2 = r2 - r3
            r14.len = r2
        L_0x01fa:
            int r4 = r14.start
            int r5 = r14.ref
            int r6 = r14.len
            r2 = r24
            r3 = r0
            r7 = r27
            r8 = r15
            r9 = r10
            int r8 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r14.end()
            int r4 = r12.start
            int r5 = r12.ref
            int r6 = r12.len
            int r0 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r12.end()
            goto L_0x023c
        L_0x021e:
            r16 = r6
            r14 = r8
            r21 = r11
            r22 = r12
            r12 = r7
        L_0x0226:
            r11 = r9
            int r4 = r14.start
            int r5 = r14.ref
            int r6 = r14.len
            r2 = r24
            r3 = r0
            r7 = r27
            r8 = r15
            r9 = r10
            int r0 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r14.end()
        L_0x023c:
            r2 = r3
            r9 = r11
            r7 = r12
            r8 = r14
            r6 = r16
            r11 = r21
            r12 = r22
            r14 = r23
            goto L_0x0030
        L_0x024a:
            int r4 = r1 - r3
            r2 = r24
            r5 = r27
            r6 = r0
            r7 = r10
            int r0 = net.jpountz.lz4.LZ4SafeUtils.lastLiterals(r2, r3, r4, r5, r6, r7)
            int r0 = r0 - r28
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }
}
