package com.p280ss.ugc.live.gift.resource.p1829c;

import com.p280ss.ugc.live.gift.resource.C46209a;
import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.exception.BaseGetResourceException;

/* renamed from: com.ss.ugc.live.gift.resource.c.f */
public final class C46227f implements C46209a<String>, C46225d<String> {

    /* renamed from: a */
    private C46225d<String> f118830a;

    /* renamed from: b */
    private C46209a<String> f118831b;

    public C46227f(C46225d dVar) {
        this.f118830a = dVar;
    }

    /* renamed from: a */
    public final void mo20821a(C46220c cVar, C46209a<String> aVar) {
        this.f118831b = aVar;
        this.f118830a.mo20821a(cVar, this);
    }

    /* renamed from: a */
    public final void mo114160a(C46220c cVar, int i) {
        if (this.f118831b != null) {
            this.f118831b.mo114160a(cVar, i);
        }
    }

    /* renamed from: a */
    public final void mo114161a(C46220c cVar, BaseGetResourceException baseGetResourceException) {
        if (this.f118831b != null) {
            this.f118831b.mo114161a(cVar, baseGetResourceException);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114162a(com.p280ss.ugc.live.gift.resource.C46220c r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = "/"
            int r2 = r5.lastIndexOf(r2)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r0 = r5.substring(r0, r2)     // Catch:{ Exception -> 0x0023 }
            com.p280ss.ugc.live.gift.resource.p1830d.C46233e.m145170a(r5, r0)     // Catch:{ Exception -> 0x0021 }
            com.ss.ugc.live.gift.resource.a<java.lang.String> r1 = r3.f118831b     // Catch:{ Exception -> 0x0021 }
            if (r1 == 0) goto L_0x0018
            com.ss.ugc.live.gift.resource.a<java.lang.String> r1 = r3.f118831b     // Catch:{ Exception -> 0x0021 }
            r1.mo114162a(r4, r0)     // Catch:{ Exception -> 0x0021 }
        L_0x0018:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0021 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0021 }
            r1.delete()     // Catch:{ Exception -> 0x0021 }
            return
        L_0x0021:
            r5 = move-exception
            goto L_0x0025
        L_0x0023:
            r5 = move-exception
            r0 = r1
        L_0x0025:
            com.ss.ugc.live.gift.resource.exception.UnzipException r1 = new com.ss.ugc.live.gift.resource.exception.UnzipException
            java.lang.String r2 = "unzip exception"
            r1.<init>(r2, r5, r4)
            r3.mo114161a(r4, r1)
            if (r0 == 0) goto L_0x0039
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            com.p280ss.ugc.live.gift.resource.p1830d.C46230b.m145166a(r4)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ugc.live.gift.resource.p1829c.C46227f.mo114162a(com.ss.ugc.live.gift.resource.c, java.lang.String):void");
    }
}
