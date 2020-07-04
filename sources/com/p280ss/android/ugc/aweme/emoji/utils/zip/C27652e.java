package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.e */
final class C27652e implements C27664p {

    /* renamed from: a */
    private final String f72852a;

    C27652e() {
    }

    /* renamed from: a */
    public final boolean mo71054a(String str) {
        return true;
    }

    C27652e(String str) {
        this.f72852a = str;
    }

    /* renamed from: a */
    public final String mo71053a(byte[] bArr) throws IOException {
        if (this.f72852a == null) {
            return new String(bArr);
        }
        return new String(bArr, this.f72852a);
    }

    /* renamed from: b */
    public final ByteBuffer mo71055b(String str) throws IOException {
        if (this.f72852a == null) {
            return ByteBuffer.wrap(str.getBytes());
        }
        return ByteBuffer.wrap(str.getBytes(this.f72852a));
    }
}
