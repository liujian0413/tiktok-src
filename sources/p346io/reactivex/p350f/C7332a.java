package p346io.reactivex.p350f;

import java.util.concurrent.Callable;
import org.p361a.C48293c;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47560b;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7318a;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7490k;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.exceptions.OnErrorNotImplementedException;
import p346io.reactivex.exceptions.UndeliverableException;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.p348d.C47569e;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p349e.C7330a;

/* renamed from: io.reactivex.f.a */
public final class C7332a {

    /* renamed from: a */
    static volatile C7326g<? super Throwable> f20394a;

    /* renamed from: b */
    static volatile C7327h<? super Runnable, ? extends Runnable> f20395b;

    /* renamed from: c */
    static volatile C7327h<? super Callable<C7499z>, ? extends C7499z> f20396c;

    /* renamed from: d */
    static volatile C7327h<? super Callable<C7499z>, ? extends C7499z> f20397d;

    /* renamed from: e */
    static volatile C7327h<? super Callable<C7499z>, ? extends C7499z> f20398e;

    /* renamed from: f */
    static volatile C7327h<? super Callable<C7499z>, ? extends C7499z> f20399f;

    /* renamed from: g */
    static volatile C7327h<? super C7499z, ? extends C7499z> f20400g;

    /* renamed from: h */
    static volatile C7327h<? super C7499z, ? extends C7499z> f20401h;

    /* renamed from: i */
    static volatile C7327h<? super C7499z, ? extends C7499z> f20402i;

    /* renamed from: j */
    static volatile C7327h<? super C7499z, ? extends C7499z> f20403j;

    /* renamed from: k */
    static volatile C7327h<? super C7329e, ? extends C7329e> f20404k;

    /* renamed from: l */
    static volatile C7327h<? super C7492s, ? extends C7492s> f20405l;

    /* renamed from: m */
    static volatile C7327h<? super C7330a, ? extends C7330a> f20406m;

    /* renamed from: n */
    static volatile C7327h<? super C7490k, ? extends C7490k> f20407n;

    /* renamed from: o */
    static volatile C7327h<? super C7319aa, ? extends C7319aa> f20408o;

    /* renamed from: p */
    static volatile C7327h<? super C7318a, ? extends C7318a> f20409p;

    /* renamed from: q */
    static volatile C7324c<? super C7329e, ? super C48293c, ? extends C48293c> f20410q;

    /* renamed from: r */
    static volatile C7324c<? super C7490k, ? super C47856n, ? extends C47856n> f20411r;

    /* renamed from: s */
    static volatile C7324c<? super C7492s, ? super C7498y, ? extends C7498y> f20412s;

    /* renamed from: t */
    static volatile C7324c<? super C7319aa, ? super C47557ad, ? extends C47557ad> f20413t;

    /* renamed from: u */
    static volatile C7324c<? super C7318a, ? super C47560b, ? extends C47560b> f20414u;

    /* renamed from: v */
    static volatile C47569e f20415v;

    /* renamed from: w */
    static volatile boolean f20416w;

    /* renamed from: x */
    static volatile boolean f20417x;

    /* renamed from: a */
    public static boolean m23030a() {
        return f20417x;
    }

    /* renamed from: b */
    public static C7326g<? super Throwable> m23031b() {
        return f20394a;
    }

    /* renamed from: a */
    public static C7499z m23022a(Callable<C7499z> callable) {
        C7364b.m23081a(callable, "Scheduler Callable can't be null");
        C7327h<? super Callable<C7499z>, ? extends C7499z> hVar = f20396c;
        if (hVar == null) {
            return m23041e(callable);
        }
        return m23020a(hVar, callable);
    }

    /* renamed from: a */
    public static C7499z m23021a(C7499z zVar) {
        C7327h<? super C7499z, ? extends C7499z> hVar = f20400g;
        if (hVar == null) {
            return zVar;
        }
        return (C7499z) m23024a(hVar, (T) zVar);
    }

