package org.apache.http.impl.cookie;

import com.taobao.android.dexposed.ClassUtils;
import java.util.Locale;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

public class RFC2965DomainAttributeHandler implements CookieAttributeHandler {
    public boolean domainMatch(String str, String str2) {
        if (str.equals(str2) || (str2.startsWith(ClassUtils.PACKAGE_SEPARATOR) && str.endsWith(str2))) {
            return true;
        }
        return false;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String lowerCase = cookieOrigin.getHost().toLowerCase(Locale.ENGLISH);
            String domain = cookie.getDomain();
            if (domainMatch(lowerCase, domain) && lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1) {
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
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (!lowerCase.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(lowerCase);
                lowerCase = sb.toString();
            }
            setCookie.setDomain(lowerCase);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String lowerCase = cookieOrigin.getHost().toLowerCase(Locale.ENGLISH);
            if (cookie.getDomain() != null) {
                String lowerCase2 = cookie.getDomain().toLowerCase(Locale.ENGLISH);
                if (!(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute("domain")) {
                    if (!cookie.getDomain().equals(lowerCase)) {
                        StringBuilder sb = new StringBuilder("Illegal domain attribute: \"");
                        sb.append(cookie.getDomain());
                        sb.append("\".Domain of origin: \"");
                        sb.append(lowerCase);
                        sb.append("\"");
                        throw new MalformedCookieException(sb.toString());
                    }
                } else if (lowerCase2.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                    int indexOf = lowerCase2.indexOf(46, 1);
                    if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                        StringBuilder sb2 = new StringBuilder("Domain attribute \"");
                        sb2.append(cookie.getDomain());
                        sb2.append("\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
                        throw new MalformedCookieException(sb2.toString());
                    } else if (!domainMatch(lowerCase, lowerCase2)) {
                        StringBuilder sb3 = new StringBuilder("Domain attribute \"");
                        sb3.append(cookie.getDomain());
                        sb3.append("\" violates RFC 2965: effective host name does not domain-match domain attribute.");
                        throw new MalformedCookieException(sb3.toString());
                    } else if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) != -1) {
                        StringBuilder sb4 = new StringBuilder("Domain attribute \"");
                        sb4.append(cookie.getDomain());
                        sb4.append("\" violates RFC 2965: effective host minus domain may not contain any dots");
                        throw new MalformedCookieException(sb4.toString());
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder("Domain attribute \"");
                    sb5.append(cookie.getDomain());
                    sb5.append("\" violates RFC 2109: domain must start with a dot");
                    throw new MalformedCookieException(sb5.toString());
                }
            } else {
                throw new MalformedCookieException("Invalid cookie state: domain not specified");
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
