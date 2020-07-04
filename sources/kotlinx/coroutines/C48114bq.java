package kotlinx.coroutines;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.p1885a.C48049a;

/* renamed from: kotlinx.coroutines.bq */
final class C48114bq<T> extends C48064al<T> {

    /* renamed from: c */
    private C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> f122980c;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo120253d() {
        C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> mVar = this.f122980c;
        if (mVar != null) {
            this.f122980c = null;
            C48049a.m149006a(mVar, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }

    public C48114bq(C47924e eVar, C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> mVar) {
        C7573i.m23587b(eVar, "parentContext");
        C7573i.m23587b(mVar, "block");
        super(eVar, false);
        this.f122980c = mVar;
    }
}
