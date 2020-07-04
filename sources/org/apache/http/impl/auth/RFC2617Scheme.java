package org.apache.http.impl.auth;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HeaderElement;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

public abstract class RFC2617Scheme extends AuthSchemeBase {
    private Map<String, String> params;

    public String getRealm() {
        return getParameter("realm");
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getParameters() {
        if (this.params == null) {
            this.params = new HashMap();
        }
        return this.params;
    }

    public String getParameter(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Parameter name may not be null");
        } else if (this.params == null) {
            return null;
        } else {
            return (String) this.params.get(str.toLowerCase(Locale.ENGLISH));
        }
    }

    /* access modifiers changed from: protected */
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException {
        HeaderElement[] parseElements = BasicHeaderValueParser.DEFAULT.parseElements(charArrayBuffer, new ParserCursor(i, charArrayBuffer.length()));
        if (parseElements.length != 0) {
            this.params = new HashMap(parseElements.length);
            for (HeaderElement headerElement : parseElements) {
                this.params.put(headerElement.getName(), headerElement.getValue());
            }
            return;
        }
        throw new MalformedChallengeException("Authentication challenge is empty");
    }
}
