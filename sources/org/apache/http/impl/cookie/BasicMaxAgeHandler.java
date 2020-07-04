package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    setCookie.setExpiryDate(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
                    return;
                }
                StringBuilder sb = new StringBuilder("Negative max-age attribute: ");
                sb.append(str);
                throw new MalformedCookieException(sb.toString());
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder("Invalid max-age attribute: ");
                sb2.append(str);
                throw new MalformedCookieException(sb2.toString());
            }
        } else {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
    }
}
