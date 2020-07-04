package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7601m;
import kotlin.reflect.C7601m.C7602a;

public abstract class PropertyReference2 extends PropertyReference implements C7601m {
    /* access modifiers changed from: protected */
    public C7583b computeReflected() {
        return C7575l.m23603a(this);
    }

    public C7602a getGetter() {
        return ((C7601m) getReflected()).getGetter();
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public Object getDelegate(Object obj, Object obj2) {
        return ((C7601m) getReflected()).getDelegate(obj, obj2);
    }
}
