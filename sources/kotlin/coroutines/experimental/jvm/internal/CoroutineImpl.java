package kotlin.coroutines.experimental.jvm.internal;

import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.coroutines.experimental.C47930a;
import kotlin.coroutines.experimental.C47936c;
import kotlin.coroutines.experimental.p1880a.C47931a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;

public abstract class CoroutineImpl extends Lambda<Object> implements C47930a<Object> {
    private final C47936c _context;
    private C47930a<Object> _facade;
    protected C47930a<Object> completion;
    protected int label;

    /* access modifiers changed from: protected */
    public abstract Object doResume(Object obj, Throwable th);

    public C47936c getContext() {
        C47936c cVar = this._context;
        if (cVar == null) {
            C7573i.m23580a();
        }
        return cVar;
    }

    public final C47930a<Object> getFacade() {
        if (this._facade == null) {
            C47936c cVar = this._context;
            if (cVar == null) {
                C7573i.m23580a();
            }
            this._facade = C47939a.m148876a(cVar, this);
        }
        C47930a<Object> aVar = this._facade;
        if (aVar == null) {
            C7573i.m23580a();
        }
        return aVar;
    }

    public C47930a<C7581n> create(C47930a<?> aVar) {
        C7573i.m23587b(aVar, "completion");
        throw new IllegalStateException("create(Continuation) has not been overridden");
    }

    public void resume(Object obj) {
        C47930a<Object> aVar = this.completion;
        if (aVar == null) {
            C7573i.m23580a();
        }
        try {
            Object doResume = doResume(obj, null);
            if (doResume != C47931a.m148873a()) {
                if (aVar != null) {
                    aVar.resume(doResume);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
            }
        } catch (Throwable th) {
            aVar.resumeWithException(th);
        }
    }

    public void resumeWithException(Throwable th) {
        C7573i.m23587b(th, "exception");
        C47930a<Object> aVar = this.completion;
        if (aVar == null) {
            C7573i.m23580a();
        }
        try {
            Object doResume = doResume(null, th);
            if (doResume != C47931a.m148873a()) {
                if (aVar != null) {
                    aVar.resume(doResume);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
            }
        } catch (Throwable th2) {
            aVar.resumeWithException(th2);
        }
    }

    public C47930a<C7581n> create(Object obj, C47930a<?> aVar) {
        C7573i.m23587b(aVar, "completion");
        throw new IllegalStateException("create(Any?;Continuation) has not been overridden");
    }

    public CoroutineImpl(int i, C47930a<Object> aVar) {
        int i2;
        C47936c cVar;
        super(i);
        this.completion = aVar;
        if (this.completion != null) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        this.label = i2;
        C47930a<Object> aVar2 = this.completion;
        if (aVar2 != null) {
            cVar = aVar2.getContext();
        } else {
            cVar = null;
        }
        this._context = cVar;
    }
}
