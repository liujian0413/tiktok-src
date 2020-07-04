package org.msgpack.unpacker;

import org.msgpack.C48350a;
import org.msgpack.p1895io.C48356e;

public class MessagePackBufferUnpacker extends MessagePackUnpacker implements BufferUnpacker {
    public MessagePackBufferUnpacker(C48350a aVar) {
        this(aVar, 512);
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr) {
        return wrap(bArr, 0, bArr.length);
    }

    public MessagePackBufferUnpacker(C48350a aVar, int i) {
        super(aVar, new C48356e(i));
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr, int i, int i2) {
        ((C48356e) this.f123485in).mo121902j();
        ((C48356e) this.f123485in).mo121900a(bArr, i, i2, true);
        return this;
    }
}
