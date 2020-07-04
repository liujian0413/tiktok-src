package org.msgpack;

import java.io.IOException;
import org.msgpack.packer.BufferPacker;
import org.msgpack.packer.MessagePackBufferPacker;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.unpacker.BufferUnpacker;
import org.msgpack.unpacker.MessagePackBufferUnpacker;

/* renamed from: org.msgpack.a */
public final class C48350a {

    /* renamed from: b */
    private static final C48350a f123467b = new C48350a();

    /* renamed from: a */
    private TemplateRegistry f123468a = new TemplateRegistry(null);

    /* renamed from: a */
    private BufferPacker m149952a() {
        return new MessagePackBufferPacker(this);
    }

    /* renamed from: b */
    private BufferUnpacker m149954b() {
        return new MessagePackBufferUnpacker(this);
    }

    /* renamed from: a */
    private BufferUnpacker m149953a(byte[] bArr) {
        return m149954b().wrap(bArr);
    }

    /* renamed from: a */
    public final <T> Template<T> mo121874a(Class<T> cls) {
        return this.f123468a.lookup(cls);
    }

    /* renamed from: a */
    public final <T> T mo121873a(byte[] bArr, Template<T> template) throws IOException {
        return m149951a(bArr, null, template);
    }

    /* renamed from: a */
    public final <T> byte[] mo121875a(T t, Template<T> template) throws IOException {
        BufferPacker a = m149952a();
        template.write(a, t);
        return a.toByteArray();
    }

    /* renamed from: a */
    private <T> T m149951a(byte[] bArr, T t, Template<T> template) throws IOException {
        return template.read(m149953a(bArr), null);
    }
}
