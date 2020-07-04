package p346io.reactivex;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.observers.LambdaObserver;
import p346io.reactivex.internal.operators.flowable.C7369m;
import p346io.reactivex.internal.operators.flowable.C7371u;
import p346io.reactivex.internal.operators.observable.C7377aa;
import p346io.reactivex.internal.operators.observable.C7379ac;
import p346io.reactivex.internal.operators.observable.C7381ad;
import p346io.reactivex.internal.operators.observable.C7385ae;
import p346io.reactivex.internal.operators.observable.C7387ag;
import p346io.reactivex.internal.operators.observable.C7388ah;
import p346io.reactivex.internal.operators.observable.C7390ai;
import p346io.reactivex.internal.operators.observable.C7392aj;
import p346io.reactivex.internal.operators.observable.C7394ak;
import p346io.reactivex.internal.operators.observable.C7396al;
import p346io.reactivex.internal.operators.observable.C7400an;
import p346io.reactivex.internal.operators.observable.C7402ap;
import p346io.reactivex.internal.operators.observable.C7406aq;
import p346io.reactivex.internal.operators.observable.C7408ar;
import p346io.reactivex.internal.operators.observable.C7410as;
import p346io.reactivex.internal.operators.observable.C7412at;
import p346io.reactivex.internal.operators.observable.C7414au;
import p346io.reactivex.internal.operators.observable.C7417av;
import p346io.reactivex.internal.operators.observable.C7419aw;
import p346io.reactivex.internal.operators.observable.C7421ax;
import p346io.reactivex.internal.operators.observable.C7424ay;
import p346io.reactivex.internal.operators.observable.C7426az;
import p346io.reactivex.internal.operators.observable.C7428b;
import p346io.reactivex.internal.operators.observable.C7434bb;
import p346io.reactivex.internal.operators.observable.C7436bc;
import p346io.reactivex.internal.operators.observable.C7439c;
import p346io.reactivex.internal.operators.observable.C7442d;
import p346io.reactivex.internal.operators.observable.C7447e;
import p346io.reactivex.internal.operators.observable.C7449f;
import p346io.reactivex.internal.operators.observable.C7451g;
import p346io.reactivex.internal.operators.observable.C7454h;
import p346io.reactivex.internal.operators.observable.C7459j;
import p346io.reactivex.internal.operators.observable.C7461k;
import p346io.reactivex.internal.operators.observable.C7463l;
import p346io.reactivex.internal.operators.observable.C7465m;
import p346io.reactivex.internal.operators.observable.C7466o;
import p346io.reactivex.internal.operators.observable.C7468p;
import p346io.reactivex.internal.operators.observable.C7470q;
import p346io.reactivex.internal.operators.observable.C7471r;
import p346io.reactivex.internal.operators.observable.C7472s;
import p346io.reactivex.internal.operators.observable.C7474t;
import p346io.reactivex.internal.operators.observable.C7477u;
import p346io.reactivex.internal.operators.observable.C7479v;
import p346io.reactivex.internal.operators.observable.C7481w;
import p346io.reactivex.internal.operators.observable.C7482x;
import p346io.reactivex.internal.operators.observable.C7484z;
import p346io.reactivex.internal.operators.observable.ObservableGroupBy;
import p346io.reactivex.internal.operators.observable.ObservableScalarXMap;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C7367g;
import p346io.reactivex.internal.util.ArrayListSupplier;
import p346io.reactivex.internal.util.ErrorMode;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7325d;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p349e.C47574b;
import p346io.reactivex.p349e.C7330a;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: io.reactivex.s */
public abstract class C7492s<T> implements C7496w<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public abstract void mo10166a_(C7498y<? super T> yVar);

    /* renamed from: a */
    private static <T, R> C7492s<R> m23276a(C7327h<? super Object[], ? extends R> hVar, int i, C7496w<? extends T>... wVarArr) {
        return m23292a(wVarArr, hVar, i);
    }

    /* renamed from: a */
    private static <T, R> C7492s<R> m23292a(C7496w<? extends T>[] wVarArr, C7327h<? super Object[], ? extends R> hVar, int i) {
        C7364b.m23081a(wVarArr, "sources is null");
        if (wVarArr.length == 0) {
            return m23303c();
        }
        C7364b.m23081a(hVar, "combiner is null");
        C7364b.m23078a(i, "bufferSize");
        C7439c cVar = new C7439c(wVarArr, null, hVar, i << 1, false);
        return C7332a.m23018a((C7492s<T>) cVar);
    }

    /* renamed from: a */
    public static <T1, T2, R> C7492s<R> m23284a(C7496w<? extends T1> wVar, C7496w<? extends T2> wVar2, C7324c<? super T1, ? super T2, ? extends R> cVar) {
        C7364b.m23081a(wVar, "source1 is null");
        C7364b.m23081a(wVar2, "source2 is null");
        return m23276a(C7342a.m23054a(cVar), mo10165a(), (C7496w<? extends T>[]) new C7496w[]{wVar, wVar2});
    }

    /* renamed from: a */
    public static <T> C7492s<T> m23283a(C7496w<? extends T> wVar, C7496w<? extends T> wVar2) {
        C7364b.m23081a(wVar, "source1 is null");
        C7364b.m23081a(wVar2, "source2 is null");
        return m23291a((C7496w<? extends T>[]) new C7496w[]{wVar, wVar2});
    }

    /* renamed from: a */
    private static <T> C7492s<T> m23291a(C7496w<? extends T>... wVarArr) {
        return C7332a.m23018a((C7492s<T>) new C7442d<T>(m23293a((T[]) wVarArr), C7342a.m23053a(), mo10165a(), ErrorMode.BOUNDARY));
    }

    /* renamed from: a */
    public static <T> C7492s<T> m23286a(Iterable<? extends C7496w<? extends T>> iterable) {
        return m23287a(iterable, mo10165a(), mo10165a());
    }

    /* renamed from: a */
    private static <T> C7492s<T> m23287a(Iterable<? extends C7496w<? extends T>> iterable, int i, int i2) {
        return m23300b(iterable).m23275a(C7342a.m23053a(), i, i2, false);
    }

    /* renamed from: a */
    public static <T> C7492s<T> m23282a(C7495v<T> vVar) {
        C7364b.m23081a(vVar, "source is null");
        return C7332a.m23018a((C7492s<T>) new C7449f<T>(vVar));
    }

    /* renamed from: a */
    public static <T> C7492s<T> m23289a(Throwable th) {
        C7364b.m23081a(th, "e is null");
        return m23302b(C7342a.m23057a(th));
    }

    /* renamed from: a */
    public static <T> C7492s<T> m23293a(T... tArr) {
        C7364b.m23081a(tArr, "items is null");
        if (tArr.length == 0) {
            return m23303c();
        }
        if (tArr.length == 1) {
            return m23301b(tArr[0]);
        }
        return C7332a.m23018a((C7492s<T>) new C7479v<T>(tArr));
    }

    /* renamed from: a */
    public static <T> C7492s<T> m23290a(Callable<? extends T> callable) {
        C7364b.m23081a(callable, "supplier is null");
        return C7332a.m23018a((C7492s<T>) new C7481w<T>(callable));
    }

    /* renamed from: a */
    public static <T, R> C7492s<R> m23288a(Iterable<? extends C7496w<? extends T>> iterable, C7327h<? super Object[], ? extends R> hVar) {
        C7364b.m23081a(hVar, "zipper is null");
        C7364b.m23081a(iterable, "sources is null");
        C7436bc bcVar = new C7436bc(null, iterable, hVar, mo10165a(), false);
        return C7332a.m23018a((C7492s<T>) bcVar);
    }

    /* renamed from: a */
    private static <T, R> C7492s<R> m23281a(C7327h<? super Object[], ? extends R> hVar, boolean z, int i, C7496w<? extends T>... wVarArr) {
        C7364b.m23081a(hVar, "zipper is null");
        C7364b.m23078a(i, "bufferSize");
        C7436bc bcVar = new C7436bc(wVarArr, null, hVar, i, false);
        return C7332a.m23018a((C7492s<T>) bcVar);
    }

    /* renamed from: a */
    public final <R> R mo19297a(C7494t<T, ? extends R> tVar) {
        return ((C7494t) C7364b.m23081a(tVar, "converter is null")).mo10193a(this);
    }

    /* renamed from: a */
    public final <R> C7492s<R> mo19293a(C7497x<? super T, ? extends R> xVar) {
        return m23308f(((C7497x) C7364b.m23081a(xVar, "composer is null")).mo10161a(this));
    }

    /* renamed from: a */
    private <R> C7492s<R> m23275a(C7327h<? super T, ? extends C7496w<? extends R>> hVar, int i, int i2, boolean z) {
        C7364b.m23081a(hVar, "mapper is null");
        C7364b.m23078a(i, "maxConcurrency");
        C7364b.m23078a(i2, "prefetch");
        C7447e eVar = new C7447e(this, hVar, ErrorMode.BOUNDARY, i, i2);
        return C7332a.m23018a((C7492s<T>) eVar);
    }

    /* renamed from: a */
    public final C7492s<T> mo19292a(C7496w<? extends T> wVar) {
        C7364b.m23081a(wVar, "other is null");
        return m23283a((C7496w<? extends T>) this, wVar);
    }

    /* renamed from: a */
    public final C7492s<T> mo19286a(long j, TimeUnit timeUnit, boolean z) {
        return m23272a(5, timeUnit, C7333a.m23042a(), true);
    }

    /* renamed from: a */
    public final C7492s<T> mo19285a(long j, TimeUnit timeUnit, C7499z zVar) {
        return m23272a(j, timeUnit, zVar, false);
    }

    /* renamed from: a */
    public final C7492s<T> mo19288a(C7325d<? super T, ? super T> dVar) {
        C7364b.m23081a(dVar, "comparer is null");
        return C7332a.m23018a((C7492s<T>) new C7459j<T>(this, C7342a.m23053a(), dVar));
    }

    /* renamed from: a */
    public final C7492s<T> mo19289a(C7326g<? super T> gVar) {
        C7364b.m23081a(gVar, "onAfterNext is null");
        return C7332a.m23018a((C7492s<T>) new C7461k<T>(this, gVar));
    }

    /* renamed from: a */
    public final C7492s<T> mo19287a(C7323a aVar) {
        return m23274a(C7342a.m23058b(), C7342a.m23058b(), aVar, C7342a.f20429c);
    }

    /* renamed from: a */
    private C7492s<T> m23274a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7323a aVar2) {
        C7364b.m23081a(gVar, "onNext is null");
        C7364b.m23081a(gVar2, "onError is null");
        C7364b.m23081a(aVar, "onComplete is null");
        C7364b.m23081a(aVar2, "onAfterTerminate is null");
        C7463l lVar = new C7463l(this, gVar, gVar2, aVar, aVar2);
        return C7332a.m23018a((C7492s<T>) lVar);
    }

    /* renamed from: b */
    public final C7492s<T> mo19299b(C7326g<? super C47869r<T>> gVar) {
        C7364b.m23081a(gVar, "consumer is null");
        return m23274a(C7342a.m23052a(gVar), C7342a.m23059b(gVar), C7342a.m23062c(gVar), C7342a.f20429c);
    }

    /* renamed from: b */
    public final C7492s<T> mo19303b(C7498y<? super T> yVar) {
        C7364b.m23081a(yVar, "observer is null");
        return m23274a(C7381ad.m23103a(yVar), C7381ad.m23104b(yVar), C7381ad.m23105c(yVar), C7342a.f20429c);
    }

    /* renamed from: a */
    public final C7492s<T> mo19291a(C7328l<? super T> lVar) {
        C7364b.m23081a(lVar, "predicate is null");
        return C7332a.m23018a((C7492s<T>) new C7472s<T>(this, lVar));
    }

    /* renamed from: a */
    public final <R> C7492s<R> mo19290a(C7327h<? super T, ? extends C7496w<? extends R>> hVar) {
        return m23278a(hVar, false);
    }

    /* renamed from: a */
    private <R> C7492s<R> m23278a(C7327h<? super T, ? extends C7496w<? extends R>> hVar, boolean z) {
        return m23279a(hVar, false, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    private <R> C7492s<R> m23279a(C7327h<? super T, ? extends C7496w<? extends R>> hVar, boolean z, int i) {
        return m23280a(hVar, z, i, mo10165a());
    }

    /* renamed from: a */
    private <R> C7492s<R> m23280a(C7327h<? super T, ? extends C7496w<? extends R>> hVar, boolean z, int i, int i2) {
        C7364b.m23081a(hVar, "mapper is null");
        C7364b.m23078a(i, "maxConcurrency");
        C7364b.m23078a(i2, "bufferSize");
        if (this instanceof C7367g) {
            Object call = ((C7367g) this).call();
            if (call == null) {
                return m23303c();
            }
            return ObservableScalarXMap.m23098a(call, hVar);
        }
        C7474t tVar = new C7474t(this, hVar, z, i, i2);
        return C7332a.m23018a((C7492s<T>) tVar);
    }

    /* renamed from: b */
    public final <U> C7492s<U> mo19300b(C7327h<? super T, ? extends Iterable<? extends U>> hVar) {
        C7364b.m23081a(hVar, "mapper is null");
        return C7332a.m23018a((C7492s<T>) new C7477u<T>(this, hVar));
    }

    /* renamed from: a */
    private <K, V> C7492s<C47574b<K, V>> m23277a(C7327h<? super T, ? extends K> hVar, C7327h<? super T, ? extends V> hVar2, boolean z, int i) {
        C7364b.m23081a(hVar, "keySelector is null");
        C7364b.m23081a(hVar2, "valueSelector is null");
        C7364b.m23078a(i, "bufferSize");
        ObservableGroupBy observableGroupBy = new ObservableGroupBy(this, hVar, hVar2, i, false);
        return C7332a.m23018a((C7492s<T>) observableGroupBy);
    }

    /* renamed from: a */
    public final C7492s<T> mo19294a(C7499z zVar) {
        return m23285a(zVar, false, mo10165a());
    }

    /* renamed from: a */
    public final C7492s<T> mo19295a(C7499z zVar, boolean z) {
        return m23285a(zVar, true, mo10165a());
    }

    /* renamed from: a */
    private C7492s<T> m23285a(C7499z zVar, boolean z, int i) {
        C7364b.m23081a(zVar, "scheduler is null");
        C7364b.m23078a(i, "bufferSize");
        return C7332a.m23018a((C7492s<T>) new C7390ai<T>(this, zVar, z, i));
    }

    /* renamed from: a */
    public final <U> C7492s<U> mo19296a(Class<U> cls) {
        C7364b.m23081a(cls, "clazz is null");
        return mo19291a(C7342a.m23061b(cls)).m23299b(cls);
    }

    /* renamed from: b */
    public final C7492s<T> mo19302b(C7496w<? extends T> wVar) {
        C7364b.m23081a(wVar, "next is null");
        return mo19322e(C7342a.m23060b(wVar));
    }

    /* renamed from: a */
    public final C7492s<T> mo19284a(long j) {
        return m23268a(3, C7342a.m23063c());
    }

    /* renamed from: b */
    public final C7492s<T> mo19298b(long j) {
        return C7332a.m23018a((C7492s<T>) new C7410as<T>(this, 1));
    }

    /* renamed from: b */
    public final C7492s<T> mo19301b(C7328l<? super T> lVar) {
        C7364b.m23081a(lVar, "predicate is null");
        return C7332a.m23018a((C7492s<T>) new C7412at<T>(this, lVar));
    }

    /* renamed from: a */
    public final C7321c mo19280a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
        return mo19282a(gVar, gVar2, C7342a.f20429c, C7342a.m23058b());
    }

    /* renamed from: a */
    public final C7321c mo19281a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar) {
        return mo19282a(gVar, gVar2, aVar, C7342a.m23058b());
    }

    /* renamed from: a */
    public final C7321c mo19282a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7326g<? super C7321c> gVar3) {
        C7364b.m23081a(gVar, "onNext is null");
        C7364b.m23081a(gVar2, "onError is null");
        C7364b.m23081a(aVar, "onComplete is null");
        C7364b.m23081a(gVar3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(gVar, gVar2, aVar, gVar3);
        mo19189a((C7498y<? super T>) lambdaObserver);
        return lambdaObserver;
    }

    /* renamed from: a */
    public final void mo19189a(C7498y<? super T> yVar) {
        C7364b.m23081a(yVar, "observer is null");
        try {
            C7498y a = C7332a.m23019a(this, yVar);
            C7364b.m23081a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo10166a_(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C7331a.m23009b(th);
            C7332a.m23029a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C7492s<T> mo19304b(C7499z zVar) {
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23018a((C7492s<T>) new C7414au<T>(this, zVar));
    }

    /* renamed from: a */
    public final C7329e<T> mo19283a(BackpressureStrategy backpressureStrategy) {
        C7369m mVar = new C7369m(this);
        switch (backpressureStrategy) {
            case DROP:
                return mVar.mo19160c();
            case LATEST:
                return mVar.mo19164d();
            case MISSING:
                return mVar;
            case ERROR:
                return C7332a.m23015a((C7329e<T>) new C7371u<T>(mVar));
            default:
                return mVar.mo19156b();
        }
    }

    /* renamed from: a */
    private static int mo10165a() {
        return C7329e.m22962a();
    }

    /* renamed from: b */
    private C7330a<T> mo10167b() {
        return C7396al.m23119f(this);
    }

    /* renamed from: c */
    public static <T> C7492s<T> m23303c() {
        return C7332a.m23018a(C7470q.f20788a);
    }

    /* renamed from: e */
    public final C7490k<T> mo19319e() {
        return m23305d(0);
    }

    /* renamed from: f */
    public final C7319aa<T> mo19324f() {
        return m23307e(0);
    }

    /* renamed from: m */
    public final C7319aa<List<T>> mo19334m() {
        return m23266a(16);
    }

    /* renamed from: h */
    public final C7318a mo19329h() {
        return C7332a.m23010a((C7318a) new C7379ac(this));
    }

    /* renamed from: i */
    public final C7492s<T> mo19330i() {
        return mo10167b().mo10165a();
    }

    /* renamed from: j */
    public final C7490k<T> mo19331j() {
        return C7332a.m23016a((C7490k<T>) new C7406aq<T>(this));
    }

    /* renamed from: k */
    public final C7319aa<T> mo19332k() {
        return C7332a.m23011a((C7319aa<T>) new C7408ar<T>(this, null));
    }

    /* renamed from: l */
    public final C7321c mo19333l() {
        return mo19282a(C7342a.m23058b(), C7342a.f20432f, C7342a.f20429c, C7342a.m23058b());
    }

    /* renamed from: g */
    public final C7492s<T> mo19328g() {
        return C7332a.m23018a((C7492s<T>) new C7377aa<T>(this));
    }

    /* renamed from: d */
    public final C7492s<T> mo19314d() {
        return m23310g(C7342a.m23053a());
    }

    /* renamed from: c */
    public final <E extends C7498y<? super T>> E mo19312c(E e) {
        mo19189a((C7498y<? super T>) e);
        return e;
    }

    /* renamed from: d */
    private C7490k<T> m23305d(long j) {
        return C7332a.m23016a((C7490k<T>) new C7466o<T>(this, 0));
    }

    /* renamed from: e */
    private C7319aa<T> m23307e(long j) {
        return C7332a.m23011a((C7319aa<T>) new C7468p<T>(this, 0, null));
    }

    /* renamed from: f */
    public final C7321c mo19325f(C7326g<? super T> gVar) {
        return mo19282a(gVar, C7342a.f20432f, C7342a.f20429c, C7342a.m23058b());
    }

    /* renamed from: a */
    private C7319aa<List<T>> m23266a(int i) {
        C7364b.m23078a(16, "capacityHint");
        return C7332a.m23011a((C7319aa<T>) new C7434bb<T>(this, 16));
    }

    /* renamed from: f */
    private static <T> C7492s<T> m23308f(C7496w<T> wVar) {
        C7364b.m23081a(wVar, "source is null");
        if (wVar instanceof C7492s) {
            return C7332a.m23018a((C7492s) wVar);
        }
        return C7332a.m23018a((C7492s<T>) new C7484z<T>(wVar));
    }

    /* renamed from: g */
    private <K> C7492s<T> m23310g(C7327h<? super T, K> hVar) {
        C7364b.m23081a(hVar, "keySelector is null");
        return C7332a.m23018a((C7492s<T>) new C7459j<T>(this, hVar, C7364b.m23080a()));
    }

    /* renamed from: c */
    public final C7492s<T> mo19305c(long j) {
        if (j >= 0) {
            return C7332a.m23018a((C7492s<T>) new C7419aw<T>(this, j));
        }
        StringBuilder sb = new StringBuilder("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public final C7319aa<T> mo19313d(T t) {
        C7364b.m23081a(t, "defaultItem is null");
        return C7332a.m23011a((C7319aa<T>) new C7408ar<T>(this, t));
    }

    /* renamed from: e */
    public final C7492s<T> mo19321e(C7326g<? super C7321c> gVar) {
        return m23273a(gVar, C7342a.f20429c);
    }

    /* renamed from: c */
    public final C7492s<T> mo19307c(C7326g<? super Throwable> gVar) {
        C7326g b = C7342a.m23058b();
        C7323a aVar = C7342a.f20429c;
        return m23274a(b, gVar, aVar, aVar);
    }

    /* renamed from: e */
    public final C7492s<T> mo19322e(C7327h<? super Throwable, ? extends C7496w<? extends T>> hVar) {
        C7364b.m23081a(hVar, "resumeFunction is null");
        return C7332a.m23018a((C7492s<T>) new C7392aj<T>(this, hVar, false));
    }

    /* renamed from: f */
    public final C7492s<T> mo19327f(C7327h<? super Throwable, ? extends T> hVar) {
        C7364b.m23081a(hVar, "valueSupplier is null");
        return C7332a.m23018a((C7492s<T>) new C7394ak<T>(this, hVar));
    }

    /* renamed from: b */
    private <U> C7492s<U> m23299b(Class<U> cls) {
        C7364b.m23081a(cls, "clazz is null");
        return mo19317d(C7342a.m23055a(cls));
    }

    /* renamed from: c */
    public final <K> C7492s<C47574b<K, T>> mo19308c(C7327h<? super T, ? extends K> hVar) {
        return m23277a(hVar, C7342a.m23053a(), false, mo10165a());
    }

    /* renamed from: e */
    public final <U> C7492s<T> mo19323e(C7496w<U> wVar) {
        C7364b.m23081a(wVar, "other is null");
        return C7332a.m23018a((C7492s<T>) new C7421ax<T>(this, wVar));
    }

    /* renamed from: b */
    public static <T> C7492s<T> m23300b(Iterable<? extends T> iterable) {
        C7364b.m23081a(iterable, "source is null");
        return C7332a.m23018a((C7492s<T>) new C7482x<T>(iterable));
    }

    /* renamed from: c */
    public final C7492s<T> mo19309c(C7328l<? super T> lVar) {
        C7364b.m23081a(lVar, "predicate is null");
        return C7332a.m23018a((C7492s<T>) new C7424ay<T>(this, lVar));
    }

    /* renamed from: d */
    public final C7492s<T> mo19316d(C7326g<? super T> gVar) {
        C7326g b = C7342a.m23058b();
        C7323a aVar = C7342a.f20429c;
        return m23274a(gVar, b, aVar, aVar);
    }

    /* renamed from: b */
    public static <T> C7492s<T> m23301b(T t) {
        C7364b.m23081a(t, "The item is null");
        return C7332a.m23018a((C7492s<T>) new C7387ag<T>(t));
    }

    /* renamed from: c */
    public final C7492s<T> mo19310c(C7496w<? extends T> wVar) {
        C7364b.m23081a(wVar, "next is null");
        return C7332a.m23018a((C7492s<T>) new C7392aj<T>(this, C7342a.m23060b(wVar), true));
    }

    /* renamed from: d */
    public final <R> C7492s<R> mo19317d(C7327h<? super T, ? extends R> hVar) {
        C7364b.m23081a(hVar, "mapper is null");
        return C7332a.m23018a((C7492s<T>) new C7388ah<T>(this, hVar));
    }

    /* renamed from: b */
    private static <T> C7492s<T> m23302b(Callable<? extends Throwable> callable) {
        C7364b.m23081a(callable, "errorSupplier is null");
        return C7332a.m23018a((C7492s<T>) new C7471r<T>(callable));
    }

    /* renamed from: c */
    public final C7492s<T> mo19311c(T t) {
        C7364b.m23081a(t, "item is null");
        return mo19327f(C7342a.m23060b(t));
    }

    /* renamed from: d */
    public final C7492s<T> mo19318d(C7496w<? extends T> wVar) {
        C7364b.m23081a(wVar, "other is null");
        return C7332a.m23018a((C7492s<T>) new C7417av<T>(this, wVar));
    }

    /* renamed from: a */
    public static C7492s<Long> m23269a(long j, TimeUnit timeUnit) {
        return m23267a(j, j, timeUnit, C7333a.m23042a());
    }

    /* renamed from: b */
    public static C7492s<Long> m23295b(long j, TimeUnit timeUnit) {
        return m23296b(j, timeUnit, C7333a.m23042a());
    }

    /* renamed from: g */
    private C7492s<T> m23309g(long j, TimeUnit timeUnit) {
        return m23306d(j, timeUnit, C7333a.m23042a());
    }

    /* renamed from: c */
    public final C7492s<List<T>> mo19306c(long j, TimeUnit timeUnit) {
        return m23270a(100, timeUnit, C7333a.m23042a(), Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public final C7492s<T> mo19320e(long j, TimeUnit timeUnit) {
        return m23272a(j, timeUnit, C7333a.m23042a(), false);
    }

    /* renamed from: b */
    public static <T> C7492s<T> m23297b(C7496w<? extends T> wVar, C7496w<? extends T> wVar2) {
        C7364b.m23081a(wVar, "source1 is null");
        C7364b.m23081a(wVar2, "source2 is null");
        return m23293a((T[]) new C7496w[]{wVar, wVar2}).m23279a(C7342a.m23053a(), false, 2);
    }

    /* renamed from: f */
    public final C7492s<T> mo19326f(long j, TimeUnit timeUnit) {
        return m23309g(100, timeUnit);
    }

    /* renamed from: a */
    private C7492s<T> m23268a(long j, C7328l<? super Throwable> lVar) {
        if (j >= 0) {
            C7364b.m23081a(lVar, "predicate is null");
            return C7332a.m23018a((C7492s<T>) new C7400an<T>(this, j, lVar));
        }
        StringBuilder sb = new StringBuilder("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public final C7492s<T> mo19315d(long j, TimeUnit timeUnit) {
        return m23304c(j, timeUnit, C7333a.m23042a());
    }

    /* renamed from: a */
    private C7492s<T> m23273a(C7326g<? super C7321c> gVar, C7323a aVar) {
        C7364b.m23081a(gVar, "onSubscribe is null");
        C7364b.m23081a(aVar, "onDispose is null");
        return C7332a.m23018a((C7492s<T>) new C7465m<T>(this, gVar, aVar));
    }

    /* renamed from: b */
    private static C7492s<Long> m23296b(long j, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23018a((C7492s<T>) new C7426az<T>(Math.max(j, 0), timeUnit, zVar));
    }

    /* renamed from: c */
    private C7492s<T> m23304c(long j, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C7451g gVar = new C7451g(this, j, timeUnit, zVar);
        return C7332a.m23018a((C7492s<T>) gVar);
    }

    /* renamed from: d */
    private C7492s<T> m23306d(long j, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C7402ap apVar = new C7402ap(this, j, timeUnit, zVar, false);
        return C7332a.m23018a((C7492s<T>) apVar);
    }

    /* renamed from: b */
    public static <T1, T2, R> C7492s<R> m23298b(C7496w<? extends T1> wVar, C7496w<? extends T2> wVar2, C7324c<? super T1, ? super T2, ? extends R> cVar) {
        C7364b.m23081a(wVar, "source1 is null");
        C7364b.m23081a(wVar2, "source2 is null");
        return m23281a(C7342a.m23054a(cVar), false, mo10165a(), (C7496w<? extends T>[]) new C7496w[]{wVar, wVar2});
    }

    /* renamed from: a */
    private static C7492s<Long> m23267a(long j, long j2, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C7385ae aeVar = new C7385ae(Math.max(0, j), Math.max(0, j2), timeUnit, zVar);
        return C7332a.m23018a((C7492s<T>) aeVar);
    }

    /* renamed from: a */
    private C7492s<List<T>> m23270a(long j, TimeUnit timeUnit, C7499z zVar, int i) {
        return m23271a(j, timeUnit, zVar, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    /* renamed from: a */
    private C7492s<T> m23272a(long j, TimeUnit timeUnit, C7499z zVar, boolean z) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C7454h hVar = new C7454h(this, j, timeUnit, zVar, z);
        return C7332a.m23018a((C7492s<T>) hVar);
    }

    /* renamed from: a */
    private <U extends Collection<? super T>> C7492s<U> m23271a(long j, TimeUnit timeUnit, C7499z zVar, int i, Callable<U> callable, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        C7364b.m23081a(timeUnit, "unit is null");
        C7499z zVar2 = zVar;
        C7364b.m23081a(zVar2, "scheduler is null");
        Callable<U> callable2 = callable;
        C7364b.m23081a(callable2, "bufferSupplier is null");
        int i2 = i;
        C7364b.m23078a(i2, "count");
        C7428b bVar = new C7428b(this, j, j, timeUnit2, zVar2, callable2, i2, false);
        return C7332a.m23018a((C7492s<T>) bVar);
    }
}
