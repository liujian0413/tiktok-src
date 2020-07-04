package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

@C6505uv
final class akr implements bcl {

    /* renamed from: a */
    private final ByteBuffer f40526a;

    akr(ByteBuffer byteBuffer) {
        this.f40526a = byteBuffer.duplicate();
    }

    public final void close() throws IOException {
    }

    /* renamed from: a */
    public final int mo39633a(ByteBuffer byteBuffer) throws IOException {
        if (this.f40526a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f40526a.remaining());
        byte[] bArr = new byte[min];
        this.f40526a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    /* renamed from: a */
    public final long mo39634a() throws IOException {
        return (long) this.f40526a.limit();
    }

    /* renamed from: b */
    public final long mo39637b() throws IOException {
        return (long) this.f40526a.position();
    }

    /* renamed from: a */
    public final void mo39636a(long j) throws IOException {
        this.f40526a.position((int) j);
    }

    /* renamed from: a */
    public final ByteBuffer mo39635a(long j, long j2) throws IOException {
        int position = this.f40526a.position();
        this.f40526a.position((int) j);
        ByteBuffer slice = this.f40526a.slice();
        slice.limit((int) j2);
        this.f40526a.position(position);
        return slice;
    }
}
