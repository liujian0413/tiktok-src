package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.internal.C11639g;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.arch.internal.LifecycleAwareObserver;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public abstract class JediViewModel<S extends C11670t> extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31064a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediViewModel.class), "storeOwner", "getStoreOwner()Lcom/bytedance/jedi/arch/internal/StoreOwner;"))};

    /* renamed from: b */
    public final C11665o f31065b = new C11666p();

    /* renamed from: c */
    private final C7541d f31066c = C7546e.m23569a(new C11490g(this));

    /* renamed from: d */
    private S f31067d;

    /* renamed from: e */
    private final C47562b f31068e = new C47562b();

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$a */
    static final class C11483a extends Lambda implements C7562b<T, T> {

        /* renamed from: a */
        public static final C11483a f31069a = new C11483a();

        C11483a() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$b */
    static final class C11484b extends Lambda implements C7562b<T, T> {

        /* renamed from: a */
        public static final C11484b f31070a = new C11484b();

        C11484b() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$c */
    static final class C11485c extends Lambda implements C7562b<S, S> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31071a;

        C11485c(C7563m mVar) {
            this.f31071a = mVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public S invoke(S s) {
            C7573i.m23587b(s, "$receiver");
            return (C11670t) this.f31071a.invoke(s, new C11649l());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$d */
    static final class C11486d<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C7562b f31072a;

        C11486d(C7562b bVar) {
            this.f31072a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C11674x<V> apply(T t) {
            return new C11674x<>(this.f31072a.invoke(t));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$e */
    static final class C11487e<T, R> implements C7327h<Throwable, C11491a<? extends V>> {

        /* renamed from: a */
        public static final C11487e f31073a = new C11487e();

        C11487e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m33897a((Throwable) obj);
        }

        /* renamed from: a */
        private static C11500c<V> m33897a(Throwable th) {
            C7573i.m23587b(th, "it");
            return new C11500c<>(th);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$f */
    static final class C11488f<T> implements C7326g<C11491a<? extends V>> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f31074a;

        /* renamed from: b */
        final /* synthetic */ boolean f31075b = false;

        /* renamed from: c */
        final /* synthetic */ Thread f31076c = null;

        /* renamed from: d */
        final /* synthetic */ C7563m f31077d;

        C11488f(JediViewModel jediViewModel, boolean z, Thread thread, C7563m mVar) {
            this.f31074a = jediViewModel;
            this.f31077d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(final C11491a<? extends V> aVar) {
            if (!this.f31075b || this.f31076c != Thread.currentThread()) {
                this.f31074a.mo29038c(new C7562b<S, S>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11488f f31078a;

                    {
                        this.f31078a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public S invoke(S s) {
                        C7573i.m23587b(s, "$receiver");
                        C7563m mVar = this.f31078a.f31077d;
                        C11491a aVar = aVar;
                        C7573i.m23582a((Object) aVar, "asyncData");
                        return (C11670t) mVar.invoke(s, aVar);
                    }
                });
                return;
            }
            throw new IllegalStateException("you need schedule upstream to another thread".toString());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$g */
    static final class C11490g extends Lambda implements C7561a<C11639g<S>> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f31080a;

        C11490g(JediViewModel jediViewModel) {
            this.f31080a = jediViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C11639g<S> invoke() {
            return new C11639g<>(this.f31080a.mo29041e());
        }
    }

    /* renamed from: f */
    private final C11639g<S> mo29069f() {
        return (C11639g) this.f31066c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract S mo29037c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo29039d() {
    }

    /* renamed from: a */
    public final void mo29034a(C7562b<? super S, ? extends S> bVar) {
        C7573i.m23587b(bVar, "argsAcceptor");
        if (this.f31067d == null) {
            this.f31067d = (C11670t) bVar.invoke(mo29037c());
            mo29039d();
        }
    }

    /* renamed from: a */
    public final <PROP, MW extends C11650m<S, PROP>> void mo29033a(MW mw) {
        C7573i.m23587b(mw, "middleware");
        mw.mo29183a(this.f31068e, this);
    }

    public void onCleared() {
        this.f31068e.mo119660a();
    }

    /* renamed from: a */
    public final S mo29027a() {
        return (C11670t) mo29069f().mo29160a();
    }

    /* renamed from: b */
    public final C7492s<S> mo29035b() {
        return mo29069f().mo29162b();
    }

    /* renamed from: e */
    public final C11671u<S> mo29041e() {
        S s = this.f31067d;
        if (s != null) {
            Object invoke = C11587g.m34060a().invoke(this, s);
            if (invoke != null) {
                return (C11671u) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.Store<S>");
        }
        StringBuilder sb = new StringBuilder("Cannot visit store before ViewModel(");
        sb.append(getClass());
        sb.append(") is initialized");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: c */
    public final void mo29038c(C7562b<? super S, ? extends S> bVar) {
        C7573i.m23587b(bVar, "reducer");
        mo29042e(bVar);
    }

    /* renamed from: d */
    public final void mo29040d(C7562b<? super S, C7581n> bVar) {
        C7573i.m23587b(bVar, "block");
        mo29069f().mo29161a(bVar);
    }

    /* renamed from: e */
    public final void mo29042e(C7562b<? super S, ? extends S> bVar) {
        C7573i.m23587b(bVar, "reducer");
        mo29069f().mo29163b(bVar);
    }

    /* renamed from: b */
    public final void mo29036b(C7562b<? super S, C7581n> bVar) {
        C7573i.m23587b(bVar, "block");
        mo29040d(bVar);
    }

    /* renamed from: a */
    public final C7321c mo29029a(C7321c cVar) {
        C7573i.m23587b(cVar, "$this$disposeOnClear");
        this.f31068e.mo119661a(cVar);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> C7321c mo29028a(C7319aa<T> aaVar, C7563m<? super S, ? super C11491a<? extends T>, ? extends S> mVar) {
        C7573i.m23587b(aaVar, "$this$execute");
        C7573i.m23587b(mVar, "stateReducer");
        C7492s b = aaVar.mo19136b();
        C7573i.m23582a((Object) b, "toObservable()");
        return m33877a(b, (C7562b<? super T, ? extends V>) C11483a.f31069a, mVar);
    }

    /* renamed from: a */
    public final <T> C7321c mo29031a(C7492s<T> sVar, C7563m<? super S, ? super C11491a<? extends T>, ? extends S> mVar) {
        C7573i.m23587b(sVar, "$this$execute");
        C7573i.m23587b(mVar, "stateReducer");
        return m33877a(sVar, (C7562b<? super T, ? extends V>) C11484b.f31070a, mVar);
    }

    /* renamed from: a */
    private <T, V> C7321c m33877a(C7492s<T> sVar, C7562b<? super T, ? extends V> bVar, C7563m<? super S, ? super C11491a<? extends V>, ? extends S> mVar) {
        C7573i.m23587b(sVar, "$this$execute");
        C7573i.m23587b(bVar, "mapper");
        C7573i.m23587b(mVar, "stateReducer");
        mo29038c(new C11485c(mVar));
        C7321c f = sVar.mo19317d((C7327h<? super T, ? extends R>) new C11486d<Object,Object>(bVar)).mo19327f((C7327h<? super Throwable, ? extends T>) C11487e.f31073a).mo19325f((C7326g<? super T>) new C11488f<Object>(this, false, null, mVar));
        C7573i.m23582a((Object) f, "map<Async<V>> { Success(…syncData) }\n            }");
        return mo29029a(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <A> C7321c mo29032a(C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7562b<? super A, C7581n> bVar) {
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(bVar, "subscriber");
        return C11640h.m34113a(this, null, lVar, vVar, bVar);
    }

    /* renamed from: a */
    public final <T> C7321c mo29030a(C7492s<T> sVar, C0043i iVar, boolean z, boolean z2, C7499z zVar, C7562b<? super T, C7581n> bVar) {
        C7573i.m23587b(sVar, "source");
        C7573i.m23587b(bVar, "subscriber");
        if (iVar == null) {
            if (zVar != null) {
                sVar = sVar.mo19294a(zVar);
            }
            C7321c f = sVar.mo19325f((C7326g<? super T>) new C11594i<Object>(bVar));
            C7573i.m23582a((Object) f, "source\n                .…   .subscribe(subscriber)");
            return mo29029a(f);
        }
        if (zVar != null) {
            sVar = sVar.mo19294a(zVar);
        }
        C7498y c = sVar.mo19312c(new LifecycleAwareObserver(iVar, !z, z2, bVar));
        C7573i.m23582a((Object) c, "source\n            .let …          )\n            )");
        return mo29029a((C7321c) c);
    }
}
