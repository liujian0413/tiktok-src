package p346io.reactivex;

import java.util.concurrent.TimeUnit;
import org.p361a.C7704b;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.observers.C47610c;
import p346io.reactivex.internal.operators.maybe.C47741b;
import p346io.reactivex.internal.operators.maybe.C47745d;
import p346io.reactivex.internal.operators.maybe.C47746e;
import p346io.reactivex.internal.operators.maybe.C47748f;
import p346io.reactivex.internal.operators.maybe.C47750g;
import p346io.reactivex.internal.operators.maybe.C47752h;
import p346io.reactivex.internal.operators.maybe.C47754i;
import p346io.reactivex.internal.operators.maybe.C47756j;
import p346io.reactivex.internal.operators.maybe.C47759k;
import p346io.reactivex.internal.operators.maybe.C47762l;
import p346io.reactivex.internal.operators.maybe.C47766m;
import p346io.reactivex.internal.operators.maybe.C47768n;
import p346io.reactivex.internal.operators.maybe.C47770o;
import p346io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47599b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: io.reactivex.k */
public abstract class C7490k<T> implements C7491p<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10198a(C47856n<? super T> nVar);

    /* renamed from: a */
    public final <R> R mo19272a(C47854l<T, ? extends R> lVar) {
        return ((C47854l) C7364b.m23081a(lVar, "converter is null")).mo10192a(this);
    }

    /* renamed from: a */
    public final T mo19271a() {
        C47610c cVar = new C47610c();
        mo19277b((C47856n<? super T>) cVar);
        return cVar.mo119706a();
    }

    /* renamed from: a */
    public final <R> C7490k<R> mo19268a(C47868q<? super T, ? extends R> qVar) {
        return m23238a(((C47868q) C7364b.m23081a(qVar, "transformer is null")).mo10160a(this));
    }

    /* renamed from: a */
    public final C7490k<T> mo19264a(C7323a aVar) {
        C7326g b = C7342a.m23058b();
        C7326g b2 = C7342a.m23058b();
        C7326g b3 = C7342a.m23058b();
        C7323a aVar2 = (C7323a) C7364b.m23081a(aVar, "onComplete is null");
        C7323a aVar3 = C7342a.f20429c;
        C47754i iVar = new C47754i(this, b, b2, b3, aVar2, aVar3, aVar3);
        return C7332a.m23016a((C7490k<T>) iVar);
    }

    /* renamed from: a */
    public final C7490k<T> mo19265a(C7326g<? super Throwable> gVar) {
        C7326g b = C7342a.m23058b();
        C7326g b2 = C7342a.m23058b();
        C7326g gVar2 = (C7326g) C7364b.m23081a(gVar, "onError is null");
        C7323a aVar = C7342a.f20429c;
        C47754i iVar = new C47754i(this, b, b2, gVar2, aVar, aVar, C7342a.f20429c);
        return C7332a.m23016a((C7490k<T>) iVar);
    }

    /* renamed from: a */
    public final <R> C7490k<R> mo19266a(C7327h<? super T, ? extends R> hVar) {
        C7364b.m23081a(hVar, "mapper is null");
        return C7332a.m23016a((C7490k<T>) new C47746e<T>(this, hVar));
    }

    /* renamed from: a */
    public final C7490k<T> mo19269a(C7499z zVar) {
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23016a((C7490k<T>) new C47748f<T>(this, zVar));
    }

    /* renamed from: a */
    public final C7490k<T> mo19267a(C7328l<? super Throwable> lVar) {
        C7364b.m23081a(lVar, "predicate is null");
        return C7332a.m23016a((C7490k<T>) new C47750g<T>(this, lVar));
    }

    /* renamed from: a */
    public final <U> C7490k<T> mo19270a(C7704b<U> bVar) {
        C7364b.m23081a(bVar, "other is null");
        return C7332a.m23016a((C7490k<T>) new C47759k<T>(this, bVar));
    }

    /* renamed from: c */
    private C7329e<T> m23242c() {
        if (this instanceof C47599b) {
            return ((C47599b) this).bY_();
        }
        return C7332a.m23015a((C7329e<T>) new C47768n<T>(this));
    }

    /* renamed from: b */
    public final C7321c mo19273b() {
        return m23234a(C7342a.m23058b(), C7342a.f20432f, C7342a.f20429c);
    }

    /* renamed from: c */
    private <E extends C47856n<? super T>> E m23243c(E e) {
        mo19277b((C47856n<? super T>) e);
        return e;
    }

    /* renamed from: d */
    public final C7321c mo19279d(C7326g<? super T> gVar) {
        return m23234a(gVar, C7342a.f20432f, C7342a.f20429c);
    }

    /* renamed from: b */
    private <U> C7490k<T> m23241b(C7491p<U> pVar) {
        C7364b.m23081a(pVar, "timeoutIndicator is null");
        return C7332a.m23016a((C7490k<T>) new C47762l<T>(this, pVar, null));
    }

    /* renamed from: c */
    public final C7490k<T> mo19278c(C7326g<? super T> gVar) {
        C7326g b = C7342a.m23058b();
        C7326g gVar2 = (C7326g) C7364b.m23081a(gVar, "onSubscribe is null");
        C7326g b2 = C7342a.m23058b();
        C7323a aVar = C7342a.f20429c;
        C47754i iVar = new C47754i(this, b, gVar2, b2, aVar, aVar, C7342a.f20429c);
        return C7332a.m23016a((C7490k<T>) iVar);
    }

    /* renamed from: a */
    public static <T> C7490k<T> m23237a(C47857o<T> oVar) {
        C7364b.m23081a(oVar, "onSubscribe is null");
        return C7332a.m23016a((C7490k<T>) new C47741b<T>(oVar));
    }

    /* renamed from: b */
    public final C7490k<T> mo19274b(C7326g<? super C7321c> gVar) {
        C7326g gVar2 = (C7326g) C7364b.m23081a(gVar, "onSubscribe is null");
        C7326g b = C7342a.m23058b();
        C7326g b2 = C7342a.m23058b();
        C7323a aVar = C7342a.f20429c;
        C47754i iVar = new C47754i(this, gVar2, b, b2, aVar, aVar, C7342a.f20429c);
        return C7332a.m23016a((C7490k<T>) iVar);
    }

    /* renamed from: a */
    private static <T> C7490k<T> m23238a(C7491p<T> pVar) {
        if (pVar instanceof C7490k) {
            return C7332a.m23016a((C7490k) pVar);
        }
        C7364b.m23081a(pVar, "onSubscribe is null");
        return C7332a.m23016a((C7490k<T>) new C47770o<T>(pVar));
    }

    /* renamed from: b */
    public final C7490k<T> mo19275b(C7327h<? super Throwable, ? extends T> hVar) {
        C7364b.m23081a(hVar, "valueSupplier is null");
        return C7332a.m23016a((C7490k<T>) new C47752h<T>(this, hVar));
    }

    /* renamed from: a */
    public static <T> C7490k<T> m23239a(T t) {
        C7364b.m23081a(t, "item is null");
        return C7332a.m23016a((C7490k<T>) new C47745d<T>(t));
    }

    /* renamed from: b */
    public final C7490k<T> mo19276b(C7499z zVar) {
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23016a((C7490k<T>) new C47756j<T>(this, zVar));
    }

    /* renamed from: a */
    public final C7490k<T> mo19262a(long j) {
        return m23235a(2, C7342a.m23063c());
    }

    /* renamed from: b */
    public final void mo19277b(C47856n<? super T> nVar) {
        C7364b.m23081a(nVar, "observer is null");
        C47856n a = C7332a.m23017a(this, nVar);
        C7364b.m23081a(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo10198a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C7331a.m23009b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public final C7321c mo19261a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
        return m23234a(gVar, gVar2, C7342a.f20429c);
    }

    /* renamed from: a */
    private C7490k<T> m23235a(long j, C7328l<? super Throwable> lVar) {
        return m23242c().mo19145a(j, lVar).mo19165e();
    }

    /* renamed from: a */
    public final C7490k<T> mo19263a(long j, TimeUnit timeUnit) {
        return m23240b(3, timeUnit, C7333a.m23042a());
    }

    /* renamed from: b */
    private C7490k<T> m23240b(long j, TimeUnit timeUnit, C7499z zVar) {
        return m23241b((C7491p<U>) m23236a(j, timeUnit, zVar));
    }

    /* renamed from: a */
    private C7321c m23234a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar) {
        C7364b.m23081a(gVar, "onSuccess is null");
        C7364b.m23081a(gVar2, "onError is null");
        C7364b.m23081a(aVar, "onComplete is null");
        return (C7321c) m23243c((E) new MaybeCallbackObserver(gVar, gVar2, aVar));
    }

    /* renamed from: a */
    private static C7490k<Long> m23236a(long j, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23016a((C7490k<T>) new C47766m<T>(Math.max(0, j), timeUnit, zVar));
    }
}
