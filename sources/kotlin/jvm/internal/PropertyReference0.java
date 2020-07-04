package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7597k;
import kotlin.reflect.C7597k.C7598a;

public abstract class PropertyReference0 extends PropertyReference implements C7597k {
    public PropertyReference0() {
    }

    /* access modifiers changed from: protected */
    public C7583b computeReflected() {
        return C7575l.m23601a(this);
    }

    public Object invoke() {
        return get();
    }

    public Object getDelegate() {
        return ((C7597k) getReflected()).getDelegate();
    }

    public C7598a getGetter() {
        return ((C7597k) getReflected()).getGetter();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }
}
