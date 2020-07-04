package net.jpountz.lz4;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    LZ4JavaUnsafeFastDecompressor() {
    }

    public final int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte readByte;
        int i5;
        byte readByte2;
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray()) {
            ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
            ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
            ByteBufferUtils.checkRange(inNativeByteOrder, i);
            ByteBufferUtils.checkRange(inNativeByteOrder2, i2, i3);
            if (i3 != 0) {
                int i6 = i3 + i2;
                int i7 = i;
                int i8 = i2;
                while (true) {
                    byte readByte3 = ByteBufferUtils.readByte(inNativeByteOrder, i7) & 255;
                    int i9 = i7 + 1;
                    int i10 = readByte3 >>> 4;
                    if (i10 == 15) {
                        while (true) {
                            i5 = i9 + 1;
                            readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i9);
                            if (readByte2 != -1) {
                                break;
                            }
                            i10 += NormalGiftView.ALPHA_255;
                            i9 = i5;
                        }
                        i10 += readByte2 & 255;
                        i9 = i5;
                    }
                    int i11 = i8 + i10;
                    int i12 = i6 - 8;
                    if (i11 <= i12) {
                        LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i9, inNativeByteOrder2, i8, i10);
                        int i13 = i9 + i10;
                        int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i13);
                        i7 = i13 + 2;
                        int i14 = i11 - readShortLE;
                        if (i14 >= i2) {
                            int i15 = readByte3 & 15;
                            if (i15 == 15) {
                                while (true) {
                                    i4 = i7 + 1;
                                    readByte = ByteBufferUtils.readByte(inNativeByteOrder, i7);
                                    if (readByte != -1) {
                                        break;
                                    }
                                    i15 += NormalGiftView.ALPHA_255;
                                    i7 = i4;
                                }
                                i15 += readByte & 255;
                                i7 = i4;
                            }
                            int i16 = i15 + 4;
                            int i17 = i11 + i16;
                            if (i17 <= i12) {
                                LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i14, i11, i17);
                            } else if (i17 <= i6) {
                                LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i14, i11, i16);
                            } else {
                                StringBuilder sb = new StringBuilder("Malformed input at ");
                                sb.append(i7);
                                throw new LZ4Exception(sb.toString());
                            }
                            i8 = i17;
                        } else {
                            StringBuilder sb2 = new StringBuilder("Malformed input at ");
                            sb2.append(i7);
                            throw new LZ4Exception(sb2.toString());
                        }
                    } else if (i11 == i6) {
                        LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i9, inNativeByteOrder2, i8, i10);
                        return (i9 + i10) - i;
                    } else {
                        StringBuilder sb3 = new StringBuilder("Malformed input at ");
                        sb3.append(i9);
                        throw new LZ4Exception(sb3.toString());
                    }
                }
            } else if (ByteBufferUtils.readByte(inNativeByteOrder, i) == 0) {
                return 1;
            } else {
                StringBuilder sb4 = new StringBuilder("Malformed input at ");
                sb4.append(i);
                throw new LZ4Exception(sb4.toString());
            }
        } else {
            return decompress(byteBuffer.array(), i + byteBuffer.arrayOffset(), byteBuffer2.array(), i2 + byteBuffer2.arrayOffset(), i3);
        }
    }

    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte readByte;
        int i5;
        byte readByte2;
        UnsafeUtils.checkRange(bArr, i);
        UnsafeUtils.checkRange(bArr2, i2, i3);
        if (i3 != 0) {
            int i6 = i3 + i2;
            int i7 = i;
            int i8 = i2;
            while (true) {
                byte readByte3 = UnsafeUtils.readByte(bArr, i7) & 255;
                int i9 = i7 + 1;
                int i10 = readByte3 >>> 4;
                if (i10 == 15) {
                    while (true) {
                        i5 = i9 + 1;
                        readByte2 = UnsafeUtils.readByte(bArr, i9);
                        if (readByte2 != -1) {
                            break;
                        }
                        i10 += NormalGiftView.ALPHA_255;
                        i9 = i5;
                    }
                    i10 += readByte2 & 255;
                    i9 = i5;
                }
                int i11 = i8 + i10;
                int i12 = i6 - 8;
                if (i11 <= i12) {
                    LZ4UnsafeUtils.wildArraycopy(bArr, i9, bArr2, i8, i10);
                    int i13 = i9 + i10;
                    int readShortLE = UnsafeUtils.readShortLE(bArr, i13);
                    i7 = i13 + 2;
                    int i14 = i11 - readShortLE;
                    if (i14 >= i2) {
                        int i15 = readByte3 & 15;
                        if (i15 == 15) {
                            while (true) {
                                i4 = i7 + 1;
                                readByte = UnsafeUtils.readByte(bArr, i7);
                                if (readByte != -1) {
                                    break;
                                }
                                i15 += NormalGiftView.ALPHA_255;
                                i7 = i4;
                            }
                            i15 += readByte & 255;
                            i7 = i4;
                        }
                        int i16 = i15 + 4;
                        int i17 = i11 + i16;
                        if (i17 <= i12) {
                            LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i14, i11, i17);
                        } else if (i17 <= i6) {
                            LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i14, i11, i16);
                        } else {
                            StringBuilder sb = new StringBuilder("Malformed input at ");
                            sb.append(i7);
                            throw new LZ4Exception(sb.toString());
                        }
                        i8 = i17;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Malformed input at ");
                        sb2.append(i7);
                        throw new LZ4Exception(sb2.toString());
                    }
                } else if (i11 == i6) {
                    LZ4UnsafeUtils.safeArraycopy(bArr, i9, bArr2, i8, i10);
                    return (i9 + i10) - i;
                } else {
                    StringBuilder sb3 = new StringBuilder("Malformed input at ");
                    sb3.append(i9);
                    throw new LZ4Exception(sb3.toString());
                }
            }
        } else if (UnsafeUtils.readByte(bArr, i) == 0) {
            return 1;
        } else {
            StringBuilder sb4 = new StringBuilder("Malformed input at ");
            sb4.append(i);
            throw new LZ4Exception(sb4.toString());
        }
    }
}
