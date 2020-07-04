package com.bytedance.p255e.p256a;

import com.bytedance.p255e.p256a.C6329c.C6330a;
import com.bytedance.p255e.p256a.C6329c.C6331b;
import com.bytedance.p255e.p256a.C6329c.C6332c;
import com.bytedance.p255e.p256a.C6329c.C6333d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.e.a.d */
public final class C6334d extends C6331b {

    /* renamed from: j */
    private final C6336f f18591j;

    /* renamed from: a */
    public final C6332c mo15167a(long j) throws IOException {
        return new C6337g(this.f18591j, this, j);
    }

    /* renamed from: a */
    public final C6333d mo15168a(int i) throws IOException {
        return new C6339i(this.f18591j, this, 0);
    }

    /* renamed from: a */
    public final C6330a mo15166a(long j, int i) throws IOException {
        C6327a aVar = new C6327a(this.f18591j, this, j, i);
        return aVar;
    }

    public C6334d(boolean z, C6336f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f18577a = z;
        this.f18591j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f18578b = fVar.mo15172c(allocate, 16);
        this.f18579c = fVar.mo15171b(allocate, 28);
        this.f18580d = fVar.mo15171b(allocate, 32);
        this.f18581e = fVar.mo15172c(allocate, 42);
        this.f18582f = fVar.mo15172c(allocate, 44);
        this.f18583g = fVar.mo15172c(allocate, 46);
        this.f18584h = fVar.mo15172c(allocate, 48);
        this.f18585i = fVar.mo15172c(allocate, 50);
    }
}
