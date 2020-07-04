package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7591h;
import kotlin.reflect.C7591h.C7592a;
import kotlin.reflect.C7599l.C7600a;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements C7591h {
    public MutablePropertyReference1() {
    }

    /* access modifiers changed from: protected */
    public C7583b computeReflected() {
        return C7575l.m23599a(this);
    }

    public C7600a getGetter() {
        return ((C7591h) getReflected()).getGetter();
    }

    public C7592a getSetter() {
        return ((C7591h) getReflected()).getSetter();
    }

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Object getDelegate(Object obj) {
        return ((C7591h) getReflected()).getDelegate(obj);
    }
}
