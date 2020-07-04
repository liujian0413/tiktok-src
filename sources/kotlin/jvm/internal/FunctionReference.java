package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7586e;

public class FunctionReference extends CallableReference implements C7572h, C7586e {
    private final int arity;

    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    public C7583b computeReflected() {
        return C7575l.m23597a(this);
    }

    /* access modifiers changed from: protected */
    public C7586e getReflected() {
        return (C7586e) super.getReflected();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public int hashCode() {
        int i;
        if (getOwner() == null) {
            i = 0;
        } else {
            i = getOwner().hashCode() * 31;
        }
        return ((i + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C7583b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sb = new StringBuilder("function ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public FunctionReference(int i) {
        this.arity = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getOwner() != null ? getOwner().equals(functionReference.getOwner()) : functionReference.getOwner() == null) {
                if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || !C7573i.m23585a(getBoundReceiver(), functionReference.getBoundReceiver())) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof C7586e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public FunctionReference(int i, Object obj) {
        super(obj);
        this.arity = i;
    }
}
