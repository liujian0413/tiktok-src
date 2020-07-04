package p1896pl.droidsonroids.relinker.p1898a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48443b;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48444c;

/* renamed from: pl.droidsonroids.relinker.a.h */
public final class C48450h extends C48444c {
    public C48450h(C48448f fVar, C48443b bVar, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f123550a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = bVar.f123552c + (j * ((long) bVar.f123554e));
        this.f123559a = fVar.mo123263b(allocate, j2);
        this.f123560b = fVar.mo123261a(allocate, 8 + j2);
        this.f123561c = fVar.mo123261a(allocate, 16 + j2);
        this.f123562d = fVar.mo123261a(allocate, j2 + 40);
    }
}
