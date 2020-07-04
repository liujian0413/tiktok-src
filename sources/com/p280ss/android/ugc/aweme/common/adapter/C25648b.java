package com.p280ss.android.ugc.aweme.common.adapter;

import android.support.p022v4.util.C0905l;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.b */
public final class C25648b<T> {

    /* renamed from: c */
    private static final List<Object> f67567c = Collections.emptyList();

    /* renamed from: a */
    protected C0905l<C25647a<T>> f67568a = new C0905l<>();

    /* renamed from: b */
    public C25647a<T> f67569b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r5v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66528a(T r2, int r3, android.support.p029v7.widget.RecyclerView.C1293v r4, java.util.List<java.lang.Object> r5) {
        /*
            r1 = this;
            int r0 = r4.mItemViewType
            com.ss.android.ugc.aweme.common.adapter.a r0 = r1.m84341a(r0)
            if (r0 == 0) goto L_0x0011
            if (r5 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.util.List<java.lang.Object> r5 = f67567c
        L_0x000d:
            r0.mo62252a(r2, r3, r4, r5)
            return
        L_0x0011:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No delegate found for item at position = "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = " for viewType = "
            r5.append(r3)
            int r3 = r4.mItemViewType
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.adapter.C25648b.mo66528a(java.lang.Object, int, android.support.v7.widget.RecyclerView$v, java.util.List):void");
    }

    /* renamed from: b */
    public final C25648b<T> mo66529b(C25647a<T> aVar) {
        this.f67569b = aVar;
        return this;
    }

    /* renamed from: a */
    private C25647a<T> m84341a(int i) {
        return (C25647a) this.f67568a.mo3434a(i, this.f67569b);
    }

    /* renamed from: a */
    public final C25648b<T> mo66524a(C25647a<T> aVar) {
        int b = this.f67568a.mo3435b();
        while (this.f67568a.mo3433a(b) != null) {
            b++;
            if (b == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        return mo66523a(b, false, aVar);
    }

    /* renamed from: b */
    public final void mo66530b(RecyclerView recyclerView) {
        if (this.f67568a != null) {
            for (int i = 0; i < this.f67568a.mo3435b(); i++) {
                if (this.f67568a.mo3443e(i) != null) {
                    ((C25647a) this.f67568a.mo3443e(i)).mo66520b(recyclerView);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo66532c(C1293v vVar) {
        C25647a a = m84341a(vVar.mItemViewType);
        if (a != null) {
            a.mo66517a(vVar);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(vVar);
        sb.append(" for item at position = ");
        sb.append(vVar.getAdapterPosition());
        sb.append(" for viewType = ");
        sb.append(vVar.mItemViewType);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: d */
    public final void mo66533d(C1293v vVar) {
        C25647a a = m84341a(vVar.mItemViewType);
        if (a != null) {
            a.mo66519b(vVar);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(vVar);
        sb.append(" for item at position = ");
        sb.append(vVar.getAdapterPosition());
        sb.append(" for viewType = ");
        sb.append(vVar.mItemViewType);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo66531b(C1293v vVar) {
        if (m84341a(vVar.mItemViewType) != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(vVar);
        sb.append(" for item at position = ");
        sb.append(vVar.getAdapterPosition());
        sb.append(" for viewType = ");
        sb.append(vVar.mItemViewType);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: a */
    public final void mo66525a(C1293v vVar) {
        if (m84341a(vVar.mItemViewType) == null) {
            StringBuilder sb = new StringBuilder("No delegate found for ");
            sb.append(vVar);
            sb.append(" for item at position = ");
            sb.append(vVar.getAdapterPosition());
            sb.append(" for viewType = ");
            sb.append(vVar.mItemViewType);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo66526a(RecyclerView recyclerView) {
        if (this.f67568a != null) {
            for (int i = 0; i < this.f67568a.mo3435b(); i++) {
                if (this.f67568a.mo3443e(i) != null) {
                    ((C25647a) this.f67568a.mo3443e(i)).mo66518a(recyclerView);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo66521a(T t, int i) {
        if (t != null) {
            int b = this.f67568a.mo3435b();
            for (int i2 = 0; i2 < b; i2++) {
                if (((C25647a) this.f67568a.mo3443e(i2)).mo62253a(t, i)) {
                    return this.f67568a.mo3442d(i2);
                }
            }
            if (this.f67569b != null) {
                return 2147483646;
            }
            StringBuilder sb = new StringBuilder("No AdapterDelegate added that matches position=");
            sb.append(i);
            sb.append(" delegates=");
            sb.append(this.f67568a);
            sb.append(" items=");
            sb.append(t);
            throw new NullPointerException(sb.toString());
        }
        throw new NullPointerException("Items datasource is null!");
    }

    /* renamed from: a */
    public final C1293v mo66522a(ViewGroup viewGroup, int i) {
        C25647a a = m84341a(i);
        if (a != null) {
            C1293v a2 = a.mo62251a(viewGroup);
            if (a2 != null) {
                return a2;
            }
            StringBuilder sb = new StringBuilder("ViewHolder returned from AdapterDelegate ");
            sb.append(a);
            sb.append(" for ViewType =");
            sb.append(i);
            sb.append(" is null!");
            throw new NullPointerException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("No AdapterDelegate added for ViewType ");
        sb2.append(i);
        throw new NullPointerException(sb2.toString());
    }

    /* renamed from: a */
    public final void mo66527a(T t, int i, C1293v vVar) {
        mo66528a(t, i, vVar, f67567c);
    }

    /* renamed from: a */
    public final C25648b<T> mo66523a(int i, boolean z, C25647a<T> aVar) {
        if (aVar == null) {
            throw new NullPointerException("AdapterDelegate is null!");
        } else if (i == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (this.f67568a.mo3433a(i) == null) {
            this.f67568a.mo3437b(i, aVar);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("An AdapterDelegate is already registered for the viewType = ");
            sb.append(i);
            sb.append(". Already registered AdapterDelegate is ");
            sb.append(this.f67568a.mo3433a(i));
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
