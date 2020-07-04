package com.p280ss.ugc.live.gift.resource.p1829c;

import com.p280ss.ugc.live.gift.resource.C46209a;
import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.exception.BaseGetResourceException;
import com.p280ss.ugc.live.gift.resource.exception.NetworkException;
import com.p280ss.ugc.live.gift.resource.exception.WriteStorageException;
import com.p280ss.ugc.live.gift.resource.p1827a.C46211b;
import com.p280ss.ugc.live.gift.resource.p1828b.C46213a;
import com.p280ss.ugc.live.gift.resource.p1828b.C46214b;
import com.p280ss.ugc.live.gift.resource.p1828b.C46214b.C46215a;
import com.p280ss.ugc.live.gift.resource.p1830d.C46229a;
import com.p280ss.ugc.live.gift.resource.p1830d.C46230b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.ugc.live.gift.resource.c.c */
public final class C46223c implements C46225d<String> {

    /* renamed from: a */
    public C46209a<String> f118821a;

    /* renamed from: b */
    private C46214b f118822b;

    /* renamed from: c */
    private C46211b f118823c;

    /* renamed from: a */
    public final String mo114174a(C46220c cVar) throws Exception {
        String a = C46230b.m145165a(this.f118823c.mo20651a(cVar));
        File file = new File(a);
        if (file.exists() || file.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(C46229a.m145162a(cVar.mo114170a()));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("mkdirs return false, dir=");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    public C46223c(C46214b bVar, C46211b bVar2) {
        this.f118822b = bVar;
        this.f118823c = bVar2;
    }

    /* renamed from: a */
    private static int m145144a(long j, long j2) {
        if (j2 > 0) {
            return (int) ((j * 100) / j2);
        }
        double d = (double) (-j);
        Double.isNaN(d);
        return (int) ((1.0d - Math.exp(d / 50000.0d)) * 100.0d);
    }

    /* renamed from: a */
    public final void mo20821a(final C46220c cVar, C46209a<String> aVar) {
        this.f118821a = aVar;
        final C46213a aVar2 = new C46213a(cVar.mo114171b());
        try {
            File b = C46230b.m145167b(mo114174a(cVar));
            if (b.exists()) {
                aVar2.f118806b = b.length();
            }
        } catch (Exception unused) {
        }
        this.f118822b.mo114164a(aVar2, new C46215a() {
            /* renamed from: a */
            public final void mo114166a(Throwable th, int i) {
                if (i == 416) {
                    try {
                        File b = C46230b.m145167b(C46223c.this.mo114174a(cVar));
                        if (b.exists()) {
                            b.delete();
                        }
                    } catch (Exception unused) {
                    }
                }
                NetworkException networkException = new NetworkException("download failed", th, cVar, i, aVar2);
                C46223c.this.f118821a.mo114161a(cVar, (BaseGetResourceException) networkException);
            }

            /* renamed from: a */
            public final void mo114165a(InputStream inputStream, long j) {
                try {
                    String a = C46223c.this.mo114174a(cVar);
                    File b = C46230b.m145167b(a);
                    C46223c.this.mo114175a(cVar, inputStream, j, b);
                    if (b.renameTo(new File(a))) {
                        C46223c.this.f118821a.mo114162a(cVar, a);
                    } else {
                        b.delete();
                        throw new Exception("rename file failed");
                    }
                } catch (Exception e) {
                    C46223c.this.f118821a.mo114161a(cVar, (BaseGetResourceException) new WriteStorageException("write storage failed.", e, cVar));
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[SYNTHETIC, Splitter:B:21:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114175a(com.p280ss.ugc.live.gift.resource.C46220c r8, java.io.InputStream r9, long r10, java.io.File r12) throws java.lang.Exception {
        /*
            r7 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "rw"
            r1.<init>(r12, r2)     // Catch:{ all -> 0x003e }
            long r2 = r1.length()     // Catch:{ all -> 0x003c }
            r4 = 0
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0015
            r1.seek(r2)     // Catch:{ all -> 0x003c }
        L_0x0015:
            r12 = 2048(0x800, float:2.87E-42)
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x003c }
            r0 = 0
            long r10 = r10 + r2
            r0 = 0
            r4 = 0
        L_0x001d:
            int r5 = r9.read(r12)     // Catch:{ all -> 0x003c }
            if (r5 < 0) goto L_0x0035
            r1.write(r12, r0, r5)     // Catch:{ all -> 0x003c }
            long r5 = (long) r5     // Catch:{ all -> 0x003c }
            long r2 = r2 + r5
            int r5 = m145144a(r2, r10)     // Catch:{ all -> 0x003c }
            if (r5 == r4) goto L_0x001d
            com.ss.ugc.live.gift.resource.a<java.lang.String> r4 = r7.f118821a     // Catch:{ all -> 0x003c }
            r4.mo114160a(r8, r5)     // Catch:{ all -> 0x003c }
            r4 = r5
            goto L_0x001d
        L_0x0035:
            r1.close()     // Catch:{ IOException -> 0x003b }
            r9.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            r8 = move-exception
            goto L_0x0040
        L_0x003e:
            r8 = move-exception
            r1 = r0
        L_0x0040:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ IOException -> 0x0048 }
            r9.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ugc.live.gift.resource.p1829c.C46223c.mo114175a(com.ss.ugc.live.gift.resource.c, java.io.InputStream, long, java.io.File):void");
    }
}
