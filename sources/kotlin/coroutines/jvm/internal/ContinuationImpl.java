package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47920c;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.jvm.internal.C7573i;

public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final C47924e _context;
    private transient C47919b<Object> intercepted;

    public C47924e getContext() {
        C47924e eVar = this._context;
        if (eVar == null) {
            C7573i.m23580a();
        }
        return eVar;
    }

    public final C47919b<Object> intercepted() {
        C47919b<Object> bVar = this.intercepted;
        if (bVar == null) {
            C47920c cVar = (C47920c) getContext().get(C47920c.f122777a);
            if (cVar != null) {
                bVar = cVar.mo120140a(this);
            } else {
                bVar = this;
            }
            this.intercepted = bVar;
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C47919b<Object> bVar = this.intercepted;
        if (!(bVar == null || bVar == this)) {
            C47927b bVar2 = getContext().get(C47920c.f122777a);
            if (bVar2 == null) {
                C7573i.m23580a();
            }
            ((C47920c) bVar2).mo120141b(bVar);
        }
        this.intercepted = C47952b.f122786a;
    }

    public ContinuationImpl(C47919b<Object> bVar) {
        C47924e eVar;
        if (bVar != null) {
            eVar = bVar.getContext();
        } else {
            eVar = null;
        }
        this(bVar, eVar);
    }

    public ContinuationImpl(C47919b<Object> bVar, C47924e eVar) {
        super(bVar);
        this._context = eVar;
    }
}
