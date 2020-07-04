package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.vp */
public abstract class C16118vp implements C16169xm {

    /* renamed from: a */
    private static Logger f45165a = Logger.getLogger(C16118vp.class.getName());

    /* renamed from: b */
    private ThreadLocal<ByteBuffer> f45166b = new C16141wl(this);

    /* renamed from: a */
    public abstract aan mo39641a(String str, byte[] bArr, String str2);

    /* renamed from: a */
    public final aan mo42033a(bcl bcl, abo abo) throws IOException {
        int a;
        long j;
        bcl bcl2 = bcl;
        abo abo2 = abo;
        long b = bcl.mo39637b();
        ((ByteBuffer) this.f45166b.get()).rewind().limit(8);
        do {
            a = bcl2.mo39633a((ByteBuffer) this.f45166b.get());
            if (a == 8) {
                ((ByteBuffer) this.f45166b.get()).rewind();
                long a2 = C16223zm.m52629a((ByteBuffer) this.f45166b.get());
                byte[] bArr = null;
                if (a2 >= 8 || a2 <= 1) {
                    String f = C16223zm.m52634f((ByteBuffer) this.f45166b.get());
                    if (a2 == 1) {
                        ((ByteBuffer) this.f45166b.get()).limit(16);
                        bcl2.mo39633a((ByteBuffer) this.f45166b.get());
                        ((ByteBuffer) this.f45166b.get()).position(8);
                        j = C16223zm.m52631c((ByteBuffer) this.f45166b.get()) - 16;
                    } else {
                        j = a2 == 0 ? bcl.mo39634a() - bcl.mo39637b() : a2 - 8;
                    }
                    if ("uuid".equals(f)) {
                        ((ByteBuffer) this.f45166b.get()).limit(((ByteBuffer) this.f45166b.get()).limit() + 16);
                        bcl2.mo39633a((ByteBuffer) this.f45166b.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.f45166b.get()).position() - 16; position < ((ByteBuffer) this.f45166b.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.f45166b.get()).position() - 16)] = ((ByteBuffer) this.f45166b.get()).get(position);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    aan a3 = mo39641a(f, bArr, abo2 instanceof aan ? ((aan) abo2).mo39057a() : "");
                    a3.mo39058a(abo2);
                    ((ByteBuffer) this.f45166b.get()).rewind();
                    a3.mo39059a(bcl, (ByteBuffer) this.f45166b.get(), j2, this);
                    return a3;
                }
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(a2);
                sb.append("). Stop parsing!");
                f45165a.logp(Level.SEVERE, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (a >= 0);
        bcl2.mo39636a(b);
        throw new EOFException();
    }
}
