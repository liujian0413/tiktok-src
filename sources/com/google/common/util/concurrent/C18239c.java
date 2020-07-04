package com.google.common.util.concurrent;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.c */
abstract class C18239c<I, O, F, T> extends C18235h<O> implements Runnable {

    /* renamed from: a */
    C18253l<? extends I> f49623a;

    /* renamed from: b */
    F f49624b;

    /* renamed from: com.google.common.util.concurrent.c$a */
    static final class C18240a<I, O> extends C18239c<I, O, C17427g<? super I, ? extends O>, O> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47082a(O o) {
            mo47088b(o);
        }

        C18240a(C18253l<? extends I> lVar, C17427g<? super I, ? extends O> gVar) {
            super(lVar, gVar);
        }

        /* renamed from: a */
        private static O m60200a(C17427g<? super I, ? extends O> gVar, I i) {
            return gVar.mo44914b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo47106a(Object obj, Object obj2) throws Exception {
            return m60200a((C17427g) obj, (I) obj2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo47106a(F f, I i) throws Exception;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo47082a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47083b() {
        mo47085a((Future<?>) this.f49623a);
        this.f49623a = null;
        this.f49624b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo47081a() {
        C18253l<? extends I> lVar = this.f49623a;
        F f = this.f49624b;
        String a = super.mo47081a();
        String str = "";
        if (lVar != null) {
            StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(lVar);
            sb.append("], ");
            str = sb.toString();
        }
        if (f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(f);
            sb2.append("]");
            return sb2.toString();
        } else if (a == null) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(a);
            return sb3.toString();
        }
    }

    public final void run() {
        boolean z;
        C18253l<? extends I> lVar = this.f49623a;
        F f = this.f49624b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (lVar == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (f != null) {
            z2 = false;
        }
        if (!z3 && !z2) {
            this.f49623a = null;
            try {
                try {
                    Object a = mo47106a(f, C18246h.m60212a((Future<V>) lVar));
                    this.f49624b = null;
                    mo47082a(a);
                } catch (UndeclaredThrowableException e) {
                    mo47087a(e.getCause());
                    this.f49624b = null;
                } catch (Throwable th) {
                    this.f49624b = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                mo47087a(e2.getCause());
            } catch (RuntimeException e3) {
                mo47087a((Throwable) e3);
            } catch (Error e4) {
                mo47087a((Throwable) e4);
            }
        }
    }

    C18239c(C18253l<? extends I> lVar, F f) {
        this.f49623a = (C18253l) C17439m.m57962a(lVar);
        this.f49624b = C17439m.m57962a(f);
    }

    /* renamed from: a */
    static <I, O> C18253l<O> m60195a(C18253l<I> lVar, C17427g<? super I, ? extends O> gVar, Executor executor) {
        C17439m.m57962a(gVar);
        C18240a aVar = new C18240a(lVar, gVar);
        lVar.mo6818a(aVar, C18254m.m60218a(executor, aVar));
        return aVar;
    }
}