    /* renamed from: a */
    public static void m23029a(Throwable th) {
        C7326g<? super Throwable> gVar = f20394a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m23034b(th)) {
            th = new UndeliverableException(th);
        }
        if (gVar != null) {
            try {
                gVar.accept(th);
                return;
            } catch (Throwable th2) {
                m23037c(th2);
            }
        }
        m23037c(th);
    }

    /* renamed from: a */
    public static Runnable m23025a(Runnable runnable) {
        C7364b.m23081a(runnable, "run is null");
        C7327h<? super Runnable, ? extends Runnable> hVar = f20395b;
        if (hVar == null) {
            return runnable;
        }
        return (Runnable) m23024a(hVar, (T) runnable);
    }

    /* renamed from: a */
    public static void m23027a(C7326g<? super Throwable> gVar) {
        if (!f20416w) {
            f20394a = gVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: a */
    public static void m23028a(C7327h<? super C7499z, ? extends C7499z> hVar) {
        if (!f20416w) {
            f20402i = hVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: a */
    public static <T> C48293c<? super T> m23026a(C7329e<T> eVar, C48293c<? super T> cVar) {
        C7324c<? super C7329e, ? super C48293c, ? extends C48293c> cVar2 = f20410q;
        return cVar2 != null ? (C48293c) m23023a(cVar2, eVar, cVar) : cVar;
    }

    /* renamed from: a */
    public static <T> C7498y<? super T> m23019a(C7492s<T> sVar, C7498y<? super T> yVar) {
        C7324c<? super C7492s, ? super C7498y, ? extends C7498y> cVar = f20412s;
        return cVar != null ? (C7498y) m23023a(cVar, sVar, yVar) : yVar;
    }

    /* renamed from: a */
    public static <T> C7492s<T> m23018a(C7492s<T> sVar) {
        C7327h<? super C7492s, ? extends C7492s> hVar = f20405l;
        return hVar != null ? (C7492s) m23024a(hVar, (T) sVar) : sVar;
    }

    /* renamed from: a */
    private static <T, R> R m23024a(C7327h<T, R> hVar, T t) {
        try {
            return hVar.apply(t);
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: a */
    private static <T, U, R> R m23023a(C7324c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.apply(t, u);
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: a */
    private static C7499z m23020a(C7327h<? super Callable<C7499z>, ? extends C7499z> hVar, Callable<C7499z> callable) {
        return (C7499z) C7364b.m23081a(m23024a(hVar, (T) callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: c */
    public static boolean m23038c() {
        C47569e eVar = f20415v;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo10175a();
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: a */
    public static C7318a m23010a(C7318a aVar) {
        C7327h<? super C7318a, ? extends C7318a> hVar = f20409p;
        if (hVar != null) {
            return (C7318a) m23024a(hVar, (T) aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public static C7499z m23032b(C7499z zVar) {
        C7327h<? super C7499z, ? extends C7499z> hVar = f20402i;
        if (hVar == null) {
            return zVar;
        }
        return (C7499z) m23024a(hVar, (T) zVar);
    }

    /* renamed from: c */
    public static C7499z m23035c(C7499z zVar) {
        C7327h<? super C7499z, ? extends C7499z> hVar = f20403j;
        if (hVar == null) {
            return zVar;
        }
        return (C7499z) m23024a(hVar, (T) zVar);
    }

    /* renamed from: d */
    public static C7499z m23039d(C7499z zVar) {
        C7327h<? super C7499z, ? extends C7499z> hVar = f20401h;
        if (hVar == null) {
            return zVar;
        }
        return (C7499z) m23024a(hVar, (T) zVar);
    }

    /* renamed from: a */
    public static <T> C7319aa<T> m23011a(C7319aa<T> aaVar) {
        C7327h<? super C7319aa, ? extends C7319aa> hVar = f20408o;
        if (hVar != null) {
            return (C7319aa) m23024a(hVar, (T) aaVar);
        }
        return aaVar;
    }

    /* renamed from: b */
    public static C7499z m23033b(Callable<C7499z> callable) {
        C7364b.m23081a(callable, "Scheduler Callable can't be null");
        C7327h<? super Callable<C7499z>, ? extends C7499z> hVar = f20398e;
        if (hVar == null) {
            return m23041e(callable);
        }
        return m23020a(hVar, callable);
    }

    /* renamed from: c */
    public static C7499z m23036c(Callable<C7499z> callable) {
        C7364b.m23081a(callable, "Scheduler Callable can't be null");
        C7327h<? super Callable<C7499z>, ? extends C7499z> hVar = f20399f;
        if (hVar == null) {
            return m23041e(callable);
        }
        return m23020a(hVar, callable);
    }

    /* renamed from: d */
    public static C7499z m23040d(Callable<C7499z> callable) {
        C7364b.m23081a(callable, "Scheduler Callable can't be null");
        C7327h<? super Callable<C7499z>, ? extends C7499z> hVar = f20397d;
        if (hVar == null) {
            return m23041e(callable);
        }
        return m23020a(hVar, callable);
    }

    /* renamed from: e */
    private static C7499z m23041e(Callable<C7499z> callable) {
        try {
            return (C7499z) C7364b.m23081a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: b */
    private static boolean m23034b(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m23037c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public static <T> C7330a<T> m23014a(C7330a<T> aVar) {
        C7327h<? super C7330a, ? extends C7330a> hVar = f20406m;
        if (hVar != null) {
            return (C7330a) m23024a(hVar, (T) aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public static <T> C7329e<T> m23015a(C7329e<T> eVar) {
        C7327h<? super C7329e, ? extends C7329e> hVar = f20404k;
        if (hVar != null) {
            return (C7329e) m23024a(hVar, (T) eVar);
        }
        return eVar;
    }

    /* renamed from: a */
    public static <T> C7490k<T> m23016a(C7490k<T> kVar) {
        C7327h<? super C7490k, ? extends C7490k> hVar = f20407n;
        if (hVar != null) {
            return (C7490k) m23024a(hVar, (T) kVar);
        }
        return kVar;
    }

    /* renamed from: a */
    public static <T> C47557ad<? super T> m23012a(C7319aa<T> aaVar, C47557ad<? super T> adVar) {
        C7324c<? super C7319aa, ? super C47557ad, ? extends C47557ad> cVar = f20413t;
        if (cVar != null) {
            return (C47557ad) m23023a(cVar, aaVar, adVar);
        }
        return adVar;
    }

    /* renamed from: a */
    public static C47560b m23013a(C7318a aVar, C47560b bVar) {
        C7324c<? super C7318a, ? super C47560b, ? extends C47560b> cVar = f20414u;
        if (cVar != null) {
            return (C47560b) m23023a(cVar, aVar, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public static <T> C47856n<? super T> m23017a(C7490k<T> kVar, C47856n<? super T> nVar) {
        C7324c<? super C7490k, ? super C47856n, ? extends C47856n> cVar = f20411r;
        if (cVar != null) {
            return (C47856n) m23023a(cVar, kVar, nVar);
        }
        return nVar;
    }
}
