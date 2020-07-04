package org.apache.http.impl.cookie;

import com.taobao.android.dexposed.ClassUtils;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;

public class NetscapeDomainHandler extends BasicDomainHandler {
    private static boolean isSpecialDomain(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT")) {
            return true;
        }
        return false;
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
            return host.endsWith(domain);
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        super.validate(cookie, cookieOrigin);
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (host.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            int countTokens = new StringTokenizer(domain, ClassUtils.PACKAGE_SEPARATOR).countTokens();
            if (isSpecialDomain(domain)) {
                if (countTokens < 2) {
                    StringBuilder sb = new StringBuilder("Domain attribute \"");
                    sb.append(domain);
                    sb.append("\" violates the Netscape cookie specification for special domains");
                    throw new MalformedCookieException(sb.toString());
                }
            } else if (countTokens < 3) {
                StringBuilder sb2 = new StringBuilder("Domain attribute \"");
                sb2.append(domain);
                sb2.append("\" violates the Netscape cookie specification");
                throw new MalformedCookieException(sb2.toString());
            }
        }
    }
}
