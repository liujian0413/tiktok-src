package kotlinx.coroutines;

import kotlin.C47965i;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlinx.coroutines.internal.C48177u;
import kotlinx.coroutines.internal.C48180x;
import kotlinx.coroutines.scheduling.C48208h;
import kotlinx.coroutines.scheduling.C48209i;

/* renamed from: kotlinx.coroutines.ar */
public abstract class C48079ar<T> extends C48208h {

    /* renamed from: e */
    public int f122935e;

    /* renamed from: a */
    public abstract Object mo120283a();

    /* renamed from: a */
    public <T> T mo120287a(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public abstract C47919b<T> mo120284d();

    public final void run() {
        C47924e context;
        C48100bi biVar;
        Object a;
        C48209i iVar = this.f123102g;
        try {
            C47919b d = mo120284d();
            if (d != null) {
                C48076ao aoVar = (C48076ao) d;
                C47919b<T> bVar = aoVar.f122931d;
                context = bVar.getContext();
                if (C48122by.m149233a(this.f122935e)) {
                    biVar = (C48100bi) context.get(C48100bi.f122964b);
                } else {
                    biVar = null;
                }
                Object a2 = mo120283a();
                a = C48180x.m149482a(context, aoVar.f122929b);
                if (biVar != null) {
                    if (!biVar.mo120251b()) {
                        bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(biVar.mo120330l())));
                        C48180x.m149483b(context, a);
                        iVar.mo120437a();
                        return;
                    }
                }
                Throwable b = m149067b(a2);
                if (b != null) {
                    bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(C48177u.m149466a(b, bVar))));
                } else {
                    bVar.resumeWith(Result.m150902constructorimpl(mo120287a(a2)));
                }
                C48180x.m149483b(context, a);
                iVar.mo120437a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th) {
            try {
                StringBuilder sb = new StringBuilder("Unexpected exception running ");
                sb.append(this);
                throw new DispatchException(sb.toString(), th);
            } catch (Throwable th2) {
                iVar.mo120437a();
                throw th2;
            }
        }
    }

    public C48079ar(int i) {
        this.f122935e = i;
    }

    /* renamed from: b */
    public static Throwable m149067b(Object obj) {
        if (!(obj instanceof C48217t)) {
            obj = null;
        }
        C48217t tVar = (C48217t) obj;
        if (tVar != null) {
            return tVar.f123124a;
        }
        return null;
    }
}
