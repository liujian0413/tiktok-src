package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.p1885a.C48049a;

/* renamed from: kotlinx.coroutines.br */
final class C48115br extends C48125ca {

    /* renamed from: c */
    private C7563m<? super C48056ad, ? super C47919b<? super C7581n>, ? extends Object> f122981c;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo120253d() {
        C7563m<? super C48056ad, ? super C47919b<? super C7581n>, ? extends Object> mVar = this.f122981c;
        if (mVar != null) {
            this.f122981c = null;
            C48049a.m149006a(mVar, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }

    public C48115br(C47924e eVar, C7563m<? super C48056ad, ? super C47919b<? super C7581n>, ? extends Object> mVar) {
        C7573i.m23587b(eVar, "parentContext");
        C7573i.m23587b(mVar, "block");
        super(eVar, false);
        this.f122981c = mVar;
    }
}
