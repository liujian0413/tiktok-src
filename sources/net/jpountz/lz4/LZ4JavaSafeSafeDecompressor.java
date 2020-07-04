package net.jpountz.lz4;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JavaSafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaSafeSafeDecompressor();

    LZ4JavaSafeSafeDecompressor() {
    }

    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr3 = bArr;
        int i9 = i2;
        byte[] bArr4 = bArr2;
        int i10 = i3;
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        if (i4 != 0) {
            int i11 = i + i9;
            int i12 = i10 + i4;
            int i13 = i;
            int i14 = i10;
            while (true) {
                byte readByte = SafeUtils.readByte(bArr3, i13) & 255;
                i5 = i13 + 1;
                i6 = readByte >>> 4;
                if (i6 == 15) {
                    int i15 = -1;
                    while (true) {
                        if (i5 >= i11) {
                            break;
                        }
                        int i16 = i5 + 1;
                        byte readByte2 = SafeUtils.readByte(bArr3, i5);
                        if (readByte2 != -1) {
                            int i17 = i16;
                            i15 = readByte2;
                            i5 = i17;
                            break;
                        }
                        i6 += NormalGiftView.ALPHA_255;
                        int i18 = i16;
                        i15 = readByte2;
                        i5 = i18;
                    }
                    i6 += i15 & NormalGiftView.ALPHA_255;
                }
                i7 = i14 + i6;
                int i19 = i12 - 8;
                if (i7 > i19) {
                    break;
                }
                int i20 = i5 + i6;
                if (i20 > i11 - 8) {
                    break;
                }
                LZ4SafeUtils.wildArraycopy(bArr3, i5, bArr4, i14, i6);
                int readShortLE = SafeUtils.readShortLE(bArr3, i20);
                int i21 = i20 + 2;
                int i22 = i7 - readShortLE;
                if (i22 >= i10) {
                    int i23 = readByte & 15;
                    if (i23 == 15) {
                        int i24 = -1;
                        while (true) {
                            if (i21 >= i11) {
                                i8 = i24;
                                break;
                            }
                            int i25 = i21 + 1;
                            i8 = SafeUtils.readByte(bArr3, i21);
                            if (i8 != -1) {
                                i21 = i25;
                                break;
                            }
                            i23 += NormalGiftView.ALPHA_255;
                            i21 = i25;
                            i24 = i8;
                        }
                        i23 += i8 & NormalGiftView.ALPHA_255;
                    }
                    int i26 = i23 + 4;
                    int i27 = i7 + i26;
                    if (i27 <= i19) {
                        LZ4SafeUtils.wildIncrementalCopy(bArr4, i22, i7, i27);
                    } else if (i27 <= i12) {
                        LZ4SafeUtils.safeIncrementalCopy(bArr4, i22, i7, i26);
                    } else {
                        StringBuilder sb = new StringBuilder("Malformed input at ");
                        sb.append(i21);
                        throw new LZ4Exception(sb.toString());
                    }
                    i14 = i27;
                    i13 = i21;
                } else {
                    StringBuilder sb2 = new StringBuilder("Malformed input at ");
                    sb2.append(i21);
                    throw new LZ4Exception(sb2.toString());
                }
            }
            if (i7 > i12) {
                throw new LZ4Exception();
            } else if (i5 + i6 == i11) {
                LZ4SafeUtils.safeArraycopy(bArr3, i5, bArr4, i14, i6);
                return i7 - i10;
            } else {
                StringBuilder sb3 = new StringBuilder("Malformed input at ");
                sb3.append(i5);
                throw new LZ4Exception(sb3.toString());
            }
        } else if (i9 == 1 && SafeUtils.readByte(bArr, i) == 0) {
            return 0;
        } else {
            throw new LZ4Exception("Output buffer too small");
        }
    }

    public final int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray()) {
            ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
            ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
            ByteBufferUtils.checkRange(inNativeByteOrder, i9, i10);
            ByteBufferUtils.checkRange(inNativeByteOrder2, i11, i12);
            if (i12 != 0) {
                int i13 = i10 + i9;
                int i14 = i12 + i11;
                int i15 = i11;
                while (true) {
                    byte readByte = ByteBufferUtils.readByte(inNativeByteOrder, i9) & 255;
                    i5 = i9 + 1;
                    i6 = readByte >>> 4;
                    if (i6 == 15) {
                        int i16 = -1;
                        while (true) {
                            if (i5 >= i13) {
                                break;
                            }
                            int i17 = i5 + 1;
                            byte readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i5);
                            if (readByte2 != -1) {
                                int i18 = i17;
                                i16 = readByte2;
                                i5 = i18;
                                break;
                            }
                            i6 += NormalGiftView.ALPHA_255;
                            int i19 = i17;
                            i16 = readByte2;
                            i5 = i19;
                        }
                        i6 += i16 & NormalGiftView.ALPHA_255;
                    }
                    i7 = i15 + i6;
                    int i20 = i14 - 8;
                    if (i7 > i20) {
                        break;
                    }
                    int i21 = i5 + i6;
                    if (i21 > i13 - 8) {
                        break;
                    }
                    LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i5, inNativeByteOrder2, i15, i6);
                    int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i21);
                    int i22 = i21 + 2;
                    int i23 = i7 - readShortLE;
                    if (i23 >= i11) {
                        int i24 = readByte & 15;
                        if (i24 == 15) {
                            int i25 = -1;
                            while (true) {
                                if (i22 >= i13) {
                                    i8 = i25;
                                    break;
                                }
                                int i26 = i22 + 1;
                                i8 = ByteBufferUtils.readByte(inNativeByteOrder, i22);
                                if (i8 != -1) {
                                    i22 = i26;
                                    break;
                                }
                                i24 += NormalGiftView.ALPHA_255;
                                i22 = i26;
                                i25 = i8;
                            }
                            i24 += i8 & NormalGiftView.ALPHA_255;
                        }
                        int i27 = i24 + 4;
                        int i28 = i7 + i27;
                        if (i28 <= i20) {
                            LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i23, i7, i28);
                        } else if (i28 <= i14) {
                            LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i23, i7, i27);
                        } else {
                            StringBuilder sb = new StringBuilder("Malformed input at ");
                            sb.append(i22);
                            throw new LZ4Exception(sb.toString());
                        }
                        i15 = i28;
                        i9 = i22;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Malformed input at ");
                        sb2.append(i22);
                        throw new LZ4Exception(sb2.toString());
                    }
                }
                if (i7 > i14) {
                    throw new LZ4Exception();
                } else if (i5 + i6 == i13) {
                    LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i5, inNativeByteOrder2, i15, i6);
                    return i7 - i11;
                } else {
                    StringBuilder sb3 = new StringBuilder("Malformed input at ");
                    sb3.append(i5);
                    throw new LZ4Exception(sb3.toString());
                }
            } else if (i10 == 1 && ByteBufferUtils.readByte(inNativeByteOrder, i9) == 0) {
                return 0;
            } else {
                throw new LZ4Exception("Output buffer too small");
            }
        } else {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i9, i2, byteBuffer2.array(), i11 + byteBuffer2.arrayOffset(), i4);
        }
    }
}
