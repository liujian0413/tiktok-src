package com.facebook.drawee.backends.pipeline.p696b;

import com.facebook.common.p686c.C13286a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.drawee.backends.pipeline.b.a */
public final class C13369a implements C13373b {

    /* renamed from: a */
    private final List<C13373b> f35332a = new ArrayList(2);

    /* renamed from: a */
    public final synchronized void mo32682a(C13373b bVar) {
        this.f35332a.add(bVar);
    }

    /* renamed from: b */
    public final synchronized void mo32683b(C13373b bVar) {
        this.f35332a.remove(bVar);
    }

    public C13369a(C13373b... bVarArr) {
        Collections.addAll(this.f35332a, bVarArr);
    }

    /* renamed from: a */
    public final synchronized void mo32681a(String str, int i, boolean z) {
        int size = this.f35332a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C13373b bVar = (C13373b) this.f35332a.get(i2);
            if (bVar != null) {
                try {
                    bVar.mo32681a(str, i, z);
                } catch (Exception e) {
                    C13286a.m38861c("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", (Throwable) e);
                }
            }
        }
    }
}
