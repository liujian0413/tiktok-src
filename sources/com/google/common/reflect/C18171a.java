package com.google.common.reflect;

import com.google.common.base.C17439m;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* renamed from: com.google.common.reflect.a */
class C18171a extends AccessibleObject implements Member {

    /* renamed from: a */
    private final AccessibleObject f49538a;

    /* renamed from: b */
    private final Member f49539b;

    public final Annotation[] getAnnotations() {
        return this.f49538a.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f49538a.getDeclaredAnnotations();
    }

    public Class<?> getDeclaringClass() {
        return this.f49539b.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f49539b.getModifiers();
    }

    public final String getName() {
        return this.f49539b.getName();
    }

    public int hashCode() {
        return this.f49539b.hashCode();
    }

    public final boolean isAccessible() {
        return this.f49538a.isAccessible();
    }

    public final boolean isSynthetic() {
        return this.f49539b.isSynthetic();
    }

    public String toString() {
        return this.f49539b.toString();
    }

    /* renamed from: a */
    public TypeToken<?> mo46955a() {
        return TypeToken.m60007of(getDeclaringClass());
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f49538a.getAnnotation(cls);
    }

    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f49538a.isAnnotationPresent(cls);
    }

    public final void setAccessible(boolean z) throws SecurityException {
        this.f49538a.setAccessible(z);
    }

    <M extends AccessibleObject & Member> C18171a(M m) {
        C17439m.m57962a(m);
        this.f49538a = m;
        this.f49539b = (Member) m;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18171a)) {
            return false;
        }
        C18171a aVar = (C18171a) obj;
        if (!mo46955a().equals(aVar.mo46955a()) || !this.f49539b.equals(aVar.f49539b)) {
            return false;
        }
        return true;
    }
}
