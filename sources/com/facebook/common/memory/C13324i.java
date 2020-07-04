package com.facebook.common.memory;

import com.facebook.common.internal.C13315l;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.common.memory.i */
public abstract class C13324i extends OutputStream {
    /* renamed from: a */
    public abstract PooledByteBuffer mo32602a();

    /* renamed from: b */
    public abstract int mo32603b();

    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C13315l.m38962b(e);
        }
    }
}
