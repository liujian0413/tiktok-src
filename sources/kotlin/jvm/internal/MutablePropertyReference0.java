package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7589g;
import kotlin.reflect.C7589g.C7590a;
import kotlin.reflect.C7597k.C7598a;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements C7589g {
    public MutablePropertyReference0() {
    }

    /* access modifiers changed from: protected */
    public C7583b computeReflected() {
        return C7575l.m23598a(this);
    }

    public Object invoke() {
        return get();
    }

    public Object getDelegate() {
        return ((C7589g) getReflected()).getDelegate();
    }

    public C7598a getGetter() {
        return ((C7589g) getReflected()).getGetter();
    }

    public C7590a getSetter() {
        return ((C7589g) getReflected()).getSetter();
    }

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }
}
