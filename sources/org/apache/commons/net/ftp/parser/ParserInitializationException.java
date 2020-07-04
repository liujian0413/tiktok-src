package org.apache.commons.net.ftp.parser;

public class ParserInitializationException extends RuntimeException {
    private static final long serialVersionUID = 5563335279583210658L;

    public Throwable getRootCause() {
        return super.getCause();
    }

    public ParserInitializationException(String str) {
        super(str);
    }

    public ParserInitializationException(String str, Throwable th) {
        super(str, th);
    }
}
