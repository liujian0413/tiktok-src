package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

@C6505uv
public final class aks {

    /* renamed from: a */
    private long f40527a;

    /* renamed from: a */
    public final long mo39639a(ByteBuffer byteBuffer) {
        adq adq;
        acp acp;
        if (this.f40527a > 0) {
            return this.f40527a;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new C16198yo(new akr(duplicate), aku.f40528a).mo40495b().iterator();
            while (true) {
                adq = null;
                if (!it.hasNext()) {
                    acp = null;
                    break;
                }
                aan aan = (aan) it.next();
                if (aan instanceof acp) {
                    acp = (acp) aan;
                    break;
                }
            }
            Iterator it2 = acp.mo40495b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                aan aan2 = (aan) it2.next();
                if (aan2 instanceof adq) {
                    adq = (adq) aan2;
                    break;
                }
            }
            this.f40527a = (adq.f40051b * 1000) / adq.f40050a;
            return this.f40527a;
        } catch (IOException | RuntimeException unused) {
            return 0;
        }
    }
}
