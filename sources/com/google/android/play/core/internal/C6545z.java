package com.google.android.play.core.internal;

import com.C1642a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.play.core.internal.z */
public final class C6545z<T> {

    /* renamed from: a */
    private final Object f18843a;

    /* renamed from: b */
    private final Field f18844b;

    /* renamed from: c */
    private final Class<T> f18845c;

    C6545z(Object obj, Field field, Class<T> cls) {
        this.f18843a = obj;
        this.f18844b = field;
        this.f18845c = cls;
    }

    C6545z(Object obj, Field field, Class<T> cls, byte b) {
        this(obj, field, m20329a(cls));
    }

    /* renamed from: a */
    private static <T> Class<T[]> m20329a(Class<T> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    private Class<T> m20330b() {
        return this.f18844b.getType().getComponentType();
    }

    /* renamed from: a */
    public final T mo15898a() {
        try {
            return this.f18845c.cast(this.f18844b.get(this.f18843a));
        } catch (Exception e) {
            throw new C6522ba(C1642a.m8034a("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f18844b.getName(), this.f18843a.getClass().getName(), this.f18845c.getName()}), e);
        }
    }

    /* renamed from: a */
    public final void mo15899a(Collection<T> collection) {
        Object[] objArr = (Object[]) mo15898a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(m20330b(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (T t : collection) {
            objArr2[length] = t;
            length++;
        }
        try {
            this.f18844b.set(this.f18843a, objArr2);
        } catch (Exception e) {
            throw new C6522ba(C1642a.m8034a("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f18844b.getName(), this.f18843a.getClass().getName(), this.f18845c.getName()}), e);
        }
    }

    /* renamed from: a */
    public final void mo15900a(T[] tArr) {
        mo15899a((Collection<T>) Arrays.asList(tArr));
    }
}
