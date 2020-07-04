package com.bytedance.p255e.p256a;

import com.bytedance.p255e.p256a.C6329c.C6330a;
import com.bytedance.p255e.p256a.C6329c.C6331b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.e.a.b */
public final class C6328b extends C6330a {
    public C6328b(C6336f fVar, C6331b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f18577a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 16));
        this.f18575a = fVar.mo15169a(allocate, j2);
        this.f18576b = fVar.mo15169a(allocate, j2 + 8);
    }
}
