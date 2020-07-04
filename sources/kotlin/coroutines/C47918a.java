package kotlin.coroutines;

import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47927b.C47928a;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlin.coroutines.a */
public abstract class C47918a implements C47927b {
    private final C47929c<?> key;

    public C47929c<?> getKey() {
        return this.key;
    }

    public C47918a(C47929c<?> cVar) {
        C7573i.m23587b(cVar, "key");
        this.key = cVar;
    }

    public <E extends C47927b> E get(C47929c<E> cVar) {
        C7573i.m23587b(cVar, "key");
        return C47928a.m148870a((C47927b) this, cVar);
    }

    public C47924e minusKey(C47929c<?> cVar) {
        C7573i.m23587b(cVar, "key");
        return C47928a.m148872b(this, cVar);
    }

    public C47924e plus(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        return C47928a.m148871a((C47927b) this, eVar);
    }

    public <R> R fold(R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
        C7573i.m23587b(mVar, "operation");
        return C47928a.m148869a(this, r, mVar);
    }
}
