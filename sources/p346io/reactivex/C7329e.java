package p346io.reactivex;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.p361a.C48293c;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.operators.flowable.C47665aa;
import p346io.reactivex.internal.operators.flowable.C47669ab;
import p346io.reactivex.internal.operators.flowable.C47673ad;
import p346io.reactivex.internal.operators.flowable.C47677af;
import p346io.reactivex.internal.operators.flowable.C47680ag;
import p346io.reactivex.internal.operators.flowable.C47682b;
import p346io.reactivex.internal.operators.flowable.C47691c;
import p346io.reactivex.internal.operators.flowable.C47694d;
import p346io.reactivex.internal.operators.flowable.C47697e;
import p346io.reactivex.internal.operators.flowable.C47699f;
import p346io.reactivex.internal.operators.flowable.C47700g;
import p346io.reactivex.internal.operators.flowable.C47701h;
import p346io.reactivex.internal.operators.flowable.C47704i;
import p346io.reactivex.internal.operators.flowable.C47708k;
import p346io.reactivex.internal.operators.flowable.C47712l;
import p346io.reactivex.internal.operators.flowable.C47713n;
import p346io.reactivex.internal.operators.flowable.C47716p;
import p346io.reactivex.internal.operators.flowable.C47717q;
import p346io.reactivex.internal.operators.flowable.C47720r;
import p346io.reactivex.internal.operators.flowable.C47724s;
import p346io.reactivex.internal.operators.flowable.C47726t;
import p346io.reactivex.internal.operators.flowable.C47728v;
import p346io.reactivex.internal.operators.flowable.C47730w;
import p346io.reactivex.internal.operators.flowable.C47736y;
import p346io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax;
import p346io.reactivex.internal.operators.observable.C47787y;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C7367g;
import p346io.reactivex.internal.subscribers.LambdaSubscriber;
import p346io.reactivex.internal.subscribers.StrictSubscriber;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C47573k;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: io.reactivex.e */
public abstract class C7329e<T> implements C7704b<T> {

    /* renamed from: b */
    static final int f20393b = Math.max(1, Integer.getInteger("rx2.buffer-size", PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).intValue());

