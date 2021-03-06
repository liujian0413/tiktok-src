package com.facebook;

public class FacebookOperationCanceledException extends FacebookException {
    static final long serialVersionUID = 1;

    public FacebookOperationCanceledException() {
    }

    public FacebookOperationCanceledException(String str) {
        super(str);
    }

    public FacebookOperationCanceledException(Throwable th) {
        super(th);
    }

    public FacebookOperationCanceledException(String str, Throwable th) {
        super(str, th);
    }
}
