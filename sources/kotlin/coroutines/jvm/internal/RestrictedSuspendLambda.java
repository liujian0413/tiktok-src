package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C47919b;
import kotlin.jvm.internal.C7572h;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;

public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements C7572h<Object> {
    private final int arity;

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String a = C7575l.m23594a((C7572h) this);
        C7573i.m23582a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }

    public RestrictedSuspendLambda(int i) {
        this(i, null);
    }

    public RestrictedSuspendLambda(int i, C47919b<Object> bVar) {
        super(bVar);
        this.arity = i;
    }
}
