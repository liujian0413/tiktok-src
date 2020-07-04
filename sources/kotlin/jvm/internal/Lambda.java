package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class Lambda<R> implements Serializable, C7572h<R> {
    private final int arity;

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String a = C7575l.m23593a(this);
        C7573i.m23582a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }

    public Lambda(int i) {
        this.arity = i;
    }
}
