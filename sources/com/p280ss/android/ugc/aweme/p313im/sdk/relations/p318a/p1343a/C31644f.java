package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
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
import p346io.reactivex.C7499z;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f */
public abstract class C31644f<T, R> extends C31643e<R> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f82852g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31644f.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: q */
    public static final C31646b f82853q = new C31646b(null);

    /* renamed from: a */
    private final C7541d f82854a = C7546e.m23569a(C31647c.f82864a);

    /* renamed from: b */
    private volatile boolean f82855b = true;

    /* renamed from: i */
    public C7562b<? super T, Boolean> f82856i;

    /* renamed from: j */
    public C7562b<? super List<? extends T>, ? extends List<? extends T>> f82857j;

    /* renamed from: k */
    public C7562b<? super R, Boolean> f82858k;

    /* renamed from: l */
    public C7562b<? super List<? extends R>, ? extends List<? extends R>> f82859l;

    /* renamed from: m */
    public C7499z f82860m;

    /* renamed from: n */
    public C7499z f82861n;

    /* renamed from: o */
    public int f82862o = -1;

    /* renamed from: p */
    public volatile boolean f82863p;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$a */
    public static abstract class C31645a<LOADER extends C31644f<T, R>, T, R> {
        /* renamed from: a */
        public abstract LOADER mo82427a();

        /* renamed from: b */
        public abstract LOADER mo82428b();

        /* renamed from: a */
        public final C31645a<LOADER, T, R> mo82436a(int i) {
            C31645a<LOADER, T, R> aVar = this;
            aVar.mo82427a().f82862o = i;
            return aVar;
        }

        /* renamed from: b */
        public final C31645a<LOADER, T, R> mo82438b(C7562b<? super List<? extends T>, ? extends List<? extends T>> bVar) {
            C7573i.m23587b(bVar, "collator");
            C31645a<LOADER, T, R> aVar = this;
            aVar.mo82427a().f82857j = bVar;
            return aVar;
        }

        /* renamed from: c */
        public final C31645a<LOADER, T, R> mo82439c(C7562b<? super R, Boolean> bVar) {
            C7573i.m23587b(bVar, "filter");
            C31645a<LOADER, T, R> aVar = this;
            aVar.mo82427a().f82858k = bVar;
            return aVar;
        }

        /* renamed from: a */
        public final C31645a<LOADER, T, R> mo82437a(C7562b<? super T, Boolean> bVar) {
            C7573i.m23587b(bVar, "filter");
            C31645a<LOADER, T, R> aVar = this;
            aVar.mo82427a().f82856i = bVar;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$b */
    public static final class C31646b {
        private C31646b() {
        }

        public /* synthetic */ C31646b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$c */
    static final class C31647c extends Lambda implements C7561a<C47562b> {

        /* renamed from: a */
        public static final C31647c f82864a = new C31647c();

        C31647c() {
            super(0);
        }

        /* renamed from: a */
        private static C47562b m102857a() {
            return new C47562b();
        }

        public final /* synthetic */ Object invoke() {
            return m102857a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$d */
    static final /* synthetic */ class C31648d extends FunctionReference implements C7561a<List<T>> {
        C31648d(C31644f fVar) {
            super(0, fVar);
        }

        public final String getName() {
            return "loadInternal";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31644f.class);
        }

        public final String getSignature() {
            return "loadInternal()Ljava/util/List;";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<T> invoke() {
            return ((C31644f) this.receiver).mo82422h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$e */
    static final /* synthetic */ class C31649e extends FunctionReference implements C7561a<List<T>> {
        C31649e(C31644f fVar) {
            super(0, fVar);
        }

        public final String getName() {
            return "loadMoreInternal";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31644f.class);
        }

        public final String getSignature() {
            return "loadMoreInternal()Ljava/util/List;";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<T> invoke() {
            return ((C31644f) this.receiver).mo82423i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$f */
    static final class C31650f<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ C7561a f82865a;

        C31650f(C7561a aVar) {
            this.f82865a = aVar;
        }

        public final void subscribe(C47870u<List<T>> uVar) {
            C7573i.m23587b(uVar, "it");
            try {
                uVar.mo19239a(this.f82865a.invoke());
            } catch (Throwable th) {
                uVar.mo19240a(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$g */
    static final class C31651g<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C31644f f82866a;

        C31651g(C31644f fVar) {
            this.f82866a = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<R> apply(List<T> list) {
            C7573i.m23587b(list, "it");
            return this.f82866a.mo82433a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$h */
    static final class C31652h<T> implements C7326g<List<R>> {

        /* renamed from: a */
        final /* synthetic */ C31644f f82867a;

        /* renamed from: b */
        final /* synthetic */ boolean f82868b;

        C31652h(C31644f fVar, boolean z) {
            this.f82867a = fVar;
            this.f82868b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<R> list) {
            this.f82867a.f82863p = false;
            C31644f fVar = this.f82867a;
            C7573i.m23582a((Object) list, "it");
            fVar.mo82431a(list, this.f82868b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.f$i */
    static final class C31653i<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C31644f f82869a;

        /* renamed from: b */
        final /* synthetic */ boolean f82870b;

        C31653i(C31644f fVar, boolean z) {
            this.f82869a = fVar;
            this.f82870b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f82869a.f82863p = false;
            C31644f fVar = this.f82869a;
            C7573i.m23582a((Object) th, "it");
            fVar.mo82430a(th, this.f82870b);
        }
    }

    /* renamed from: m */
    private final C47562b m102837m() {
        return (C47562b) this.f82854a.getValue();
    }

    /* renamed from: c */
    public final boolean mo82412c() {
        return this.f82863p;
    }

    /* renamed from: d */
    public final boolean mo82413d() {
        return this.f82855b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C7562b<T, R> mo82421g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract List<T> mo82422h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract List<T> mo82423i();

    /* renamed from: j */
    public final void mo82432j() {
        mo82414e();
        this.f82855b = true;
    }

    /* renamed from: e */
    public final void mo82414e() {
        this.f82863p = false;
        m102837m().mo119660a();
    }

    /* renamed from: k */
    public final List<R> mo82434k() {
        return mo82433a(mo82422h());
    }

    /* renamed from: l */
    public final List<R> mo82435l() {
        return mo82433a(mo82423i());
    }

    /* renamed from: a */
    public final void mo82409a() {
        C31644f fVar;
        if (mo82415f()) {
            fVar = this;
        } else {
            fVar = null;
        }
        C31644f fVar2 = fVar;
        if (fVar2 != null) {
            fVar2.m102834a(false, (C7561a<? extends List<T>>) new C31648d<Object>(this));
        }
    }

    /* renamed from: b */
    public final void mo82411b() {
        C31644f fVar;
        if (mo82415f()) {
            fVar = this;
        } else {
            fVar = null;
        }
        C31644f fVar2 = fVar;
        if (fVar2 != null) {
            fVar2.m102834a(true, (C7561a<? extends List<T>>) new C31649e<Object>(this));
        }
    }

    /* renamed from: f */
    public boolean mo82415f() {
        if (!this.f82863p) {
            C31644f fVar = this;
            if (!(fVar.f82860m == null || fVar.f82861n == null || !super.mo82415f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<R> mo82433a(List<T> list) {
        boolean z;
        if (this.f82862o <= 0 || list.size() < this.f82862o) {
            z = false;
        } else {
            z = true;
        }
        this.f82855b = z;
        return C7525m.m23509d((Collection<? extends T>) m102835b(m102833a(m102836c(m102835b(m102833a(list, this.f82856i), this.f82857j), mo82421g()), this.f82858k), this.f82859l));
    }

    /* renamed from: b */
    private static <D> List<D> m102835b(List<? extends D> list, C7562b<? super List<? extends D>, ? extends List<? extends D>> bVar) {
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
    private static <D> List<D> m102833a(List<? extends D> list, C7562b<? super D, Boolean> bVar) {
        if (bVar == null) {
            return list;
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) bVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    private static <D, F> List<F> m102836c(List<? extends D> list, C7562b<? super D, ? extends F> bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object invoke : list) {
            Object invoke2 = bVar.invoke(invoke);
            if (invoke2 != null) {
                arrayList.add(invoke2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m102834a(boolean z, C7561a<? extends List<T>> aVar) {
        this.f82863p = true;
        C7492s a = C7492s.m23282a((C7495v<T>) new C31650f<T>(aVar));
        C7499z zVar = this.f82860m;
        if (zVar == null) {
            C7573i.m23583a("subscribeScheduler");
        }
        C7492s d = a.mo19304b(zVar).mo19317d((C7327h<? super T, ? extends R>) new C31651g<Object,Object>(this));
        C7499z zVar2 = this.f82861n;
        if (zVar2 == null) {
            C7573i.m23583a("observeScheduler");
        }
        C7321c a2 = d.mo19294a(zVar2).mo19280a((C7326g<? super T>) new C31652h<Object>(this, z), (C7326g<? super Throwable>) new C31653i<Object>(this, z));
        m102837m().mo119660a();
        m102837m().mo119661a(a2);
    }
}
