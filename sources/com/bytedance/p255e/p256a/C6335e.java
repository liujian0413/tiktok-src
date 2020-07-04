package com.bytedance.p255e.p256a;

import com.bytedance.p255e.p256a.C6329c.C6330a;
import com.bytedance.p255e.p256a.C6329c.C6331b;
import com.bytedance.p255e.p256a.C6329c.C6332c;
import com.bytedance.p255e.p256a.C6329c.C6333d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.e.a.e */
public final class C6335e extends C6331b {

    /* renamed from: j */
    private final C6336f f18592j;

    /* renamed from: a */
    public final C6332c mo15167a(long j) throws IOException {
        return new C6338h(this.f18592j, this, j);
    }

    /* renamed from: a */
    public final C6333d mo15168a(int i) throws IOException {
        return new C6340j(this.f18592j, this, 0);
    }

    /* renamed from: a */
    public final C6330a mo15166a(long j, int i) throws IOException {
        C6328b bVar = new C6328b(this.f18592j, this, j, i);
        return bVar;
    }

    public C6335e(boolean z, C6336f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f18577a = z;
        this.f18592j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f18578b = fVar.mo15172c(allocate, 16);
        this.f18579c = fVar.mo15169a(allocate, 32);
        this.f18580d = fVar.mo15169a(allocate, 40);
        this.f18581e = fVar.mo15172c(allocate, 54);
        this.f18582f = fVar.mo15172c(allocate, 56);
        this.f18583g = fVar.mo15172c(allocate, 58);
        this.f18584h = fVar.mo15172c(allocate, 60);
        this.f18585i = fVar.mo15172c(allocate, 62);
    }
}
