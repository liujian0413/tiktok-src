package net.jpountz.lz4;

final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    LZ4JavaUnsafeCompressor() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (r11 < 15) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r11 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        net.jpountz.util.ByteBufferUtils.writeShortLE(r3, r12, (short) (r8 - r15));
        r12 = r12 + 2;
        r8 = r8 + 4;
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (((r12 + 6) + (r9 >>> 8)) > r5) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        if (r9 < 15) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, net.jpountz.util.ByteBufferUtils.readByte(r3, r10) | 15);
        r10 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r9 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r9 | net.jpountz.util.ByteBufferUtils.readByte(r3, r10));
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (r8 <= r7) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r9 = r8 - 2;
        net.jpountz.util.UnsafeUtils.writeShort(r2, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r0, r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r0, r8));
        r15 = r1 + net.jpountz.util.UnsafeUtils.readShort(r2, r9);
        net.jpountz.util.UnsafeUtils.writeShort(r2, r9, r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cc, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ce, code lost:
        r12 = r10 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e5, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int compress64k(java.nio.ByteBuffer r18, int r19, int r20, java.nio.ByteBuffer r21, int r22, int r23) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x00f6
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r22
            r9 = r1
        L_0x001d:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x0022:
            int r12 = r12 + r8
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 > r7) goto L_0x00f4
            int r14 = net.jpountz.util.ByteBufferUtils.readInt(r0, r8)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            int r15 = net.jpountz.util.UnsafeUtils.readShort(r2, r14)
            int r15 = r15 + r1
            r16 = r11
            int r11 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort(r2, r14, r11)
            boolean r11 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x00ee
            int r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r0, r15, r8, r1, r9)
            int r8 = r8 - r11
            int r15 = r15 - r11
            int r11 = r8 - r9
            int r12 = r10 + 1
            int r13 = r12 + r11
            int r13 = r13 + 8
            int r14 = r11 >>> 8
            int r13 = r13 + r14
            if (r13 > r5) goto L_0x00e6
            r13 = 15
            if (r11 < r13) goto L_0x0067
            r14 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r14)
            int r14 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14, r3, r12)
            goto L_0x006c
        L_0x0067:
            int r14 = r11 << 4
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r14)
        L_0x006c:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x0070:
            int r9 = r8 - r15
            short r9 = (short) r9
            net.jpountz.util.ByteBufferUtils.writeShortLE(r3, r12, r9)
            int r12 = r12 + 2
            int r8 = r8 + 4
            int r15 = r15 + 4
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r0, r15, r8, r6)
            int r11 = r12 + 6
            int r14 = r9 >>> 8
            int r11 = r11 + r14
            if (r11 > r5) goto L_0x00de
            int r8 = r8 + r9
            if (r9 < r13) goto L_0x009a
            byte r11 = net.jpountz.util.ByteBufferUtils.readByte(r3, r10)
            r11 = r11 | r13
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r11)
            int r9 = r9 + -15
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r9, r3, r12)
            r10 = r9
            goto L_0x00a3
        L_0x009a:
            byte r11 = net.jpountz.util.ByteBufferUtils.readByte(r3, r10)
            r9 = r9 | r11
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r9)
            r10 = r12
        L_0x00a3:
            if (r8 <= r7) goto L_0x00a7
            r1 = r8
            goto L_0x00f8
        L_0x00a7:
            int r9 = r8 + -2
            int r11 = net.jpountz.util.ByteBufferUtils.readInt(r0, r9)
            int r11 = net.jpountz.lz4.LZ4Utils.hash64k(r11)
            int r9 = r9 - r1
            net.jpountz.util.UnsafeUtils.writeShort(r2, r11, r9)
            int r9 = net.jpountz.util.ByteBufferUtils.readInt(r0, r8)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            int r11 = net.jpountz.util.UnsafeUtils.readShort(r2, r9)
            int r15 = r1 + r11
            int r11 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort(r2, r9, r11)
            boolean r9 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15)
            if (r9 == 0) goto L_0x00d5
            int r12 = r10 + 1
            r9 = 0
            net.jpountz.util.ByteBufferUtils.writeByte(r3, r10, r9)
            goto L_0x0070
        L_0x00d5:
            int r9 = r8 + 1
            r17 = r9
            r9 = r8
            r8 = r17
            goto L_0x001d
        L_0x00de:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x00e6:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            r8 = r12
            r11 = r13
            r12 = r16
            goto L_0x0022
        L_0x00f4:
            r1 = r9
            goto L_0x00f8
        L_0x00f6:
            r10 = r22
        L_0x00f8:
            int r2 = r4 - r1
            r0 = r18
            r3 = r21
            r4 = r10
            r5 = r23
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r22
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9);
        r6 = r6 - r14;
        r12 = r12 - r14;
        r14 = r6 - r9;
        r15 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a9, code lost:
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r10) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
        if (r14 < 15) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, 240);
        r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14 - 15, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r14 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14);
        r15 = r15 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c4, code lost:
        net.jpountz.util.ByteBufferUtils.writeShortLE(r8, r15, r13);
        r15 = r15 + 2;
        r6 = r6 + 4;
        r1 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12 + 4, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d6, code lost:
        if (((r15 + 6) + (r1 >>> 8)) > r10) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d8, code lost:
        r6 = r6 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00db, code lost:
        if (r1 < 15) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dd, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, net.jpountz.util.ByteBufferUtils.readByte(r8, r11) | 15);
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r1 - 15, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r1 | net.jpountz.util.ByteBufferUtils.readByte(r8, r11));
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f6, code lost:
        if (r6 <= r3) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f9, code lost:
        r1 = r6 - 2;
        net.jpountz.util.UnsafeUtils.writeInt(r7, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r5, r1)), r1);
        r1 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r5, r6));
        r12 = net.jpountz.util.UnsafeUtils.readInt(r7, r1);
        net.jpountz.util.UnsafeUtils.writeInt(r7, r1, r6);
        r13 = r6 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0119, code lost:
        if (r13 >= 65536) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011f, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r6) == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0121, code lost:
        r15 = r11 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0137, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013f, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(java.nio.ByteBuffer r20, int r21, int r22, java.nio.ByteBuffer r23, int r24, int r25) {
        /*
            r19 = this;
            r1 = r21
            r3 = r22
            r4 = r24
            r6 = r25
            boolean r0 = r20.hasArray()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r23.hasArray()
            if (r0 == 0) goto L_0x0037
            byte[] r2 = r20.array()
            int r0 = r20.arrayOffset()
            int r5 = r1 + r0
            byte[] r7 = r23.array()
            int r0 = r23.arrayOffset()
            int r8 = r4 + r0
            r0 = r19
            r1 = r2
            r2 = r5
            r3 = r22
            r4 = r7
            r5 = r8
            r6 = r25
            int r0 = r0.compress(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0037:
            java.nio.ByteBuffer r5 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r20)
            java.nio.ByteBuffer r8 = net.jpountz.util.ByteBufferUtils.inNativeByteOrder(r23)
            net.jpountz.util.ByteBufferUtils.checkRange(r5, r1, r3)
            net.jpountz.util.ByteBufferUtils.checkRange(r8, r4, r6)
            int r10 = r4 + r6
            r0 = 65547(0x1000b, float:9.1851E-41)
            if (r3 >= r0) goto L_0x005a
            r0 = r5
            r1 = r21
            r2 = r22
            r3 = r8
            r4 = r24
            r5 = r10
            int r0 = compress64k(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x005a:
            int r0 = r1 + r3
            int r2 = r0 + -5
            int r3 = r0 + -12
            int r6 = r1 + 1
            r7 = 4096(0x1000, float:5.74E-42)
            int[] r7 = new int[r7]
            java.util.Arrays.fill(r7, r1)
            r9 = r1
            r11 = r4
        L_0x006b:
            int r12 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r13 = 1
            int r12 = r13 << r12
        L_0x0070:
            int r13 = r13 + r6
            int r14 = r12 + 1
            int r15 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r12 = r12 >>> r15
            if (r13 > r3) goto L_0x0149
            int r15 = net.jpountz.util.ByteBufferUtils.readInt(r5, r6)
            int r15 = net.jpountz.lz4.LZ4Utils.hash(r15)
            r16 = r12
            int r12 = net.jpountz.util.UnsafeUtils.readInt(r7, r15)
            r17 = r13
            int r13 = r6 - r12
            net.jpountz.util.UnsafeUtils.writeInt(r7, r15, r6)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r13 >= r15) goto L_0x0140
            boolean r18 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r6)
            if (r18 == 0) goto L_0x0140
            int r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9)
            int r6 = r6 - r14
            int r12 = r12 - r14
            int r14 = r6 - r9
            int r15 = r11 + 1
            int r16 = r15 + r14
            int r16 = r16 + 8
            int r17 = r14 >>> 8
            int r1 = r16 + r17
            if (r1 > r10) goto L_0x0138
            r1 = 15
            if (r14 < r1) goto L_0x00bb
            r1 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r1)
            int r1 = r14 + -15
            int r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r1, r8, r15)
            goto L_0x00c0
        L_0x00bb:
            int r1 = r14 << 4
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r1)
        L_0x00c0:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14)
            int r15 = r15 + r14
        L_0x00c4:
            net.jpountz.util.ByteBufferUtils.writeShortLE(r8, r15, r13)
            int r15 = r15 + 2
            int r6 = r6 + 4
            int r12 = r12 + 4
            int r1 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12, r6, r2)
            int r9 = r15 + 6
            int r12 = r1 >>> 8
            int r9 = r9 + r12
            if (r9 > r10) goto L_0x0130
            int r6 = r6 + r1
            r9 = 15
            if (r1 < r9) goto L_0x00ed
            byte r12 = net.jpountz.util.ByteBufferUtils.readByte(r8, r11)
            r12 = r12 | r9
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r12)
            int r1 = r1 + -15
            int r1 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r1, r8, r15)
            r11 = r1
            goto L_0x00f6
        L_0x00ed:
            byte r12 = net.jpountz.util.ByteBufferUtils.readByte(r8, r11)
            r1 = r1 | r12
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r1)
            r11 = r15
        L_0x00f6:
            if (r6 <= r3) goto L_0x00f9
            goto L_0x014a
        L_0x00f9:
            int r1 = r6 + -2
            int r12 = net.jpountz.util.ByteBufferUtils.readInt(r5, r1)
            int r12 = net.jpountz.lz4.LZ4Utils.hash(r12)
            net.jpountz.util.UnsafeUtils.writeInt(r7, r12, r1)
            int r1 = net.jpountz.util.ByteBufferUtils.readInt(r5, r6)
            int r1 = net.jpountz.lz4.LZ4Utils.hash(r1)
            int r12 = net.jpountz.util.UnsafeUtils.readInt(r7, r1)
            net.jpountz.util.UnsafeUtils.writeInt(r7, r1, r6)
            int r13 = r6 - r12
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r13 >= r1) goto L_0x0128
            boolean r14 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r6)
            if (r14 == 0) goto L_0x0128
            int r15 = r11 + 1
            r14 = 0
            net.jpountz.util.ByteBufferUtils.writeByte(r8, r11, r14)
            goto L_0x00c4
        L_0x0128:
            int r1 = r6 + 1
            r9 = r6
            r6 = r1
            r1 = r21
            goto L_0x006b
        L_0x0130:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x0138:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x0140:
            r12 = r14
            r13 = r16
            r6 = r17
            r1 = r21
            goto L_0x0070
        L_0x0149:
            r6 = r9
        L_0x014a:
            r9 = r11
            int r7 = r0 - r6
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r5, r6, r7, r8, r9, r10)
            int r0 = r0 - r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (r11 < 15) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 240);
        r12 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r11 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        net.jpountz.util.UnsafeUtils.writeShortLE(r3, r12, (short) (r8 - r15));
        r12 = r12 + 2;
        r8 = r8 + 4;
        r9 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (((r12 + 6) + (r9 >>> 8)) > r5) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        if (r9 < 15) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) net.jpountz.util.UnsafeUtils.readByte(r3, r10) | 15);
        r10 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r9 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) r9 | net.jpountz.util.UnsafeUtils.readByte(r3, r10));
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (r8 <= r7) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r9 = r8 - 2;
        net.jpountz.util.UnsafeUtils.writeShort(r2, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.UnsafeUtils.readInt(r0, r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.UnsafeUtils.readInt(r0, r8));
        r15 = r1 + net.jpountz.util.UnsafeUtils.readShort(r2, r9);
        net.jpountz.util.UnsafeUtils.writeShort(r2, r9, r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cc, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r8, r15) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ce, code lost:
        r12 = r10 + 1;
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e5, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int compress64k(byte[] r18, int r19, int r20, byte[] r21, int r22, int r23) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x00f6
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r22
            r9 = r1
        L_0x001d:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x0022:
            int r12 = r12 + r8
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 > r7) goto L_0x00f4
            int r14 = net.jpountz.util.UnsafeUtils.readInt(r0, r8)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            int r15 = net.jpountz.util.UnsafeUtils.readShort(r2, r14)
            int r15 = r15 + r1
            r16 = r11
            int r11 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort(r2, r14, r11)
            boolean r11 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x00ee
            int r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r8, r1, r9)
            int r8 = r8 - r11
            int r15 = r15 - r11
            int r11 = r8 - r9
            int r12 = r10 + 1
            int r13 = r12 + r11
            int r13 = r13 + 8
            int r14 = r11 >>> 8
            int r13 = r13 + r14
            if (r13 > r5) goto L_0x00e6
            r13 = 15
            if (r11 < r13) goto L_0x0067
            r14 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r14)
            int r14 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r14, r3, r12)
            goto L_0x006c
        L_0x0067:
            int r14 = r11 << 4
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r14)
        L_0x006c:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x0070:
            int r9 = r8 - r15
            short r9 = (short) r9
            net.jpountz.util.UnsafeUtils.writeShortLE(r3, r12, r9)
            int r12 = r12 + 2
            int r8 = r8 + 4
            int r15 = r15 + 4
            int r9 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15, r8, r6)
            int r11 = r12 + 6
            int r14 = r9 >>> 8
            int r11 = r11 + r14
            if (r11 > r5) goto L_0x00de
            int r8 = r8 + r9
            if (r9 < r13) goto L_0x009a
            byte r11 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r11 = r11 | r13
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r11)
            int r9 = r9 + -15
            int r9 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r9, r3, r12)
            r10 = r9
            goto L_0x00a3
        L_0x009a:
            byte r11 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r9 = r9 | r11
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r9)
            r10 = r12
        L_0x00a3:
            if (r8 <= r7) goto L_0x00a7
            r1 = r8
            goto L_0x00f8
        L_0x00a7:
            int r9 = r8 + -2
            int r11 = net.jpountz.util.UnsafeUtils.readInt(r0, r9)
            int r11 = net.jpountz.lz4.LZ4Utils.hash64k(r11)
            int r9 = r9 - r1
            net.jpountz.util.UnsafeUtils.writeShort(r2, r11, r9)
            int r9 = net.jpountz.util.UnsafeUtils.readInt(r0, r8)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            int r11 = net.jpountz.util.UnsafeUtils.readShort(r2, r9)
            int r15 = r1 + r11
            int r11 = r8 - r1
            net.jpountz.util.UnsafeUtils.writeShort(r2, r9, r11)
            boolean r9 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r8, r15)
            if (r9 == 0) goto L_0x00d5
            int r12 = r10 + 1
            r9 = 0
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r9)
            goto L_0x0070
        L_0x00d5:
            int r9 = r8 + 1
            r17 = r9
            r9 = r8
            r8 = r17
            goto L_0x001d
        L_0x00de:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x00e6:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            r8 = r12
            r11 = r13
            r12 = r16
            goto L_0x0022
        L_0x00f4:
            r1 = r9
            goto L_0x00f8
        L_0x00f6:
            r10 = r22
        L_0x00f8:
            int r2 = r4 - r1
            r0 = r18
            r3 = r21
            r4 = r10
            r5 = r23
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r22
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        r13 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r11, r7, r1, r9);
        r7 = r7 - r13;
        r11 = r11 - r13;
        r13 = r7 - r9;
        r14 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        if ((((r14 + r13) + 8) + (r13 >>> 8)) > r5) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        if (r13 < 15) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 240);
        r14 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r13 - 15, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r13 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r14, r13);
        r14 = r14 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        net.jpountz.util.UnsafeUtils.writeShortLE(r3, r14, r12);
        r14 = r14 + 2;
        r7 = r7 + 4;
        r1 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r11 + 4, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        if (((r14 + 6) + (r1 >>> 8)) > r5) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r7 = r7 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        if (r1 < 15) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) net.jpountz.util.UnsafeUtils.readByte(r3, r10) | 15);
        r10 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r1 - 15, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b6, code lost:
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, (int) r1 | net.jpountz.util.UnsafeUtils.readByte(r3, r10));
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
        if (r7 <= r6) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c1, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c3, code lost:
        r1 = r7 - 2;
        net.jpountz.util.UnsafeUtils.writeInt(r8, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.UnsafeUtils.readInt(r0, r1)), r1);
        r1 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.UnsafeUtils.readInt(r0, r7));
        r11 = net.jpountz.util.UnsafeUtils.readInt(r8, r1);
        net.jpountz.util.UnsafeUtils.writeInt(r8, r1, r7);
        r12 = r7 - r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e3, code lost:
        if (r12 >= 65536) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r11, r7) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        r14 = r10 + 1;
        net.jpountz.util.UnsafeUtils.writeByte(r3, r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0109, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            net.jpountz.util.UnsafeUtils.checkRange(r19, r20, r21)
            net.jpountz.util.UnsafeUtils.checkRange(r22, r23, r24)
            int r5 = r23 + r24
            r4 = 65547(0x1000b, float:9.1851E-41)
            if (r2 >= r4) goto L_0x0024
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            int r0 = compress64k(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x0024:
            int r2 = r2 + r1
            int r4 = r2 + -5
            int r6 = r2 + -12
            int r7 = r1 + 1
            r8 = 4096(0x1000, float:5.74E-42)
            int[] r8 = new int[r8]
            java.util.Arrays.fill(r8, r1)
            r10 = r23
            r9 = r1
        L_0x0035:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x003a:
            int r12 = r12 + r7
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 > r6) goto L_0x0112
            int r14 = net.jpountz.util.UnsafeUtils.readInt(r0, r7)
            int r14 = net.jpountz.lz4.LZ4Utils.hash(r14)
            r15 = r11
            int r11 = net.jpountz.util.UnsafeUtils.readInt(r8, r14)
            r16 = r12
            int r12 = r7 - r11
            net.jpountz.util.UnsafeUtils.writeInt(r8, r14, r7)
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r12 >= r14) goto L_0x010a
            boolean r17 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r11, r7)
            if (r17 == 0) goto L_0x010a
            int r13 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r11, r7, r1, r9)
            int r7 = r7 - r13
            int r11 = r11 - r13
            int r13 = r7 - r9
            int r14 = r10 + 1
            int r15 = r14 + r13
            int r15 = r15 + 8
            int r16 = r13 >>> 8
            int r1 = r15 + r16
            if (r1 > r5) goto L_0x0102
            r1 = 15
            if (r13 < r1) goto L_0x0084
            r1 = 240(0xf0, float:3.36E-43)
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r1)
            int r1 = r13 + -15
            int r14 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r1, r3, r14)
            goto L_0x0089
        L_0x0084:
            int r1 = r13 << 4
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r1)
        L_0x0089:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r14, r13)
            int r14 = r14 + r13
        L_0x008d:
            net.jpountz.util.UnsafeUtils.writeShortLE(r3, r14, r12)
            int r14 = r14 + 2
            int r7 = r7 + 4
            int r11 = r11 + 4
            int r1 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r11, r7, r4)
            int r9 = r14 + 6
            int r11 = r1 >>> 8
            int r9 = r9 + r11
            if (r9 > r5) goto L_0x00fa
            int r7 = r7 + r1
            r9 = 15
            if (r1 < r9) goto L_0x00b6
            byte r11 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r11 = r11 | r9
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r11)
            int r1 = r1 + -15
            int r1 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r1, r3, r14)
            r10 = r1
            goto L_0x00bf
        L_0x00b6:
            byte r11 = net.jpountz.util.UnsafeUtils.readByte(r3, r10)
            r1 = r1 | r11
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r1)
            r10 = r14
        L_0x00bf:
            if (r7 <= r6) goto L_0x00c3
            r1 = r7
            goto L_0x0113
        L_0x00c3:
            int r1 = r7 + -2
            int r11 = net.jpountz.util.UnsafeUtils.readInt(r0, r1)
            int r11 = net.jpountz.lz4.LZ4Utils.hash(r11)
            net.jpountz.util.UnsafeUtils.writeInt(r8, r11, r1)
            int r1 = net.jpountz.util.UnsafeUtils.readInt(r0, r7)
            int r1 = net.jpountz.lz4.LZ4Utils.hash(r1)
            int r11 = net.jpountz.util.UnsafeUtils.readInt(r8, r1)
            net.jpountz.util.UnsafeUtils.writeInt(r8, r1, r7)
            int r12 = r7 - r11
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r12 >= r1) goto L_0x00f2
            boolean r13 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r11, r7)
            if (r13 == 0) goto L_0x00f2
            int r14 = r10 + 1
            r13 = 0
            net.jpountz.util.UnsafeUtils.writeByte(r3, r10, r13)
            goto L_0x008d
        L_0x00f2:
            int r1 = r7 + 1
            r9 = r7
            r7 = r1
            r1 = r20
            goto L_0x0035
        L_0x00fa:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x0102:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "maxDestLen is too small"
            r0.<init>(r1)
            throw r0
        L_0x010a:
            r11 = r13
            r12 = r15
            r7 = r16
            r1 = r20
            goto L_0x003a
        L_0x0112:
            r1 = r9
        L_0x0113:
            r4 = r10
            int r2 = r2 - r1
            r0 = r19
            r3 = r22
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r23
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }
}
