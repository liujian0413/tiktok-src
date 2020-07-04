package org.cryptonode.jncryptor;

public class CryptorException extends Exception {
    private static final long serialVersionUID = 1;

    public CryptorException() {
    }

    public CryptorException(String str) {
        super(str);
    }

    public CryptorException(Throwable th) {
        super(th);
    }

    public CryptorException(String str, Throwable th) {
        super(str, th);
    }
}
