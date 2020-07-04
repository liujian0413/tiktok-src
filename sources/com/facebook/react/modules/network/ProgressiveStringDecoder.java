package com.facebook.react.modules.network;

import com.facebook.common.p686c.C13286a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ProgressiveStringDecoder {
    private final CharsetDecoder mDecoder;
    private byte[] remainder;

    public ProgressiveStringDecoder(Charset charset) {
        this.mDecoder = charset.newDecoder();
    }

    public String decodeNext(byte[] bArr, int i) {
        if (this.remainder != null) {
            byte[] bArr2 = new byte[(this.remainder.length + i)];
            System.arraycopy(this.remainder, 0, bArr2, 0, this.remainder.length);
            System.arraycopy(bArr, 0, bArr2, this.remainder.length, i);
            i += this.remainder.length;
            bArr = bArr2;
        }
        boolean z = true;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.mDecoder.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z2 || i2 <= 0) {
            z = false;
        }
        if (z) {
            this.remainder = new byte[i2];
            System.arraycopy(bArr, i - i2, this.remainder, 0, i2);
        } else {
            this.remainder = null;
        }
        if (z2) {
            return new String(charBuffer.array(), 0, charBuffer.length());
        }
        C13286a.m38860c("ReactNative", "failed to decode string from byte array");
        return "";
    }
}
