package org.cryptonode.jncryptor;

public class InvalidHMACException extends CryptorException {
    private static final long serialVersionUID = 1;

    public InvalidHMACException() {
    }

    public InvalidHMACException(String str) {
        super(str);
    }

    public InvalidHMACException(Throwable th) {
        super(th);
    }

    public InvalidHMACException(String str, Throwable th) {
        super(str, th);
    }
}
