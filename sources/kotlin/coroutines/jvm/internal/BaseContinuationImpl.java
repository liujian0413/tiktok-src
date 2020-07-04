package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.C47965i;
import kotlin.C7581n;
import kotlin.Result;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.jvm.internal.C7573i;

public abstract class BaseContinuationImpl implements Serializable, C47919b<Object>, C47953c {
    private final C47919b<Object> completion;

    public final C47919b<Object> getCompletion() {
        return this.completion;
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public StackTraceElement getStackTraceElement() {
        return C47954e.m148885a(this);
    }

    public C47953c getCallerFrame() {
        C47919b<Object> bVar = this.completion;
        if (!(bVar instanceof C47953c)) {
            bVar = null;
        }
        return (C47953c) bVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public BaseContinuationImpl(C47919b<Object> bVar) {
        this.completion = bVar;
    }

    public C47919b<C7581n> create(C47919b<?> bVar) {
        C7573i.m23587b(bVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public final void resumeWith(Object obj) {
        C47919b bVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) bVar;
            C47955f.m148890b(baseContinuationImpl);
            C47919b bVar2 = baseContinuationImpl.completion;
            if (bVar2 == null) {
                C7573i.m23580a();
            }
            try {
                Object invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (invokeSuspend != C47948a.m148881a()) {
                    obj = Result.m150902constructorimpl(invokeSuspend);
                    baseContinuationImpl.releaseIntercepted();
                    if (bVar2 instanceof BaseContinuationImpl) {
                        bVar = bVar2;
                    } else {
                        bVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                obj = Result.m150902constructorimpl(C47965i.m148906a(th));
            }
        }
    }

    public C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
        C7573i.m23587b(bVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
