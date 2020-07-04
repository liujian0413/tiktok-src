package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    LZ4JNISafeDecompressor() {
    }

    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i, i2, bArr2, null, i3, i4);
        if (LZ4_decompress_safe >= 0) {
            return LZ4_decompress_safe;
        }
        StringBuilder sb = new StringBuilder("Error decoding offset ");
        sb.append(i - LZ4_decompress_safe);
        sb.append(" of input buffer");
        throw new LZ4Exception(sb.toString());
    }

    public final int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i5;
        int i6;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i, i2);
        ByteBufferUtils.checkRange(byteBuffer2, i3, i4);
        if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
            if (byteBuffer.hasArray()) {
                i5 = byteBuffer.arrayOffset() + i;
                bArr = byteBuffer.array();
                byteBuffer3 = null;
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
            int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i5, i2, bArr2, byteBuffer4, i6, i4);
            if (LZ4_decompress_safe >= 0) {
                return LZ4_decompress_safe;
            }
            StringBuilder sb = new StringBuilder("Error decoding offset ");
            sb.append(i5 - LZ4_decompress_safe);
            sb.append(" of input buffer");
            throw new LZ4Exception(sb.toString());
        }
        LZ4SafeDecompressor lZ4SafeDecompressor = SAFE_INSTANCE;
        if (lZ4SafeDecompressor == null) {
            lZ4SafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
            SAFE_INSTANCE = lZ4SafeDecompressor;
        }
        return lZ4SafeDecompressor.decompress(byteBuffer, i, i2, byteBuffer2, i3, i4);
    }
}
