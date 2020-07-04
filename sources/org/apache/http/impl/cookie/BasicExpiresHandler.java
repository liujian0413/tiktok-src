package org.apache.http.impl.cookie;

import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

public class BasicExpiresHandler extends AbstractCookieAttributeHandler {
    private final String[] datepatterns;

    public BasicExpiresHandler(String[] strArr) {
        if (strArr != null) {
            this.datepatterns = strArr;
            return;
        }
        throw new IllegalArgumentException("Array of date patterns may not be null");
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                setCookie.setExpiryDate(DateUtils.parseDate(str, this.datepatterns));
            } catch (DateParseException unused) {
                StringBuilder sb = new StringBuilder("Unable to parse expires attribute: ");
                sb.append(str);
                throw new MalformedCookieException(sb.toString());
            }
        } else {
            throw new MalformedCookieException("Missing value for expires attribute");
        }
    }
}
