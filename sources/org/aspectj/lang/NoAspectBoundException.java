package org.aspectj.lang;

public class NoAspectBoundException extends RuntimeException {
    Throwable cause;

    public NoAspectBoundException() {
    }

    public Throwable getCause() {
        return this.cause;
    }

    public NoAspectBoundException(String str, Throwable th) {
        if (th != null) {
            StringBuffer stringBuffer = new StringBuffer("Exception while initializing ");
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(th);
            str = stringBuffer.toString();
        }
        super(str);
        this.cause = th;
    }
}
