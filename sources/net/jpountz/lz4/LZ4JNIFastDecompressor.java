package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    LZ4JNIFastDecompressor() {
    }

    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i, bArr2, null, i2, i3);
        if (LZ4_decompress_fast >= 0) {
            return LZ4_decompress_fast;
        }
        StringBuilder sb = new StringBuilder("Error decoding offset ");
        sb.append(i - LZ4_decompress_fast);
        sb.append(" of input buffer");
        throw new LZ4Exception(sb.toString());
    }

    public final int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i4;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i);
        ByteBufferUtils.checkRange(byteBuffer2, i2, i3);
        if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
            if (byteBuffer.hasArray()) {
                i += byteBuffer.arrayOffset();
                bArr = byteBuffer.array();
                byteBuffer3 = null;
            } else {
                byteBuffer3 = byteBuffer;
                bArr = null;
            }
            if (byteBuffer2.hasArray()) {
                bArr2 = byteBuffer2.array();
                i4 = i2 + byteBuffer2.arrayOffset();
                byteBuffer4 = null;
            } else {
                byteBuffer4 = byteBuffer2;
                i4 = i2;
                bArr2 = null;
            }
            int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer3, i, bArr2, byteBuffer4, i4, i3);
            if (LZ4_decompress_fast >= 0) {
                return LZ4_decompress_fast;
            }
            StringBuilder sb = new StringBuilder("Error decoding offset ");
            sb.append(i - LZ4_decompress_fast);
            sb.append(" of input buffer");
            throw new LZ4Exception(sb.toString());
        }
        LZ4FastDecompressor lZ4FastDecompressor = SAFE_INSTANCE;
        if (lZ4FastDecompressor == null) {
            lZ4FastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
            SAFE_INSTANCE = lZ4FastDecompressor;
        }
        return lZ4FastDecompressor.decompress(byteBuffer, i, byteBuffer2, i2, i3);
    }
}
