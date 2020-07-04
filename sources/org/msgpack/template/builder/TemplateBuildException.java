package org.msgpack.template.builder;

public class TemplateBuildException extends RuntimeException {
    public TemplateBuildException(String str) {
        super(str);
    }

    public TemplateBuildException(Throwable th) {
        super(th);
    }

    public TemplateBuildException(String str, Throwable th) {
        super(str, th);
    }
}
