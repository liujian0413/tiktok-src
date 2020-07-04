package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import org.p361a.C7704b;
import p346io.reactivex.C7329e;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.flowable.j */
public final class C47707j<T, U> extends C7329e<U> {

    /* renamed from: a */
    final C7704b<T> f122302a;

    /* renamed from: c */
    final C7327h<? super T, ? extends C7704b<? extends U>> f122303c;

    /* renamed from: d */
    final boolean f122304d = true;

    /* renamed from: e */
    final int f122305e = Integer.MAX_VALUE;

    /* renamed from: f */
    final int f122306f;

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super U> cVar) {
        if (!C47669ab.m148473a(this.f122302a, cVar, this.f122303c)) {
            this.f122302a.mo19155a(C47704i.m148520a(cVar, this.f122303c, this.f122304d, this.f122305e, this.f122306f));
        }
    }

    public C47707j(C7704b<T> bVar, C7327h<? super T, ? extends C7704b<? extends U>> hVar, boolean z, int i, int i2) {
        this.f122302a = bVar;
        this.f122303c = hVar;
        this.f122306f = i2;
    }
}
