package com.p280ss.android.ugc.aweme.effect.p1197c;

import android.os.Handler;
import android.os.Looper;
import bolts.C1592h;
import com.google.common.collect.C17794bt;
import com.google.common.collect.C17863bz;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27417c;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27418d;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27419e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a */
public final class C27400a<Param, Target> implements C27414b<Param, Target> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f72291a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27400a.class), "mMultiCallbacks", "getMMultiCallbacks()Lcom/google/common/collect/ListMultimap;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27400a.class), "mMainThread", "getMMainThread()Ljava/lang/Thread;"))};

    /* renamed from: g */
    public static final C27401a f72292g = new C27401a(null);

    /* renamed from: b */
    public int f72293b;

    /* renamed from: c */
    public boolean f72294c;

    /* renamed from: d */
    public boolean f72295d;

    /* renamed from: e */
    public C27418d f72296e;

    /* renamed from: f */
    public boolean f72297f;

    /* renamed from: h */
    private final Queue<C27416b<Param, Target>> f72298h;

    /* renamed from: i */
    private final Queue<C27416b<Param, Target>> f72299i;

    /* renamed from: j */
    private final Queue<C27416b<Param, Target>> f72300j;

    /* renamed from: k */
    private final C7541d f72301k;

    /* renamed from: l */
    private final Handler f72302l;

    /* renamed from: m */
    private final C7541d f72303m;

    /* renamed from: n */
    private AtomicInteger f72304n;

    /* renamed from: o */
    private final List<Param> f72305o;

    /* renamed from: p */
    private final int f72306p = 3;

    /* renamed from: q */
    private final C27417c<Param, Target> f72307q;

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$a */
    public static final class C27401a {
        private C27401a() {
        }

        public /* synthetic */ C27401a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$b */
    static final class C27402b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72308a;

        /* renamed from: b */
        final /* synthetic */ C27416b f72309b;

        C27402b(C27400a aVar, C27416b bVar) {
            this.f72308a = aVar;
            this.f72309b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m89818a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89818a() {
            if (this.f72308a.f72295d) {
                this.f72308a.mo70502a(this.f72309b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$c */
    static final class C27403c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72310a;

        /* renamed from: b */
        final /* synthetic */ C27416b f72311b;

        C27403c(C27400a aVar, C27416b bVar) {
            this.f72310a = aVar;
            this.f72311b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m89819a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89819a() {
            if (this.f72310a.f72295d) {
                this.f72310a.mo70502a(this.f72311b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$d */
    static final class C27404d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72312a;

        /* renamed from: b */
        final /* synthetic */ C27416b f72313b;

        C27404d(C27400a aVar, C27416b bVar) {
            this.f72312a = aVar;
            this.f72313b = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n invoke() {
            Integer num;
            String str;
            Exception exc;
            switch (this.f72313b.mo70526b()) {
                case 2:
                    List<C27413a> list = this.f72312a.mo70501a().get(this.f72313b.f72333e);
                    if (list == null) {
                        return null;
                    }
                    for (C27413a aVar : list) {
                        if (aVar != null) {
                            aVar.mo70519a(this.f72313b.f72333e);
                        }
                    }
                    return C7581n.f20898a;
                case 3:
                    List<C27413a> list2 = this.f72312a.mo70501a().get(this.f72313b.f72333e);
                    if (list2 == null) {
                        return null;
                    }
                    for (C27413a aVar2 : list2) {
                        if (aVar2 != null) {
                            aVar2.mo70521a(this.f72313b.f72333e, this.f72313b.f72331c);
                        }
                    }
                    return C7581n.f20898a;
                case 4:
                    List<C27413a> list3 = this.f72312a.mo70501a().get(this.f72313b.f72333e);
                    if (list3 == null) {
                        return null;
                    }
                    for (C27413a aVar3 : list3) {
                        if (aVar3 != null) {
                            Param param = this.f72313b.f72333e;
                            C27419e eVar = this.f72313b.f72332d;
                            if (eVar != null) {
                                num = eVar.f72337a;
                            } else {
                                num = null;
                            }
                            C27419e eVar2 = this.f72313b.f72332d;
                            if (eVar2 != null) {
                                str = eVar2.f72338b;
                            } else {
                                str = null;
                            }
                            C27419e eVar3 = this.f72313b.f72332d;
                            if (eVar3 != null) {
                                exc = eVar3.f72339c;
                            } else {
                                exc = null;
                            }
                            aVar3.mo70520a(param, num, str, exc);
                        }
                    }
                    return C7581n.f20898a;
                default:
                    return C7581n.f20898a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$e */
    static final class C27405e extends Lambda implements C7561a<Thread> {

        /* renamed from: a */
        public static final C27405e f72314a = new C27405e();

        C27405e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m89821a();
        }

        /* renamed from: a */
        private static Thread m89821a() {
            Looper mainLooper = Looper.getMainLooper();
            C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
            return mainLooper.getThread();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$f */
    static final class C27406f extends Lambda implements C7561a<C17794bt<Param, C27413a<Param, Target>>> {

        /* renamed from: a */
        public static final C27406f f72315a = new C27406f();

        C27406f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m89822a();
        }

        /* renamed from: a */
        private static C17794bt<Param, C27413a<Param, Target>> m89822a() {
            return C17863bz.m59388a().mo46190b().mo46189b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$g */
    static final class C27407g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72316a;

        /* renamed from: b */
        final /* synthetic */ C27416b f72317b;

        C27407g(C27400a aVar, C27416b bVar) {
            this.f72316a = aVar;
            this.f72317b = bVar;
        }

        public final /* synthetic */ Object call() {
            m89823a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89823a() {
            try {
                this.f72317b.mo70524a((C27414b<Param, Target>) this.f72316a);
            } catch (Exception e) {
                C27418d dVar = this.f72316a.f72296e;
                if (dVar != null) {
                    dVar.mo70531a(e);
                }
                this.f72316a.mo70512c(this.f72317b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$h */
    static final class C27408h extends Lambda implements C7561a<C7561a<? extends Object>> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72318a;

        /* renamed from: b */
        final /* synthetic */ Object f72319b;

        /* renamed from: c */
        final /* synthetic */ C27413a f72320c;

        /* renamed from: d */
        final /* synthetic */ C7561a f72321d;

        C27408h(C27400a aVar, Object obj, C27413a aVar2, C7561a aVar3) {
            this.f72318a = aVar;
            this.f72319b = obj;
            this.f72320c = aVar2;
            this.f72321d = aVar3;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7561a<Object> invoke() {
            Object obj = this.f72319b;
            if (obj != null) {
                C27413a aVar = this.f72320c;
                if (aVar != null) {
                    this.f72318a.mo70501a().put(obj, aVar);
                }
            }
            C7561a<Object> aVar2 = this.f72321d;
            if (aVar2 == null) {
                return null;
            }
            aVar2.invoke();
            return aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$i */
    static final class C27409i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27400a f72322a;

        /* renamed from: b */
        final /* synthetic */ C7561a f72323b;

        C27409i(C27400a aVar, C7561a aVar2) {
            this.f72322a = aVar;
            this.f72323b = aVar2;
        }

        public final void run() {
            this.f72322a.mo70505a(this.f72323b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$j */
    static final class C27410j extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72324a;

        C27410j(C27400a aVar) {
            this.f72324a = aVar;
            super(0);
        }

        /* renamed from: a */
        private void m89825a() {
            this.f72324a.mo70514d();
        }

        public final /* synthetic */ Object invoke() {
            m89825a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$k */
    static final class C27411k extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72325a;

        C27411k(C27400a aVar) {
            this.f72325a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m89826a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89826a() {
            this.f72325a.f72297f = true;
            this.f72325a.mo70511c();
            this.f72325a.mo70514d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$l */
    static final class C27412l extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C27400a f72326a;

        /* renamed from: b */
        final /* synthetic */ Object f72327b;

        /* renamed from: c */
        final /* synthetic */ C27413a f72328c;

        C27412l(C27400a aVar, Object obj, C27413a aVar2) {
            this.f72326a = aVar;
            this.f72327b = obj;
            this.f72328c = aVar2;
            super(0);
        }

        /* renamed from: a */
        private boolean m89827a() {
            return this.f72326a.mo70501a().remove(this.f72327b, this.f72328c);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m89827a());
        }
    }

    /* renamed from: f */
    private final Thread m89795f() {
        return (Thread) this.f72303m.getValue();
    }

    /* renamed from: a */
    public final C17794bt<Param, C27413a<Param, Target>> mo70501a() {
        return (C17794bt) this.f72301k.getValue();
    }

    /* renamed from: c */
    public final void mo70513c(Param param, C27413a<Param, Target> aVar) {
        m89788a(param, aVar, null);
    }

    /* renamed from: g */
    private final void m89797g() {
        m89789b((C7561a<? extends Object>) new C27410j<Object>(this));
    }

    /* renamed from: h */
    private final boolean m89799h() {
        return C7573i.m23585a((Object) m89795f(), (Object) Thread.currentThread());
    }

    /* renamed from: b */
    public final void mo70507b() {
        m89789b((C7561a<? extends Object>) new C27411k<Object>(this));
    }

    /* renamed from: d */
    public final void mo70514d() {
        while (this.f72297f && this.f72304n.get() > 0) {
            C27416b i = m89801i();
            if (i != null) {
                m89792d(i);
                this.f72304n.decrementAndGet();
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    private final C27416b<Param, Target> m89801i() {
        if (!this.f72299i.isEmpty()) {
            return (C27416b) this.f72299i.poll();
        }
        if (!this.f72298h.isEmpty()) {
            return (C27416b) this.f72298h.poll();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo70511c() {
        this.f72298h.clear();
        List<Param> list = this.f72305o;
        C7573i.m23582a((Object) list, "mInitParam");
        for (Param d : list) {
            C27416b d2 = m89791d(d);
            d2.f72330b = false;
            this.f72298h.offer(d2);
        }
        this.f72305o.clear();
    }

    /* renamed from: e */
    public final void mo70516e() {
        this.f72305o.clear();
        this.f72298h.clear();
        this.f72299i.clear();
        this.f72300j.clear();
        this.f72304n.set(this.f72306p);
        mo70501a().clear();
        this.f72297f = false;
    }

    /* renamed from: d */
    private final C27416b<Param, Target> m89791d(Param param) {
        return this.f72307q.mo70529a(param);
    }

    /* renamed from: f */
    private final void m89796f(C27416b<Param, Target> bVar) {
        this.f72300j.remove(bVar);
    }

    /* renamed from: d */
    private final void m89792d(C27416b<Param, Target> bVar) {
        this.f72300j.offer(bVar);
        C1592h.m7853a((Callable<TResult>) new C27407g<TResult>(this, bVar));
    }

    /* renamed from: b */
    private final void m89789b(C7561a<? extends Object> aVar) {
        if (m89799h()) {
            mo70505a(aVar);
        } else {
            this.f72302l.post(new C27409i(this, aVar));
        }
    }

    /* renamed from: e */
    private final void m89794e(C27416b<Param, Target> bVar) {
        m89796f(bVar);
        if (bVar.f72329a < this.f72293b) {
            bVar.f72329a++;
            this.f72298h.offer(bVar);
        }
    }

    /* renamed from: g */
    private final void m89798g(C27416b<Param, Target> bVar) {
        m89789b((C7561a<? extends Object>) new C27404d<Object>(this, bVar));
    }

    /* renamed from: h */
    private static boolean m89800h(C27416b<Param, Target> bVar) {
        if (bVar == null) {
            return false;
        }
        int b = bVar.mo70526b();
        if (3 == b || 4 == b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo70512c(C27416b<Param, Target> bVar) {
        C7573i.m23587b(bVar, "task");
        bVar.mo70523a(4);
        m89794e(bVar);
        m89798g(bVar);
        this.f72304n.incrementAndGet();
        m89797g();
    }

    /* renamed from: e */
    private final C27416b<Param, Target> m89793e(Param param) {
        Object obj;
        Iterator it = this.f72298h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Param param2 = ((C27416b) obj).f72333e;
            boolean z = true;
            if (param2 == null || !param2.equals(param)) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C27416b) obj;
    }

    /* renamed from: a */
    public final void mo70502a(C27416b<Param, Target> bVar) {
        C7573i.m23587b(bVar, "task");
        if (!m89800h(bVar)) {
            bVar.mo70523a(2);
        }
        m89798g(bVar);
    }

    /* renamed from: b */
    public final void mo70508b(C27416b<Param, Target> bVar) {
        C7573i.m23587b(bVar, "task");
        bVar.mo70523a(3);
        m89796f(bVar);
        m89798g(bVar);
        this.f72304n.incrementAndGet();
        m89797g();
    }

    /* renamed from: c */
    private final boolean m89790c(Param param) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        boolean z3;
        Iterator it = this.f72298h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Param param2 = ((C27416b) obj).f72333e;
            if (param2 == null || !param2.equals(param)) {
                z3 = false;
                continue;
            } else {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        if (((C27416b) obj) != null) {
            return true;
        }
        Iterator it2 = this.f72299i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            Param param3 = ((C27416b) obj2).f72333e;
            if (param3 == null || !param3.equals(param)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (((C27416b) obj2) != null) {
            return true;
        }
        Iterator it3 = this.f72300j.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            Param param4 = ((C27416b) obj3).f72333e;
            if (param4 == null || !param4.equals(param)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (((C27416b) obj3) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70504a(List<? extends Param> list) {
        if (list != null) {
            for (Object next : list) {
                if (next != null) {
                    this.f72305o.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo70510b(Param param) {
        Object obj;
        boolean z;
        if (param == null) {
            return false;
        }
        Iterator it = this.f72299i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Param param2 = ((C27416b) obj).f72333e;
            if (param2 == null || !param2.equals(param)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (((C27416b) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70505a(C7561a<? extends Object> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e) {
            C27418d dVar = this.f72296e;
            if (dVar != null) {
                dVar.mo70531a(e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo70506a(Param param) {
        Object obj;
        boolean z;
        if (param == null) {
            return false;
        }
        Iterator it = this.f72300j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Param param2 = ((C27416b) obj).f72333e;
            if (param2 == null || !param2.equals(param)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (((C27416b) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo70515d(Param param, C27413a<Param, Target> aVar) {
        m89789b((C7561a<? extends Object>) new C27412l<Object>(this, param, aVar));
    }

    public C27400a(int i, C27417c<Param, Target> cVar) {
        C7573i.m23587b(cVar, "taskGenerator");
        this.f72307q = cVar;
        this.f72294c = true;
        this.f72298h = new ConcurrentLinkedQueue();
        this.f72299i = new ConcurrentLinkedQueue();
        this.f72300j = new ConcurrentLinkedQueue();
        this.f72301k = C7546e.m23569a(C27406f.f72315a);
        this.f72302l = new Handler(Looper.getMainLooper());
        this.f72303m = C7546e.m23569a(C27405e.f72314a);
        this.f72304n = new AtomicInteger(this.f72306p);
        this.f72305o = Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: a */
    public final void mo70503a(Param param, C27413a<Param, Target> aVar) {
        if (param != null) {
            if (!this.f72294c || !m89790c(param)) {
                C27416b d = m89791d(param);
                d.f72330b = false;
                this.f72298h.offer(d);
                m89788a(param, aVar, new C27402b(this, d));
                mo70514d();
            }
        }
    }

    /* renamed from: b */
    public final void mo70509b(Param param, C27413a<Param, Target> aVar) {
        if (param != null) {
            if (!this.f72294c || (!mo70510b(param) && !mo70506a(param))) {
                C27416b e = m89793e(param);
                if (e != null) {
                    this.f72298h.remove(e);
                } else {
                    e = m89791d(param);
                }
                e.f72330b = true;
                this.f72299i.offer(e);
                m89788a(param, aVar, new C27403c(this, e));
                mo70514d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m89788a(Param param, C27413a<Param, Target> aVar, C7561a<? extends Object> aVar2) {
        m89789b((C7561a<? extends Object>) new C27408h<Object>(this, param, aVar, aVar2));
    }
}
