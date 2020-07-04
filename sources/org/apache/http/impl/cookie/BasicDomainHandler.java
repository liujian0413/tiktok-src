package org.apache.http.impl.cookie;

import com.taobao.android.dexposed.ClassUtils;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

public class BasicDomainHandler implements CookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            setCookie.setDomain(str);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            String domain = cookie.getDomain();
            if (domain == null) {
                return false;
            }
            if (host.equals(domain)) {
                return true;
            }
            if (!domain.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(domain);
                domain = sb.toString();
            }
            if (host.endsWith(domain) || host.equals(domain.substring(1))) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            String domain = cookie.getDomain();
            if (domain == null) {
                throw new MalformedCookieException("Cookie domain may not be null");
            } else if (host.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                if (!host.endsWith(domain)) {
                    if (domain.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                        domain = domain.substring(1, domain.length());
                    }
                    if (!host.equals(domain)) {
                        StringBuilder sb = new StringBuilder("Illegal domain attribute \"");
                        sb.append(domain);
                        sb.append("\". Domain of origin: \"");
                        sb.append(host);
                        sb.append("\"");
                        throw new MalformedCookieException(sb.toString());
                    }
                }
            } else if (!host.equals(domain)) {
                StringBuilder sb2 = new StringBuilder("Illegal domain attribute \"");
                sb2.append(domain);
                sb2.append("\". Domain of origin: \"");
                sb2.append(host);
                sb2.append("\"");
                throw new MalformedCookieException(sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
