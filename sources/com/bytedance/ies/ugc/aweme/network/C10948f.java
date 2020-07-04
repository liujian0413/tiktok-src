package com.bytedance.ies.ugc.aweme.network;

import android.app.Application;
import bolts.C1592h;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.ttnet.C12953c;
import com.bytedance.ttnet.p265b.C6482a;
import com.p280ss.android.common.p852c.C19279b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.ugc.aweme.network.f */
public final class C10948f {

    /* renamed from: a */
    public final Application f29619a;

    /* renamed from: b */
    public final C12953c f29620b;

    /* renamed from: c */
    public final C6482a f29621c;

    /* renamed from: d */
    public final C19279b f29622d;

    /* renamed from: e */
    public final int f29623e;

    /* renamed from: f */
    public final String f29624f;

    /* renamed from: g */
    public final String f29625g;

    /* renamed from: h */
    public final boolean f29626h;

    /* renamed from: i */
    public final Executor f29627i;

    /* renamed from: j */
    public final String f29628j;

    /* renamed from: k */
    public final boolean f29629k;

    /* renamed from: l */
    public final List<C12469a> f29630l;

    /* renamed from: m */
    public final C10965j<String> f29631m;

    /* renamed from: n */
    public final C10965j<Boolean> f29632n;

    /* renamed from: o */
    public final C10965j<Integer> f29633o;

    /* renamed from: p */
    public final C10965j<Integer> f29634p;

    /* renamed from: q */
    public final C10965j<Boolean> f29635q;

    /* renamed from: r */
    public final C10965j<Boolean> f29636r;

    /* renamed from: com.bytedance.ies.ugc.aweme.network.f$a */
    public static final class C10949a implements C10965j<Integer> {

        /* renamed from: a */
        final /* synthetic */ C10955g f29637a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Integer mo26439a() {
            return (Integer) this.f29637a.f29658o.invoke();
        }

        C10949a(C10955g gVar) {
            this.f29637a = gVar;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.f$b */
    public static final class C10950b implements C10965j<String> {

        /* renamed from: a */
        final /* synthetic */ C10955g f29638a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public String mo26439a() {
            return (String) this.f29638a.f29655l.invoke();
        }

        C10950b(C10955g gVar) {
            this.f29638a = gVar;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.f$c */
    public static final class C10951c implements C10965j<Integer> {

        /* renamed from: a */
        final /* synthetic */ C10955g f29639a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Integer mo26439a() {
            return (Integer) this.f29639a.f29657n.invoke();
        }

        C10951c(C10955g gVar) {
            this.f29639a = gVar;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.f$d */
    public static final class C10952d implements C10965j<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10955g f29640a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Boolean mo26439a() {
            return (Boolean) this.f29640a.f29660q.invoke();
        }

        C10952d(C10955g gVar) {
            this.f29640a = gVar;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.f$e */
    public static final class C10953e implements C10965j<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10955g f29641a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Boolean mo26439a() {
            return (Boolean) this.f29641a.f29659p.invoke();
        }

        C10953e(C10955g gVar) {
            this.f29641a = gVar;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.f$f */
    public static final class C10954f implements C10965j<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10955g f29642a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Boolean mo26439a() {
            return (Boolean) this.f29642a.f29656m.invoke();
        }

        C10954f(C10955g gVar) {
            this.f29642a = gVar;
        }
    }

    public C10948f(C10955g gVar) {
        C7573i.m23587b(gVar, "builder");
        this.f29619a = gVar.f29661r;
        this.f29620b = gVar.f29644a;
        this.f29621c = gVar.f29645b;
        this.f29622d = gVar.f29646c;
        this.f29623e = gVar.f29647d;
        this.f29624f = gVar.f29648e;
        this.f29625g = gVar.f29649f;
        this.f29626h = gVar.f29650g;
        Executor executor = gVar.f29651h;
        if (executor == null) {
            ExecutorService executorService = C1592h.f5957a;
            C7573i.m23582a((Object) executorService, "Task.BACKGROUND_EXECUTOR");
            executor = executorService;
        }
        this.f29627i = executor;
        this.f29628j = gVar.f29652i;
        this.f29629k = gVar.f29653j;
        this.f29630l = gVar.f29654k;
        this.f29631m = new C10950b(gVar);
        this.f29632n = new C10954f(gVar);
        this.f29633o = new C10951c(gVar);
        this.f29634p = new C10949a(gVar);
        this.f29635q = new C10953e(gVar);
        this.f29636r = new C10952d(gVar);
    }
}
