package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.h */
final class C27655h implements C27664p {

    /* renamed from: a */
    private final Charset f72861a;

    C27655h(Charset charset) {
        this.f72861a = charset;
    }

    /* renamed from: a */
    public final String mo71053a(byte[] bArr) throws IOException {
        return this.f72861a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
    }

    /* renamed from: a */
    public final boolean mo71054a(String str) {
        CharsetEncoder newEncoder = this.f72861a.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return newEncoder.canEncode(str);
    }

    /* renamed from: b */
    public final ByteBuffer mo71055b(String str) {
        CharsetEncoder newEncoder = this.f72861a.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        CharBuffer wrap = CharBuffer.wrap(str);
        ByteBuffer allocate = ByteBuffer.allocate(str.length() + ((str.length() + 1) / 2));
        while (true) {
            if (wrap.remaining() <= 0) {
                break;
            }
            CoderResult encode = newEncoder.encode(wrap, allocate, true);
            if (encode.isUnmappable() || encode.isMalformed()) {
                if (encode.length() * 6 > allocate.remaining()) {
                    allocate = C27665q.m90721a(allocate, allocate.position() + (encode.length() * 6));
                }
                for (int i = 0; i < encode.length(); i++) {
                    C27665q.m90722a(allocate, wrap.get());
                }
            } else if (encode.isOverflow()) {
                allocate = C27665q.m90721a(allocate, 0);
            } else if (encode.isUnderflow()) {
                newEncoder.flush(allocate);
                break;
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }
}
