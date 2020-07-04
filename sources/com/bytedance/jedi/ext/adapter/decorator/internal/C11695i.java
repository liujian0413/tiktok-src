package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.C11683b;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.i */
public final class C11695i extends C11689d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31424a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11695i.class), "defaultLoading", "getDefaultLoading()Lkotlin/jvm/functions/Function1;"))};

    /* renamed from: b */
    public C7562b<? super ViewGroup, ? extends C11683b> f31425b;

    /* renamed from: c */
    public C11683b f31426c;

    /* renamed from: d */
    public int f31427d = 241;

    /* renamed from: e */
    public int f31428e = 241;

    /* renamed from: f */
    public C7561a<C7581n> f31429f;

    /* renamed from: g */
    private int f31430g = 16056320;

    /* renamed from: h */
    private final C7541d f31431h = C7546e.m23569a(new C11696a(this));

    /* renamed from: i */
    private boolean f31432i;

    /* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.i$a */
    static final class C11696a extends Lambda implements C7561a<C7562b<? super ViewGroup, ? extends C11684a>> {

        /* renamed from: a */
        final /* synthetic */ C11695i f31433a;

        C11696a(C11695i iVar) {
            this.f31433a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7562b<ViewGroup, C11684a> invoke() {
            return new C7562b<ViewGroup, C11684a>(this) {

                /* renamed from: a */
                final /* synthetic */ C11696a f31434a;

                {
                    this.f31434a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C11684a invoke(ViewGroup viewGroup) {
                    C7573i.m23587b(viewGroup, "parent");
                    return new C11684a(viewGroup, new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C116971 f31435a;

                        {
                            this.f31435a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m34302a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m34302a() {
                            this.f31435a.f31434a.f31433a.mo29257j();
                        }
                    });
                }
            };
        }
    }

    /* renamed from: k */
    private final C7562b<ViewGroup, C11683b> m34291k() {
        return (C7562b) this.f31431h.getValue();
    }

    /* renamed from: f */
    public final int mo29253f() {
        return this.f31430g;
    }

    /* renamed from: m */
    private final void m34293m() {
        m34289b(242);
    }

    /* renamed from: i */
    public final void mo29256i() {
        m34290c(241);
    }

    /* renamed from: j */
    public final void mo29257j() {
        m34290c(244);
    }

    /* renamed from: l */
    private final boolean m34292l() {
        if (this.f31428e == 242) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo29254g() {
        if (this.f31428e == 241 || this.f31429f == null) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo29255h() {
        if (m34292l()) {
            m34290c(241);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34287a(int i) {
        C11683b bVar = this.f31426c;
        if (bVar != null) {
            bVar.mo29236a(i);
        }
    }

    /* renamed from: b */
    private void m34289b(int i) {
        if (this.f31427d != 242) {
            this.f31427d = 242;
            this.f31432i = true;
            m34287a(242);
        }
    }

    /* renamed from: c */
    private final void m34290c(int i) {
        if (this.f31427d == i && !this.f31432i) {
            this.f31432i = true;
            m34293m();
            C7561a<C7581n> aVar = this.f31429f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p029v7.widget.RecyclerView.C1293v mo29252a(android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            com.bytedance.jedi.ext.adapter.decorator.b r0 = r3.f31426c
            if (r0 == 0) goto L_0x000f
            android.view.View r0 = r0.mo29235a()
            if (r0 != 0) goto L_0x0023
        L_0x000f:
            kotlin.jvm.a.b<? super android.view.ViewGroup, ? extends com.bytedance.jedi.ext.adapter.decorator.b> r0 = r3.f31425b
            if (r0 != 0) goto L_0x0017
            kotlin.jvm.a.b r0 = r3.m34291k()
        L_0x0017:
            java.lang.Object r4 = r0.invoke(r4)
            com.bytedance.jedi.ext.adapter.decorator.b r4 = (com.bytedance.jedi.ext.adapter.decorator.C11683b) r4
            r3.f31426c = r4
            android.view.View r0 = r4.mo29235a()
        L_0x0023:
            com.bytedance.jedi.ext.adapter.decorator.internal.LoadingHolder r4 = new com.bytedance.jedi.ext.adapter.decorator.internal.LoadingHolder
            r4.<init>(r0)
            r0 = 0
            r1 = 1
            r2 = 0
            r3.m34287a(r3.f31427d)
            android.support.v7.widget.RecyclerView$v r4 = (android.support.p029v7.widget.RecyclerView.C1293v) r4
            r3.mo29244a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.internal.C11695i.mo29252a(android.view.ViewGroup):android.support.v7.widget.RecyclerView$v");
    }
}
