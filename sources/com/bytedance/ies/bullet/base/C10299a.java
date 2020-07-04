package com.bytedance.ies.bullet.base;

import android.app.Application;
import com.bytedance.ies.bullet.base.p535a.C10311a;
import com.bytedance.ies.bullet.core.C10318a.C10319a;
import com.bytedance.ies.bullet.core.C10331b;
import com.bytedance.ies.bullet.core.C10351d;
import com.bytedance.ies.bullet.core.C10353f;
import com.bytedance.ies.bullet.core.common.C10348b;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10380e;
import com.bytedance.ies.bullet.core.kit.C10381f;
import com.bytedance.ies.bullet.core.kit.C10385j;
import com.bytedance.ies.bullet.core.kit.KitApiFinder;
import com.bytedance.ies.bullet.core.kit.KitApiFinder.KitType;
import com.bytedance.ies.bullet.core.kit.bridge.C10361a;
import com.bytedance.ies.bullet.core.kit.bridge.C10374e;
import com.bytedance.ies.bullet.core.kit.bridge.C10376g;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.bytedance.ies.bullet.core.p538a.C10328a;
import com.bytedance.ies.bullet.core.p538a.C10330c;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.bytedance.ies.bullet.kit.p261rn.C10580l;
import com.bytedance.ies.bullet.kit.p261rn.C10581m;
import com.bytedance.ies.bullet.kit.p261rn.C10582n;
import com.bytedance.ies.bullet.kit.web.C10642i;
import com.bytedance.ies.bullet.kit.web.C10643j;
import com.bytedance.ies.bullet.kit.web.C10644k;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.base.a */
public final class C10299a implements C10315b {

    /* renamed from: a */
    public final C10331b f27968a;

    /* renamed from: com.bytedance.ies.bullet.base.a$a */
    public static final class C10300a {

        /* renamed from: a */
        private final C10319a f27969a;

        /* renamed from: b */
        private C10317d f27970b;

        /* renamed from: com.bytedance.ies.bullet.base.a$a$a */
        public static final class C10301a implements C10381f<C10380e> {

            /* renamed from: a */
            final /* synthetic */ C10300a f27971a;

            /* renamed from: b */
            final /* synthetic */ C10316c f27972b;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C10581m mo25035a(C10403b bVar) {
                C7573i.m23587b(bVar, "providerFactory");
                return this.f27972b.mo25066b(bVar);
            }

