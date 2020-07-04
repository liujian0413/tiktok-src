package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13315l;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.C13325j;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.memory.w */
public final class C13830w implements C13322g {

    /* renamed from: a */
    private final C13325j f36681a;

    /* renamed from: b */
    private final C13827t f36682b;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public MemoryPooledByteBufferOutputStream mo32592a() {
        return new MemoryPooledByteBufferOutputStream(this.f36682b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public MemoryPooledByteBufferOutputStream mo32593a(int i) {
        return new MemoryPooledByteBufferOutputStream(this.f36682b, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C13829v mo32589a(InputStream inputStream) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f36682b);
        try {
            return m40841a(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C13829v mo32591a(byte[] bArr) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f36682b, bArr.length);
        try {
            memoryPooledByteBufferOutputStream.write(bArr, 0, bArr.length);
            C13829v c = memoryPooledByteBufferOutputStream.mo32602a();
            memoryPooledByteBufferOutputStream.close();
            return c;
        } catch (IOException e) {
            throw C13315l.m38962b(e);
        } catch (Throwable th) {
            memoryPooledByteBufferOutputStream.close();
            throw th;
        }
    }

    public C13830w(C13827t tVar, C13325j jVar) {
        this.f36682b = tVar;
        this.f36681a = jVar;
    }

    /* renamed from: a */
    private C13829v m40841a(InputStream inputStream, MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream) throws IOException {
        this.f36681a.mo32605a(inputStream, memoryPooledByteBufferOutputStream);
        return memoryPooledByteBufferOutputStream.mo32602a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C13829v mo32590a(InputStream inputStream, int i) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f36682b, i);
        try {
            return m40841a(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }
}
