package p1896pl.droidsonroids.relinker.p1898a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48443b;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48445d;

/* renamed from: pl.droidsonroids.relinker.a.j */
public final class C48452j extends C48445d {
    public C48452j(C48448f fVar, C48443b bVar, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f123550a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f123563a = fVar.mo123263b(allocate, bVar.f123553d + ((long) (i * bVar.f123556g)) + 44);
    }
}
