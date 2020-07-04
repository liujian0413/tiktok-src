package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.ca */
class C48125ca extends C48048a<C7581n> {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo120273h() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo120342d(Throwable th) {
        C7573i.m23587b(th, "exception");
        C48051aa.m149012a(this.f122898a, th);
    }

    public C48125ca(C47924e eVar, boolean z) {
        C7573i.m23587b(eVar, "parentContext");
        super(eVar, z);
    }
}
