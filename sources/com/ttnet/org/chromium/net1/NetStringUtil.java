package com.ttnet.org.chromium.net1;

import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;
import java.text.Normalizer.Form;

@JNINamespace("net::android")
public class NetStringUtil {
    private static String convertToUnicodeAndNormalize(ByteBuffer byteBuffer, String str) {
        String convertToUnicode = convertToUnicode(byteBuffer, str);
        if (convertToUnicode == null) {
            return null;
        }
        return Normalizer.normalize(convertToUnicode, Form.NFC);
    }

    private static String convertToUnicode(ByteBuffer byteBuffer, String str) {
        try {
            return Charset.forName(str).newDecoder().decode(byteBuffer).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String convertToUnicodeWithSubstitutions(ByteBuffer byteBuffer, String str) {
        try {
            CharsetDecoder newDecoder = Charset.forName(str).newDecoder();
            newDecoder.onMalformedInput(CodingErrorAction.REPLACE);
            newDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            newDecoder.replaceWith("�");
            return newDecoder.decode(byteBuffer).toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