            C10301a(C10300a aVar, C10316c cVar) {
                this.f27971a = aVar;
                this.f27972b = cVar;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.base.a$a$b */
        public static final class C10302b implements C10381f<C10380e> {

            /* renamed from: a */
            final /* synthetic */ C10300a f27973a;

            /* renamed from: b */
            final /* synthetic */ C10316c f27974b;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C10643j mo25035a(C10403b bVar) {
                C7573i.m23587b(bVar, "providerFactory");
                return this.f27974b.mo25065a(bVar);
            }

            C10302b(C10300a aVar, C10316c cVar) {
                this.f27973a = aVar;
                this.f27974b = cVar;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.base.a$a$c */
        public static final class C10303c implements C10385j<C10644k, C10642i> {

            /* renamed from: a */
            final /* synthetic */ C10353f f27975a;

            /* renamed from: b */
            final /* synthetic */ C10317d f27976b;

            /* access modifiers changed from: private */
            /* renamed from: c */
            public C10644k mo25036a(C10403b bVar) {
                C7573i.m23587b(bVar, "providerFactory");
                return this.f27976b.mo25042a(bVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public C10642i mo25037b(C10403b bVar) {
                C7573i.m23587b(bVar, "providerFactory");
                return this.f27976b.mo25043b(bVar);
            }

            C10303c(C10353f fVar, C10317d dVar) {
                this.f27975a = fVar;
                this.f27976b = dVar;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.base.a$a$d */
        public static final class C10304d implements C10385j<C10582n, C10580l> {

            /* renamed from: a */
            final /* synthetic */ C10353f f27977a;

            /* renamed from: b */
            final /* synthetic */ C10317d f27978b;

            /* access modifiers changed from: private */
            /* renamed from: c */
            public C10582n mo25036a(C10403b bVar) {
                C7573i.m23587b(bVar, "providerFactory");
                return this.f27978b.mo25044c(bVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public C10580l mo25037b(C10403b bVar) {
                C7573i.m23587b(bVar, "providerFactory");
                return this.f27978b.mo25045d(bVar);
            }

            C10304d(C10353f fVar, C10317d dVar) {
                this.f27977a = fVar;
                this.f27978b = dVar;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.base.a$a$e */
        public static final class C10305e implements C10374e {

            /* renamed from: a */
            final /* synthetic */ C10317d f27979a;

            /* renamed from: com.bytedance.ies.bullet.base.a$a$e$a */
            static final class C10306a extends Lambda implements C7562b<C10403b, List<? extends IBridge>> {

                /* renamed from: a */
                final /* synthetic */ C10305e f27980a;

                C10306a(C10305e eVar) {
                    this.f27980a = eVar;
                    super(1);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public List<IBridge> invoke(C10403b bVar) {
                    C7573i.m23587b(bVar, "it");
                    return this.f27980a.f27979a.mo25047f(bVar);
                }
            }

            /* renamed from: com.bytedance.ies.bullet.base.a$a$e$b */
            static final class C10307b extends Lambda implements C7562b<C10403b, C10410d<C10361a>> {

                /* renamed from: a */
                final /* synthetic */ C10305e f27981a;

                C10307b(C10305e eVar) {
                    this.f27981a = eVar;
                    super(1);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C10410d<C10361a> invoke(C10403b bVar) {
                    C7573i.m23587b(bVar, "it");
                    return this.f27981a.f27979a.mo25048g(bVar);
                }
            }

            /* renamed from: com.bytedance.ies.bullet.base.a$a$e$c */
            static final class C10308c extends Lambda implements C7562b<C10403b, List<? extends C10376g>> {

                /* renamed from: a */
                final /* synthetic */ C10305e f27982a;

                C10308c(C10305e eVar) {
                    this.f27982a = eVar;
                    super(1);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public List<C10376g> invoke(C10403b bVar) {
                    C7573i.m23587b(bVar, "it");
                    return this.f27982a.f27979a.mo25046e(bVar);
                }
            }

            /* renamed from: a */
            public final C7562b<C10403b, List<C10376g>> mo25038a() {
                return new C10308c<>(this);
            }

            /* renamed from: b */
            public final C7562b<C10403b, List<IBridge>> mo25039b() {
                return new C10306a<>(this);
            }

            /* renamed from: c */
            public final C7562b<C10403b, C10410d<C10361a>> mo25040c() {
                return new C10307b<>(this);
            }

            C10305e(C10317d dVar) {
                this.f27979a = dVar;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.base.a$a$f */
        public static final class C10309f implements C10330c {

            /* renamed from: a */
            final /* synthetic */ C10317d f27983a;

            /* renamed from: com.bytedance.ies.bullet.base.a$a$f$a */
            static final class C10310a extends Lambda implements C7562b<C10403b, C10328a> {

                /* renamed from: a */
                final /* synthetic */ C10309f f27984a;

                C10310a(C10309f fVar) {
                    this.f27984a = fVar;
                    super(1);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C10328a invoke(C10403b bVar) {
                    C7573i.m23587b(bVar, "it");
                    return this.f27984a.f27983a.mo25049h(bVar);
                }
            }

            /* renamed from: a */
            public final C7562b<C10403b, C10328a> mo25041a() {
                return new C10310a<>(this);
            }

            C10309f(C10317d dVar) {
                this.f27983a = dVar;
            }
        }

        public C10300a() {
            C10319a aVar = new C10319a();
            C10378c a = KitApiFinder.m30650a(KitType.KIT_RN);
            if (a != null) {
                aVar.mo25077a(a);
            }
            C10378c a2 = KitApiFinder.m30650a(KitType.KIT_WEB);
            if (a2 != null) {
                aVar.mo25077a(a2);
            }
            this.f27969a = aVar;
        }

        /* renamed from: a */
        public final C10299a mo25034a() {
            C10319a aVar = this.f27969a;
            C10317d dVar = this.f27970b;
            if (dVar == null) {
                dVar = new C10311a();
            }
            aVar.mo25076a(m30506b(dVar));
            return new C10299a(aVar.mo25082a(), null);
        }

        /* renamed from: a */
        public final C10300a mo25029a(C10317d dVar) {
            C7573i.m23587b(dVar, "packageBundle");
            this.f27970b = dVar;
            return this;
        }

        /* renamed from: a */
        public final C10300a mo25030a(C10334a aVar) {
            C7573i.m23587b(aVar, "resourceLoader");
            this.f27969a.mo25074a(aVar);
            return this;
        }

        /* renamed from: a */
        public final C10300a mo25027a(Application application) {
            C7573i.m23587b(application, "application");
            C10319a aVar = this.f27969a;
            C10403b bVar = new C10403b();
            bVar.mo25201a(Application.class, application);
            aVar.mo25078a(bVar);
            return this;
        }

        /* renamed from: b */
        private static C10351d m30506b(C10317d dVar) {
            C10353f fVar = new C10353f(new C10305e(dVar), new C10309f(dVar));
            Class b = KitApiFinder.m30651b(KitType.KIT_WEB);
            if (b != null) {
                fVar.mo25118a(b, new C10303c(fVar, dVar));
            }
            Class b2 = KitApiFinder.m30651b(KitType.KIT_RN);
            if (b2 != null) {
                fVar.mo25118a(b2, new C10304d(fVar, dVar));
            }
            return fVar;
        }

        /* renamed from: a */
        public final C10300a mo25028a(C10316c cVar) {
            C7573i.m23587b(cVar, "globalSettingsBundle");
            Class b = KitApiFinder.m30651b(KitType.KIT_RN);
            if (b != null) {
                this.f27969a.mo25080a(b, (C10381f<Y>) new C10301a<Y>(this, cVar));
            }
            Class b2 = KitApiFinder.m30651b(KitType.KIT_WEB);
            if (b2 != null) {
                this.f27969a.mo25080a(b2, (C10381f<Y>) new C10302b<Y>(this, cVar));
            }
            return this;
        }

        /* renamed from: a */
        public final C10300a mo25031a(C10348b bVar) {
            C7573i.m23587b(bVar, "deviceInfo");
            this.f27969a.mo25075a(bVar);
            return this;
        }

        /* renamed from: a */
        public final C10300a mo25032a(C10425c cVar) {
            C7573i.m23587b(cVar, "reporter");
            this.f27969a.mo25079a(cVar);
            return this;
        }

        /* renamed from: a */
        public final C10300a mo25033a(String str, C10317d dVar) {
            C7573i.m23587b(str, "name");
            C7573i.m23587b(dVar, "packageBundle");
            this.f27969a.mo25081a(str, m30506b(dVar));
            return this;
        }
    }

    /* renamed from: a */
    public final C10331b mo25026a() {
        return this.f27968a;
    }

    private C10299a(C10331b bVar) {
        this.f27968a = bVar;
    }

    public /* synthetic */ C10299a(C10331b bVar, C7571f fVar) {
        this(bVar);
    }
}
