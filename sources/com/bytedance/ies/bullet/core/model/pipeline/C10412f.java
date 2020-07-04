package com.bytedance.ies.bullet.core.model.pipeline;

import java.util.Iterator;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.model.pipeline.f */
public abstract class C10412f<T> implements C10409c<T>, C10410d<T> {

    /* renamed from: a */
    public final Iterator<C10410d<T>> f28135a;

    /* renamed from: b */
    public final C10409c<T> f28136b;

    /* renamed from: c */
    public final C10411e<T> f28137c;

    /* renamed from: com.bytedance.ies.bullet.core.model.pipeline.f$a */
    static final class C10413a extends Lambda implements C7563m<ResolvePolicy, T, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10412f f28138a;

        /* renamed from: b */
        final /* synthetic */ C7562b f28139b;

        /* renamed from: c */
        final /* synthetic */ C7562b f28140c;

        /* renamed from: d */
        final /* synthetic */ Object f28141d;

        C10413a(C10412f fVar, C7562b bVar, C7562b bVar2, Object obj) {
            this.f28138a = fVar;
            this.f28139b = bVar;
            this.f28140c = bVar2;
            this.f28141d = obj;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m30797a((ResolvePolicy) obj, obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30797a(ResolvePolicy resolvePolicy, T t) {
            C7573i.m23587b(resolvePolicy, "policy");
            C10411e<T> eVar = this.f28138a.f28137c;
            if (eVar != null) {
                T a = eVar.mo25189a(resolvePolicy, t);
                if (a != null) {
                    t = a;
                }
            }
            switch (C10417g.f28160a[resolvePolicy.ordinal()]) {
                case 1:
                    this.f28138a.mo25083a(t, this.f28139b, this.f28140c);
                    return;
                case 2:
                    this.f28139b.invoke(t);
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.model.pipeline.f$b */
    static final class C10414b extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10412f f28142a;

        /* renamed from: b */
        final /* synthetic */ C7562b f28143b;

        /* renamed from: c */
        final /* synthetic */ C7562b f28144c;

        /* renamed from: d */
        final /* synthetic */ Object f28145d;

        C10414b(C10412f fVar, C7562b bVar, C7562b bVar2, Object obj) {
            this.f28142a = fVar;
            this.f28143b = bVar;
            this.f28144c = bVar2;
            this.f28145d = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30798a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30798a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f28144c.invoke(th);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.model.pipeline.f$c */
    static final class C10415c extends Lambda implements C7562b<T, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10410d f28146a;

        /* renamed from: b */
        final /* synthetic */ C7563m f28147b;

        /* renamed from: c */
        final /* synthetic */ C7562b f28148c;

        /* renamed from: d */
        final /* synthetic */ C10412f f28149d;

        /* renamed from: e */
        final /* synthetic */ C7562b f28150e;

        /* renamed from: f */
        final /* synthetic */ C7562b f28151f;

        /* renamed from: g */
        final /* synthetic */ Object f28152g;

        C10415c(C10410d dVar, C7563m mVar, C7562b bVar, C10412f fVar, C7562b bVar2, C7562b bVar3, Object obj) {
            this.f28146a = dVar;
            this.f28147b = mVar;
            this.f28148c = bVar;
            this.f28149d = fVar;
            this.f28150e = bVar2;
            this.f28151f = bVar3;
            this.f28152g = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30799a(obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30799a(T t) {
            this.f28149d.mo25206a(this.f28149d.f28135a.hasNext(), this.f28146a, t, this.f28147b, this.f28148c);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.model.pipeline.f$d */
    static final class C10416d extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10410d f28153a;

        /* renamed from: b */
        final /* synthetic */ C7563m f28154b;

        /* renamed from: c */
        final /* synthetic */ C7562b f28155c;

        /* renamed from: d */
        final /* synthetic */ C10412f f28156d;

        /* renamed from: e */
        final /* synthetic */ C7562b f28157e;

        /* renamed from: f */
        final /* synthetic */ C7562b f28158f;

        /* renamed from: g */
        final /* synthetic */ Object f28159g;

        C10416d(C10410d dVar, C7563m mVar, C7562b bVar, C10412f fVar, C7562b bVar2, C7562b bVar3, Object obj) {
            this.f28153a = dVar;
            this.f28154b = mVar;
            this.f28155c = bVar;
            this.f28156d = fVar;
            this.f28157e = bVar2;
            this.f28158f = bVar3;
            this.f28159g = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30800a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30800a(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f28156d.mo25205a(this.f28156d.f28135a.hasNext(), this.f28153a, this.f28159g, th, this.f28154b, this.f28155c);
        }
    }

    public C10412f(Iterable<? extends C10410d<T>> iterable, C10409c<T> cVar, C10411e<T> eVar) {
        C7573i.m23587b(iterable, "processors");
        C7573i.m23587b(cVar, "connector");
        this.f28136b = cVar;
        this.f28137c = eVar;
        this.f28135a = iterable.iterator();
    }

    /* renamed from: a */
    public final void mo25083a(T t, C7562b<? super T, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        T t2 = t;
        C7562b<? super T, C7581n> bVar3 = bVar;
        C7562b<? super Throwable, C7581n> bVar4 = bVar2;
        C7573i.m23587b(bVar3, "resolve");
        C7573i.m23587b(bVar4, "reject");
        if (this.f28135a.hasNext()) {
            C10410d dVar = (C10410d) this.f28135a.next();
            C10410d dVar2 = dVar;
            C7563m aVar = new C10413a(this, bVar3, bVar4, t2);
            C7562b bVar5 = new C10414b(this, bVar3, bVar4, t2);
            C7562b<? super T, C7581n> bVar6 = bVar;
            C7562b<? super Throwable, C7581n> bVar7 = bVar2;
            T t3 = t;
            C10415c cVar = new C10415c(dVar2, aVar, bVar5, this, bVar6, bVar7, t3);
            C7562b bVar8 = cVar;
            C10416d dVar3 = new C10416d(dVar2, aVar, bVar5, this, bVar6, bVar7, t3);
            dVar.mo25083a(t2, bVar8, dVar3);
            return;
        }
        bVar3.invoke(t2);
    }

    /* renamed from: a */
    public final void mo25206a(boolean z, C10410d<T> dVar, T t, C7563m<? super ResolvePolicy, ? super T, C7581n> mVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(dVar, "processor");
        C7573i.m23587b(mVar, "resolve");
        C7573i.m23587b(bVar, "reject");
        this.f28136b.mo25206a(z, dVar, t, mVar, bVar);
    }

    /* renamed from: a */
    public final void mo25205a(boolean z, C10410d<T> dVar, T t, Throwable th, C7563m<? super ResolvePolicy, ? super T, C7581n> mVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(dVar, "processor");
        C7573i.m23587b(th, "t");
        C7573i.m23587b(mVar, "resolve");
        C7573i.m23587b(bVar, "reject");
        this.f28136b.mo25205a(z, dVar, t, th, mVar, bVar);
    }
}
