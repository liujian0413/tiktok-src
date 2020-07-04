package org.apache.http.impl.cookie;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

public class RFC2109VersionHandler extends AbstractCookieAttributeHandler {
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookie.getVersion() < 0) {
            throw new MalformedCookieException("Cookie version may not be negative");
        }
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        } else if (str.trim().length() != 0) {
            try {
                setCookie.setVersion(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("Invalid version: ");
                sb.append(e.getMessage());
                throw new MalformedCookieException(sb.toString());
            }
        } else {
            throw new MalformedCookieException("Blank value for version attribute");
        }
    }
}
