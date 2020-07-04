package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47953c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlinx.coroutines.C48100bi.C48101a;
import kotlinx.coroutines.internal.C48177u;

/* renamed from: kotlinx.coroutines.k */
public class C48188k<T> extends C48079ar<T> implements C47953c, C48187j<T> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f123047b = AtomicIntegerFieldUpdater.newUpdater(C48188k.class, "_decision");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f123048c = AtomicReferenceFieldUpdater.newUpdater(C48188k.class, Object.class, "_state");
    private volatile int _decision = 0;
    public volatile Object _state = C48091b.f122956a;

    /* renamed from: a */
    private final C47924e f123049a = this.f123050d.getContext();

    /* renamed from: d */
    private final C47919b<T> f123050d;
    private volatile C48081at parentHandle;

    /* renamed from: a */
    public final Object mo120283a() {
        return this._state;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo120347c() {
        return "CancellableContinuation";
    }

    /* renamed from: d */
    public final C47919b<T> mo120284d() {
        return this.f123050d;
    }

    public C47924e getContext() {
        return this.f123049a;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: a */
    public final boolean mo120407a(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C48119bv)) {
                return false;
            }
            z = obj instanceof C48146h;
        } while (!f123048c.compareAndSet(this, obj, new C48190m(this, th, z)));
        if (z) {
            try {
                ((C48146h) obj).mo120289a(th);
            } catch (Throwable th2) {
                C47924e context = getContext();
                StringBuilder sb = new StringBuilder("Exception in cancellation handler for ");
                sb.append(this);
                C48051aa.m149013a(context, new CompletionHandlerException(sb.toString(), th2), null);
            }
        }
        m149514j();
        m149505a(0);
        return true;
    }

    /* renamed from: f */
    private boolean m149510f() {
        if (!(this._state instanceof C48119bv)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final void m149514j() {
        C48081at atVar = this.parentHandle;
        if (atVar != null) {
            atVar.mo120281a();
            this.parentHandle = C48118bu.f122982a;
        }
    }

    public C47953c getCallerFrame() {
        C47919b<T> bVar = this.f123050d;
        if (!(bVar instanceof C47953c)) {
            bVar = null;
        }
        return (C47953c) bVar;
    }

    /* renamed from: h */
    private final boolean m149512h() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f123047b.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: i */
    private final boolean m149513i() {
        do {
            switch (this._decision) {
                case 0:
                    break;
                case 1:
                    return false;
                default:
                    throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f123047b.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: b */
    public final Object mo120408b() {
        m149511g();
        if (m149512h()) {
            return C47948a.m148881a();
        }
        Object obj = this._state;
        if (!(obj instanceof C48217t)) {
            return mo120287a(obj);
        }
        throw C48177u.m149466a(((C48217t) obj).f123124a, (C47919b<?>) this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo120347c());
        sb.append('(');
        sb.append(C48059ag.m149022a(this.f123050d));
        sb.append("){");
        sb.append(this._state);
        sb.append("}@");
        sb.append(C48059ag.m149021a((Object) this));
        return sb.toString();
    }

    /* renamed from: g */
    private final void m149511g() {
        if (!m149510f()) {
            C48100bi biVar = (C48100bi) this.f123050d.getContext().get(C48100bi.f122964b);
            if (biVar != null) {
                biVar.mo120331m();
                C48081at a = C48101a.m149140a(biVar, true, false, new C48191n(biVar, this), 2, null);
                this.parentHandle = a;
                if (m149510f()) {
                    a.mo120281a();
                    this.parentHandle = C48118bu.f122982a;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m149505a(int i) {
        if (!m149513i()) {
            C48078aq.m149063a((C48079ar<? super T>) this, i);
        }
    }

    /* renamed from: b */
    private static C48146h m149508b(C7562b<? super Throwable, C7581n> bVar) {
        if (bVar instanceof C48146h) {
            return (C48146h) bVar;
        }
        return new C48097bf(bVar);
    }

    public void resumeWith(Object obj) {
        m149506a(C48218u.m149604a(obj), this.f122935e);
    }

    /* renamed from: c */
    private static void m149509c(Object obj) {
        StringBuilder sb = new StringBuilder("Already resumed, but proposed with update ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public final <T> T mo120287a(Object obj) {
        if (obj instanceof C48219v) {
            return ((C48219v) obj).f123125a;
        }
        return obj;
    }

    /* renamed from: a */
    public Throwable mo120346a(C48100bi biVar) {
        C7573i.m23587b(biVar, "parent");
        return biVar.mo120330l();
    }

    /* renamed from: a */
    public final void mo120404a(C7562b<? super Throwable, C7581n> bVar) {
        Object obj;
        C7573i.m23587b(bVar, "handler");
        C48146h hVar = null;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C48091b) {
                if (hVar == null) {
                    hVar = m149508b(bVar);
                }
                if (f123048c.compareAndSet(this, obj2, hVar)) {
                    return;
                }
            } else if (obj2 instanceof C48146h) {
                m149507a(bVar, obj2);
            } else if (obj2 instanceof C48190m) {
                if (!((C48190m) obj2).mo120411b()) {
                    m149507a(bVar, obj2);
                }
                try {
                    if (!(obj2 instanceof C48217t)) {
                        obj2 = null;
                    }
                    C48217t tVar = (C48217t) obj2;
                    if (tVar != null) {
                        obj = tVar.f123124a;
                    } else {
                        obj = null;
                    }
                    bVar.invoke(obj);
                    return;
                } catch (Throwable th) {
                    C47924e context = getContext();
                    StringBuilder sb = new StringBuilder("Exception in cancellation handler for ");
                    sb.append(this);
                    C48051aa.m149013a(context, new CompletionHandlerException(sb.toString(), th), null);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public C48188k(C47919b<? super T> bVar, int i) {
        C7573i.m23587b(bVar, "delegate");
        super(1);
        this.f123050d = bVar;
    }

    /* renamed from: a */
    private final void m149506a(Object obj, int i) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C48119bv) {
                if (f123048c.compareAndSet(this, obj2, obj)) {
                    m149514j();
                    m149505a(i);
                    return;
                }
            } else if (!(obj2 instanceof C48190m) || !((C48190m) obj2).mo120410a()) {
                m149509c(obj);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m149507a(C7562b<? super Throwable, C7581n> bVar, Object obj) {
        StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(bVar);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public final void mo120406a(Throwable th, int i) {
        C7573i.m23587b(th, "exception");
        m149506a((Object) new C48217t(th), 0);
    }

    /* renamed from: a */
    public final void mo120405a(C48222y yVar, T t) {
        int i;
        C7573i.m23587b(yVar, "receiver$0");
        C47919b<T> bVar = this.f123050d;
        C48222y yVar2 = null;
        if (!(bVar instanceof C48076ao)) {
            bVar = null;
        }
        C48076ao aoVar = (C48076ao) bVar;
        if (aoVar != null) {
            yVar2 = aoVar.f122930c;
        }
        if (yVar2 == yVar) {
            i = 3;
        } else {
            i = this.f122935e;
        }
        m149506a((Object) t, i);
    }
}
