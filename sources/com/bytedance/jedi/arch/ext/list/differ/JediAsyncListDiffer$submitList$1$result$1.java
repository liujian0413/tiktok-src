package com.bytedance.jedi.arch.ext.list.differ;

import android.support.p029v7.util.C1143a.C1145a;

public final class JediAsyncListDiffer$submitList$1$result$1 extends C1145a {

    /* renamed from: a */
    final /* synthetic */ C11562a f31215a;

    /* renamed from: a */
    public final int mo248a() {
        return this.f31215a.f31228b.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f31215a.f31229c.size();
    }

    JediAsyncListDiffer$submitList$1$result$1(C11562a aVar) {
        this.f31215a = aVar;
    }

    /* renamed from: a */
    public final Object mo249a(int i, int i2) {
        Object obj = this.f31215a.f31228b.get(i);
        Object obj2 = this.f31215a.f31229c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f31215a.f31227a.f31224d.f31235b.mo4551c(obj, obj2);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        Object obj = this.f31215a.f31228b.get(i);
        Object obj2 = this.f31215a.f31229c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f31215a.f31227a.f31224d.f31235b.mo4549a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        Object obj = this.f31215a.f31228b.get(i);
        Object obj2 = this.f31215a.f31229c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f31215a.f31227a.f31224d.f31235b.mo4550b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }
}
