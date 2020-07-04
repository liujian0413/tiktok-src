package p346io.reactivex.p1865a.p1866a;

import java.util.concurrent.Callable;
import p346io.reactivex.C7499z;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.a.a.a */
public final class C47548a {

    /* renamed from: a */
    private static volatile C7327h<Callable<C7499z>, C7499z> f122000a;

    /* renamed from: b */
    private static volatile C7327h<C7499z, C7499z> f122001b;

    /* renamed from: a */
    public static C7499z m148324a(Callable<C7499z> callable) {
        C7327h<Callable<C7499z>, C7499z> hVar = f122000a;
        if (hVar == null) {
            return m148326b(callable);
        }
        return m148322a(hVar, callable);
    }

    /* renamed from: b */
    private static C7499z m148326b(Callable<C7499z> callable) {
        try {
            C7499z zVar = (C7499z) callable.call();
            if (zVar != null) {
                return zVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C7331a.m23008a(th);
        }
    }

    /* renamed from: a */
    public static C7499z m148323a(C7499z zVar) {
        if (zVar != null) {
            C7327h<C7499z, C7499z> hVar = f122001b;
            if (hVar == null) {
                return zVar;
            }
            return (C7499z) m148325a(hVar, (T) zVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    private static C7499z m148322a(C7327h<Callable<C7499z>, C7499z> hVar, Callable<C7499z> callable) {
        C7499z zVar = (C7499z) m148325a(hVar, (T) callable);
        if (zVar != null) {
            return zVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: a */
    private static <T, R> R m148325a(C7327h<T, R> hVar, T t) {
        try {
            return hVar.apply(t);
        } catch (Throwable th) {
            throw C7331a.m23008a(th);
        }
    }
}
