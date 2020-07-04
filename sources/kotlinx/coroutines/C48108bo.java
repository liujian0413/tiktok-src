package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C47885a;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47953c;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48100bi.C48101a;
import kotlinx.coroutines.internal.C48153e;
import kotlinx.coroutines.internal.C48162i;
import kotlinx.coroutines.internal.C48163j;
import kotlinx.coroutines.internal.C48163j.C48164a;
import kotlinx.coroutines.internal.C48173q;
import kotlinx.coroutines.internal.C48177u;

/* renamed from: kotlinx.coroutines.bo */
public class C48108bo implements C48100bi, C48120bw, C48194q {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f122967a = AtomicReferenceFieldUpdater.newUpdater(C48108bo.class, Object.class, "_state");
    private volatile Object _state;
    private volatile C48192o parentHandle;

    /* renamed from: kotlinx.coroutines.bo$a */
    static final class C48109a<T> extends C48188k<T> {

        /* renamed from: a */
        private final C48108bo f122968a;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final String mo120347c() {
            return "AwaitContinuation";
        }

        /* renamed from: a */
        public final Throwable mo120346a(C48100bi biVar) {
            C7573i.m23587b(biVar, "parent");
            Object o = this.f122968a.mo120343o();
            if (o instanceof C48111c) {
                Throwable th = ((C48111c) o).rootCause;
                if (th != null) {
                    return th;
                }
            }
            if (o instanceof C48217t) {
                return ((C48217t) o).f123124a;
            }
            return biVar.mo120330l();
        }

        public C48109a(C47919b<? super T> bVar, C48108bo boVar) {
            C7573i.m23587b(bVar, "delegate");
            C7573i.m23587b(boVar, "job");
            super(bVar, 1);
            this.f122968a = boVar;
        }
    }

    /* renamed from: kotlinx.coroutines.bo$b */
    static final class C48110b extends C48107bn<C48100bi> {

        /* renamed from: a */
        private final C48108bo f122969a;

        /* renamed from: e */
        private final C48111c f122970e;

        /* renamed from: f */
        private final C48193p f122971f;

        /* renamed from: g */
        private final Object f122972g;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChildCompletion[");
            sb.append(this.f122971f);
            sb.append(", ");
            sb.append(this.f122972g);
            sb.append(']');
            return sb.toString();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo120291a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo120291a(Throwable th) {
            this.f122969a.mo120337a(this.f122970e, this.f122971f, this.f122972g);
        }

        public C48110b(C48108bo boVar, C48111c cVar, C48193p pVar, Object obj) {
            C7573i.m23587b(boVar, "parent");
            C7573i.m23587b(cVar, "state");
            C7573i.m23587b(pVar, "child");
            super(pVar.f123054a);
            this.f122969a = boVar;
            this.f122970e = cVar;
            this.f122971f = pVar;
            this.f122972g = obj;
        }
    }

    /* renamed from: kotlinx.coroutines.bo$c */
    static final class C48111c implements C48095bd {
        private volatile Object _exceptionsHolder;

        /* renamed from: a */
        private final C48117bt f122973a;
        public volatile boolean isCompleting = false;
        public volatile Throwable rootCause;

        public final C48117bt cd_() {
            return this.f122973a;
        }

        /* renamed from: e */
        private static ArrayList<Throwable> m149213e() {
            return new ArrayList<>(4);
        }

