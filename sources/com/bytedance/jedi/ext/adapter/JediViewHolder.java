package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.view.View;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.C11716h.C11717a;
import com.bytedance.jedi.ext.adapter.internal.C11723c;
import com.bytedance.jedi.ext.adapter.internal.C11728f;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

public abstract class JediViewHolder<R extends C11501d, ITEM> extends MultiTypeViewHolder<ITEM> implements C0042h, C0043i, C11716h<R> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31371a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediViewHolder.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: b */
    public C0043i f31372b;

    /* renamed from: c */
    public C11728f f31373c;

    /* renamed from: d */
    public JediViewHolderProxy f31374d;

    /* renamed from: e */
    public boolean f31375e;

    /* renamed from: f */
    private final C7541d f31376f = C7546e.m23569a(new C11677a(this));

    /* renamed from: com.bytedance.jedi.ext.adapter.JediViewHolder$a */
    static final class C11677a extends Lambda implements C7561a<C0044j> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f31377a;

        C11677a(JediViewHolder jediViewHolder) {
            this.f31377a = jediViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0044j invoke() {
            return new C0044j(this.f31377a);
        }
    }

    /* renamed from: q */
    private final C0044j mo69905q() {
        return (C0044j) this.f31376f.getValue();
    }

    /* renamed from: a */
    public final void mo29214a(ITEM item, int i) {
    }

    /* renamed from: a */
    public void mo29211a(List<Object> list) {
    }

    public void bA_() {
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return false;
    }

    /* renamed from: e */
    public final void mo29220e() {
        mo29221g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo29221g() {
    }

    /* renamed from: k */
    public void mo29224k() {
    }

    /* renamed from: l */
    public void mo29225l() {
    }

    /* renamed from: m */
    public void mo29226m() {
    }

    /* renamed from: a */
    public final void mo29213a(C11728f fVar) {
        C7573i.m23587b(fVar, "<set-?>");
        this.f31373c = fVar;
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11717a.m34331a(this);
    }

    /* renamed from: b */
    public final C11669s<R> mo29067b() {
        return C11717a.m34338b(this);
    }

    /* renamed from: d */
    public final C11679b mo29218d() {
        return this.f31374d;
    }

    public Lifecycle getLifecycle() {
        return mo69905q();
    }

    /* renamed from: p */
    private final C11723c mo62390p() {
        C11728f fVar = this.f31373c;
        if (fVar == null) {
            C7573i.m23583a("provider");
        }
        return fVar.f31510a;
    }

    /* renamed from: r */
    private final boolean mo69906r() {
        return mo62390p().mo29293a(this.f31526i);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void destroy$ext_adapter_release() {
        mo29226m();
        mo69909u();
        mo69905q().mo116a(Event.ON_DESTROY);
    }

    /* renamed from: n */
    public final C0043i mo29227n() {
        C0043i iVar = this.f31372b;
        if (iVar == null) {
            C7573i.m23583a("parent");
        }
        return iVar;
    }

    /* renamed from: s */
    private final void mo69907s() {
        this.f31375e = true;
        C0043i iVar = this.f31372b;
        if (iVar == null) {
            C7573i.m23583a("parent");
        }
        iVar.getLifecycle().mo55a(this);
    }

    /* renamed from: u */
    private final void mo69909u() {
        C0043i iVar = this.f31372b;
        if (iVar == null) {
            C7573i.m23583a("parent");
        }
        iVar.getLifecycle().mo56b(this);
        m34193v();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void create$ext_adapter_release() {
        if (!mo69906r()) {
            bA_();
            mo62390p().mo29292a(this.f31526i, true);
            mo69905q().mo116a(Event.ON_CREATE);
        }
    }

    /* renamed from: h */
    public void mo29222h() {
        super.mo29222h();
        JediViewHolderProxy jediViewHolderProxy = this.f31374d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31474b) {
            jediViewHolderProxy.mo29272c();
        }
        mo69908t();
    }

    /* renamed from: i */
    public void mo29223i() {
        super.mo29223i();
        JediViewHolderProxy jediViewHolderProxy = this.f31374d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31474b) {
            jediViewHolderProxy.mo29273f();
        }
        m34193v();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void pause$ext_adapter_release() {
        if (this.f31375e) {
            mo29225l();
            mo69905q().mo116a(Event.ON_PAUSE);
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void resume$ext_adapter_release() {
        if (this.f31375e) {
            mo29224k();
            mo69905q().mo116a(Event.ON_RESUME);
        }
    }

    @C0054q(mo125a = Event.ON_START)
    public final void start$ext_adapter_release() {
        if (this.f31375e) {
            mo69905q().mo116a(Event.ON_START);
            JediViewHolderProxy jediViewHolderProxy = this.f31374d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31474b) {
                jediViewHolderProxy.mo29270a(false);
            }
        }
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void stop$ext_adapter_release() {
        if (this.f31375e) {
            mo69905q().mo116a(Event.ON_STOP);
            JediViewHolderProxy jediViewHolderProxy = this.f31374d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31474b) {
                jediViewHolderProxy.mo29271b(false);
            }
        }
    }

    /* renamed from: t */
    private final void mo69908t() {
        this.f31375e = true;
        switch (C11700e.f31439a[getLifecycle().mo54a().ordinal()]) {
            case 1:
                return;
            case 2:
                start$ext_adapter_release();
                resume$ext_adapter_release();
                return;
            case 3:
                resume$ext_adapter_release();
                return;
            default:
                return;
        }
    }

    /* renamed from: v */
    private final void m34193v() {
        switch (C11700e.f31440b[getLifecycle().mo54a().ordinal()]) {
            case 1:
                pause$ext_adapter_release();
                break;
            case 2:
            case 3:
                break;
        }
        stop$ext_adapter_release();
        this.f31375e = false;
    }

    public JediViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
    }

    /* renamed from: a */
    private final void mo85800a(int i) {
        C11728f fVar = this.f31373c;
        if (fVar == null) {
            C7573i.m23583a("provider");
        }
        JediViewHolderProxy a = fVar.mo29301a(i);
        if (a != this.f31374d) {
            JediViewHolderProxy jediViewHolderProxy = this.f31374d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31474b) {
                C11728f fVar2 = this.f31373c;
                if (fVar2 == null) {
                    C7573i.m23583a("provider");
                }
                jediViewHolderProxy.mo29269a(fVar2.f31512c, null);
            }
        }
        C11728f fVar3 = this.f31373c;
        if (fVar3 == null) {
            C7573i.m23583a("provider");
        }
        a.mo29269a(fVar3.f31512c, this);
    }

    /* renamed from: a */
    public final void mo29212a(C0043i iVar) {
        C7573i.m23587b(iVar, "<set-?>");
        this.f31372b = iVar;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11717a.m34337a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super R, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11717a.m34332a(this, jediViewModel, vVar, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r2 == false) goto L_0x0041;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29215b(ITEM r6, int r7, java.util.List<java.lang.Object> r8) {
        /*
            r5 = this;
            super.mo29215b(r6, r7, r8)
            r6 = 1
            if (r8 == 0) goto L_0x0041
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x0017
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x003f
        L_0x0017:
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r0.next()
            boolean r3 = r1 instanceof kotlin.Pair
            r4 = 0
            if (r3 != 0) goto L_0x002b
            r1 = r4
        L_0x002b:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L_0x0033
            java.lang.Object r4 = r1.getSecond()
        L_0x0033:
            java.lang.Object r1 = com.bytedance.jedi.ext.adapter.C11680c.m34222a()
            if (r4 != r1) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r1 == 0) goto L_0x001b
            r2 = 1
        L_0x003f:
            if (r2 != 0) goto L_0x004c
        L_0x0041:
            r5.f31375e = r6
            r5.mo69909u()
            r5.mo85800a(r7)
            r5.mo69907s()
        L_0x004c:
            r5.mo29211a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.JediViewHolder.mo29215b(java.lang.Object, int, java.util.List):void");
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super R, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11717a.m34333a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super R, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C11717a.m34335a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super R, ? super Throwable, C7581n> mVar, C7562b<? super R, C7581n> bVar, C7563m<? super R, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11717a.m34334a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super R, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C11717a.m34336a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
