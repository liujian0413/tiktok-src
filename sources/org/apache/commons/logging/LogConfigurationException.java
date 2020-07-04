package org.apache.commons.logging;

public class LogConfigurationException extends RuntimeException {
    protected Throwable cause;

    public LogConfigurationException() {
    }

    public Throwable getCause() {
        return this.cause;
    }

    public LogConfigurationException(String str) {
        super(str);
    }

    public LogConfigurationException(Throwable th) {
        String str;
        if (th == null) {
            str = null;
        } else {
            str = th.toString();
        }
        this(str, th);
    }

    public LogConfigurationException(String str, Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" (Caused by ");
        stringBuffer.append(th);
        stringBuffer.append(")");
        super(stringBuffer.toString());
        this.cause = null;
        this.cause = th;
    }
}
