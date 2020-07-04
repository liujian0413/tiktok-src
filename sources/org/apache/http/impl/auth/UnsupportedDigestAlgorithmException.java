package org.apache.http.impl.auth;

public class UnsupportedDigestAlgorithmException extends RuntimeException {
    private static final long serialVersionUID = 319558534317118022L;

    public UnsupportedDigestAlgorithmException() {
    }

    public UnsupportedDigestAlgorithmException(String str) {
        super(str);
    }

    public UnsupportedDigestAlgorithmException(String str, Throwable th) {
        super(str, th);
    }
}
