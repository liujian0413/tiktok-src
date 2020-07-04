package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractAuthenticationHandler implements AuthenticationHandler {
    private static final List<String> DEFAULT_SCHEME_PRIORITY = Collections.unmodifiableList(Arrays.asList(new String[]{"ntlm", "digest", "basic"}));
    private final Log log = LogFactory.getLog(getClass());

    /* access modifiers changed from: protected */
    public List<String> getAuthPreferences() {
        return DEFAULT_SCHEME_PRIORITY;
    }

    /* access modifiers changed from: protected */
    public Map<String, Header> parseChallenges(Header[] headerArr) throws MalformedChallengeException {
        CharArrayBuffer charArrayBuffer;
        int i;
        HashMap hashMap = new HashMap(headerArr.length);
        for (Header header : headerArr) {
            if (header instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) header;
                charArrayBuffer = formattedHeader.getBuffer();
                i = formattedHeader.getValuePos();
            } else {
                String value = header.getValue();
                if (value != null) {
                    charArrayBuffer = new CharArrayBuffer(value.length());
                    charArrayBuffer.append(value);
                    i = 0;
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
            hashMap.put(charArrayBuffer.substring(i, i2).toLowerCase(Locale.ENGLISH), header);
        }
        return hashMap;
    }

    public AuthScheme selectScheme(Map<String, Header> map, HttpResponse httpResponse, HttpContext httpContext) throws AuthenticationException {
        AuthSchemeRegistry authSchemeRegistry = (AuthSchemeRegistry) httpContext.getAttribute("http.authscheme-registry");
        if (authSchemeRegistry != null) {
            Collection collection = (Collection) httpContext.getAttribute("http.auth.scheme-pref");
            if (collection == null) {
                collection = getAuthPreferences();
            }
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                StringBuilder sb = new StringBuilder("Authentication schemes in the order of preference: ");
                sb.append(collection);
                log2.debug(sb.toString());
            }
            AuthScheme authScheme = null;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (((Header) map.get(str.toLowerCase(Locale.ENGLISH))) != null) {
                    if (this.log.isDebugEnabled()) {
                        Log log3 = this.log;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" authentication scheme selected");
                        log3.debug(sb2.toString());
                    }
                    try {
                        authScheme = authSchemeRegistry.getAuthScheme(str, httpResponse.getParams());
                        break;
                    } catch (IllegalStateException unused) {
                        if (this.log.isWarnEnabled()) {
                            Log log4 = this.log;
                            StringBuilder sb3 = new StringBuilder("Authentication scheme ");
                            sb3.append(str);
                            sb3.append(" not supported");
                            log4.warn(sb3.toString());
                        }
                    }
                } else if (this.log.isDebugEnabled()) {
                    Log log5 = this.log;
                    StringBuilder sb4 = new StringBuilder("Challenge for ");
                    sb4.append(str);
                    sb4.append(" authentication scheme not available");
                    log5.debug(sb4.toString());
                }
            }
            if (authScheme != null) {
                return authScheme;
            }
            StringBuilder sb5 = new StringBuilder("Unable to respond to any of these challenges: ");
            sb5.append(map);
            throw new AuthenticationException(sb5.toString());
        }
        throw new IllegalStateException("AuthScheme registry not set in HTTP context");
    }
}
