package org.apache.http.client.protocol;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.ProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.protocol.HttpContext;

public class RequestAddCookies implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        URI uri;
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            CookieStore cookieStore = (CookieStore) httpContext.getAttribute("http.cookie-store");
            if (cookieStore == null) {
                this.log.info("Cookie store not available in HTTP context");
                return;
            }
            CookieSpecRegistry cookieSpecRegistry = (CookieSpecRegistry) httpContext.getAttribute("http.cookiespec-registry");
            if (cookieSpecRegistry == null) {
                this.log.info("CookieSpec registry not available in HTTP context");
                return;
            }
            HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
            if (httpHost != null) {
                ManagedClientConnection managedClientConnection = (ManagedClientConnection) httpContext.getAttribute("http.connection");
                if (managedClientConnection != null) {
                    String cookiePolicy = HttpClientParams.getCookiePolicy(httpRequest.getParams());
                    if (this.log.isDebugEnabled()) {
                        Log log2 = this.log;
                        StringBuilder sb = new StringBuilder("CookieSpec selected: ");
                        sb.append(cookiePolicy);
                        log2.debug(sb.toString());
                    }
                    if (httpRequest instanceof HttpUriRequest) {
                        uri = ((HttpUriRequest) httpRequest).getURI();
                    } else {
                        try {
                            uri = new URI(httpRequest.getRequestLine().getUri());
                        } catch (URISyntaxException e) {
                            StringBuilder sb2 = new StringBuilder("Invalid request URI: ");
                            sb2.append(httpRequest.getRequestLine().getUri());
                            throw new ProtocolException(sb2.toString(), e);
                        }
                    }
                    String hostName = httpHost.getHostName();
                    int port = httpHost.getPort();
                    if (port < 0) {
                        SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute("http.scheme-registry");
                        if (schemeRegistry != null) {
                            port = schemeRegistry.get(httpHost.getSchemeName()).resolvePort(port);
                        } else {
                            port = managedClientConnection.getRemotePort();
                        }
                    }
                    CookieOrigin cookieOrigin = new CookieOrigin(hostName, port, uri.getPath(), managedClientConnection.isSecure());
                    CookieSpec cookieSpec = cookieSpecRegistry.getCookieSpec(cookiePolicy, httpRequest.getParams());
                    ArrayList<Cookie> arrayList = new ArrayList<>(cookieStore.getCookies());
                    ArrayList<Cookie> arrayList2 = new ArrayList<>();
                    Date date = new Date();
                    for (Cookie cookie : arrayList) {
                        if (!cookie.isExpired(date)) {
                            if (cookieSpec.match(cookie, cookieOrigin)) {
                                if (this.log.isDebugEnabled()) {
                                    Log log3 = this.log;
                                    StringBuilder sb3 = new StringBuilder("Cookie ");
                                    sb3.append(cookie);
                                    sb3.append(" match ");
                                    sb3.append(cookieOrigin);
                                    log3.debug(sb3.toString());
                                }
                                arrayList2.add(cookie);
                            }
                        } else if (this.log.isDebugEnabled()) {
                            Log log4 = this.log;
                            StringBuilder sb4 = new StringBuilder("Cookie ");
                            sb4.append(cookie);
                            sb4.append(" expired");
                            log4.debug(sb4.toString());
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        for (Header addHeader : cookieSpec.formatCookies(arrayList2)) {
                            httpRequest.addHeader(addHeader);
                        }
                    }
                    int version = cookieSpec.getVersion();
                    if (version > 0) {
                        boolean z = false;
                        for (Cookie cookie2 : arrayList2) {
                            if (version != cookie2.getVersion() || !(cookie2 instanceof SetCookie2)) {
                                z = true;
                            }
                        }
                        if (z) {
                            Header versionHeader = cookieSpec.getVersionHeader();
                            if (versionHeader != null) {
                                httpRequest.addHeader(versionHeader);
                            }
                        }
                    }
                    httpContext.setAttribute("http.cookie-spec", cookieSpec);
                    httpContext.setAttribute("http.cookie-origin", cookieOrigin);
                    return;
                }
                throw new IllegalStateException("Client connection not specified in HTTP context");
            }
            throw new IllegalStateException("Target host not specified in HTTP context");
        }
    }
}
