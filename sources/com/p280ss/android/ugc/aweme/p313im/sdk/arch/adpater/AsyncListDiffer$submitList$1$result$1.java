package com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater;

import android.support.p029v7.util.C1143a.C1145a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.AsyncListDiffer$submitList$1$result$1 */
public final class AsyncListDiffer$submitList$1$result$1 extends C1145a {

    /* renamed from: a */
    final /* synthetic */ C30579b f80287a;

    /* renamed from: a */
    public final int mo248a() {
        return this.f80287a.f80300b.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f80287a.f80301c.size();
    }

    AsyncListDiffer$submitList$1$result$1(C30579b bVar) {
        this.f80287a = bVar;
    }

    /* renamed from: a */
    public final Object mo249a(int i, int i2) {
        Object obj = this.f80287a.f80300b.get(i);
        Object obj2 = this.f80287a.f80301c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f80287a.f80299a.f80295c.f80306a.mo4551c(obj, obj2);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        Object obj = this.f80287a.f80300b.get(i);
        Object obj2 = this.f80287a.f80301c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f80287a.f80299a.f80295c.f80306a.mo4549a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        Object obj = this.f80287a.f80300b.get(i);
        Object obj2 = this.f80287a.f80301c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f80287a.f80299a.f80295c.f80306a.mo4550b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }
}
