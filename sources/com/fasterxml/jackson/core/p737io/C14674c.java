package com.fasterxml.jackson.core.p737io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType;
import com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType;
import com.fasterxml.jackson.core.util.C14681b;

/* renamed from: com.fasterxml.jackson.core.io.c */
public final class C14674c {

    /* renamed from: a */
    public final Object f37933a;

    /* renamed from: b */
    public JsonEncoding f37934b;

    /* renamed from: c */
    public final boolean f37935c;

    /* renamed from: d */
    protected final BufferRecycler f37936d;

    /* renamed from: e */
    protected byte[] f37937e;

    /* renamed from: f */
    protected byte[] f37938f;

    /* renamed from: g */
    protected char[] f37939g;

    /* renamed from: h */
    protected char[] f37940h;

    /* renamed from: i */
    protected char[] f37941i;

    /* renamed from: a */
    public final C14681b mo37194a() {
        return new C14681b(this.f37936d);
    }

    /* renamed from: d */
    public final char[] mo37202d() {
        if (this.f37939g == null) {
            this.f37939g = this.f37936d.mo37228a(CharBufferType.TOKEN_BUFFER);
            return this.f37939g;
        }
        throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
    }

    /* renamed from: e */
    public final char[] mo37203e() {
        if (this.f37940h == null) {
            this.f37940h = this.f37936d.mo37228a(CharBufferType.CONCAT_BUFFER);
            return this.f37940h;
        }
        throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
    }

    /* renamed from: c */
    public final byte[] mo37201c() {
        if (this.f37938f == null) {
            this.f37938f = this.f37936d.mo37227a(ByteBufferType.WRITE_ENCODING_BUFFER);
            return this.f37938f;
        }
        throw new IllegalStateException("Trying to call allocWriteEncodingBuffer() second time");
    }

    /* renamed from: b */
    public final byte[] mo37199b() {
        if (this.f37937e == null) {
            this.f37937e = this.f37936d.mo37227a(ByteBufferType.READ_IO_BUFFER);
            return this.f37937e;
        }
        throw new IllegalStateException("Trying to call allocReadIOBuffer() second time");
    }

    /* renamed from: a */
    public final void mo37195a(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr == this.f37937e) {
            this.f37937e = null;
            this.f37936d.mo37225a(ByteBufferType.READ_IO_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: b */
    public final void mo37197b(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr == this.f37938f) {
            this.f37938f = null;
            this.f37936d.mo37225a(ByteBufferType.WRITE_ENCODING_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: c */
    public final void mo37200c(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f37941i) {
            this.f37941i = null;
            this.f37936d.mo37226a(CharBufferType.NAME_COPY_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: a */
    public final void mo37196a(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f37939g) {
            this.f37939g = null;
            this.f37936d.mo37226a(CharBufferType.TOKEN_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: b */
    public final void mo37198b(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f37940h) {
            this.f37940h = null;
            this.f37936d.mo37226a(CharBufferType.CONCAT_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    public C14674c(BufferRecycler bufferRecycler, Object obj, boolean z) {
        this.f37936d = bufferRecycler;
        this.f37933a = obj;
        this.f37935c = z;
    }
}