        /* renamed from: b */
        public final boolean mo120293b() {
            if (this.rootCause == null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo120351d() {
            if (this.rootCause != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo120350c() {
            if (this._exceptionsHolder == C48113bp.f122977a) {
                return true;
            }
            return false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(mo120351d());
            sb.append(", completing=");
            sb.append(this.isCompleting);
            sb.append(", rootCause=");
            sb.append(this.rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(cd_());
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public final List<Throwable> mo120348a(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = m149213e();
            } else if (obj instanceof Throwable) {
                ArrayList e = m149213e();
                e.add(obj);
                arrayList = e;
            } else if (!(obj instanceof ArrayList)) {
                StringBuilder sb = new StringBuilder("State is ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            } else if (obj != null) {
                arrayList = (ArrayList) obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!C7573i.m23585a((Object) th, (Object) th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C48113bp.f122977a;
            return arrayList;
        }

        /* renamed from: b */
        public final void mo120349b(Throwable th) {
            C7573i.m23587b(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList e = m149213e();
                        e.add(obj);
                        e.add(th);
                        this._exceptionsHolder = e;
                    }
                } else if (!(obj instanceof ArrayList)) {
                    StringBuilder sb = new StringBuilder("State is ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (obj != null) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
                }
            }
        }

        public C48111c(C48117bt btVar, boolean z, Throwable th) {
            C7573i.m23587b(btVar, "list");
            this.f122973a = btVar;
            this.rootCause = th;
        }
    }

    /* renamed from: kotlinx.coroutines.bo$d */
    public static final class C48112d extends C48164a {

        /* renamed from: a */
        final /* synthetic */ C48163j f122974a;

        /* renamed from: b */
        final /* synthetic */ C48108bo f122975b;

        /* renamed from: c */
        final /* synthetic */ Object f122976c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Object mo120353a(C48163j jVar) {
            boolean z;
            C7573i.m23587b(jVar, "affected");
            if (this.f122975b.mo120343o() == this.f122976c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return C48162i.m149410a();
        }

        public C48112d(C48163j jVar, C48163j jVar2, C48108bo boVar, Object obj) {
            this.f122974a = jVar;
            this.f122975b = boVar;
            this.f122976c = obj;
            super(jVar2);
        }
    }

    /* renamed from: a */
    public void mo120248a(Object obj, int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo120333c() {
        return true;
    }

    public boolean cb_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo120342d(Throwable th) {
        C7573i.m23587b(th, "exception");
    }

    /* renamed from: e */
    public void mo120254e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo120273h() {
        return false;
    }

    /* renamed from: a */
    public final void mo120335a(C48100bi biVar) {
        if (!(this.parentHandle == null)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (biVar == null) {
            this.parentHandle = C48118bu.f122982a;
        } else {
            biVar.mo120331m();
            C48192o a = biVar.mo120325a((C48194q) this);
            this.parentHandle = a;
            if (mo120328j()) {
                a.mo120281a();
                this.parentHandle = C48118bu.f122982a;
            }
        }
    }

    /* renamed from: a */
    private final boolean m149167a(C48111c cVar, Object obj, int i) {
        Throwable a;
        boolean z = false;
        if (!(mo120343o() == cVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!cVar.mo120350c())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (cVar.isCompleting) {
            Throwable th = null;
            C48217t tVar = (C48217t) (!(obj instanceof C48217t) ? null : obj);
            if (tVar != null) {
                th = tVar.f123124a;
            }
            synchronized (cVar) {
                List a2 = cVar.mo120348a(th);
                a = m149155a(cVar, a2);
                if (a != null && (m149164a(a, a2) || a != cVar.rootCause)) {
                    z = true;
                }
            }
            if (!(a == null || a == th)) {
                obj = new C48217t(a);
            }
            if (a != null && !m149178e(a)) {
                mo120342d(a);
            }
            if (f122967a.compareAndSet(this, cVar, C48113bp.m149221a(obj))) {
                m149161a(cVar, obj, i, z);
                return true;
            }
            StringBuilder sb = new StringBuilder("Unexpected state: ");
            sb.append(this._state);
            sb.append(", expected: ");
            sb.append(cVar);
            sb.append(", update: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString().toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: a */
    private static boolean m149164a(Throwable th, List<? extends Throwable> list) {
        boolean z = false;
        if (list.size() <= 1) {
            return false;
        }
        Set a = C48153e.m149402a(list.size());
        for (Throwable a2 : list) {
            Throwable a3 = C48177u.m149464a(a2);
            if (a3 != th && !(a3 instanceof CancellationException) && a.add(a3)) {
                C47885a.m148820a(th, a3);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m149165a(C48095bd bdVar, Object obj, int i) {
        if ((bdVar instanceof C48084aw) || (bdVar instanceof C48107bn)) {
            if (!(!(obj instanceof C48217t))) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!f122967a.compareAndSet(this, bdVar, C48113bp.m149221a(obj))) {
                return false;
            } else {
                m149161a(bdVar, obj, i, false);
                return true;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: a */
    private final void m149161a(C48095bd bdVar, Object obj, int i, boolean z) {
        C48192o oVar = this.parentHandle;
        if (oVar != null) {
            oVar.mo120281a();
            this.parentHandle = C48118bu.f122982a;
        }
        Throwable th = null;
        C48217t tVar = (C48217t) (!(obj instanceof C48217t) ? null : obj);
        if (tVar != null) {
            th = tVar.f123124a;
        }
        if (bdVar instanceof C48107bn) {
            try {
                ((C48107bn) bdVar).mo120291a(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(bdVar);
                sb.append(" for ");
                sb.append(this);
                mo120249a((Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        } else {
            C48117bt cd_ = bdVar.cd_();
            if (cd_ != null) {
                m149170b(cd_, th);
            }
        }
        mo120248a(obj, i, z);
    }

    /* renamed from: a */
    private final void m149160a(C48084aw awVar) {
        C48117bt btVar = new C48117bt();
        f122967a.compareAndSet(this, awVar, awVar.mo120293b() ? btVar : new C48094bc(btVar));
    }

    /* renamed from: a */
    public final void mo120338a(C48120bw bwVar) {
        C7573i.m23587b(bwVar, "parentJob");
        m149171b((Object) bwVar);
    }

    /* renamed from: a */
    private final boolean m149166a(C48095bd bdVar, Throwable th) {
        if (!(!(bdVar instanceof C48111c))) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (bdVar.mo120293b()) {
            C48117bt a = m149158a(bdVar);
            if (a == null) {
                return false;
            }
            if (!f122967a.compareAndSet(this, bdVar, new C48111c(a, false, th))) {
                return false;
            }
            m149162a(a, th);
            return true;
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: a */
    public final void mo120337a(C48111c cVar, C48193p pVar, Object obj) {
        if (mo120343o() == cVar) {
            C48193p a = m149159a((C48163j) pVar);
            if (a == null || !m149172b(cVar, a, obj)) {
                m149167a(cVar, obj, 0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: a */
    private static C48193p m149159a(C48163j jVar) {
        while (jVar.mo120377d()) {
            jVar = jVar.mo120381h();
        }
        while (true) {
            jVar = jVar.mo120379f();
            if (!jVar.mo120377d()) {
                if (jVar instanceof C48193p) {
                    return (C48193p) jVar;
                }
                if (jVar instanceof C48117bt) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public final C48192o mo120325a(C48194q qVar) {
        C7573i.m23587b(qVar, "child");
        C48081at a = C48101a.m149140a(this, true, false, new C48193p(this, qVar), 2, null);
        if (a != null) {
            return (C48192o) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: a */
    private final void m149162a(C48117bt btVar, Throwable th) {
        Object e = btVar.mo120378e();
        if (e != null) {
            Throwable th2 = null;
            for (C48163j jVar = (C48163j) e; !C7573i.m23585a((Object) jVar, (Object) btVar); jVar = jVar.mo120379f()) {
                if (jVar instanceof C48103bj) {
                    C48107bn bnVar = (C48107bn) jVar;
                    try {
                        bnVar.mo120291a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C47885a.m148820a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        C48108bo boVar = this;
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(bnVar);
                        sb.append(" for ");
                        sb.append(boVar);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                    }
                }
            }
            if (th2 != null) {
                mo120249a(th2);
            }
            m149178e(th);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public final C48081at mo120324a(boolean z, boolean z2, C7562b<? super Throwable, C7581n> bVar) {
        Object obj;
        C7573i.m23587b(bVar, "handler");
        Throwable th = null;
        C48107bn bnVar = null;
        while (true) {
            Object o = mo120343o();
            if (o instanceof C48084aw) {
                C48084aw awVar = (C48084aw) o;
                if (awVar.mo120293b()) {
                    if (bnVar == null) {
                        bnVar = m149157a(bVar, z);
                    }
                    if (f122967a.compareAndSet(this, o, bnVar)) {
                        return bnVar;
                    }
                } else {
                    m149160a(awVar);
                }
            } else if (o instanceof C48095bd) {
                C48117bt cd_ = ((C48095bd) o).cd_();
                if (cd_ != null) {
                    C48081at atVar = C48118bu.f122982a;
                    if (!z || !(o instanceof C48111c)) {
                        obj = null;
                    } else {
                        synchronized (o) {
                            obj = ((C48111c) o).rootCause;
                            if (obj == null || ((bVar instanceof C48193p) && !((C48111c) o).isCompleting)) {
                                if (bnVar == null) {
                                    bnVar = m149157a(bVar, z);
                                }
                                if (m149163a(o, cd_, bnVar)) {
                                    if (obj == null) {
                                        C48081at atVar2 = bnVar;
                                        return atVar2;
                                    }
                                    atVar = bnVar;
                                }
                            }
                        }
                    }
                    if (obj != null) {
                        if (z2) {
                            bVar.invoke(obj);
                        }
                        return atVar;
                    }
                    if (bnVar == null) {
                        bnVar = m149157a(bVar, z);
                    }
                    if (m149163a(o, cd_, bnVar)) {
                        return bnVar;
                    }
                } else if (o != null) {
                    m149169b((C48107bn) o);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(o instanceof C48217t)) {
                        o = null;
                    }
                    C48217t tVar = (C48217t) o;
                    if (tVar != null) {
                        th = tVar.f123124a;
                    }
                    bVar.invoke(th);
                }
                return C48118bu.f122982a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0009 A[LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m149163a(java.lang.Object r2, kotlinx.coroutines.C48117bt r3, kotlinx.coroutines.C48107bn<?> r4) {
        /*
            r1 = this;
            kotlinx.coroutines.bo$d r0 = new kotlinx.coroutines.bo$d
            kotlinx.coroutines.internal.j r4 = (kotlinx.coroutines.internal.C48163j) r4
            r0.<init>(r4, r4, r1, r2)
            kotlinx.coroutines.internal.j$a r0 = (kotlinx.coroutines.internal.C48163j.C48164a) r0
        L_0x0009:
            java.lang.Object r2 = r3.mo120380g()
            if (r2 == 0) goto L_0x001d
            kotlinx.coroutines.internal.j r2 = (kotlinx.coroutines.internal.C48163j) r2
            int r2 = r2.mo120374a(r4, r3, r0)
            switch(r2) {
                case 1: goto L_0x001b;
                case 2: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0009
        L_0x0019:
            r2 = 0
            return r2
        L_0x001b:
            r2 = 1
            return r2
        L_0x001d:
            kotlin.TypeCastException r2 = new kotlin.TypeCastException
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.m149163a(java.lang.Object, kotlinx.coroutines.bt, kotlinx.coroutines.bn):boolean");
    }

    /* renamed from: a */
    public final void mo120336a(C48107bn<?> bnVar) {
        Object o;
        C7573i.m23587b(bnVar, "node");
        do {
            o = mo120343o();
            if (!(o instanceof C48107bn)) {
                if ((o instanceof C48095bd) && ((C48095bd) o).cd_() != null) {
                    bnVar.mo120373c();
                }
                return;
            } else if (o != bnVar) {
                return;
            }
        } while (!f122967a.compareAndSet(this, o, C48113bp.f122979c));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo120339a(java.lang.Object r3, int r4) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.mo120343o()
            int r0 = r2.m149153a(r0, r3, r4)
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x001b;
                case 2: goto L_0x0019;
                case 3: goto L_0x0000;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            throw r3
        L_0x0019:
            r3 = 0
            return r3
        L_0x001b:
            r3 = 1
            return r3
        L_0x001d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " is already complete or completing, but is being completed with "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r3 = m149179f(r3)
            r4.<init>(r0, r3)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.mo120339a(java.lang.Object, int):boolean");
    }

    /* renamed from: g */
    public String mo120256g() {
        return C48059ag.m149023b(this);
    }

    public final C47929c<?> getKey() {
        return C48100bi.f122964b;
    }

    /* renamed from: n */
    public final void mo120332n() {
        mo120327b((Throwable) null);
    }

    /* renamed from: j */
    public final boolean mo120328j() {
        if (!(mo120343o() instanceof C48095bd)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final Object mo120343o() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C48173q)) {
                return obj;
            }
            ((C48173q) obj).mo120371b(this);
        }
    }

    /* renamed from: d */
    private final boolean mo120253d() {
        Object o;
        do {
            o = mo120343o();
            if (!(o instanceof C48095bd)) {
                return false;
            }
        } while (m149152a(o) < 0);
        return true;
    }

    /* renamed from: f */
    private final JobCancellationException mo120255f() {
        return new JobCancellationException("Job was cancelled", null, this);
    }

    /* renamed from: k */
    public final boolean mo120329k() {
        Object o = mo120343o();
        if ((o instanceof C48217t) || ((o instanceof C48111c) && ((C48111c) o).mo120351d())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo120331m() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.mo120343o()
            int r0 = r1.m149152a(r0)
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0000
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.mo120331m():boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo120286i());
        sb.append('@');
        sb.append(C48059ag.m149021a((Object) this));
        return sb.toString();
    }

    /* renamed from: i */
    private String mo120286i() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo120256g());
        sb.append('{');
        sb.append(m149181g(mo120343o()));
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != null) goto L_0x0051;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException mo120330l() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mo120343o()
            boolean r1 = r0 instanceof kotlinx.coroutines.C48108bo.C48111c
            if (r1 == 0) goto L_0x0031
            kotlinx.coroutines.bo$c r0 = (kotlinx.coroutines.C48108bo.C48111c) r0
            java.lang.Throwable r0 = r0.rootCause
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = "Job is cancelling"
            java.util.concurrent.CancellationException r0 = r4.m149156a(r0, r1)
            if (r0 == 0) goto L_0x0017
            goto L_0x0051
        L_0x0017:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job is still new or active: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0031:
            boolean r1 = r0 instanceof kotlinx.coroutines.C48095bd
            if (r1 != 0) goto L_0x0052
            boolean r1 = r0 instanceof kotlinx.coroutines.C48217t
            if (r1 == 0) goto L_0x0044
            kotlinx.coroutines.t r0 = (kotlinx.coroutines.C48217t) r0
            java.lang.Throwable r0 = r0.f123124a
            java.lang.String r1 = "Job was cancelled"
            java.util.concurrent.CancellationException r0 = r4.m149156a(r0, r1)
            return r0
        L_0x0044:
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = "Job has completed normally"
            r2 = 0
            r3 = r4
            kotlinx.coroutines.bi r3 = (kotlinx.coroutines.C48100bi) r3
            r0.<init>(r1, r2, r3)
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        L_0x0051:
            return r0
        L_0x0052:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job is still new or active: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.mo120330l():java.util.concurrent.CancellationException");
    }

    /* renamed from: p */
    public final Throwable mo120344p() {
        Throwable th;
        Object o = mo120343o();
        if (o instanceof C48111c) {
            th = ((C48111c) o).rootCause;
        } else if (o instanceof C48095bd) {
            StringBuilder sb = new StringBuilder("Cannot be cancelling child in this state: ");
            sb.append(o);
            throw new IllegalStateException(sb.toString().toString());
        } else if (o instanceof C48217t) {
            th = ((C48217t) o).f123124a;
        } else {
            th = null;
        }
        if (th != null && (!mo120333c() || (th instanceof CancellationException))) {
            return th;
        }
        StringBuilder sb2 = new StringBuilder("Parent job is ");
        sb2.append(m149181g(o));
        return new JobCancellationException(sb2.toString(), th, this);
    }

    /* renamed from: b */
    public boolean mo120251b() {
        Object o = mo120343o();
        if (!(o instanceof C48095bd) || !((C48095bd) o).mo120293b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo120249a(Throwable th) {
        C7573i.m23587b(th, "exception");
        throw th;
    }

    public C48108bo(boolean z) {
        C48084aw awVar;
        if (z) {
            awVar = C48113bp.f122979c;
        } else {
            awVar = C48113bp.f122978b;
        }
        this._state = awVar;
    }

    /* renamed from: f */
    private static Throwable m149179f(Object obj) {
        if (!(obj instanceof C48217t)) {
            obj = null;
        }
        C48217t tVar = (C48217t) obj;
        if (tVar != null) {
            return tVar.f123124a;
        }
        return null;
    }

    /* renamed from: a */
    public final C48081at mo120323a(C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(bVar, "handler");
        return mo120324a(false, true, bVar);
    }

    /* renamed from: b */
    public final boolean mo120327b(Throwable th) {
        if (!m149171b((Object) th) || !mo120333c()) {
            return false;
        }
        return true;
    }

    public <E extends C47927b> E get(C47929c<E> cVar) {
        C7573i.m23587b(cVar, "key");
        return C48101a.m149138a((C48100bi) this, cVar);
    }

    public C47924e minusKey(C47929c<?> cVar) {
        C7573i.m23587b(cVar, "key");
        return C48101a.m149141b(this, cVar);
    }

    public C47924e plus(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        return C48101a.m149139a((C48100bi) this, eVar);
    }

    /* renamed from: b */
    private final C48193p m149168b(C48095bd bdVar) {
        C48095bd bdVar2;
        if (!(bdVar instanceof C48193p)) {
            bdVar2 = null;
        } else {
            bdVar2 = bdVar;
        }
        C48193p pVar = (C48193p) bdVar2;
        if (pVar == null) {
            C48117bt cd_ = bdVar.cd_();
            if (cd_ != null) {
                return m149159a((C48163j) cd_);
            }
            pVar = null;
        }
        return pVar;
    }

    /* renamed from: e */
    private final boolean m149178e(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo120273h()) {
            return false;
        }
        C48192o oVar = this.parentHandle;
        if (oVar == null || !oVar.mo120355b(th)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo120341c(Throwable th) {
        C7573i.m23587b(th, "cause");
        if (!m149171b((Object) th) || !mo120333c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final int m149152a(Object obj) {
        if (obj instanceof C48084aw) {
            if (((C48084aw) obj).mo120293b()) {
                return 0;
            }
            if (!f122967a.compareAndSet(this, obj, C48113bp.f122979c)) {
                return -1;
            }
            mo120254e();
            return 1;
        } else if (!(obj instanceof C48094bc)) {
            return 0;
        } else {
            if (!f122967a.compareAndSet(this, obj, ((C48094bc) obj).cd_())) {
                return -1;
            }
            mo120254e();
            return 1;
        }
    }

    /* renamed from: b */
    private final void m149169b(C48107bn<?> bnVar) {
        bnVar.mo120375a(new C48117bt());
        f122967a.compareAndSet(this, bnVar, bnVar.mo120379f());
    }

    /* renamed from: d */
    private /* synthetic */ Object m149174d(C47919b<Object> bVar) {
        C48109a aVar = new C48109a(C47948a.m148878a(bVar), this);
        C48189l.m149525a(aVar, mo120323a((C7562b<? super Throwable, C7581n>) new C48121bx<Object,C7581n>(this, aVar)));
        Object b = aVar.mo120408b();
        if (b == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return b;
    }

    /* renamed from: g */
    private static String m149181g(Object obj) {
        if (obj instanceof C48111c) {
            C48111c cVar = (C48111c) obj;
            if (cVar.mo120351d()) {
                return "Cancelling";
            }
            if (cVar.isCompleting) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C48095bd) {
            if (((C48095bd) obj).mo120293b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C48217t) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: c */
    public final Object mo120340c(C47919b<Object> bVar) {
        Object o;
        do {
            o = mo120343o();
            if (!(o instanceof C48095bd)) {
                if (!(o instanceof C48217t)) {
                    return C48113bp.m149222b(o);
                }
                Throwable th = ((C48217t) o).f123124a;
                if (C48177u.m149472b(th)) {
                    throw th;
                } else if (!(bVar instanceof C47953c)) {
                    throw th;
                } else {
                    throw C48177u.m149467a(th, (C47953c) bVar);
                }
            }
        } while (m149152a(o) < 0);
        return m149174d(bVar);
    }

    /* renamed from: a */
    private /* synthetic */ Object mo120272a(C47919b<? super C7581n> bVar) {
        C48188k kVar = new C48188k(C47948a.m148878a(bVar), 1);
        C48187j jVar = kVar;
        C48189l.m149525a(jVar, mo120323a((C7562b<? super Throwable, C7581n>) new C48123bz<Object,C7581n>(this, jVar)));
        Object b = kVar.mo120408b();
        if (b == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m149173c(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.mo120343o()
            boolean r1 = r0 instanceof kotlinx.coroutines.C48095bd
            r2 = 0
            if (r1 == 0) goto L_0x0036
            boolean r1 = r0 instanceof kotlinx.coroutines.C48108bo.C48111c
            if (r1 == 0) goto L_0x0015
            r1 = r0
            kotlinx.coroutines.bo$c r1 = (kotlinx.coroutines.C48108bo.C48111c) r1
            boolean r1 = r1.isCompleting
            if (r1 == 0) goto L_0x0015
            goto L_0x0036
        L_0x0015:
            kotlinx.coroutines.t r1 = new kotlinx.coroutines.t
            java.lang.Throwable r3 = r4.m149175d(r5)
            r1.<init>(r3)
            int r0 = r4.m149153a(r0, r1, r2)
            switch(r0) {
                case 0: goto L_0x0035;
                case 1: goto L_0x0033;
                case 2: goto L_0x0033;
                case 3: goto L_0x0000;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x0033:
            r5 = 1
            return r5
        L_0x0035:
            return r2
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.m149173c(java.lang.Object):boolean");
    }

    /* renamed from: d */
    private final Throwable m149175d(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof Throwable;
        } else {
            z = true;
        }
        if (z) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return mo120255f();
        } else if (obj != null) {
            return ((C48120bw) obj).mo120344p();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: b */
    private final boolean m149171b(Object obj) {
        if (!cb_() || !m149173c(obj)) {
            return m149177e(obj);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r8 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        m149162a(((kotlinx.coroutines.C48108bo.C48111c) r2).cd_(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m149177e(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.mo120343o()
            boolean r3 = r2 instanceof kotlinx.coroutines.C48108bo.C48111c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004a
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.bo$c r3 = (kotlinx.coroutines.C48108bo.C48111c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.mo120350c()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r4
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.bo$c r3 = (kotlinx.coroutines.C48108bo.C48111c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.mo120351d()     // Catch:{ all -> 0x0047 }
            if (r8 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x002f
        L_0x0023:
            if (r1 != 0) goto L_0x0029
            java.lang.Throwable r1 = r7.m149175d(r8)     // Catch:{ all -> 0x0047 }
        L_0x0029:
            r8 = r2
            kotlinx.coroutines.bo$c r8 = (kotlinx.coroutines.C48108bo.C48111c) r8     // Catch:{ all -> 0x0047 }
            r8.mo120349b(r1)     // Catch:{ all -> 0x0047 }
        L_0x002f:
            r8 = r2
            kotlinx.coroutines.bo$c r8 = (kotlinx.coroutines.C48108bo.C48111c) r8     // Catch:{ all -> 0x0047 }
            java.lang.Throwable r8 = r8.rootCause     // Catch:{ all -> 0x0047 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r8 = r0
        L_0x003a:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x0046
            kotlinx.coroutines.bo$c r2 = (kotlinx.coroutines.C48108bo.C48111c) r2
            kotlinx.coroutines.bt r0 = r2.cd_()
            r7.m149162a(r0, r8)
        L_0x0046:
            return r5
        L_0x0047:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x004a:
            boolean r3 = r2 instanceof kotlinx.coroutines.C48095bd
            if (r3 == 0) goto L_0x0099
            if (r1 != 0) goto L_0x0054
            java.lang.Throwable r1 = r7.m149175d(r8)
        L_0x0054:
            r3 = r2
            kotlinx.coroutines.bd r3 = (kotlinx.coroutines.C48095bd) r3
            boolean r6 = r3.mo120293b()
            if (r6 == 0) goto L_0x0064
            boolean r2 = r7.m149166a(r3, r1)
            if (r2 == 0) goto L_0x0002
            return r5
        L_0x0064:
            kotlinx.coroutines.t r3 = new kotlinx.coroutines.t
            r3.<init>(r1)
            int r3 = r7.m149153a(r2, r3, r4)
            switch(r3) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x0002;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x007e:
            return r5
        L_0x007f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot happen in "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0099:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.m149177e(java.lang.Object):boolean");
    }

    /* renamed from: b */
    public final Object mo120326b(C47919b<? super C7581n> bVar) {
        if (mo120253d()) {
            return mo120272a(bVar);
        }
        C48141cj.m149372a(bVar.getContext());
        return C7581n.f20898a;
    }

    /* renamed from: a */
    private final C48117bt m149158a(C48095bd bdVar) {
        C48117bt cd_ = bdVar.cd_();
        if (cd_ != null) {
            return cd_;
        }
        if (bdVar instanceof C48084aw) {
            return new C48117bt();
        }
        if (bdVar instanceof C48107bn) {
            m149169b((C48107bn) bdVar);
            return null;
        }
        StringBuilder sb = new StringBuilder("State should have list: ");
        sb.append(bdVar);
        throw new IllegalStateException(sb.toString().toString());
    }

    public <R> R fold(R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
        C7573i.m23587b(mVar, "operation");
        return C48101a.m149137a(this, r, mVar);
    }

    /* renamed from: a */
    private final CancellationException m149156a(Throwable th, String str) {
        Throwable th2;
        if (!(th instanceof CancellationException)) {
            th2 = null;
        } else {
            th2 = th;
        }
        CancellationException cancellationException = (CancellationException) th2;
        if (cancellationException == null) {
            return new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: b */
    private final void m149170b(C48117bt btVar, Throwable th) {
        Object e = btVar.mo120378e();
        if (e != null) {
            Throwable th2 = null;
            for (C48163j jVar = (C48163j) e; !C7573i.m23585a((Object) jVar, (Object) btVar); jVar = jVar.mo120379f()) {
                if (jVar instanceof C48107bn) {
                    C48107bn bnVar = (C48107bn) jVar;
                    try {
                        bnVar.mo120291a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C47885a.m148820a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        C48108bo boVar = this;
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(bnVar);
                        sb.append(" for ");
                        sb.append(boVar);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                    }
                }
            }
            if (th2 != null) {
                mo120249a(th2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    private final Throwable m149155a(C48111c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th == null) {
                th = (Throwable) list.get(0);
            }
            return th;
        } else if (cVar.mo120351d()) {
            return mo120255f();
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r2 == null) goto L_0x0060;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.C48107bn<?> m149157a(kotlin.jvm.p357a.C7562b<? super java.lang.Throwable, kotlin.C7581n> r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0037
            boolean r6 = r5 instanceof kotlinx.coroutines.C48103bj
            if (r6 != 0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r2 = r5
        L_0x000b:
            kotlinx.coroutines.bj r2 = (kotlinx.coroutines.C48103bj) r2
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.bi r6 = r2.f122966b
            r3 = r4
            kotlinx.coroutines.bo r3 = (kotlinx.coroutines.C48108bo) r3
            if (r6 != r3) goto L_0x0017
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x001e
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.C48107bn) r2
            return r2
        L_0x001e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x002c:
            kotlinx.coroutines.bg r6 = new kotlinx.coroutines.bg
            r0 = r4
            kotlinx.coroutines.bi r0 = (kotlinx.coroutines.C48100bi) r0
            r6.<init>(r0, r5)
            kotlinx.coroutines.bn r6 = (kotlinx.coroutines.C48107bn) r6
            return r6
        L_0x0037:
            boolean r6 = r5 instanceof kotlinx.coroutines.C48107bn
            if (r6 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r5
        L_0x003d:
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.C48107bn) r2
            if (r2 == 0) goto L_0x0060
            J r6 = r2.f122966b
            r3 = r4
            kotlinx.coroutines.bo r3 = (kotlinx.coroutines.C48108bo) r3
            if (r6 != r3) goto L_0x004d
            boolean r6 = r2 instanceof kotlinx.coroutines.C48103bj
            if (r6 != 0) goto L_0x004d
            r0 = 1
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            if (r2 != 0) goto L_0x006b
            goto L_0x0060
        L_0x0052:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x0060:
            kotlinx.coroutines.bh r6 = new kotlinx.coroutines.bh
            r0 = r4
            kotlinx.coroutines.bi r0 = (kotlinx.coroutines.C48100bi) r0
            r6.<init>(r0, r5)
            r2 = r6
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.C48107bn) r2
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.m149157a(kotlin.jvm.a.b, boolean):kotlinx.coroutines.bn");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        if (r1 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        m149162a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x007a, code lost:
        r9 = m149168b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007e, code lost:
        if (r9 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0084, code lost:
        if (m149172b(r5, r9, r10) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0087, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0088, code lost:
        m149167a(r5, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008b, code lost:
        return 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m149153a(java.lang.Object r9, java.lang.Object r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.C48095bd
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r9 instanceof kotlinx.coroutines.C48084aw
            r2 = 3
            r3 = 1
            if (r0 != 0) goto L_0x0010
            boolean r0 = r9 instanceof kotlinx.coroutines.C48107bn
            if (r0 == 0) goto L_0x0022
        L_0x0010:
            boolean r0 = r9 instanceof kotlinx.coroutines.C48193p
            if (r0 != 0) goto L_0x0022
            boolean r0 = r10 instanceof kotlinx.coroutines.C48217t
            if (r0 != 0) goto L_0x0022
            kotlinx.coroutines.bd r9 = (kotlinx.coroutines.C48095bd) r9
            boolean r9 = r8.m149165a(r9, r10, r11)
            if (r9 != 0) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        L_0x0022:
            r0 = r9
            kotlinx.coroutines.bd r0 = (kotlinx.coroutines.C48095bd) r0
            kotlinx.coroutines.bt r4 = r8.m149158a(r0)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            boolean r5 = r9 instanceof kotlinx.coroutines.C48108bo.C48111c
            r6 = 0
            if (r5 != 0) goto L_0x0033
            r5 = r6
            goto L_0x0034
        L_0x0033:
            r5 = r9
        L_0x0034:
            kotlinx.coroutines.bo$c r5 = (kotlinx.coroutines.C48108bo.C48111c) r5
            if (r5 != 0) goto L_0x003d
            kotlinx.coroutines.bo$c r5 = new kotlinx.coroutines.bo$c
            r5.<init>(r4, r1, r6)
        L_0x003d:
            monitor-enter(r5)
            boolean r7 = r5.isCompleting     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x0044
            monitor-exit(r5)
            return r1
        L_0x0044:
            r5.isCompleting = r3     // Catch:{ all -> 0x009a }
            if (r5 == r9) goto L_0x0052
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f122967a     // Catch:{ all -> 0x009a }
            boolean r9 = r1.compareAndSet(r8, r9, r5)     // Catch:{ all -> 0x009a }
            if (r9 != 0) goto L_0x0052
            monitor-exit(r5)
            return r2
        L_0x0052:
            boolean r9 = r5.mo120350c()     // Catch:{ all -> 0x009a }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x008c
            boolean r9 = r5.mo120351d()     // Catch:{ all -> 0x009a }
            boolean r1 = r10 instanceof kotlinx.coroutines.C48217t     // Catch:{ all -> 0x009a }
            if (r1 != 0) goto L_0x0063
            r1 = r6
            goto L_0x0064
        L_0x0063:
            r1 = r10
        L_0x0064:
            kotlinx.coroutines.t r1 = (kotlinx.coroutines.C48217t) r1     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x006d
            java.lang.Throwable r1 = r1.f123124a     // Catch:{ all -> 0x009a }
            r5.mo120349b(r1)     // Catch:{ all -> 0x009a }
        L_0x006d:
            java.lang.Throwable r1 = r5.rootCause     // Catch:{ all -> 0x009a }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r6
        L_0x0074:
            monitor-exit(r5)
            if (r1 == 0) goto L_0x007a
            r8.m149162a(r4, r1)
        L_0x007a:
            kotlinx.coroutines.p r9 = r8.m149168b(r0)
            if (r9 == 0) goto L_0x0088
            boolean r9 = r8.m149172b(r5, r9, r10)
            if (r9 == 0) goto L_0x0088
            r9 = 2
            return r9
        L_0x0088:
            r8.m149167a(r5, r10, r11)
            return r3
        L_0x008c:
            java.lang.String r9 = "Failed requirement."
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x009a }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x009a }
            r10.<init>(r9)     // Catch:{ all -> 0x009a }
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ all -> 0x009a }
            throw r10     // Catch:{ all -> 0x009a }
        L_0x009a:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48108bo.m149153a(java.lang.Object, java.lang.Object, int):int");
    }

    /* renamed from: b */
    private final boolean m149172b(C48111c cVar, C48193p pVar, Object obj) {
        while (C48101a.m149140a(pVar.f123054a, false, false, new C48110b(this, cVar, pVar, obj), 1, null) == C48118bu.f122982a) {
            pVar = m149159a((C48163j) pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }
}
