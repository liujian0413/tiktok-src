package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.EmptyCoroutineContext;

public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public C47924e getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public RestrictedContinuationImpl(C47919b<Object> bVar) {
        boolean z;
        super(bVar);
        if (bVar != null) {
            if (bVar.getContext() == EmptyCoroutineContext.INSTANCE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }
}
