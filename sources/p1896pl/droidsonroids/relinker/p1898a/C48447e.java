package p1896pl.droidsonroids.relinker.p1898a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48442a;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48443b;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48444c;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48445d;

/* renamed from: pl.droidsonroids.relinker.a.e */
public final class C48447e extends C48443b {

    /* renamed from: j */
    private final C48448f f123565j;

    /* renamed from: a */
    public final C48444c mo123259a(long j) throws IOException {
        return new C48450h(this.f123565j, this, j);
    }

    /* renamed from: a */
    public final C48445d mo123260a(int i) throws IOException {
        return new C48452j(this.f123565j, this, 0);
    }

    /* renamed from: a */
    public final C48442a mo123258a(long j, int i) throws IOException {
        C48440b bVar = new C48440b(this.f123565j, this, j, i);
        return bVar;
    }

    public C48447e(boolean z, C48448f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f123550a = z;
        this.f123565j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f123551b = fVar.mo123264c(allocate, 16);
        this.f123552c = fVar.mo123261a(allocate, 32);
        this.f123553d = fVar.mo123261a(allocate, 40);
        this.f123554e = fVar.mo123264c(allocate, 54);
        this.f123555f = fVar.mo123264c(allocate, 56);
        this.f123556g = fVar.mo123264c(allocate, 58);
        this.f123557h = fVar.mo123264c(allocate, 60);
        this.f123558i = fVar.mo123264c(allocate, 62);
    }
}
