package com.bytedance.p255e.p256a;

import com.bytedance.p255e.p256a.C6329c.C6330a;
import com.bytedance.p255e.p256a.C6329c.C6331b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.e.a.a */
public final class C6327a extends C6330a {
    public C6327a(C6336f fVar, C6331b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f18577a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 8));
        this.f18575a = fVar.mo15171b(allocate, j2);
        this.f18576b = fVar.mo15171b(allocate, j2 + 4);
    }
}
