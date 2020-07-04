package com.p280ss.android.ugc.aweme.filter;

import com.bytedance.keva.Keva;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.filter.bg */
public final class C29245bg implements C29243be {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f77161a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C29245bg.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C29246a f77162b = new C29246a(null);

    /* renamed from: c */
    private final C7541d f77163c = C7546e.m23569a(C29247b.f77164a);

    /* renamed from: com.ss.android.ugc.aweme.filter.bg$a */
    public static final class C29246a {
        private C29246a() {
        }

        public /* synthetic */ C29246a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.bg$b */
    static final class C29247b extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C29247b f77164a = new C29247b();

        C29247b() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m95935a() {
            return Keva.getRepo("filter_intensity");
        }

        public final /* synthetic */ Object invoke() {
            return m95935a();
        }
    }

    /* renamed from: a */
    private final Keva m95932a() {
        return (Keva) this.f77163c.getValue();
    }

    /* renamed from: b */
    public final int mo74879b(String str, int i) {
        C7573i.m23587b(str, "key");
        return m95932a().getInt(str, -1);
    }

    /* renamed from: a */
    public final void mo74878a(String str, int i) {
        C7573i.m23587b(str, "key");
        m95932a().storeInt(str, i);
    }
}
