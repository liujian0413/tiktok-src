package com.fasterxml.jackson.core.p737io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.io.InputDecorator */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract InputStream decorate(C14674c cVar, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(C14674c cVar, byte[] bArr, int i, int i2) throws IOException;

    public abstract Reader decorate(C14674c cVar, Reader reader) throws IOException;
}
