package com.p280ss.android.ugc.trill.share.helo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p029v7.app.AppCompatActivity;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.opensdk.core.grant.model.GrantInfo;
import com.bytedance.opensdk.p618a.C12256a;
import com.bytedance.opensdk.p618a.C12257b;
import com.bytedance.opensdk.p618a.C12258c;
import com.bytedance.opensdk.p618a.C12259d.C12260a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.trill.share.helo.HeloApiManager.C45120a;
import com.p280ss.android.ugc.trill.share.helo.p1768a.C45138a;
import com.p280ss.android.ugc.trill.share.helo.p1768a.C45139b;
import com.p280ss.android.ugc.trill.share.helo.p1769b.C45141a;
import com.p280ss.android.ugc.trill.share.helo.p1769b.C45144b.C45145a;
import com.p280ss.android.ugc.trill.share.helo.p1770c.C45147a;
import com.p280ss.android.ugc.trill.share.helo.p1771d.C45148a;
import com.p280ss.android.ugc.trill.share.helo.p1771d.C45149b;
import com.p280ss.android.ugc.trill.share.p1767a.C45078a;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p1870h.C47591c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.trill.share.helo.a */
public final class C45123a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f115967a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45123a.class), "emptyHeloApi", "getEmptyHeloApi()Lcom/ss/android/ugc/trill/share/helo/IOpenAuth;"))};

    /* renamed from: e */
    public static final C7541d f115968e = C7546e.m23569a(C45125b.f115977a);

    /* renamed from: f */
    public static final C7541d f115969f = C7546e.m23569a(C45126c.f115978a);

    /* renamed from: g */
    public static final C45124a f115970g = new C45124a(null);

    /* renamed from: b */
    public C12258c f115971b;

    /* renamed from: c */
    public C45147a f115972c;

    /* renamed from: d */
    public C7321c f115973d;

    /* renamed from: h */
    private final C7541d f115974h;

    /* renamed from: i */
    private C45140b<C45148a, C45138a> f115975i;

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$a */
    public static final class C45124a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f115976a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45124a.class), "instance", "getInstance()Lcom/ss/android/ugc/trill/share/helo/HeloProxyService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45124a.class), "sp", "getSp()Lcom/ss/android/ugc/trill/share/model/IVideoPublishShareCache;"))};

        private C45124a() {
        }

        /* renamed from: a */
        public static C45123a m142292a() {
            return (C45123a) C45123a.f115968e.getValue();
        }

        /* renamed from: b */
        public static C45078a m142293b() {
            return (C45078a) C45123a.f115969f.getValue();
        }

        public /* synthetic */ C45124a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$b */
    static final class C45125b extends Lambda implements C7561a<C45123a> {

        /* renamed from: a */
        public static final C45125b f115977a = new C45125b();

        C45125b() {
            super(0);
        }

        /* renamed from: a */
        private static C45123a m142294a() {
            return new C45123a(null);
        }

        public final /* synthetic */ Object invoke() {
            return m142294a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$c */
    static final class C45126c extends Lambda implements C7561a<C45078a> {

        /* renamed from: a */
        public static final C45126c f115978a = new C45126c();

        C45126c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m142295a();
        }

        /* renamed from: a */
        private static C45078a m142295a() {
            return (C45078a) C23336d.m76560a(AwemeApplication.m21341a(), C45078a.class);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$d */
    public static final class C45127d implements C12256a {

        /* renamed from: a */
        final /* synthetic */ C45138a f115979a;

        /* renamed from: com.ss.android.ugc.trill.share.helo.a$d$a */
        static final class C45128a<V> implements Callable<Void> {

            /* renamed from: a */
            final /* synthetic */ C45127d f115980a;

            /* renamed from: b */
            final /* synthetic */ C12257b f115981b;

            C45128a(C45127d dVar, C12257b bVar) {
                this.f115980a = dVar;
                this.f115981b = bVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                switch (this.f115981b.f32582a) {
                    case 0:
                        this.f115980a.f115979a.mo107625a();
                        break;
                    case 1:
                        this.f115980a.f115979a.mo107626a(this.f115981b.f32582a, this.f115981b.f32583b, this.f115981b.f32584c);
                        break;
                    default:
                        this.f115980a.f115979a.mo107626a(this.f115981b.f32582a, this.f115981b.f32583b, this.f115981b.f32584c);
                        break;
                }
                return null;
            }
        }

        C45127d(C45138a aVar) {
            this.f115979a = aVar;
        }

        /* renamed from: a */
        public final void mo30070a(C12257b bVar) {
            C7573i.m23587b(bVar, "result");
            C1592h.m7855a((Callable<TResult>) new C45128a<TResult>(this, bVar), C1592h.f5958b);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$e */
    static final class C45129e extends Lambda implements C7561a<C451301> {

        /* renamed from: a */
        public static final C45129e f115982a = new C45129e();

        C45129e() {
            super(0);
        }

        /* renamed from: a */
        private static C451301 m142298a() {
            return new C45140b<C45148a, C45138a>() {
                /* renamed from: a */
                private static void m142299a(Activity activity, C45148a aVar, C45138a aVar2) {
                    C7573i.m23587b(activity, "activity");
                    C7573i.m23587b(aVar, "param");
                    C7573i.m23587b(aVar2, "callback");
                }

                /* renamed from: a */
                public final void mo107690a() {
                }

                /* renamed from: a */
                public final void mo107691a(int i, int i2, Intent intent) {
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo107692a(Activity activity, Object obj, Object obj2) {
                    m142299a(activity, (C45148a) obj, (C45138a) obj2);
                }
            };
        }

        public final /* synthetic */ Object invoke() {
            return m142298a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$f */
    public static final class C45131f implements C45140b<C45148a, C45138a> {

        /* renamed from: a */
        final /* synthetic */ C45123a f115983a;

        /* renamed from: a */
        public final void mo107690a() {
            C7321c cVar = this.f115983a.f115973d;
            if (cVar != null) {
                cVar.dispose();
            }
            C12258c cVar2 = this.f115983a.f115971b;
            if (cVar2 != null) {
                cVar2.mo30071a();
            }
        }

        C45131f(C45123a aVar) {
            this.f115983a = aVar;
        }

        /* renamed from: a */
        public final void mo107691a(int i, int i2, Intent intent) {
            C12258c cVar = this.f115983a.f115971b;
            if (cVar != null) {
                cVar.mo30072a(i, i2, intent);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo107692a(Activity activity, C45148a aVar, C45138a aVar2) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(aVar, "param");
            C7573i.m23587b(aVar2, "callback");
            if (activity instanceof AppCompatActivity) {
                this.f115983a.mo107685a((AppCompatActivity) activity, aVar, aVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$g */
    static final class C45132g extends Lambda implements C7562b<C45147a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C45123a f115984a;

        /* renamed from: b */
        final /* synthetic */ C45139b f115985b;

        C45132g(C45123a aVar, C45139b bVar) {
            this.f115984a = aVar;
            this.f115985b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m142307a((C45147a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m142307a(C45147a aVar) {
            C45124a.m142293b().mo60413c(aVar.mo107697a());
            C45124a.m142293b().mo60414d(aVar.mo107698b());
            this.f115984a.f115972c = aVar;
            this.f115985b.mo107627a(aVar.mo107697a(), aVar.mo107698b());
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$h */
    static final class C45133h extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C45139b f115986a;

        C45133h(C45139b bVar) {
            this.f115986a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m142308a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m142308a(Throwable th) {
            C7573i.m23587b(th, "it");
            th.getMessage();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$i */
    static final class C45134i extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C45134i f115987a = new C45134i();

        C45134i() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$j */
    static final class C45135j extends Lambda implements C7562b<C45147a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C45123a f115988a;

        /* renamed from: b */
        final /* synthetic */ AppCompatActivity f115989b;

        /* renamed from: c */
        final /* synthetic */ C45148a f115990c;

        /* renamed from: d */
        final /* synthetic */ C45138a f115991d;

        C45135j(C45123a aVar, AppCompatActivity appCompatActivity, C45148a aVar2, C45138a aVar3) {
            this.f115988a = aVar;
            this.f115989b = appCompatActivity;
            this.f115990c = aVar2;
            this.f115991d = aVar3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m142309a((C45147a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m142309a(C45147a aVar) {
            C45123a aVar2 = this.f115988a;
            AppCompatActivity appCompatActivity = this.f115989b;
            C45148a aVar3 = this.f115990c;
            C7573i.m23582a((Object) aVar, "config");
            aVar2.mo107686a(appCompatActivity, aVar3, aVar, this.f115991d);
            this.f115988a.f115972c = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$k */
    static final class C45136k extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C45138a f115992a;

        C45136k(C45138a aVar) {
            this.f115992a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m142310a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m142310a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f115992a.mo107626a(-1, th.getMessage(), th.getMessage());
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$l */
    static final class C45137l extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C45137l f115993a = new C45137l();

        C45137l() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: c */
    public static final C45123a m142285c() {
        return C45124a.m142292a();
    }

    /* renamed from: d */
    private final C45140b<C45148a, C45138a> m142286d() {
        return (C45140b) this.f115974h.getValue();
    }

    private C45123a() {
        this.f115974h = C7546e.m23569a(C45129e.f115982a);
    }

    /* renamed from: a */
    public static boolean m142284a() {
        return C45145a.m142328a().mo107694a();
    }

    /* renamed from: b */
    public final C45140b<C45148a, C45138a> mo107688b() {
        if (this.f115975i != null) {
            C45140b<C45148a, C45138a> bVar = this.f115975i;
            if (bVar == null) {
                C7573i.m23580a();
            }
            return bVar;
        } else if (!C6399b.m19946v()) {
            this.f115975i = m142286d();
            C45140b<C45148a, C45138a> bVar2 = this.f115975i;
            if (bVar2 == null) {
                C7573i.m23580a();
            }
            return bVar2;
        } else {
            this.f115975i = new C45131f(this);
            C45140b<C45148a, C45138a> bVar3 = this.f115975i;
            if (bVar3 == null) {
                C7573i.m23580a();
            }
            return bVar3;
        }
    }

    public /* synthetic */ C45123a(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo107687a(C45139b bVar) {
        C7573i.m23587b(bVar, "callback");
        C7492s a = C45120a.m142281a().mo107682a().fetchUserHeloConfiguration().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "HeloApiManager.instance.…dSchedulers.mainThread())");
        this.f115973d = C47591c.m148387a(a, new C45133h(bVar), C45134i.f115987a, new C45132g(this, bVar));
    }

    /* renamed from: a */
    public final void mo107684a(Context context, C45149b bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bVar, "param");
        if (C6399b.m19946v()) {
            C45141a.m142317a(context);
            C12260a aVar = new C12260a();
            aVar.mo30077b(bVar.mo107707b());
            aVar.mo30076a(bVar.mo107706a());
            this.f115971b = aVar.mo30075a();
        }
    }

    /* renamed from: a */
    public final void mo107685a(AppCompatActivity appCompatActivity, C45148a aVar, C45138a aVar2) {
        if (this.f115972c == null) {
            C7492s a = C45120a.m142281a().mo107682a().fetchUserHeloConfiguration().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
            C7573i.m23582a((Object) a, "HeloApiManager.instance.…dSchedulers.mainThread())");
            this.f115973d = C47591c.m148387a(a, new C45136k(aVar2), C45137l.f115993a, new C45135j(this, appCompatActivity, aVar, aVar2));
            return;
        }
        C45147a aVar3 = this.f115972c;
        if (aVar3 == null) {
            C7573i.m23580a();
        }
        mo107686a(appCompatActivity, aVar, aVar3, aVar2);
    }

    /* renamed from: a */
    public final void mo107686a(AppCompatActivity appCompatActivity, C45148a aVar, C45147a aVar2, C45138a aVar3) {
        C45127d dVar = new C45127d(aVar3);
        C12258c cVar = this.f115971b;
        if (cVar != null) {
            cVar.mo30073a(new GrantInfo(aVar.mo107701a(), aVar.mo107702b(), aVar2.f116000a, aVar2.f116001b), appCompatActivity, (C12256a) dVar);
        }
    }
}