    /* renamed from: a */
    public static int m22962a() {
        return f20393b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public abstract void mo10197a_(C48293c<? super T> cVar);

    /* renamed from: a */
    public static <T> C7329e<T> m22974a(Throwable th) {
        C7364b.m23081a(th, "throwable is null");
        return m22978b(C7342a.m23057a(th));
    }

    /* renamed from: a */
    public static <T> C7329e<T> m22977a(T... tArr) {
        C7364b.m23081a(tArr, "items is null");
        return C7332a.m23015a((C7329e<T>) new C47708k<T>(tArr));
    }

    /* renamed from: a */
    public static <T> C7329e<T> m22975a(Callable<? extends T> callable) {
        C7364b.m23081a(callable, "supplier is null");
        return C7332a.m23015a((C7329e<T>) new C47712l<T>(callable));
    }

    /* renamed from: a */
    private static <T> C7329e<T> m22976a(C7704b<? extends T> bVar) {
        if (bVar instanceof C7329e) {
            return C7332a.m23015a((C7329e) bVar);
        }
        C7364b.m23081a(bVar, "publisher is null");
        return C7332a.m23015a((C7329e<T>) new C47713n<T>(bVar));
    }

    /* renamed from: a */
    public static <T> C7329e<T> m22973a(T t) {
        C7364b.m23081a(t, "item is null");
        return C7332a.m23015a((C7329e<T>) new C47716p<T>(t));
    }

    /* renamed from: a */
    public final <R> R mo19153a(C47579f<T, ? extends R> fVar) {
        return ((C47579f) C7364b.m23081a(fVar, "converter is null")).mo10191a(this);
    }

    /* renamed from: a */
    public final <R> C7329e<R> mo19151a(C47843j<? super T, ? extends R> jVar) {
        return m22976a(((C47843j) C7364b.m23081a(jVar, "composer is null")).mo10213a(this));
    }

    /* renamed from: a */
    public final C7329e<T> mo19147a(C7323a aVar) {
        C7364b.m23081a(aVar, "onFinally is null");
        return C7332a.m23015a((C7329e<T>) new C47691c<T>(this, aVar));
    }

    /* renamed from: a */
    public final C7329e<T> mo19148a(C7326g<? super Throwable> gVar) {
        C7326g b = C7342a.m23058b();
        C7323a aVar = C7342a.f20429c;
        return m22967a(b, gVar, aVar, aVar);
    }

    /* renamed from: a */
    public final C7329e<T> mo19150a(C7328l<? super T> lVar) {
        C7364b.m23081a(lVar, "predicate is null");
        return C7332a.m23015a((C7329e<T>) new C47701h<T>(this, lVar));
    }

    /* renamed from: a */
    public final <R> C7329e<R> mo19149a(C7327h<? super T, ? extends C7704b<? extends R>> hVar) {
        return m22969a(hVar, false, m22962a(), m22962a());
    }

    /* renamed from: a */
    public final C7329e<T> mo19152a(C7499z zVar) {
        return m22972a(zVar, false, m22962a());
    }

    /* renamed from: a */
    private C7329e<T> m22972a(C7499z zVar, boolean z, int i) {
        C7364b.m23081a(zVar, "scheduler is null");
        C7364b.m23078a(i, "bufferSize");
        return C7332a.m23015a((C7329e<T>) new C47720r<T>(this, zVar, false, i));
    }

    /* renamed from: a */
    public final C7329e<T> mo19144a(int i) {
        return m22964a(100, false, false);
    }

    /* renamed from: a */
    public final C7329e<T> mo19145a(long j, C7328l<? super Throwable> lVar) {
        if (j >= 0) {
            C7364b.m23081a(lVar, "predicate is null");
            return C7332a.m23015a((C7329e<T>) new C47736y<T>(this, j, lVar));
        }
        StringBuilder sb = new StringBuilder("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C7329e<T> mo19146a(long j, TimeUnit timeUnit, C7499z zVar, boolean z) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C47665aa aaVar = new C47665aa(this, j, timeUnit, zVar, true);
        return C7332a.m23015a((C7329e<T>) aaVar);
    }

    /* renamed from: a */
    public final C7321c mo19142a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
        return m22963a(gVar, gVar2, C7342a.f20429c, (C7326g<? super C48294d>) RequestMax.INSTANCE);
    }

    /* renamed from: a */
    public final void mo19155a(C48293c<? super T> cVar) {
        if (cVar instanceof C47597i) {
            mo19154a((C47597i) cVar);
            return;
        }
        C7364b.m23081a(cVar, "s is null");
        mo19154a((C47597i<? super T>) new StrictSubscriber<Object>(cVar));
    }

    /* renamed from: a */
    public final void mo19154a(C47597i<? super T> iVar) {
        C7364b.m23081a(iVar, "s is null");
        try {
            C48293c a = C7332a.m23026a(this, (C48293c<? super T>) iVar);
            C7364b.m23081a(a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo10197a_(a);
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

    /* renamed from: a */
    private C7329e<T> m22971a(C7499z zVar, boolean z) {
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23015a((C7329e<T>) new C47677af<T>(this, zVar, z));
    }

    /* renamed from: g */
    private static <T> C7329e<T> mo119676g() {
        return C7332a.m23015a(C47699f.f122266a);
    }

    /* renamed from: c */
    public final C7329e<T> mo19160c() {
        return C7332a.m23015a((C7329e<T>) new C47726t<T>(this));
    }

    /* renamed from: e */
    public final C7490k<T> mo19165e() {
        return C7332a.m23016a((C7490k<T>) new C47673ad<T>(this));
    }

    /* renamed from: f */
    public final C7492s<T> mo19166f() {
        return C7332a.m23018a((C7492s<T>) new C47787y<T>(this));
    }

    /* renamed from: b */
    public final C7329e<T> mo19156b() {
        return m22964a(m22962a(), false, true);
    }

    /* renamed from: d */
    public final C7329e<T> mo19164d() {
        return C7332a.m23015a((C7329e<T>) new C47728v<T>(this));
    }

    /* renamed from: b */
    private static <T> C7329e<T> m22978b(Callable<? extends Throwable> callable) {
        C7364b.m23081a(callable, "errorSupplier is null");
        return C7332a.m23015a((C7329e<T>) new C47700g<T>(callable));
    }

    /* renamed from: d */
    public final C7321c mo19163d(C7326g<? super T> gVar) {
        return m22963a(gVar, C7342a.f20432f, C7342a.f20429c, (C7326g<? super C48294d>) RequestMax.INSTANCE);
    }

    /* renamed from: c */
    public final C7329e<T> mo19161c(C7326g<? super C48294d> gVar) {
        return m22968a(gVar, C7342a.f20433g, C7342a.f20429c);
    }

    /* renamed from: b */
    public final C7329e<T> mo19157b(C7326g<? super T> gVar) {
        C7326g b = C7342a.m23058b();
        C7323a aVar = C7342a.f20429c;
        return m22967a(gVar, b, aVar, aVar);
    }

    /* renamed from: c */
    public final C7329e<T> mo19162c(C7327h<? super Throwable, ? extends T> hVar) {
        C7364b.m23081a(hVar, "valueSupplier is null");
        return C7332a.m23015a((C7329e<T>) new C47730w<T>(this, hVar));
    }

    /* renamed from: b */
    public final <R> C7329e<R> mo19158b(C7327h<? super T, ? extends R> hVar) {
        C7364b.m23081a(hVar, "mapper is null");
        return C7332a.m23015a((C7329e<T>) new C47717q<T>(this, hVar));
    }

    /* renamed from: b */
    public final C7329e<T> mo19159b(C7499z zVar) {
        boolean z;
        C7364b.m23081a(zVar, "scheduler is null");
        if (!(this instanceof C47682b)) {
            z = true;
        } else {
            z = false;
        }
        return m22971a(zVar, z);
    }

    /* renamed from: a */
    public static C7329e<Long> m22965a(long j, TimeUnit timeUnit) {
        return m22966a(500, timeUnit, C7333a.m23042a());
    }

    /* renamed from: a */
    public static <T> C7329e<T> m22970a(C47587h<T> hVar, BackpressureStrategy backpressureStrategy) {
        C7364b.m23081a(hVar, "source is null");
        C7364b.m23081a(backpressureStrategy, "mode is null");
        return C7332a.m23015a((C7329e<T>) new C47682b<T>(hVar, backpressureStrategy));
    }

    /* renamed from: a */
    public final C7321c mo19143a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar) {
        return m22963a(gVar, gVar2, aVar, (C7326g<? super C48294d>) RequestMax.INSTANCE);
    }

    /* renamed from: a */
    private C7329e<T> m22964a(int i, boolean z, boolean z2) {
        C7364b.m23078a(i, "bufferSize");
        C47724s sVar = new C47724s(this, i, z2, false, C7342a.f20429c);
        return C7332a.m23015a((C7329e<T>) sVar);
    }

    /* renamed from: a */
    private static C7329e<Long> m22966a(long j, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        return C7332a.m23015a((C7329e<T>) new C47680ag<T>(Math.max(0, j), timeUnit, zVar));
    }

    /* renamed from: a */
    private C7329e<T> m22968a(C7326g<? super C48294d> gVar, C47573k kVar, C7323a aVar) {
        C7364b.m23081a(gVar, "onSubscribe is null");
        C7364b.m23081a(kVar, "onRequest is null");
        C7364b.m23081a(aVar, "onCancel is null");
        return C7332a.m23015a((C7329e<T>) new C47697e<T>(this, gVar, kVar, aVar));
    }

    /* renamed from: a */
    private C7321c m22963a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7326g<? super C48294d> gVar3) {
        C7364b.m23081a(gVar, "onNext is null");
        C7364b.m23081a(gVar2, "onError is null");
        C7364b.m23081a(aVar, "onComplete is null");
        C7364b.m23081a(gVar3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(gVar, gVar2, aVar, gVar3);
        mo19154a((C47597i<? super T>) lambdaSubscriber);
        return lambdaSubscriber;
    }

    /* renamed from: a */
    private C7329e<T> m22967a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7323a aVar2) {
        C7364b.m23081a(gVar, "onNext is null");
        C7364b.m23081a(gVar2, "onError is null");
        C7364b.m23081a(aVar, "onComplete is null");
        C7364b.m23081a(aVar2, "onAfterTerminate is null");
        C47694d dVar = new C47694d(this, gVar, gVar2, aVar, aVar2);
        return C7332a.m23015a((C7329e<T>) dVar);
    }

    /* renamed from: a */
    private <R> C7329e<R> m22969a(C7327h<? super T, ? extends C7704b<? extends R>> hVar, boolean z, int i, int i2) {
        C7364b.m23081a(hVar, "mapper is null");
        C7364b.m23078a(i, "maxConcurrency");
        C7364b.m23078a(i2, "bufferSize");
        if (this instanceof C7367g) {
            Object call = ((C7367g) this).call();
            if (call == null) {
                return mo119676g();
            }
            return C47669ab.m148472a(call, hVar);
        }
        C47704i iVar = new C47704i(this, hVar, false, i, i2);
        return C7332a.m23015a((C7329e<T>) iVar);
    }
}
