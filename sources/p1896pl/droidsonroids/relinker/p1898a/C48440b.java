package p1896pl.droidsonroids.relinker.p1898a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48442a;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48443b;

/* renamed from: pl.droidsonroids.relinker.a.b */
public final class C48440b extends C48442a {
    public C48440b(C48448f fVar, C48443b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f123550a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 16));
        this.f123548a = fVar.mo123261a(allocate, j2);
        this.f123549b = fVar.mo123261a(allocate, j2 + 8);
    }
}
