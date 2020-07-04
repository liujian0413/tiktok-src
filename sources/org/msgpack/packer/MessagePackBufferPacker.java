package org.msgpack.packer;

import org.msgpack.C48350a;
import org.msgpack.p1895io.C48357f;

public class MessagePackBufferPacker extends MessagePackPacker implements BufferPacker {
    public byte[] toByteArray() {
        return ((C48357f) this.out).mo121903a();
    }

    public MessagePackBufferPacker(C48350a aVar) {
        this(aVar, 512);
    }

    public MessagePackBufferPacker(C48350a aVar, int i) {
        super(aVar, new C48357f(i));
    }
}
