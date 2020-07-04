package com.bytedance.ies.ugc.aweme.network;

import android.app.Application;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.ttnet.C12953c;
import com.bytedance.ttnet.p265b.C6482a;
import com.p280ss.android.common.p852c.C19279b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.bytedance.ies.ugc.aweme.network.g */
public final class C10955g {

    /* renamed from: s */
    public static final C10956a f29643s = new C10956a(null);

    /* renamed from: a */
    public C12953c f29644a;

    /* renamed from: b */
    public C6482a f29645b;

    /* renamed from: c */
    public C19279b f29646c;

    /* renamed from: d */
    public int f29647d;

    /* renamed from: e */
    public String f29648e;

    /* renamed from: f */
    public String f29649f;

    /* renamed from: g */
    public boolean f29650g;

    /* renamed from: h */
    public Executor f29651h;

    /* renamed from: i */
    public String f29652i;

    /* renamed from: j */
    public boolean f29653j;

    /* renamed from: k */
    public List<C12469a> f29654k = new ArrayList();

    /* renamed from: l */
    public C7561a<String> f29655l = C10958c.f29663a;

    /* renamed from: m */
    public C7561a<Boolean> f29656m = C10962g.f29667a;

    /* renamed from: n */
    public C7561a<Integer> f29657n = C10959d.f29664a;

    /* renamed from: o */
    public C7561a<Integer> f29658o = C10957b.f29662a;

    /* renamed from: p */
    public C7561a<Boolean> f29659p = C10961f.f29666a;

    /* renamed from: q */
    public C7561a<Boolean> f29660q = C10960e.f29665a;

    /* renamed from: r */
    public final Application f29661r;

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$a */
    public static final class C10956a {
        private C10956a() {
        }

        public /* synthetic */ C10956a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$b */
    static final class C10957b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C10957b f29662a = new C10957b();

        C10957b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(0);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$c */
    static final class C10958c extends Lambda implements C7561a {

        /* renamed from: a */
        public static final C10958c f29663a = new C10958c();

        C10958c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$d */
    static final class C10959d extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C10959d f29664a = new C10959d();

        C10959d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(10);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$e */
    static final class C10960e extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C10960e f29665a = new C10960e();

        C10960e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$f */
    static final class C10961f extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C10961f f29666a = new C10961f();

        C10961f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$g */
    static final class C10962g extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C10962g f29667a = new C10962g();

        C10962g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    public final C10948f mo26440a() {
        return new C10948f(this);
    }

    /* renamed from: b */
    public final void mo26443b(C7561a<Boolean> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f29656m = aVar;
    }

    /* renamed from: c */
    public final void mo26444c(C7561a<Integer> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f29658o = aVar;
    }

    /* renamed from: d */
    public final void mo26445d(C7561a<Boolean> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f29659p = aVar;
    }

    /* renamed from: e */
    public final void mo26446e(C7561a<Boolean> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f29660q = aVar;
    }

    /* renamed from: a */
    public final C10955g mo26441a(C12469a aVar) {
        C7573i.m23587b(aVar, "interceptor");
        C10955g gVar = this;
        gVar.f29654k.add(aVar);
        return gVar;
    }

    /* renamed from: a */
    public final void mo26442a(C7561a<String> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f29655l = aVar;
    }

    public C10955g(Application application) {
        C7573i.m23587b(application, "application");
        this.f29661r = application;
    }
}
