package org.apache.http.impl.auth;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

public abstract class AuthSchemeBase implements AuthScheme {
    private boolean proxy;

    public boolean isProxy() {
        return this.proxy;
    }

    /* access modifiers changed from: protected */
    public abstract void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException;

    public String toString() {
        return getSchemeName();
    }

    public void processChallenge(Header header) throws MalformedChallengeException {
        CharArrayBuffer charArrayBuffer;
        if (header != null) {
            String name = header.getName();
            int i = 0;
            if (name.equalsIgnoreCase("WWW-Authenticate")) {
                this.proxy = false;
            } else if (name.equalsIgnoreCase("Proxy-Authenticate")) {
                this.proxy = true;
            } else {
                StringBuilder sb = new StringBuilder("Unexpected header name: ");
                sb.append(name);
                throw new MalformedChallengeException(sb.toString());
            }
            if (header instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) header;
                charArrayBuffer = formattedHeader.getBuffer();
                i = formattedHeader.getValuePos();
            } else {
                String value = header.getValue();
                if (value != null) {
                    charArrayBuffer = new CharArrayBuffer(value.length());
                    charArrayBuffer.append(value);
                } else {
                    throw new MalformedChallengeException("Header value is null");
                }
            }
            while (i < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i2))) {
                i2++;
            }
            String substring = charArrayBuffer.substring(i, i2);
            if (substring.equalsIgnoreCase(getSchemeName())) {
                parseChallenge(charArrayBuffer, i2, charArrayBuffer.length());
                return;
            }
            StringBuilder sb2 = new StringBuilder("Invalid scheme identifier: ");
            sb2.append(substring);
            throw new MalformedChallengeException(sb2.toString());
        }
        throw new IllegalArgumentException("Header may not be null");
    }
}
