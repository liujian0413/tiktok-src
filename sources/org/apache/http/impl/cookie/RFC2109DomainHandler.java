package org.apache.http.impl.cookie;

import com.taobao.android.dexposed.ClassUtils;
import java.util.Locale;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

public class RFC2109DomainHandler implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            String domain = cookie.getDomain();
            if (domain == null) {
                return false;
            }
            if (host.equals(domain) || (domain.startsWith(ClassUtils.PACKAGE_SEPARATOR) && host.endsWith(domain))) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

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

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            String domain = cookie.getDomain();
            if (domain == null) {
                throw new MalformedCookieException("Cookie domain may not be null");
            } else if (domain.equals(host)) {
            } else {
                if (domain.indexOf(46) == -1) {
                    StringBuilder sb = new StringBuilder("Domain attribute \"");
                    sb.append(domain);
                    sb.append("\" does not match the host \"");
                    sb.append(host);
                    sb.append("\"");
                    throw new MalformedCookieException(sb.toString());
                } else if (domain.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                    int indexOf = domain.indexOf(46, 1);
                    if (indexOf < 0 || indexOf == domain.length() - 1) {
                        StringBuilder sb2 = new StringBuilder("Domain attribute \"");
                        sb2.append(domain);
                        sb2.append("\" violates RFC 2109: domain must contain an embedded dot");
                        throw new MalformedCookieException(sb2.toString());
                    }
                    String lowerCase = host.toLowerCase(Locale.ENGLISH);
                    if (!lowerCase.endsWith(domain)) {
                        StringBuilder sb3 = new StringBuilder("Illegal domain attribute \"");
                        sb3.append(domain);
                        sb3.append("\". Domain of origin: \"");
                        sb3.append(lowerCase);
                        sb3.append("\"");
                        throw new MalformedCookieException(sb3.toString());
                    } else if (lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) != -1) {
                        StringBuilder sb4 = new StringBuilder("Domain attribute \"");
                        sb4.append(domain);
                        sb4.append("\" violates RFC 2109: host minus domain may not contain any dots");
                        throw new MalformedCookieException(sb4.toString());
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder("Domain attribute \"");
                    sb5.append(domain);
                    sb5.append("\" violates RFC 2109: domain must start with a dot");
                    throw new MalformedCookieException(sb5.toString());
                }
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
