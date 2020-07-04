package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7593i;
import kotlin.reflect.C7593i.C7594a;
import kotlin.reflect.C7601m.C7602a;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements C7593i {
    /* access modifiers changed from: protected */
    public C7583b computeReflected() {
        return C7575l.m23600a(this);
    }

    public C7602a getGetter() {
        return ((C7593i) getReflected()).getGetter();
    }

    public C7594a getSetter() {
        return ((C7593i) getReflected()).getSetter();
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public Object getDelegate(Object obj, Object obj2) {
        return ((C7593i) getReflected()).getDelegate(obj, obj2);
    }
}
