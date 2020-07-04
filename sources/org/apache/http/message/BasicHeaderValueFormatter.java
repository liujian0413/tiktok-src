package org.apache.http.message;

import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;

public class BasicHeaderValueFormatter {
    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();

    /* access modifiers changed from: protected */
    public boolean isSeparator(char c) {
        if (" ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isUnsafe(char c) {
        if ("\"\\".indexOf(c) >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int estimateNameValuePairLen(NameValuePair nameValuePair) {
        if (nameValuePair == null) {
            return 0;
        }
        int length = nameValuePair.getName().length();
        String value = nameValuePair.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        return length;
    }

    public CharArrayBuffer formatNameValuePair(CharArrayBuffer charArrayBuffer, NameValuePair nameValuePair, boolean z) {
        if (nameValuePair != null) {
            int estimateNameValuePairLen = estimateNameValuePairLen(nameValuePair);
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(estimateNameValuePairLen);
            } else {
                charArrayBuffer.ensureCapacity(estimateNameValuePairLen);
            }
            charArrayBuffer.append(nameValuePair.getName());
            String value = nameValuePair.getValue();
            if (value != null) {
                charArrayBuffer.append('=');
                doFormatValue(charArrayBuffer, value, z);
            }
            return charArrayBuffer;
        }
        throw new IllegalArgumentException("NameValuePair must not be null.");
    }

    /* access modifiers changed from: protected */
    public void doFormatValue(CharArrayBuffer charArrayBuffer, String str, boolean z) {
        if (!z) {
            boolean z2 = z;
            for (int i = 0; i < str.length() && !z2; i++) {
                z2 = isSeparator(str.charAt(i));
            }
            z = z2;
        }
        if (z) {
            charArrayBuffer.append('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (isUnsafe(charAt)) {
                charArrayBuffer.append('\\');
            }
            charArrayBuffer.append(charAt);
        }
        if (z) {
            charArrayBuffer.append('\"');
        }
    }
}
