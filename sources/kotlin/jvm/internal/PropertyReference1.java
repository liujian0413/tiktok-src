package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7599l;
import kotlin.reflect.C7599l.C7600a;

public abstract class PropertyReference1 extends PropertyReference implements C7599l {
    public PropertyReference1() {
    }

    /* access modifiers changed from: protected */
    public C7583b computeReflected() {
        return C7575l.m23602a(this);
    }

    public C7600a getGetter() {
        return ((C7599l) getReflected()).getGetter();
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Object getDelegate(Object obj) {
        return ((C7599l) getReflected()).getDelegate(obj);
    }
}
