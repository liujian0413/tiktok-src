package com.facebook;

public class FacebookAuthorizationException extends FacebookException {
    static final long serialVersionUID = 1;

    public FacebookAuthorizationException() {
    }

    public FacebookAuthorizationException(String str) {
        super(str);
    }

    public FacebookAuthorizationException(Throwable th) {
        super(th);
    }

    public FacebookAuthorizationException(String str, Throwable th) {
        super(str, th);
    }
}
