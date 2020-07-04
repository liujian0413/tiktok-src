package org.apache.commons.net.telnet;

public class InvalidTelnetOptionException extends Exception {
    private static final long serialVersionUID = -2516777155928793597L;
    private final String msg;
    private final int optionCode;

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msg);
        sb.append(": ");
        sb.append(this.optionCode);
        return sb.toString();
    }

    public InvalidTelnetOptionException(String str, int i) {
        this.optionCode = i;
        this.msg = str;
    }
}
