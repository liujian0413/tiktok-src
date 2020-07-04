package com.bytedance.jedi.arch.internal;

import com.bytedance.jedi.arch.C11671u;
import java.util.LinkedList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7499z;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C47844a;

/* renamed from: com.bytedance.jedi.arch.internal.b */
public final class C11625b<S> implements C11671u<S> {

    /* renamed from: a */
    private final C47844a<S> f31269a;

    /* renamed from: b */
    private final C47562b f31270b = new C47562b();

    /* renamed from: c */
    private final C47844a<C7581n> f31271c;

    /* renamed from: d */
    private final C11628a<S> f31272d;

    /* renamed from: e */
    private final C7492s<S> f31273e;

    /* renamed from: com.bytedance.jedi.arch.internal.b$a */
    static final class C11628a<S> {

        /* renamed from: a */
        private final LinkedList<C7562b<S, C7581n>> f31275a = new LinkedList<>();

        /* renamed from: b */
        private LinkedList<C7562b<S, S>> f31276b = new LinkedList<>();

        /* renamed from: a */
        public final synchronized C7562b<S, C7581n> mo29165a() {
            if (this.f31275a.isEmpty()) {
                return null;
            }
            return (C7562b) this.f31275a.removeFirst();
        }

        /* renamed from: b */
        public final synchronized List<C7562b<S, S>> mo29167b() {
            if (this.f31276b.isEmpty()) {
                return null;
            }
            LinkedList<C7562b<S, S>> linkedList = this.f31276b;
            this.f31276b = new LinkedList<>();
            return linkedList;
        }

        /* renamed from: a */
        public final synchronized void mo29166a(C7562b<? super S, C7581n> bVar) {
            C7573i.m23587b(bVar, "block");
            this.f31275a.add(bVar);
        }

        /* renamed from: b */
        public final synchronized void mo29168b(C7562b<? super S, ? extends S> bVar) {
            C7573i.m23587b(bVar, "block");
            this.f31276b.add(bVar);
        }
    }

    /* renamed from: b */
    public final C7492s<S> mo29162b() {
        return this.f31273e;
    }

    /* renamed from: a */
    public final S mo29160a() {
        S b = this.f31269a.mo10167b();
        if (b == null) {
            C7573i.m23580a();
        }
        return b;
    }

    /* renamed from: c */
    public final void mo29164c() {
        while (true) {
            m34082d();
            C7562b a = this.f31272d.mo29165a();
            if (a != null) {
                a.invoke(mo29160a());
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private final void m34082d() {
        List b = this.f31272d.mo29167b();
        if (b != null) {
            Iterable<C7562b> iterable = b;
            Object a = mo29160a();
            for (C7562b invoke : iterable) {
                a = invoke.invoke(a);
            }
            this.f31269a.onNext(a);
        }
    }

    /* renamed from: a */
    private final C7321c m34080a(C7321c cVar) {
        this.f31270b.mo119661a(cVar);
        return cVar;
    }

    /* renamed from: a */
    public static void m34081a(Throwable th) {
        Throwable th2;
        while (true) {
            if (th != null) {
                th2 = th.getCause();
            } else {
                th2 = null;
            }
            if (th2 == null) {
                break;
            }
            th = th.getCause();
        }
        if (th != null) {
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo29163b(C7562b<? super S, ? extends S> bVar) {
        C7573i.m23587b(bVar, "stateReducer");
        this.f31272d.mo29168b(bVar);
        this.f31271c.onNext(C7581n.f20898a);
    }

    /* renamed from: a */
    public final void mo29161a(C7562b<? super S, C7581n> bVar) {
        C7573i.m23587b(bVar, "block");
        this.f31272d.mo29166a(bVar);
        this.f31271c.onNext(C7581n.f20898a);
    }

    public C11625b(S s, C7499z zVar) {
        C7573i.m23587b(s, "initialState");
        C7573i.m23587b(zVar, "scheduler");
        C47844a<S> a = C47844a.m148743a(s);
        C7573i.m23582a((Object) a, "BehaviorSubject.createDefault(initialState)");
        this.f31269a = a;
        C47844a<C7581n> a2 = C47844a.m148742a();
        C7573i.m23582a((Object) a2, "BehaviorSubject.create<Unit>()");
        this.f31271c = a2;
        this.f31272d = new C11628a<>();
        C7492s<S> g = this.f31269a.mo19328g();
        C7573i.m23582a((Object) g, "subject.hide()");
        this.f31273e = g;
        C7321c a3 = this.f31271c.mo19294a(zVar).mo19280a((C7326g<? super T>) new C7326g<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ C11625b f31274a;

            {
                this.f31274a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C7581n nVar) {
                this.f31274a.mo29164c();
            }
        }, (C7326g<? super Throwable>) new C11629c<Object>(new C7562b<Throwable, C7581n>(this) {
            public final String getName() {
                return "handleError";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(C11625b.class);
            }

            public final String getSignature() {
                return "handleError(Ljava/lang/Throwable;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m34089a((Throwable) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m34089a(Throwable th) {
                C7573i.m23587b(th, "p1");
                C11625b.m34081a(th);
            }
        }));
        C7573i.m23582a((Object) a3, "flushQueueSubject.observ…ueues() }, ::handleError)");
        m34080a(a3);
    }
}
