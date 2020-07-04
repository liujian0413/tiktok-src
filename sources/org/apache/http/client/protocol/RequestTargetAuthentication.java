package org.apache.http.client.protocol;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;

public class RequestTargetAuthentication implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") && !httpRequest.containsHeader("Authorization")) {
            AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
            if (authState != null) {
                AuthScheme authScheme = authState.getAuthScheme();
                if (authScheme != null) {
                    Credentials credentials = authState.getCredentials();
                    if (credentials == null) {
                        this.log.debug("User credentials not available");
                        return;
                    }
                    if (authState.getAuthScope() != null || !authScheme.isConnectionBased()) {
                        try {
                            httpRequest.addHeader(authScheme.authenticate(credentials, httpRequest));
                        } catch (AuthenticationException e) {
                            if (this.log.isErrorEnabled()) {
                                Log log2 = this.log;
                                StringBuilder sb = new StringBuilder("Authentication error: ");
                                sb.append(e.getMessage());
                                log2.error(sb.toString());
                            }
                        }
                    }
                }
            }
        }
    }
}
