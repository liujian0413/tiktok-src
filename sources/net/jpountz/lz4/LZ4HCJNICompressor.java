package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    LZ4HCJNICompressor() {
        this(9);
    }

    LZ4HCJNICompressor(int i) {
        this.compressionLevel = i;
    }

    public final int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i, i2, bArr2, null, i3, i4, this.compressionLevel);
        if (LZ4_compressHC > 0) {
            return LZ4_compressHC;
        }
        throw new LZ4Exception();
    }

    public final int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i6;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i, i2);
        ByteBufferUtils.checkRange(byteBuffer2, i3, i4);
        if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
                byteBuffer3 = null;
                i5 = byteBuffer.arrayOffset() + i;
            } else {
                byteBuffer3 = byteBuffer;
                i5 = i;
                bArr = null;
            }
            if (byteBuffer2.hasArray()) {
                bArr2 = byteBuffer2.array();
                byteBuffer4 = null;
                i6 = i3 + byteBuffer2.arrayOffset();
            } else {
                byteBuffer4 = byteBuffer2;
                i6 = i3;
                bArr2 = null;
            }
            int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, byteBuffer3, i5, i2, bArr2, byteBuffer4, i6, i4, this.compressionLevel);
            if (LZ4_compressHC > 0) {
                return LZ4_compressHC;
            }
            throw new LZ4Exception();
        }
        LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
        if (lZ4Compressor == null) {
            lZ4Compressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
            SAFE_INSTANCE = lZ4Compressor;
        }
        return lZ4Compressor.compress(byteBuffer, i, i2, byteBuffer2, i3, i4);
    }
}
