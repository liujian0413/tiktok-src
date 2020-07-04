package p346io.reactivex;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.p361a.C7704b;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.observers.ConsumerSingleObserver;
import p346io.reactivex.internal.operators.flowable.C47707j;
import p346io.reactivex.internal.operators.maybe.C47743c;
import p346io.reactivex.internal.operators.observable.C7408ar;
import p346io.reactivex.internal.operators.p1872b.C47621a;
import p346io.reactivex.internal.operators.p1872b.C47623b;
import p346io.reactivex.internal.operators.p1872b.C47627c;
import p346io.reactivex.internal.operators.p1872b.C47629d;
import p346io.reactivex.internal.operators.p1872b.C47631e;
import p346io.reactivex.internal.operators.p1872b.C47633f;
import p346io.reactivex.internal.operators.p1872b.C47634g;
import p346io.reactivex.internal.operators.p1872b.C47637h;
import p346io.reactivex.internal.operators.p1872b.C47638i;
import p346io.reactivex.internal.operators.p1872b.C47639j;
import p346io.reactivex.internal.operators.p1872b.C47641k;
import p346io.reactivex.internal.operators.p1872b.C47642l;
import p346io.reactivex.internal.operators.p1872b.C47644m;
import p346io.reactivex.internal.operators.p1872b.C47646n;
import p346io.reactivex.internal.operators.p1872b.C47648o;
import p346io.reactivex.internal.operators.p1872b.C47650p;
import p346io.reactivex.internal.operators.p1872b.C47652q;
import p346io.reactivex.internal.operators.p1872b.C47656s;
import p346io.reactivex.internal.operators.p1872b.C47658t;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C7366c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: io.reactivex.aa */
public abstract class C7319aa<T> implements C7320af<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10199a(C47557ad<? super T> adVar);

    /* renamed from: a */
    public static <T> C7319aa<T> m22931a(Throwable th) {
        C7364b.m23081a(th, "error is null");
        return m22935b(C7342a.m23057a(th));
    }

    /* renamed from: a */
    public static <T> C7319aa<T> m22932a(Callable<? extends T> callable) {
        C7364b.m23081a(callable, "callable is null");
        return C7332a.m23011a((C7319aa<T>) new C47637h<T>(callable));
    }

    /* renamed from: a */
    public static <T> C7319aa<T> m22930a(T t) {
        C7364b.m23081a(t, "value is null");
        return C7332a.m23011a((C7319aa<T>) new C47641k<T>(t));
    }

    /* renamed from: a */
    private static <T> C7329e<T> m22934a(C7704b<? extends C7320af<? extends T>> bVar) {
        C7364b.m23081a(bVar, "sources is null");
        C47707j jVar = new C47707j(bVar, C47639j.m148433a(), true, Integer.MAX_VALUE, C7329e.m22962a());
        return C7332a.m23015a((C7329e<T>) jVar);
    }

    /* renamed from: a */
    public static <T> C7329e<T> m22933a(C7320af<? extends T> afVar, C7320af<? extends T> afVar2) {
        C7364b.m23081a(afVar, "source1 is null");
        C7364b.m23081a(afVar2, "source2 is null");
        return m22934a((C7704b<? extends C7320af<? extends T>>) C7329e.m22977a((T[]) new C7320af[]{afVar, afVar2}));
    }

    /* renamed from: a */
    public final <R> R mo19131a(C47555ab<T, ? extends R> abVar) {
        return ((C47555ab) C7364b.m23081a(abVar, "converter is null")).mo10190a(this);
    }

    /* renamed from: a */
    public final <R> C7319aa<R> mo19124a(C47559ag<? super T, ? extends R> agVar) {
        return m22926a(((C47559ag) C7364b.m23081a(agVar, "transformer is null")).mo10159a(this));
    }

    /* renamed from: a */
    public final C7319aa<T> mo19125a(C7326g<? super T> gVar) {
        C7364b.m23081a(gVar, "doAfterSuccess is null");
        return C7332a.m23011a((C7319aa<T>) new C47627c<T>(this, gVar));
    }

    /* renamed from: a */
    public final C7490k<T> mo19130a(C7328l<? super T> lVar) {
        C7364b.m23081a(lVar, "predicate is null");
        return C7332a.m23016a((C7490k<T>) new C47743c<T>(this, lVar));
    }

    /* renamed from: a */
    public final <R> C7319aa<R> mo19126a(C7327h<? super T, ? extends C7320af<? extends R>> hVar) {
        C7364b.m23081a(hVar, "mapper is null");
        return C7332a.m23011a((C7319aa<T>) new C47634g<T>(this, hVar));
    }

    /* renamed from: a */
    public final C7319aa<T> mo19127a(C7499z zVar) {
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23011a((C7319aa<T>) new C47644m<T>(this, zVar));
    }

    /* renamed from: a */
    public final C7319aa<T> mo19122a(C7319aa<? extends T> aaVar) {
        C7364b.m23081a(aaVar, "resumeSingleInCaseOfError is null");
        return m22936d(C7342a.m23060b(aaVar));
    }

    /* renamed from: a */
    public final C7321c mo19128a() {
        return mo19129a(C7342a.m23058b(), C7342a.f20432f);
    }

    /* renamed from: a */
    public final C7321c mo19129a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
        C7364b.m23081a(gVar, "onSuccess is null");
        C7364b.m23081a(gVar2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(gVar, gVar2);
        mo19137b((C47557ad<? super T>) consumerSingleObserver);
        return consumerSingleObserver;
    }

    /* renamed from: b */
    public final C7492s<T> mo19136b() {
        if (this instanceof C7366c) {
            return ((C7366c) this).bZ_();
        }
        return C7332a.m23018a((C7492s<T>) new C47656s<T>(this));
    }

    /* renamed from: d */
    public final C7321c mo19140d(C7326g<? super T> gVar) {
        return mo19129a(gVar, C7342a.f20432f);
    }

    /* renamed from: b */
    private static <T> C7319aa<T> m22935b(Callable<? extends Throwable> callable) {
        C7364b.m23081a(callable, "errorSupplier is null");
        return C7332a.m23011a((C7319aa<T>) new C47633f<T>(callable));
    }

    /* renamed from: d */
    private C7319aa<T> m22936d(C7327h<? super Throwable, ? extends C7320af<? extends T>> hVar) {
        C7364b.m23081a(hVar, "resumeFunctionInCaseOfError is null");
        return C7332a.m23011a((C7319aa<T>) new C47648o<T>(this, hVar));
    }

    /* renamed from: c */
    public final C7319aa<T> mo19138c(C7326g<? super T> gVar) {
        C7364b.m23081a(gVar, "onSuccess is null");
        return C7332a.m23011a((C7319aa<T>) new C47631e<T>(this, gVar));
    }

    /* renamed from: c */
    public final C7319aa<T> mo19139c(C7327h<Throwable, ? extends T> hVar) {
        C7364b.m23081a(hVar, "resumeFunction is null");
        return C7332a.m23011a((C7319aa<T>) new C47646n<T>(this, hVar, null));
    }

    /* renamed from: b */
    public final C7319aa<T> mo19133b(C7326g<? super C7321c> gVar) {
        C7364b.m23081a(gVar, "onSubscribe is null");
        return C7332a.m23011a((C7319aa<T>) new C47629d<T>(this, gVar));
    }

    /* renamed from: a */
    public static <T> C7319aa<T> m22925a(C47558ae<T> aeVar) {
        C7364b.m23081a(aeVar, "source is null");
        return C7332a.m23011a((C7319aa<T>) new C47621a<T>(aeVar));
    }

    /* renamed from: b */
    public final <R> C7319aa<R> mo19134b(C7327h<? super T, ? extends R> hVar) {
        C7364b.m23081a(hVar, "mapper is null");
        return C7332a.m23011a((C7319aa<T>) new C47642l<T>(this, hVar));
    }

    /* renamed from: a */
    private static <T> C7319aa<T> m22926a(C7320af<T> afVar) {
        C7364b.m23081a(afVar, "source is null");
        if (afVar instanceof C7319aa) {
            return C7332a.m23011a((C7319aa) afVar);
        }
        return C7332a.m23011a((C7319aa<T>) new C47638i<T>(afVar));
    }

    /* renamed from: b */
    public final C7319aa<T> mo19135b(C7499z zVar) {
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23011a((C7319aa<T>) new C47650p<T>(this, zVar));
    }

    /* renamed from: b */
    public final void mo19137b(C47557ad<? super T> adVar) {
        C7364b.m23081a(adVar, "subscriber is null");
        C47557ad a = C7332a.m23012a(this, adVar);
        C7364b.m23081a(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo10199a(a);
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
    public static <T> C7319aa<T> m22929a(C7496w<? extends T> wVar) {
        C7364b.m23081a(wVar, "observableSource is null");
        return C7332a.m23011a((C7319aa<T>) new C7408ar<T>(wVar, null));
    }

    /* renamed from: a */
    public final <U, R> C7319aa<R> mo19123a(C7320af<U> afVar, C7324c<? super T, ? super U, ? extends R> cVar) {
        return m22927a((C7320af<? extends T1>) this, afVar, cVar);
    }

    /* renamed from: a */
    public static C7319aa<Long> m22922a(long j, TimeUnit timeUnit) {
        return m22923a(j, timeUnit, C7333a.m23042a());
    }

    /* renamed from: b */
    public final C7319aa<T> mo19132b(long j, TimeUnit timeUnit) {
        return m22924a(j, timeUnit, C7333a.m23042a(), false);
    }

    /* renamed from: a */
    private static <T, R> C7319aa<R> m22928a(C7327h<? super Object[], ? extends R> hVar, C7320af<? extends T>... afVarArr) {
        C7364b.m23081a(hVar, "zipper is null");
        C7364b.m23081a(afVarArr, "sources is null");
        return C7332a.m23011a((C7319aa<T>) new C47658t<T>(afVarArr, hVar));
    }

    /* renamed from: a */
    private static C7319aa<Long> m22923a(long j, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23011a((C7319aa<T>) new C47652q<T>(j, timeUnit, zVar));
    }

    /* renamed from: a */
    private static <T1, T2, R> C7319aa<R> m22927a(C7320af<? extends T1> afVar, C7320af<? extends T2> afVar2, C7324c<? super T1, ? super T2, ? extends R> cVar) {
        C7364b.m23081a(afVar, "source1 is null");
        C7364b.m23081a(afVar2, "source2 is null");
        return m22928a(C7342a.m23054a(cVar), (C7320af<? extends T>[]) new C7320af[]{afVar, afVar2});
    }

    /* renamed from: a */
    private C7319aa<T> m22924a(long j, TimeUnit timeUnit, C7499z zVar, boolean z) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C47623b bVar = new C47623b(this, j, timeUnit, zVar, false);
        return C7332a.m23011a((C7319aa<T>) bVar);
    }
}
