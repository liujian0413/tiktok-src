package com.google.common.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* renamed from: com.google.common.reflect.b */
public abstract class C18172b<T, R> extends C18171a implements GenericDeclaration {

    /* renamed from: com.google.common.reflect.b$a */
    static class C18173a<T> extends C18172b<T, T> {

        /* renamed from: a */
        final Constructor<?> f49540a;

        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable[] typeParameters2 = this.f49540a.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[(typeParameters.length + typeParameters2.length)];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        /* renamed from: c */
        private boolean m60055c() {
            Class declaringClass = this.f49540a.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                if (!Modifier.isStatic(enclosingMethod.getModifiers())) {
                    return true;
                }
                return false;
            } else if (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                return false;
            } else {
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Type[] mo46956b() {
            Type[] genericParameterTypes = this.f49540a.getGenericParameterTypes();
            if (genericParameterTypes.length > 0 && m60055c()) {
                Class[] parameterTypes = this.f49540a.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                    return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
            }
            return genericParameterTypes;
        }

        C18173a(Constructor<?> constructor) {
            super(constructor);
            this.f49540a = constructor;
        }
    }

    /* renamed from: com.google.common.reflect.b$b */
    static class C18174b<T> extends C18172b<T, Object> {

        /* renamed from: a */
        final Method f49541a;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Type[] mo46956b() {
            return this.f49541a.getGenericParameterTypes();
        }

        public final TypeVariable<?>[] getTypeParameters() {
            return this.f49541a.getTypeParameters();
        }

        C18174b(Method method) {
            super(method);
            this.f49541a = method;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Type[] mo46956b();

    public final Class<? super T> getDeclaringClass() {
        return super.getDeclaringClass();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public TypeToken<T> mo46955a() {
        return TypeToken.m60007of(getDeclaringClass());
    }

    <M extends AccessibleObject & Member> C18172b(M m) {
        super(m);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }
}
