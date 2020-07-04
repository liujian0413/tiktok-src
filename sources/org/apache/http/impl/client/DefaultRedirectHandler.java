package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class DefaultRedirectHandler implements RedirectHandler {
    private final Log log = LogFactory.getLog(getClass());

    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse != null) {
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != 307) {
                switch (statusCode) {
                    case 301:
                    case 302:
                        break;
                    case 303:
                        return true;
                    default:
                        return false;
                }
            }
            String method = ((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getMethod();
            if (method.equalsIgnoreCase("GET") || method.equalsIgnoreCase("HEAD")) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    public URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        URI uri;
        if (httpResponse != null) {
            Header firstHeader = httpResponse.getFirstHeader("location");
            if (firstHeader != null) {
                String value = firstHeader.getValue();
                if (this.log.isDebugEnabled()) {
                    Log log2 = this.log;
                    StringBuilder sb = new StringBuilder("Redirect requested to location '");
                    sb.append(value);
                    sb.append("'");
                    log2.debug(sb.toString());
                }
                try {
                    URI uri2 = new URI(value);
                    HttpParams params = httpResponse.getParams();
                    if (!uri2.isAbsolute()) {
                        if (!params.isParameterTrue("http.protocol.reject-relative-redirect")) {
                            HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
                            if (httpHost != null) {
                                try {
                                    uri2 = URIUtils.resolve(URIUtils.rewriteURI(new URI(((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getUri()), httpHost, true), uri2);
                                } catch (URISyntaxException e) {
                                    throw new ProtocolException(e.getMessage(), e);
                                }
                            } else {
                                throw new IllegalStateException("Target host not available in the HTTP context");
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Relative redirect location '");
                            sb2.append(uri2);
                            sb2.append("' not allowed");
                            throw new ProtocolException(sb2.toString());
                        }
                    }
                    if (params.isParameterFalse("http.protocol.allow-circular-redirects")) {
                        RedirectLocations redirectLocations = (RedirectLocations) httpContext.getAttribute("http.protocol.redirect-locations");
                        if (redirectLocations == null) {
                            redirectLocations = new RedirectLocations();
                            httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations);
                        }
                        if (uri2.getFragment() != null) {
                            try {
                                uri = URIUtils.rewriteURI(uri2, new HttpHost(uri2.getHost(), uri2.getPort(), uri2.getScheme()), true);
                            } catch (URISyntaxException e2) {
                                throw new ProtocolException(e2.getMessage(), e2);
                            }
                        } else {
                            uri = uri2;
                        }
                        if (!redirectLocations.contains(uri)) {
                            redirectLocations.add(uri);
                        } else {
                            StringBuilder sb3 = new StringBuilder("Circular redirect to '");
                            sb3.append(uri);
                            sb3.append("'");
                            throw new CircularRedirectException(sb3.toString());
                        }
                    }
                    return uri2;
                } catch (URISyntaxException e3) {
                    StringBuilder sb4 = new StringBuilder("Invalid redirect URI: ");
                    sb4.append(value);
                    throw new ProtocolException(sb4.toString(), e3);
                }
            } else {
                StringBuilder sb5 = new StringBuilder("Received redirect response ");
                sb5.append(httpResponse.getStatusLine());
                sb5.append(" but no location header");
                throw new ProtocolException(sb5.toString());
            }
        } else {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
    }
}
