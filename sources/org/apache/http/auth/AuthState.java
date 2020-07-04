package org.apache.http.auth;

public class AuthState {
    private AuthScheme authScheme;
    private AuthScope authScope;
    private Credentials credentials;

    public AuthScheme getAuthScheme() {
        return this.authScheme;
    }

    public AuthScope getAuthScope() {
        return this.authScope;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public void invalidate() {
        this.authScheme = null;
        this.authScope = null;
        this.credentials = null;
    }

    public boolean isValid() {
        if (this.authScheme != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("auth scope [");
        sb.append(this.authScope);
        sb.append("]; credentials set [");
        if (this.credentials != null) {
            str = "true";
        } else {
            str = "false";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public void setAuthScope(AuthScope authScope2) {
        this.authScope = authScope2;
    }

    public void setCredentials(Credentials credentials2) {
        this.credentials = credentials2;
    }

    public void setAuthScheme(AuthScheme authScheme2) {
        if (authScheme2 == null) {
            invalidate();
        } else {
            this.authScheme = authScheme2;
        }
    }
}
