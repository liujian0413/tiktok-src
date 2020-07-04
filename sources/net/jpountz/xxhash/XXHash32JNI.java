package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash32JNI extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JNI();
    private static XXHash32 SAFE_INSTANCE;

    XXHash32JNI() {
    }

    public final int hash(byte[] bArr, int i, int i2, int i3) {
        SafeUtils.checkRange(bArr, i, i2);
        return XXHashJNI.XXH32(bArr, i, i2, i3);
    }

    public final int hash(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i, i2);
            return XXHashJNI.XXH32BB(byteBuffer, i, i2, i3);
        } else if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i + byteBuffer.arrayOffset(), i2, i3);
        } else {
            XXHash32 xXHash32 = SAFE_INSTANCE;
            if (xXHash32 == null) {
                xXHash32 = XXHashFactory.safeInstance().hash32();
                SAFE_INSTANCE = xXHash32;
            }
            return xXHash32.hash(byteBuffer, i, i2, i3);
        }
    }
}
