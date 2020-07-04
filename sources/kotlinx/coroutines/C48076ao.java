package kotlinx.coroutines;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.jvm.internal.C47953c;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48180x;

/* renamed from: kotlinx.coroutines.ao */
public final class C48076ao<T> extends C48079ar<T> implements C47919b<T>, C47953c {

    /* renamed from: a */
    public Object f122928a = C48078aq.f122934a;

    /* renamed from: b */
    public final Object f122929b;

    /* renamed from: c */
    public final C48222y f122930c;

    /* renamed from: d */
    public final C47919b<T> f122931d;

    /* renamed from: h */
    private final C47953c f122932h;

    /* renamed from: d */
    public final C47919b<T> mo120284d() {
        return this;
    }

    public final C47953c getCallerFrame() {
        return this.f122932h;
    }

    public final C47924e getContext() {
        return this.f122931d.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: a */
    public final Object mo120283a() {
        boolean z;
        Object obj = this.f122928a;
        if (obj != C48078aq.f122934a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f122928a = C48078aq.f122934a;
            return obj;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append(this.f122930c);
        sb.append(", ");
        sb.append(C48059ag.m149022a(this.f122931d));
        sb.append(']');
        return sb.toString();
    }

    public final void resumeWith(Object obj) {
        C47924e context;
        Object a;
        C47924e context2 = this.f122931d.getContext();
        Object a2 = C48218u.m149604a(obj);
        if (this.f122930c.mo83490a(context2)) {
            this.f122928a = a2;
            this.f122935e = 0;
            this.f122930c.mo83489a(context2, this);
            return;
        }
        C48085ax a3 = C48128cc.m149247a();
        if (a3.mo120303f()) {
            this.f122928a = a2;
            this.f122935e = 0;
            a3.mo120296a((C48079ar<?>) this);
            return;
        }
        a3.mo120297a(true);
        try {
            context = getContext();
            a = C48180x.m149482a(context, this.f122929b);
            this.f122931d.resumeWith(obj);
            C48180x.m149483b(context, a);
            do {
            } while (a3.mo120302e());
            a3.mo120299b(true);
        } catch (Throwable th) {
            try {
                throw new DispatchException("Unexpected exception in unconfined event loop", th);
            } catch (Throwable th2) {
                a3.mo120299b(true);
                throw th2;
            }
        }
    }

    public C48076ao(C48222y yVar, C47919b<? super T> bVar) {
        C7573i.m23587b(yVar, "dispatcher");
        C7573i.m23587b(bVar, "continuation");
        super(0);
        this.f122930c = yVar;
        this.f122931d = bVar;
        C47919b<T> bVar2 = this.f122931d;
        if (!(bVar2 instanceof C47953c)) {
            bVar2 = null;
        }
        this.f122932h = (C47953c) bVar2;
        this.f122929b = C48180x.m149481a(getContext());
    }
}
