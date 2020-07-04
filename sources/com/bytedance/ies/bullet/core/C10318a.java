package com.bytedance.ies.bullet.core;

import android.net.Uri;
import com.bytedance.ies.bullet.core.common.C10348b;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10379d;
import com.bytedance.ies.bullet.core.kit.C10380e;
import com.bytedance.ies.bullet.core.kit.C10381f;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.kit.C10384i;
import com.bytedance.ies.bullet.core.kit.C10385j;
import com.bytedance.ies.bullet.core.kit.C10386k;
import com.bytedance.ies.bullet.core.kit.C10387l;
import com.bytedance.ies.bullet.core.kit.C10394o;
import com.bytedance.ies.bullet.core.kit.C10395p;
import com.bytedance.ies.bullet.core.kit.C10397r;
import com.bytedance.ies.bullet.core.kit.C10400u;
import com.bytedance.ies.bullet.core.kit.bridge.C10374e;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.pipeline.C10408b;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import com.bytedance.ies.bullet.core.model.pipeline.C10411e;
import com.bytedance.ies.bullet.core.model.pipeline.C10412f;
import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.a */
public final class C10318a implements C10331b {

    /* renamed from: a */
    public final C10334a f27985a;

    /* renamed from: b */
    public final C10425c f27986b;

    /* renamed from: c */
    public final C10348b f27987c;

    /* renamed from: d */
    public final C7563m<Iterable<? extends C10410d<C10397r>>, C10411e<C10397r>, C10412f<C10397r>> f27988d;

    /* renamed from: e */
    public final List<C10378c<?, ?, ?, ?>> f27989e;

    /* renamed from: f */
    public final C10381f<?> f27990f;

    /* renamed from: g */
    public final C10351d f27991g;

    /* renamed from: h */
    public final Map<String, C10351d> f27992h;

    /* renamed from: i */
    private final Set<C10384i> f27993i;

    /* renamed from: j */
    private final C10403b f27994j;

    /* renamed from: com.bytedance.ies.bullet.core.a$a */
    public static final class C10319a {

        /* renamed from: a */
        private C10403b f27995a = new C10403b();

        /* renamed from: b */
        private C10334a f27996b;

        /* renamed from: c */
        private C10425c f27997c;

        /* renamed from: d */
        private C10348b f27998d;

        /* renamed from: e */
        private C7563m<? super Iterable<? extends C10410d<C10397r>>, ? super C10411e<C10397r>, ? extends C10412f<C10397r>> f27999e = C10320a.f28004a;

        /* renamed from: f */
        private final List<C10378c<?, ?, ?, ?>> f28000f = new ArrayList();

        /* renamed from: g */
        private C10381f<?> f28001g;

        /* renamed from: h */
        private C10351d f28002h;

        /* renamed from: i */
        private final Map<String, C10351d> f28003i = new LinkedHashMap();

        /* renamed from: com.bytedance.ies.bullet.core.a$a$a */
        static final class C10320a extends Lambda implements C7563m<Iterable<? extends C10410d<C10397r>>, C10411e<C10397r>, C10408b<C10397r>> {

            /* renamed from: a */
            public static final C10320a f28004a = new C10320a();

            C10320a() {
                super(2);
            }

            /* renamed from: a */
            private static C10408b<C10397r> m30588a(Iterable<? extends C10410d<C10397r>> iterable, C10411e<C10397r> eVar) {
                C7573i.m23587b(iterable, "processors");
                return new C10408b<>(iterable, eVar);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m30588a((Iterable) obj, (C10411e) obj2);
            }
        }

        /* renamed from: a */
        public final C10318a mo25082a() {
            C10318a aVar = new C10318a(this.f27995a, this.f27996b, this.f27997c, this.f27998d, this.f27999e, this.f28000f, this.f28001g, this.f28002h, this.f28003i, null);
            return aVar;
        }

        /* renamed from: a */
        public final C10319a mo25074a(C10334a aVar) {
            C7573i.m23587b(aVar, "resourceLoader");
            this.f27996b = aVar;
            return this;
        }

        /* renamed from: a */
        public final C10319a mo25075a(C10348b bVar) {
            C7573i.m23587b(bVar, "deviceInfo");
            this.f27998d = bVar;
            return this;
        }

