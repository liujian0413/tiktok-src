package com.fasterxml.jackson.core.p737io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.io.OutputDecorator */
public abstract class OutputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract OutputStream decorate(C14674c cVar, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(C14674c cVar, Writer writer) throws IOException;
}
