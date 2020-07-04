package org.cryptonode.jncryptor;

import java.io.IOException;

public class StreamIntegrityException extends IOException {
    private static final long serialVersionUID = 1;

    public StreamIntegrityException() {
    }

    public StreamIntegrityException(String str) {
        super(str);
    }

    public StreamIntegrityException(Throwable th) {
        super(th);
    }

    public StreamIntegrityException(String str, Throwable th) {
        super(str, th);
    }
}
