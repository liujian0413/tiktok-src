package com.bytedance.p255e.p256a;

import com.bytedance.p255e.p256a.C6329c.C6331b;
import com.bytedance.p255e.p256a.C6329c.C6333d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.e.a.j */
public final class C6340j extends C6333d {
    public C6340j(C6336f fVar, C6331b bVar, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f18577a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f18590a = fVar.mo15171b(allocate, bVar.f18580d + ((long) (i * bVar.f18583g)) + 44);
    }
}