        /* renamed from: a */
        public final C10319a mo25076a(C10351d dVar) {
            C7573i.m23587b(dVar, "packageRegistry");
            this.f28002h = dVar;
            return this;
        }

        /* renamed from: a */
        public final <U extends C10386k, V extends C10379d, W extends C10382g, X extends C10380e> C10319a mo25077a(C10378c<U, V, W, X> cVar) {
            C7573i.m23587b(cVar, "api");
            this.f28000f.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C10319a mo25078a(C10403b bVar) {
            C7573i.m23587b(bVar, "contextProviderFactory");
            this.f27995a = bVar;
            return this;
        }

        /* renamed from: a */
        public final C10319a mo25079a(C10425c cVar) {
            C7573i.m23587b(cVar, "reporter");
            this.f27997c = cVar;
            return this;
        }

        /* renamed from: a */
        public final <U extends C10378c<? extends V, ? extends W, ? extends X, ? extends Y>, V extends C10386k, W extends C10379d, X extends C10382g, Y extends C10380e> C10319a mo25080a(Class<? extends U> cls, C10381f<Y> fVar) {
            C7573i.m23587b(cls, "apiClass");
            C7573i.m23587b(fVar, "globalSettingsProviderFactory");
            this.f28001g = fVar;
            return this;
        }

        /* renamed from: a */
        public final C10319a mo25081a(String str, C10351d dVar) {
            C7573i.m23587b(str, "name");
            C7573i.m23587b(dVar, "packageRegistry");
            this.f28003i.put(str, dVar);
            return this;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.a$b */
    public static final class C10321b implements C10410d<C10397r> {

        /* renamed from: a */
        final /* synthetic */ C10318a f28005a;

        /* renamed from: b */
        final /* synthetic */ C10410d f28006b;

        /* renamed from: c */
        final /* synthetic */ C10387l f28007c;

        /* renamed from: d */
        final /* synthetic */ C10378c f28008d;

        /* renamed from: e */
        final /* synthetic */ C10400u f28009e;

        /* renamed from: f */
        final /* synthetic */ List f28010f;

        /* renamed from: com.bytedance.ies.bullet.core.a$b$a */
        static final class C10322a extends Lambda implements C7562b<C10397r, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C10321b f28011a;

            /* renamed from: b */
            final /* synthetic */ C7562b f28012b;

            /* renamed from: c */
            final /* synthetic */ C7562b f28013c;

            C10322a(C10321b bVar, C7562b bVar2, C7562b bVar3) {
                this.f28011a = bVar;
                this.f28012b = bVar2;
                this.f28013c = bVar3;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m30591a((C10397r) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m30591a(C10397r rVar) {
                C7573i.m23587b(rVar, "kitProcessUnit");
                this.f28011a.f28005a.mo25071a(this.f28011a.f28007c, this.f28011a.f28008d, this.f28011a.f28009e, this.f28011a.f28010f, rVar, this.f28012b, this.f28013c);
            }
        }

        /* renamed from: com.bytedance.ies.bullet.core.a$b$b */
        static final class C10323b extends Lambda implements C7562b<Throwable, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C7562b f28014a;

            C10323b(C7562b bVar) {
                this.f28014a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m30592a((Throwable) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m30592a(Throwable th) {
                C7573i.m23587b(th, "it");
                this.f28014a.invoke(th);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo25083a(C10397r rVar, C7562b<? super C10397r, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
            C7573i.m23587b(rVar, "input");
            C7573i.m23587b(bVar, "resolve");
            C7573i.m23587b(bVar2, "reject");
            this.f28006b.mo25083a(rVar, new C10322a(this, bVar, bVar2), new C10323b(bVar2));
        }

        C10321b(C10318a aVar, C10410d<C10397r> dVar, C10387l lVar, C10378c cVar, C10400u uVar, List list) {
            this.f28005a = aVar;
            this.f28006b = dVar;
            this.f28007c = lVar;
            this.f28008d = cVar;
            this.f28009e = uVar;
            this.f28010f = list;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.a$c */
    static final class C10324c extends Lambda implements C7562b<Uri, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10382g f28015a;

        /* renamed from: b */
        final /* synthetic */ C10318a f28016b;

        /* renamed from: c */
        final /* synthetic */ boolean f28017c;

        /* renamed from: d */
        final /* synthetic */ C10387l f28018d;

        /* renamed from: e */
        final /* synthetic */ C10378c f28019e;

        /* renamed from: f */
        final /* synthetic */ List f28020f;

        /* renamed from: g */
        final /* synthetic */ C10397r f28021g;

        /* renamed from: h */
        final /* synthetic */ C7562b f28022h;

        /* renamed from: i */
        final /* synthetic */ C7562b f28023i;

        C10324c(C10382g gVar, C10318a aVar, boolean z, C10387l lVar, C10378c cVar, List list, C10397r rVar, C7562b bVar, C7562b bVar2) {
            this.f28015a = gVar;
            this.f28016b = aVar;
            this.f28017c = z;
            this.f28018d = lVar;
            this.f28019e = cVar;
            this.f28020f = list;
            this.f28021g = rVar;
            this.f28022h = bVar;
            this.f28023i = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30593a((Uri) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30593a(Uri uri) {
            C7573i.m23587b(uri, "it");
            C10403b bVar = this.f28021g.f28127b;
            bVar.mo25203b(C10394o.class, new C10394o(this.f28015a, this.f28017c));
            this.f28022h.invoke(new C10397r(uri, bVar));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.a$d */
    static final class C10325d extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10382g f28024a;

        /* renamed from: b */
        final /* synthetic */ C10318a f28025b;

        /* renamed from: c */
        final /* synthetic */ boolean f28026c;

        /* renamed from: d */
        final /* synthetic */ C10387l f28027d;

        /* renamed from: e */
        final /* synthetic */ C10378c f28028e;

        /* renamed from: f */
        final /* synthetic */ List f28029f;

        /* renamed from: g */
        final /* synthetic */ C10397r f28030g;

        /* renamed from: h */
        final /* synthetic */ C7562b f28031h;

        /* renamed from: i */
        final /* synthetic */ C7562b f28032i;

        C10325d(C10382g gVar, C10318a aVar, boolean z, C10387l lVar, C10378c cVar, List list, C10397r rVar, C7562b bVar, C7562b bVar2) {
            this.f28024a = gVar;
            this.f28025b = aVar;
            this.f28026c = z;
            this.f28027d = lVar;
            this.f28028e = cVar;
            this.f28029f = list;
            this.f28030g = rVar;
            this.f28031h = bVar;
            this.f28032i = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30594a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30594a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f28024a.mo25164f();
            this.f28032i.invoke(th);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.a$e */
    static final class C10326e extends Lambda implements C7562b<C10397r, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10318a f28033a;

        /* renamed from: b */
        final /* synthetic */ Uri f28034b;

        /* renamed from: c */
        final /* synthetic */ C10403b f28035c;

        /* renamed from: d */
        final /* synthetic */ C48006q f28036d;

        /* renamed from: e */
        final /* synthetic */ C7562b f28037e;

        C10326e(C10318a aVar, Uri uri, C10403b bVar, C48006q qVar, C7562b bVar2) {
            this.f28033a = aVar;
            this.f28034b = uri;
            this.f28035c = bVar;
            this.f28036d = qVar;
            this.f28037e = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30595a((C10397r) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30595a(C10397r rVar) {
            C7573i.m23587b(rVar, "unit");
            C10394o oVar = (C10394o) rVar.f28127b.mo25202b(C10394o.class);
            if (oVar != null) {
                this.f28036d.invoke(oVar.f28122a, rVar.f28126a, Boolean.valueOf(oVar.f28123b));
                return;
            }
            C7562b bVar = this.f28037e;
            StringBuilder sb = new StringBuilder("No result resolved for uri ");
            sb.append(this.f28034b);
            bVar.invoke(new IllegalStateException(sb.toString()));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.a$f */
    static final class C10327f extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10318a f28038a;

        /* renamed from: b */
        final /* synthetic */ Uri f28039b;

        /* renamed from: c */
        final /* synthetic */ C10403b f28040c;

        /* renamed from: d */
        final /* synthetic */ C48006q f28041d;

        /* renamed from: e */
        final /* synthetic */ C7562b f28042e;

        C10327f(C10318a aVar, Uri uri, C10403b bVar, C48006q qVar, C7562b bVar2) {
            this.f28038a = aVar;
            this.f28039b = uri;
            this.f28040c = bVar;
            this.f28041d = qVar;
            this.f28042e = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30596a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30596a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f28042e.invoke(th);
        }
    }

    /* renamed from: a */
    public final C10403b mo25069a() {
        return this.f27994j;
    }

    /* renamed from: b */
    public final void mo25073b(C10384i iVar) {
        C7573i.m23587b(iVar, "instancesHolder");
        this.f27993i.remove(iVar);
    }

    /* renamed from: a */
    public final void mo25070a(C10384i iVar) {
        C7573i.m23587b(iVar, "instancesHolder");
        this.f27993i.add(iVar);
    }

    /* renamed from: a */
    public final <T extends C10378c<?, ?, ?, ?>> C10382g mo25067a(Class<? extends T> cls) {
        C7573i.m23587b(cls, "clazz");
        for (C10384i a : this.f27993i) {
            C10382g a2 = a.mo25067a(cls);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C10382g mo25068a(String str) {
        C7573i.m23587b(str, "sessionId");
        for (C10384i a : this.f27993i) {
            C10382g a2 = a.mo25068a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C10336c m30569a(C10378c<?, ?, ?, ?> cVar, List<String> list) {
        C10385j jVar;
        C10351d dVar = this.f27991g;
        C10374e eVar = null;
        if (dVar != null) {
            jVar = dVar.mo25116a(cVar.getClass());
        } else {
            jVar = null;
        }
        C10351d dVar2 = this.f27991g;
        if (dVar2 != null) {
            eVar = dVar2.mo25115a();
        }
        C10374e eVar2 = eVar;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Iterable<String> iterable = list;
        Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (String str : iterable) {
            arrayList3.add((C10351d) this.f27992h.get(str));
        }
        for (C10351d dVar3 : (List) arrayList3) {
            if (dVar3 != null) {
                C10385j a = dVar3.mo25116a(cVar.getClass());
                if (a != null) {
                    arrayList.add(a);
                }
                arrayList2.add(dVar3.mo25115a());
            }
        }
        if (cVar != null) {
            C10352e eVar3 = new C10352e(cVar, jVar, arrayList, eVar2, arrayList2);
            return eVar3;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
    }

    /* renamed from: a */
    private final C10382g m30570a(C10378c<?, ?, ?, ?> cVar, C10400u uVar, List<String> list, C10403b bVar) {
        C10336c a = m30569a(cVar, list);
        bVar.mo25201a(C10334a.class, this.f27985a);
        bVar.mo25201a(C10425c.class, this.f27986b);
        bVar.mo25201a(C10348b.class, this.f27987c);
        if (cVar != null) {
            return cVar.provideInstanceApi(uVar, list, a, bVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
    }

    /* renamed from: a */
    private final C10410d<C10397r> m30571a(C10410d<C10397r> dVar, C10387l lVar, C10400u uVar, C10378c<?, ?, ?, ?> cVar, List<String> list) {
        C10321b bVar = new C10321b(this, dVar, lVar, cVar, uVar, list);
        return bVar;
    }

    /* renamed from: a */
    public final void mo25071a(C10387l lVar, C10378c<?, ?, ?, ?> cVar, C10400u uVar, List<String> list, C10397r rVar, C7562b<? super C10397r, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        boolean z;
        C10387l lVar2 = lVar;
        C10378c<?, ?, ?, ?> cVar2 = cVar;
        List<String> list2 = list;
        C10397r rVar2 = rVar;
        C10382g a = lVar2.mo25067a(cVar.getClass());
        if (a == null) {
            z = true;
        } else {
            z = false;
        }
        if (a == null) {
            C10382g a2 = m30570a(cVar2, uVar, list2, rVar2.f28127b);
            if (z) {
                lVar.mo25110a();
                lVar2.mo25166a(cVar.getClass(), a2);
                if (cVar2 != null) {
                    cVar2.onApiMounted(a2);
                    a2.mo25163e();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
                }
            } else if (!a2.mo25160b().equals(list2)) {
                a2.mo25159a(list2, m30569a(cVar2, list2));
            }
            boolean z2 = z;
            C10387l lVar3 = lVar;
            C10378c<?, ?, ?, ?> cVar3 = cVar;
            List<String> list3 = list;
            C10397r rVar3 = rVar;
            Uri uri = rVar2.f28126a;
            C7562b<? super C10397r, C7581n> bVar3 = bVar;
            C10382g gVar = a2;
            C10324c cVar4 = new C10324c(a2, this, z2, lVar3, cVar3, list3, rVar3, bVar3, bVar2);
            C10382g gVar2 = gVar;
            C7562b bVar4 = cVar4;
            C10325d dVar = new C10325d(gVar2, this, z2, lVar3, cVar3, list3, rVar3, bVar3, bVar2);
            gVar2.mo25083a(uri, bVar4, dVar);
        }
    }

    /* renamed from: a */
    public final void mo25072a(C10387l lVar, C10400u uVar, Uri uri, List<String> list, C10403b bVar, C48006q<? super C10382g, ? super Uri, ? super Boolean, C7581n> qVar, C7562b<? super Throwable, C7581n> bVar2) {
        Uri uri2 = uri;
        C10403b bVar3 = bVar;
        C7573i.m23587b(lVar, "instancesHolder");
        C7573i.m23587b(uVar, "sessionInfo");
        C7573i.m23587b(uri2, "uri");
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(bVar3, "providerFactory");
        C7573i.m23587b(qVar, "resolve");
        C7573i.m23587b(bVar2, "reject");
        Iterable<C10378c> iterable = this.f27989e;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (C10378c cVar : iterable) {
            arrayList.add(m30571a(cVar.provideProcessor(), lVar, uVar, cVar, list));
        }
        C10412f fVar = (C10412f) this.f27988d.invoke(C7525m.m23509d((Collection<? extends T>) (List) arrayList), C10395p.f28124a);
        bVar3.mo25200a(mo25069a());
        C10397r rVar = new C10397r(uri2, bVar3);
        Uri uri3 = uri;
        C10403b bVar4 = bVar;
        C48006q<? super C10382g, ? super Uri, ? super Boolean, C7581n> qVar2 = qVar;
        C7562b<? super Throwable, C7581n> bVar5 = bVar2;
        C10326e eVar = new C10326e(this, uri3, bVar4, qVar2, bVar5);
        C7562b bVar6 = eVar;
        C10327f fVar2 = new C10327f(this, uri3, bVar4, qVar2, bVar5);
        fVar.mo25083a(rVar, bVar6, fVar2);
    }

    private C10318a(C10403b bVar, C10334a aVar, C10425c cVar, C10348b bVar2, C7563m<? super Iterable<? extends C10410d<C10397r>>, ? super C10411e<C10397r>, ? extends C10412f<C10397r>> mVar, List<C10378c<?, ?, ?, ?>> list, C10381f<?> fVar, C10351d dVar, Map<String, C10351d> map) {
        C10380e eVar;
        this.f27994j = bVar;
        this.f27985a = aVar;
        this.f27986b = cVar;
        this.f27987c = bVar2;
        this.f27988d = mVar;
        this.f27989e = list;
        this.f27990f = fVar;
        this.f27991g = dVar;
        this.f27992h = map;
        mo25069a().mo25201a(C10331b.class, this);
        for (C10378c cVar2 : this.f27989e) {
            if (cVar2 != null) {
                C10381f<?> fVar2 = this.f27990f;
                if (fVar2 != null) {
                    eVar = fVar2.mo25035a(mo25069a());
                } else {
                    eVar = null;
                }
                cVar2.onInitialized(eVar, mo25069a());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
            }
        }
        this.f27993i = new LinkedHashSet();
    }

    public /* synthetic */ C10318a(C10403b bVar, C10334a aVar, C10425c cVar, C10348b bVar2, C7563m mVar, List list, C10381f fVar, C10351d dVar, Map map, C7571f fVar2) {
        this(bVar, aVar, cVar, bVar2, mVar, list, fVar, dVar, map);
    }
}
