package com.facebook;

public class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    private final FacebookRequestError error;

    public final FacebookRequestError getRequestError() {
        return this.error;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: ");
        sb.append("httpResponseCode: ");
        sb.append(this.error.f34653c);
        sb.append(", facebookErrorCode: ");
        sb.append(this.error.f34654d);
        sb.append(", facebookErrorType: ");
        sb.append(this.error.f34656f);
        sb.append(", message: ");
        sb.append(this.error.mo31780a());
        sb.append("}");
        return sb.toString();
    }

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.error = facebookRequestError;
    }
}
