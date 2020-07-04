package org.apache.http.client.protocol;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;

public class ResponseProcessCookies implements HttpResponseInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpContext != null) {
            CookieSpec cookieSpec = (CookieSpec) httpContext.getAttribute("http.cookie-spec");
            if (cookieSpec != null) {
                CookieStore cookieStore = (CookieStore) httpContext.getAttribute("http.cookie-store");
                if (cookieStore == null) {
                    this.log.info("CookieStore not available in HTTP context");
                    return;
                }
                CookieOrigin cookieOrigin = (CookieOrigin) httpContext.getAttribute("http.cookie-origin");
                if (cookieOrigin == null) {
                    this.log.info("CookieOrigin not available in HTTP context");
                    return;
                }
                processCookies(httpResponse.headerIterator("Set-Cookie"), cookieSpec, cookieOrigin, cookieStore);
                if (cookieSpec.getVersion() > 0) {
                    processCookies(httpResponse.headerIterator("Set-Cookie2"), cookieSpec, cookieOrigin, cookieStore);
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    private void processCookies(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            Header nextHeader = headerIterator.nextHeader();
            try {
                for (Cookie cookie : cookieSpec.parse(nextHeader, cookieOrigin)) {
                    try {
                        cookieSpec.validate(cookie, cookieOrigin);
                        cookieStore.addCookie(cookie);
                        if (this.log.isDebugEnabled()) {
                            Log log2 = this.log;
                            StringBuilder sb = new StringBuilder("Cookie accepted: \"");
                            sb.append(cookie);
                            sb.append("\". ");
                            log2.debug(sb.toString());
                        }
                    } catch (MalformedCookieException e) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            StringBuilder sb2 = new StringBuilder("Cookie rejected: \"");
                            sb2.append(cookie);
                            sb2.append("\". ");
                            sb2.append(e.getMessage());
                            log3.warn(sb2.toString());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (this.log.isWarnEnabled()) {
                    Log log4 = this.log;
                    StringBuilder sb3 = new StringBuilder("Invalid cookie header: \"");
                    sb3.append(nextHeader);
                    sb3.append("\". ");
                    sb3.append(e2.getMessage());
                    log4.warn(sb3.toString());
                }
            }
        }
    }
}
