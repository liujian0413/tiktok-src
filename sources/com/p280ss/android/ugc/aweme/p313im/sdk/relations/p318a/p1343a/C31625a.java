package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a */
public final class C31625a<R> extends C31643e<R> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82823a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31625a.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: g */
    public static final C31627b f82824g = new C31627b(null);

    /* renamed from: b */
    public C31654g<R> f82825b;

    /* renamed from: c */
    public C7561a<Boolean> f82826c;

    /* renamed from: d */
    public C7562b<? super C31628c<R>, Boolean> f82827d;

    /* renamed from: e */
    public C7562b<? super List<R>, ? extends List<R>> f82828e;

    /* renamed from: f */
    public volatile boolean f82829f;

    /* renamed from: i */
    private final C7541d f82830i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$a */
    public static final class C31626a<R> {

        /* renamed from: a */
        public final C31625a<R> f82831a = new C31625a<>(null);

        /* renamed from: a */
        public final C31626a<R> mo82417a(C31641d<R> dVar) {
            C7573i.m23587b(dVar, "loadSubscriber");
            C31626a<R> aVar = this;
            aVar.f82831a.mo82429a(dVar);
            return aVar;
        }

        /* renamed from: a */
        public final C31626a<R> mo82418a(C31654g<R> gVar) {
            C7573i.m23587b(gVar, "provider");
            C31626a<R> aVar = this;
            aVar.f82831a.f82825b = gVar;
            return aVar;
        }

        /* renamed from: a */
        public final C31626a<R> mo82419a(C7561a<Boolean> aVar) {
            C7573i.m23587b(aVar, "interceptor");
            C31626a<R> aVar2 = this;
            aVar2.f82831a.f82826c = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public final C31626a<R> mo82420a(C7562b<? super C31628c<R>, Boolean> bVar) {
            C7573i.m23587b(bVar, "interceptor");
            C31626a<R> aVar = this;
            aVar.f82831a.f82827d = bVar;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$b */
    public static final class C31627b {
        private C31627b() {
        }

        /* renamed from: a */
        public static <R> C31626a<R> m102792a() {
            return new C31626a<>();
        }

        public /* synthetic */ C31627b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$c */
    public static final class C31628c<R> {

        /* renamed from: a */
        public final LinkedHashMap<C31643e<R>, List<R>> f82832a;

        /* renamed from: b */
        public final List<R> f82833b;

        /* renamed from: c */
        public final C31643e<R> f82834c;

        public C31628c(LinkedHashMap<C31643e<R>, List<R>> linkedHashMap, List<R> list, C31643e<R> eVar) {
            C7573i.m23587b(linkedHashMap, "resultMap");
            C7573i.m23587b(list, "list");
            C7573i.m23587b(eVar, "loader");
            this.f82832a = linkedHashMap;
            this.f82833b = list;
            this.f82834c = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$d */
    static final class C31629d extends Lambda implements C7561a<C47562b> {

        /* renamed from: a */
        public static final C31629d f82835a = new C31629d();

        C31629d() {
            super(0);
        }

        /* renamed from: a */
        private static C47562b m102793a() {
            return new C47562b();
        }

        public final /* synthetic */ Object invoke() {
            return m102793a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$e */
    static final class C31630e<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ C31625a f82836a;

        /* renamed from: b */
        final /* synthetic */ boolean f82837b;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$e$a */
        static final /* synthetic */ class C31631a extends FunctionReference implements C7561a<List<R>> {
            C31631a(C31644f fVar) {
                super(0, fVar);
            }

            public final String getName() {
                return "loadMoreDirectly";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(C31644f.class);
            }

            public final String getSignature() {
                return "loadMoreDirectly()Ljava/util/List;";
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<R> invoke() {
                return ((C31644f) this.receiver).mo82435l();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$e$b */
        static final /* synthetic */ class C31632b extends FunctionReference implements C7561a<List<R>> {
            C31632b(C31644f fVar) {
                super(0, fVar);
            }

            public final String getName() {
                return "loadMoreDirectly";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(C31644f.class);
            }

            public final String getSignature() {
                return "loadMoreDirectly()Ljava/util/List;";
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<R> invoke() {
                return ((C31644f) this.receiver).mo82435l();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$e$c */
        static final /* synthetic */ class C31633c extends FunctionReference implements C7561a<List<R>> {
            C31633c(C31644f fVar) {
                super(0, fVar);
            }

            public final String getName() {
                return "loadDirectly";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(C31644f.class);
            }

            public final String getSignature() {
                return "loadDirectly()Ljava/util/List;";
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<R> invoke() {
                return ((C31644f) this.receiver).mo82434k();
            }
        }

        C31630e(C31625a aVar, boolean z) {
            this.f82836a = aVar;
            this.f82837b = z;
        }

        public final void subscribe(C47870u<List<R>> uVar) {
            C7561a aVar;
            C7573i.m23587b(uVar, "emitter");
            if (!this.f82836a.mo82416g()) {
                uVar.mo19239a((Object) new ArrayList());
                return;
            }
            if (!this.f82837b) {
                C31654g<R> gVar = this.f82836a.f82825b;
                if (gVar == null) {
                    C7573i.m23580a();
                }
                gVar.mo82443b();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C31644f fVar = null;
            while (true) {
                C31654g<R> gVar2 = this.f82836a.f82825b;
                if (gVar2 == null) {
                    C7573i.m23580a();
                }
                C31644f a = gVar2.mo82440a(true);
                if (a == null) {
                    break;
                }
                if (fVar == null && this.f82837b) {
                    aVar = new C31631a(a);
                } else if (C7573i.m23585a((Object) a, (Object) fVar)) {
                    aVar = new C31632b(a);
                } else {
                    aVar = new C31633c(a);
                }
                if (!this.f82836a.mo82410a(new C31628c<>(linkedHashMap, (List) aVar.invoke(), a))) {
                    break;
                }
                fVar = a;
            }
            uVar.mo19239a((Object) this.f82836a.mo82408a(C31636b.m102799a(linkedHashMap)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$f */
    static final class C31634f<T> implements C7326g<List<R>> {

        /* renamed from: a */
        final /* synthetic */ C31625a f82838a;

        /* renamed from: b */
        final /* synthetic */ boolean f82839b;

        C31634f(C31625a aVar, boolean z) {
            this.f82838a = aVar;
            this.f82839b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<R> list) {
            this.f82838a.f82829f = false;
            C31625a aVar = this.f82838a;
            C7573i.m23582a((Object) list, "it");
            aVar.mo82431a(list, this.f82839b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a$g */
    static final class C31635g<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C31625a f82840a;

        /* renamed from: b */
        final /* synthetic */ boolean f82841b;

        C31635g(C31625a aVar, boolean z) {
            this.f82840a = aVar;
            this.f82841b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f82840a.f82829f = false;
            C31625a aVar = this.f82840a;
            C7573i.m23582a((Object) th, "it");
            aVar.mo82430a(th, this.f82841b);
        }
    }

    /* renamed from: h */
    private final C47562b m102778h() {
        return (C47562b) this.f82830i.getValue();
    }

    /* renamed from: c */
    public final boolean mo82412c() {
        return this.f82829f;
    }

    private C31625a() {
        this.f82830i = C7546e.m23569a(C31629d.f82835a);
    }

    /* renamed from: d */
    public final boolean mo82413d() {
        C31644f fVar;
        C31654g<R> gVar = this.f82825b;
        if (gVar != null) {
            fVar = gVar.mo82440a(true);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo82414e() {
        this.f82829f = false;
        m102778h().mo119660a();
    }

    /* renamed from: a */
    public final void mo82409a() {
        C31625a aVar;
        if (mo82415f()) {
            aVar = this;
        } else {
            aVar = null;
        }
        C31625a aVar2 = aVar;
        if (aVar2 != null) {
            aVar2.m102777a(false);
        }
    }

    /* renamed from: b */
    public final void mo82411b() {
        C31625a aVar;
        if (mo82415f()) {
            aVar = this;
        } else {
            aVar = null;
        }
        C31625a aVar2 = aVar;
        if (aVar2 != null) {
            aVar2.m102777a(true);
        }
    }

    /* renamed from: g */
    public final boolean mo82416g() {
        C7561a<Boolean> aVar = this.f82826c;
        if (aVar != null) {
            Boolean bool = (Boolean) aVar.invoke();
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo82415f() {
        List list;
        boolean z;
        if (!this.f82829f) {
            C31654g<R> gVar = this.f82825b;
            if (gVar != null) {
                list = gVar.mo82442a();
            } else {
                list = null;
            }
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z || !super.mo82415f()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ C31625a(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final List<R> mo82408a(List<R> list) {
        C7562b<? super List<R>, ? extends List<R>> bVar = this.f82828e;
        if (bVar == null) {
            return list;
        }
        List list2 = (List) bVar.invoke(list);
        if (list2 == null) {
            return list;
        }
        return list2;
    }

    /* renamed from: a */
    private final void m102777a(boolean z) {
        this.f82829f = true;
        C7321c a = C7492s.m23282a((C7495v<T>) new C31630e<T>(this, z)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C31634f<Object>(this, z), (C7326g<? super Throwable>) new C31635g<Object>(this, z));
        m102778h().mo119660a();
        m102778h().mo119661a(a);
    }

    /* renamed from: a */
    public final boolean mo82410a(C31628c<R> cVar) {
        C7562b<? super C31628c<R>, Boolean> bVar = this.f82827d;
        if (bVar != null) {
            Boolean bool = (Boolean) bVar.invoke(cVar);
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
