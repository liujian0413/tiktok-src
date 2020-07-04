package p1896pl.droidsonroids.relinker.p1898a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48442a;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48443b;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48444c;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48445d;

/* renamed from: pl.droidsonroids.relinker.a.d */
public final class C48446d extends C48443b {

    /* renamed from: j */
    private final C48448f f123564j;

    /* renamed from: a */
    public final C48444c mo123259a(long j) throws IOException {
        return new C48449g(this.f123564j, this, j);
    }

    /* renamed from: a */
    public final C48445d mo123260a(int i) throws IOException {
        return new C48451i(this.f123564j, this, 0);
    }

    /* renamed from: a */
    public final C48442a mo123258a(long j, int i) throws IOException {
        C48439a aVar = new C48439a(this.f123564j, this, j, i);
        return aVar;
    }

    public C48446d(boolean z, C48448f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f123550a = z;
        this.f123564j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f123551b = fVar.mo123264c(allocate, 16);
        this.f123552c = fVar.mo123263b(allocate, 28);
        this.f123553d = fVar.mo123263b(allocate, 32);
        this.f123554e = fVar.mo123264c(allocate, 42);
        this.f123555f = fVar.mo123264c(allocate, 44);
        this.f123556g = fVar.mo123264c(allocate, 46);
        this.f123557h = fVar.mo123264c(allocate, 48);
        this.f123558i = fVar.mo123264c(allocate, 50);
    }
}
