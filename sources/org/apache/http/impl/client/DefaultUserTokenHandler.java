package org.apache.http.impl.client;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.protocol.HttpContext;

public class DefaultUserTokenHandler implements UserTokenHandler {
    private static Principal getAuthPrincipal(AuthState authState) {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme != null && authScheme.isComplete() && authScheme.isConnectionBased()) {
            Credentials credentials = authState.getCredentials();
            if (credentials != null) {
                return credentials.getUserPrincipal();
            }
        }
        return null;
    }

    public Object getUserToken(HttpContext httpContext) {
        Principal principal;
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (authState != null) {
            principal = getAuthPrincipal(authState);
            if (principal == null) {
                principal = getAuthPrincipal((AuthState) httpContext.getAttribute("http.auth.proxy-scope"));
            }
        } else {
            principal = null;
        }
        if (principal != null) {
            return principal;
        }
        ManagedClientConnection managedClientConnection = (ManagedClientConnection) httpContext.getAttribute("http.connection");
        if (!managedClientConnection.isOpen()) {
            return principal;
        }
        SSLSession sSLSession = managedClientConnection.getSSLSession();
        if (sSLSession != null) {
            return sSLSession.getLocalPrincipal();
        }
        return principal;
    }
}
