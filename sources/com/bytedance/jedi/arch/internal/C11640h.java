package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7499z;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.jedi.arch.internal.h */
public final class C11640h {

    /* renamed from: com.bytedance.jedi.arch.internal.h$a */
    public static final class C11641a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C7599l f31299a;

        public C11641a(C7599l lVar) {
            this.f31299a = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public R apply(PROP prop) {
            C7573i.m23587b(prop, "it");
            return new C11675y(this.f31299a.invoke(prop));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.h$b */
    public static final class C11642b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C7599l f31300a;

        public C11642b(C7599l lVar) {
            this.f31300a = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public PROP apply(S s) {
            C7573i.m23587b(s, "it");
            return (C11670t) this.f31300a.invoke(s);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.h$c */
    public static final class C11643c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C7599l f31301a;

        public C11643c(C7599l lVar) {
            this.f31301a = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public R apply(PROP prop) {
            C7573i.m23587b(prop, "it");
            return new C11675y(this.f31301a.invoke(prop));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.h$d */
    public static final class C11644d<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f31302a;

        /* renamed from: b */
        final /* synthetic */ C0043i f31303b;

        /* renamed from: c */
        final /* synthetic */ C7599l f31304c;

        /* renamed from: d */
        final /* synthetic */ C7562b f31305d;

        public C11644d(JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7562b bVar) {
            this.f31302a = jediViewModel;
            this.f31303b = iVar;
            this.f31304c = lVar;
            this.f31305d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public R apply(S s) {
            C7573i.m23587b(s, "it");
            return new C11675y(this.f31304c.get(s));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.h$e */
    public static final class C11645e<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f31306a;

        /* renamed from: b */
        final /* synthetic */ C0043i f31307b;

        /* renamed from: c */
        final /* synthetic */ C7599l f31308c;

        /* renamed from: d */
        final /* synthetic */ C7599l f31309d;

        /* renamed from: e */
        final /* synthetic */ C7563m f31310e;

        public C11645e(JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7599l lVar2, C7563m mVar) {
            this.f31306a = jediViewModel;
            this.f31307b = iVar;
            this.f31308c = lVar;
            this.f31309d = lVar2;
            this.f31310e = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public R apply(S s) {
            C7573i.m23587b(s, "it");
            return new C11676z(this.f31308c.get(s), this.f31309d.get(s));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.h$f */
    public static final class C11646f<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f31311a;

        /* renamed from: b */
        final /* synthetic */ C0043i f31312b;

        /* renamed from: c */
        final /* synthetic */ C7599l f31313c;

        /* renamed from: d */
        final /* synthetic */ C7599l f31314d;

        /* renamed from: e */
        final /* synthetic */ C7599l f31315e;

        /* renamed from: f */
        final /* synthetic */ C7599l f31316f;

        /* renamed from: g */
        final /* synthetic */ C48007r f31317g;

        public C11646f(JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7599l lVar2, C7599l lVar3, C7599l lVar4, C48007r rVar) {
            this.f31311a = jediViewModel;
            this.f31312b = iVar;
            this.f31313c = lVar;
            this.f31314d = lVar2;
            this.f31315e = lVar3;
            this.f31316f = lVar4;
            this.f31317g = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public R apply(S s) {
            C7573i.m23587b(s, "it");
            return new C11493ab(this.f31313c.get(s), this.f31314d.get(s), this.f31315e.get(s), this.f31316f.get(s));
        }
    }

    /* renamed from: a */
    public static final <R> C11672v<R> m34110a() {
        return new C11672v<>();
    }

    /* renamed from: a */
    public static final <R> C11672v<R> m34111a(C11502e<?> eVar, C11672v<R> vVar) {
        C7573i.m23587b(eVar, "$this$configWrapper");
        C7573i.m23587b(vVar, "target");
        if (!vVar.f31357d) {
            vVar.f31358e = eVar.mo29068c();
        }
        return vVar;
    }

    /* renamed from: a */
    public static final <S extends C11670t> C7321c m34112a(JediViewModel<S> jediViewModel, C0043i iVar, C11672v<S> vVar, C7562b<? super S, C7581n> bVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeInternal");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(bVar, "subscriber");
        C7492s a = jediViewModel.mo29035b().mo19288a(vVar.f31355b);
        if (vVar.f31354a) {
            a = a.mo19298b(1);
        }
        C7492s sVar = a;
        C7573i.m23582a((Object) sVar, "it");
        return jediViewModel.mo29030a(sVar, iVar, vVar.f31358e, vVar.f31356c, vVar.f31359f, bVar);
    }

    /* renamed from: a */
    public static final <A, S extends C11670t> C7321c m34113a(JediViewModel<S> jediViewModel, C0043i iVar, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7562b<? super A, C7581n> bVar) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        C7599l<S, ? extends A> lVar2 = lVar;
        C11672v<C11675y<A>> vVar2 = vVar;
        C7562b<? super A, C7581n> bVar2 = bVar;
        C7573i.m23587b(jediViewModel, "$this$selectSubscribeInternal");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar2, "config");
        C7573i.m23587b(bVar2, "subscriber");
        C0043i iVar2 = iVar;
        C7492s a = jediViewModel.mo29035b().mo19317d((C7327h<? super T, ? extends R>) new C11644d<Object,Object>(jediViewModel, iVar, lVar, bVar2)).mo19288a(vVar2.f31355b);
        if (vVar2.f31354a) {
            a = a.mo19298b(1);
        }
        C7492s sVar = a;
        C7573i.m23582a((Object) sVar, "upstream");
        boolean z = vVar2.f31358e;
        boolean z2 = vVar2.f31356c;
        C7499z zVar = vVar2.f31359f;
        C11612xb2104fc subscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$2 = new C11612xb2104fc(vVar, jediViewModel, iVar, lVar, bVar);
        return jediViewModel.mo29030a(sVar, iVar, z, z2, zVar, subscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$2);
    }

    /* renamed from: a */
    public static final <A, B, S extends C11670t> C7321c m34114a(JediViewModel<S> jediViewModel, C0043i iVar, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C7563m<? super A, ? super B, C7581n> mVar) {
        C11672v<C11676z<A, B>> vVar2 = vVar;
        C7573i.m23587b(jediViewModel, "$this$selectSubscribeInternal");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar2, "config");
        C7573i.m23587b(mVar, "subscriber");
        C7492s b = jediViewModel.mo29035b();
        C11645e eVar = new C11645e(jediViewModel, iVar, lVar, lVar2, mVar);
        C7492s a = b.mo19317d((C7327h<? super T, ? extends R>) eVar).mo19288a(vVar2.f31355b);
        if (vVar2.f31354a) {
            a = a.mo19298b(1);
        }
        C7492s sVar = a;
        C7573i.m23582a((Object) sVar, "upstream");
        boolean z = vVar2.f31358e;
        boolean z2 = vVar2.f31356c;
        C7499z zVar = vVar2.f31359f;
        C0043i iVar2 = iVar;
        C11613xb2104fe subscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$4 = new C11613xb2104fe(vVar, jediViewModel, iVar2, lVar, lVar2, mVar);
        return jediViewModel.mo29030a(sVar, iVar2, z, z2, zVar, subscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$4);
    }

    /* renamed from: a */
    public static final <A, PROP extends C11670t, S extends C11670t> C7321c m34116a(JediViewModel<S> jediViewModel, C0043i iVar, C7599l<PROP, ? extends A> lVar, C7599l<S, ? extends PROP> lVar2, boolean z, boolean z2, C7562b<? super A, C7581n> bVar) {
        C7573i.m23587b(jediViewModel, "$this$middlewareSelectSubscribeInternal");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "subprop");
        C7573i.m23587b(bVar, "subscriber");
        C7492s d = jediViewModel.mo29035b().mo19317d((C7327h<? super T, ? extends R>) new C11642b<Object,Object>(lVar2)).mo19314d();
        C7573i.m23582a((Object) d, "map { subprop(it) }.distinctUntilChanged()");
        C7492s d2 = d.mo19317d((C7327h<? super T, ? extends R>) new C11643c<Object,Object>(lVar)).mo19314d();
        C7573i.m23582a((Object) d2, "upstream");
        C11599x934942bc subscriptioinExtensionsKt$middlewareSelectSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$2 = new C11599x934942bc(jediViewModel, iVar, z, z2, bVar);
        return jediViewModel.mo29030a(d2, iVar, z, z2, C11638f.m34104a(), subscriptioinExtensionsKt$middlewareSelectSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$2);
    }

    /* renamed from: a */
    public static final <A, B, C, D, S extends C11670t> C7321c m34115a(JediViewModel<S> jediViewModel, C0043i iVar, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48007r<? super A, ? super B, ? super C, ? super D, C7581n> rVar) {
        C11672v<C11493ab<A, B, C, D>> vVar2 = vVar;
        C7573i.m23587b(jediViewModel, "$this$selectSubscribeInternal");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar2, "config");
        C7573i.m23587b(rVar, "subscriber");
        C7492s b = jediViewModel.mo29035b();
        C11646f fVar = new C11646f(jediViewModel, iVar, lVar, lVar2, lVar3, lVar4, rVar);
        C7492s a = b.mo19317d((C7327h<? super T, ? extends R>) fVar).mo19288a(vVar2.f31355b);
        if (vVar2.f31354a) {
            a = a.mo19298b(1);
        }
        C7492s sVar = a;
        C7573i.m23582a((Object) sVar, "upstream");
        boolean z = vVar2.f31358e;
        boolean z2 = vVar2.f31356c;
        C0043i iVar2 = iVar;
        C7499z zVar = vVar2.f31359f;
        boolean z3 = z2;
        boolean z4 = z;
        C11615xb210502 subscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$8 = new C11615xb210502(vVar, jediViewModel, iVar2, lVar, lVar2, lVar3, lVar4, rVar);
        return jediViewModel.mo29030a(sVar, iVar2, z4, z3, zVar, subscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$8);
    }

    /* renamed from: a */
    public static final <T, PROP extends C11670t, S extends C11670t> C7321c m34117a(JediViewModel<S> jediViewModel, C0043i iVar, C7599l<PROP, ? extends C11491a<? extends T>> lVar, C7599l<S, ? extends PROP> lVar2, boolean z, boolean z2, C7562b<? super Throwable, C7581n> bVar, C7561a<C7581n> aVar, C7562b<? super T, C7581n> bVar2) {
        C7599l<PROP, ? extends C11491a<? extends T>> lVar3 = lVar;
        C7599l<S, ? extends PROP> lVar4 = lVar2;
        JediViewModel<S> jediViewModel2 = jediViewModel;
        C7573i.m23587b(jediViewModel, "$this$middlewareAsyncSubscribeInternal");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "subprop");
        C7492s d = jediViewModel.mo29035b().mo19317d((C7327h<? super T, ? extends R>) new C11642b<Object,Object>(lVar2)).mo19314d();
        C7573i.m23582a((Object) d, "map { subprop(it) }.distinctUntilChanged()");
        C7492s d2 = d.mo19317d((C7327h<? super T, ? extends R>) new C11641a<Object,Object>(lVar)).mo19314d();
        C7573i.m23582a((Object) d2, "upstream");
        C0043i iVar2 = iVar;
        boolean z3 = z;
        boolean z4 = z2;
        C11597x3b817b56 subscriptioinExtensionsKt$middlewareAsyncSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$2 = new C11597x3b817b56(jediViewModel, iVar2, z3, z4, bVar2, bVar, aVar);
        return jediViewModel.mo29030a(d2, iVar2, z3, z4, C11638f.m34104a(), subscriptioinExtensionsKt$middlewareAsyncSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$2);
    }
}
