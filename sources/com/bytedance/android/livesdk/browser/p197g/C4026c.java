package com.bytedance.android.livesdk.browser.p197g;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;

/* renamed from: com.bytedance.android.livesdk.browser.g.c */
public final class C4026c implements C4024a {

    /* renamed from: a */
    private SparseArray<C4025b> f11999a;

    /* renamed from: com.bytedance.android.livesdk.browser.g.c$a */
    public static final class C4028a implements C9174b<C4024a> {
        /* renamed from: a */
        public final C9175a<C4024a> mo11528a(C9175a<C4024a> aVar) {
            return aVar.mo22388a(new C4026c()).mo22387a();
        }
    }

    private C4026c() {
        this.f11999a = new SparseArray<>();
    }

    /* renamed from: a */
    public final void mo11650a(Context context) {
        this.f11999a.remove(context.hashCode());
    }
}
