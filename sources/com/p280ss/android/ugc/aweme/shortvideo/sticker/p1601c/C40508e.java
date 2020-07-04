package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c;

import android.os.Handler;
import android.os.Looper;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27417c;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27419e;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e */
public final class C40508e<Param, Target> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f105269a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40508e.class), "mMainThread", "getMMainThread()Ljava/lang/Thread;"))};

    /* renamed from: b */
    public Param f105270b;

    /* renamed from: c */
    public final C40505b<Param, Target> f105271c;

    /* renamed from: d */
    public final C40504a<Param, Target> f105272d;

    /* renamed from: e */
    private final Queue<Param> f105273e = new LinkedList();

    /* renamed from: f */
    private final Handler f105274f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final C7541d f105275g = C7546e.m23569a(C40512c.f105282a);

    /* renamed from: h */
    private final C27414b<Param, Target> f105276h = new C40509a(this);

    /* renamed from: i */
    private final C27417c<Param, Target> f105277i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e$a */
    public static final class C40509a implements C27414b<Param, Target> {

        /* renamed from: a */
        final /* synthetic */ C40508e f105278a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e$a$a */
        static final class C40510a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C40509a f105279a;

            /* renamed from: b */
            final /* synthetic */ C27416b f105280b;

            C40510a(C40509a aVar, C27416b bVar) {
                this.f105279a = aVar;
                this.f105280b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m129513a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m129513a() {
                Integer num;
                String str;
                C40505b<Param, Target> bVar = this.f105279a.f105278a.f105271c;
                Param param = this.f105280b.f72333e;
                C27419e eVar = this.f105280b.f72332d;
                Exception exc = null;
                if (eVar != null) {
                    num = eVar.f72337a;
                } else {
                    num = null;
                }
                C27419e eVar2 = this.f105280b.f72332d;
                if (eVar2 != null) {
                    str = eVar2.f72338b;
                } else {
                    str = null;
                }
                C27419e eVar3 = this.f105280b.f72332d;
                if (eVar3 != null) {
                    exc = eVar3.f72339c;
                }
                bVar.mo100350a(param, num, str, exc);
            }
        }

        /* renamed from: a */
        public final void mo70502a(C27416b<Param, Target> bVar) {
            C7573i.m23587b(bVar, "task");
        }

        C40509a(C40508e eVar) {
            this.f105278a = eVar;
        }

        /* renamed from: b */
        public final void mo70508b(C27416b<Param, Target> bVar) {
            C7573i.m23587b(bVar, "task");
            this.f105278a.f105272d.mo70508b(bVar);
            this.f105278a.mo100561b();
        }

        /* renamed from: c */
        public final void mo70512c(C27416b<Param, Target> bVar) {
            C7573i.m23587b(bVar, "task");
            this.f105278a.mo100560a((C7561a<? extends Object>) new C40510a<Object>(this, bVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e$b */
    static final class C40511b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C40508e f105281a;

        C40511b(C40508e eVar) {
            this.f105281a = eVar;
        }

        /* renamed from: a */
        private void m129514a() {
            this.f105281a.mo100561b();
        }

        public final /* synthetic */ Object call() {
            m129514a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e$c */
    static final class C40512c extends Lambda implements C7561a<Thread> {

        /* renamed from: a */
        public static final C40512c f105282a = new C40512c();

        C40512c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m129515a();
        }

        /* renamed from: a */
        private static Thread m129515a() {
            Looper mainLooper = Looper.getMainLooper();
            C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
            return mainLooper.getThread();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e$d */
    static final class C40513d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40508e f105283a;

        C40513d(C40508e eVar) {
            this.f105283a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129516a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129516a() {
            this.f105283a.f105271c.mo100349a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e$e */
    static final class C40514e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40508e f105284a;

        /* renamed from: b */
        final /* synthetic */ Exception f105285b;

        C40514e(C40508e eVar, Exception exc) {
            this.f105284a = eVar;
            this.f105285b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129517a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129517a() {
            C40505b<Param, Target> bVar = this.f105284a.f105271c;
            Param param = this.f105284a.f105270b;
            if (param == null) {
                C7573i.m23580a();
            }
            bVar.mo100350a(param, null, null, this.f105285b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.e$f */
    static final class C40515f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40508e f105286a;

        /* renamed from: b */
        final /* synthetic */ C7561a f105287b;

        C40515f(C40508e eVar, C7561a aVar) {
            this.f105286a = eVar;
            this.f105287b = aVar;
        }

        public final void run() {
            C40508e.m129503b(this.f105287b);
        }
    }

    /* renamed from: c */
    private final Thread m129504c() {
        return (Thread) this.f105275g.getValue();
    }

    /* renamed from: d */
    private final boolean m129505d() {
        return C7573i.m23585a((Object) m129504c(), (Object) Thread.currentThread());
    }

    /* renamed from: a */
    public final void mo100558a() {
        C1592h.m7853a((Callable<TResult>) new C40511b<TResult>(this));
    }

    /* renamed from: b */
    public final void mo100561b() {
        while (!this.f105273e.isEmpty()) {
            this.f105270b = this.f105273e.poll();
            if (this.f105270b != null) {
                C27417c<Param, Target> cVar = this.f105277i;
                Param param = this.f105270b;
                if (param == null) {
                    C7573i.m23580a();
                }
                try {
                    cVar.mo70529a(param).mo70524a(this.f105276h);
                    return;
                } catch (Exception e) {
                    mo100560a((C7561a<? extends Object>) new C40514e<Object>(this, e));
                    return;
                }
            }
        }
        mo100560a((C7561a<? extends Object>) new C40513d<Object>(this));
    }

    /* renamed from: b */
    public static void m129503b(C7561a<? extends Object> aVar) {
        try {
            aVar.invoke();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo100559a(List<? extends Param> list) {
        C7573i.m23587b(list, "task");
        this.f105273e.addAll(list);
    }

    /* renamed from: a */
    public final void mo100560a(C7561a<? extends Object> aVar) {
        if (m129505d()) {
            m129503b(aVar);
        } else {
            this.f105274f.post(new C40515f(this, aVar));
        }
    }

    public C40508e(C27417c<Param, Target> cVar, C40505b<Param, Target> bVar, C40504a<Param, Target> aVar) {
        C7573i.m23587b(cVar, "execTask");
        C7573i.m23587b(bVar, "listener");
        C7573i.m23587b(aVar, "onTaskExecListener");
        this.f105277i = cVar;
        this.f105271c = bVar;
        this.f105272d = aVar;
    }
}
