package com.google.common.reflect;

import com.google.common.base.C17427g;
import com.google.common.base.C17428h;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.base.C17441o;
import com.google.common.collect.C17777bq;
import com.google.common.collect.C17995dt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.C17584a;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.C17591a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.common.reflect.h */
final class C18187h {

    /* renamed from: a */
    public static final C17427g<Type, String> f49557a = new C17427g<Type, String>() {
        /* renamed from: a */
        private static String m60113a(Type type) {
            return C18196c.f49569e.mo47015c(type);
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo44914b(Object obj) {
            return m60113a((Type) obj);
        }
    };

    /* renamed from: b */
    public static final C17428h f49558b = C17428h.m57934a(", ").mo44918b(TEVideoRecorder.FACE_BEAUTY_NULL);

    /* renamed from: com.google.common.reflect.h$a */
    enum C18190a {
        OWNED_BY_ENCLOSING_CLASS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Class<?> mo47006a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Class<?> mo47006a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: c */
        static final C18190a f49562c = null;

        /* renamed from: com.google.common.reflect.h$a$a */
        class C18194a<T> {
            C18194a() {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Class<?> mo47006a(Class<?> cls);

        static {
            f49562c = m60119a();
        }

        /* renamed from: a */
        private static C18190a m60119a() {
            C18190a[] values;
            ParameterizedType parameterizedType = (ParameterizedType) new C18194a<String>() {
            }.getClass().getGenericSuperclass();
            for (C18190a aVar : values()) {
                if (aVar.mo47006a(C18194a.class) == parameterizedType.getOwnerType()) {
                    return aVar;
                }
            }
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.reflect.h$b */
    static final class C18195b implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f49564a;

        public final Type getGenericComponentType() {
            return this.f49564a;
        }

        public final int hashCode() {
            return this.f49564a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C18187h.m60108b(this.f49564a));
            sb.append("[]");
            return sb.toString();
        }

        C18195b(Type type) {
            this.f49564a = C18196c.f49569e.mo47014b(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return C17434j.m57955a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }
    }

    /* renamed from: com.google.common.reflect.h$c */
    enum C18196c {
        JAVA6 {
            /* renamed from: d */
            private static GenericArrayType m60128d(Type type) {
                return new C18195b(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Type mo47012a(Type type) {
                return m60128d(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo47014b(Type type) {
                C17439m.m57962a(type);
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        return new C18195b(cls.getComponentType());
                    }
                }
                return type;
            }
        },
        JAVA7 {
            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo47014b(Type type) {
                return (Type) C17439m.m57962a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Type mo47012a(Type type) {
                if (type instanceof Class) {
                    return C18187h.m60099a((Class) type);
                }
                return new C18195b(type);
            }
        },
        JAVA8 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Type mo47012a(Type type) {
                return JAVA7.mo47012a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo47014b(Type type) {
                return JAVA7.mo47014b(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final String mo47015c(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        },
        JAVA9 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final boolean mo47013a() {
                return false;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Type mo47012a(Type type) {
                return JAVA8.mo47012a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo47014b(Type type) {
                return JAVA8.mo47014b(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final String mo47015c(Type type) {
                return JAVA8.mo47015c(type);
            }
        };
        

        /* renamed from: e */
        static final C18196c f49569e = null;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Type mo47012a(Type type);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo47013a() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Type mo47014b(Type type);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public String mo47015c(Type type) {
            return C18187h.m60108b(type);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ImmutableList<Type> mo47011a(Type[] typeArr) {
            C17584a builder = ImmutableList.builder();
            for (Type b : typeArr) {
                builder.mo45403b(mo47014b(b));
            }
            return builder.mo45418a();
        }
    }

    /* renamed from: com.google.common.reflect.h$d */
    static final class C18203d<X> {

        /* renamed from: a */
        static final boolean f49571a = (!C18203d.class.getTypeParameters()[0].equals(C18187h.m60105a(C18203d.class, "X", new Type[0])));

        C18203d() {
        }
    }

    /* renamed from: com.google.common.reflect.h$e */
    static final class C18204e implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f49572a;

        /* renamed from: b */
        private final ImmutableList<Type> f49573b;

        /* renamed from: c */
        private final Class<?> f49574c;

        public final Type getOwnerType() {
            return this.f49572a;
        }

        public final Type getRawType() {
            return this.f49574c;
        }

        public final Type[] getActualTypeArguments() {
            return C18187h.m60107a((Collection<Type>) this.f49573b);
        }

        public final int hashCode() {
            int i;
            if (this.f49572a == null) {
                i = 0;
            } else {
                i = this.f49572a.hashCode();
            }
            return (i ^ this.f49573b.hashCode()) ^ this.f49574c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f49572a != null && C18196c.f49569e.mo47013a()) {
                sb.append(C18196c.f49569e.mo47015c(this.f49572a));
                sb.append('.');
            }
            sb.append(this.f49574c.getName());
            sb.append('<');
            sb.append(C18187h.f49558b.mo44916a(C17777bq.m59088a((Iterable<F>) this.f49573b, C18187h.f49557a)));
            sb.append('>');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !C17434j.m57955a(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        C18204e(Type type, Class<?> cls, Type[] typeArr) {
            boolean z;
            C17439m.m57962a(cls);
            if (typeArr.length == cls.getTypeParameters().length) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57968a(z);
            C18187h.m60106a(typeArr, "type parameter");
            this.f49572a = type;
            this.f49574c = cls;
            this.f49573b = C18196c.f49569e.mo47011a(typeArr);
        }
    }

    /* renamed from: com.google.common.reflect.h$f */
    static final class C18205f<D extends GenericDeclaration> {

        /* renamed from: a */
        public final D f49575a;

        /* renamed from: b */
        public final String f49576b;

        /* renamed from: c */
        private final ImmutableList<Type> f49577c;

        public final String toString() {
            return this.f49576b;
        }

        public final int hashCode() {
            return this.f49575a.hashCode() ^ this.f49576b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (C18203d.f49571a) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C18206g)) {
                    return false;
                }
                C18205f<?> fVar = ((C18206g) Proxy.getInvocationHandler(obj)).f49579a;
                if (!this.f49576b.equals(fVar.f49576b) || !this.f49575a.equals(fVar.f49575a) || !this.f49577c.equals(fVar.f49577c)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f49576b.equals(typeVariable.getName()) || !this.f49575a.equals(typeVariable.getGenericDeclaration())) {
                    return false;
                }
                return true;
            }
        }

        C18205f(D d, String str, Type[] typeArr) {
            C18187h.m60106a(typeArr, "bound for type variable");
            this.f49575a = (GenericDeclaration) C17439m.m57962a(d);
            this.f49576b = (String) C17439m.m57962a(str);
            this.f49577c = ImmutableList.copyOf((E[]) typeArr);
        }
    }

    /* renamed from: com.google.common.reflect.h$g */
    static final class C18206g implements InvocationHandler {

        /* renamed from: b */
        private static final ImmutableMap<String, Method> f49578b;

        /* renamed from: a */
        public final C18205f<?> f49579a;

        static {
            Method[] methods;
            C17591a builder = ImmutableMap.builder();
            for (Method method : C18205f.class.getMethods()) {
                if (method.getDeclaringClass().equals(C18205f.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.mo45375a(method.getName(), method);
                }
            }
            f49578b = builder.mo45379b();
        }

        C18206g(C18205f<?> fVar) {
            this.f49579a = fVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f49578b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f49579a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    /* renamed from: com.google.common.reflect.h$h */
    static final class C18207h implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final ImmutableList<Type> f49580a;

        /* renamed from: b */
        private final ImmutableList<Type> f49581b;

        public final Type[] getLowerBounds() {
            return C18187h.m60107a((Collection<Type>) this.f49580a);
        }

        public final Type[] getUpperBounds() {
            return C18187h.m60107a((Collection<Type>) this.f49581b);
        }

        public final int hashCode() {
            return this.f49580a.hashCode() ^ this.f49581b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            C17995dt it = this.f49580a.iterator();
            while (it.hasNext()) {
                Type type = (Type) it.next();
                sb.append(" super ");
                sb.append(C18196c.f49569e.mo47015c(type));
            }
            for (Type type2 : C18187h.m60100a((Iterable<Type>) this.f49581b)) {
                sb.append(" extends ");
                sb.append(C18196c.f49569e.mo47015c(type2));
            }
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.f49580a.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.f49581b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }

        C18207h(Type[] typeArr, Type[] typeArr2) {
            C18187h.m60106a(typeArr, "lower bound for wildcard");
            C18187h.m60106a(typeArr2, "upper bound for wildcard");
            this.f49580a = C18196c.f49569e.mo47011a(typeArr);
            this.f49581b = C18196c.f49569e.mo47011a(typeArr2);
        }
    }

    /* renamed from: a */
    public static Type[] m60107a(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    /* renamed from: a */
    static Class<?> m60099a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    static String m60108b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: d */
    private static WildcardType m60111d(Type type) {
        return new C18207h(new Type[0], new Type[]{type});
    }

    /* renamed from: a */
    public static Iterable<Type> m60100a(Iterable<Type> iterable) {
        return C17777bq.m59098b(iterable, C17441o.m57989a(C17441o.m57992a(Object.class)));
    }

    /* renamed from: c */
    static Type m60110c(Type type) {
        C17439m.m57962a(type);
        final AtomicReference atomicReference = new AtomicReference();
        new C18186g() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46962a(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46958a(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46960a(TypeVariable<?> typeVariable) {
                atomicReference.set(C18187h.m60104a(typeVariable.getBounds()));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46961a(WildcardType wildcardType) {
                atomicReference.set(C18187h.m60104a(wildcardType.getUpperBounds()));
            }
        }.mo47005a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: e */
    private static WildcardType m60112e(Type type) {
        return new C18207h(new Type[]{type}, new Type[]{Object.class});
    }

    /* renamed from: a */
    static Type m60103a(Type type) {
        boolean z;
        if (!(type instanceof WildcardType)) {
            return C18196c.f49569e.mo47012a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z2 = true;
        if (lowerBounds.length <= 1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m60112e(m60103a(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z2 = false;
        }
        C17439m.m57969a(z2, (Object) "Wildcard should have only one upper bound.");
        return m60111d(m60103a(upperBounds[0]));
    }

    /* renamed from: a */
    public static Type m60104a(Type[] typeArr) {
        for (Type c : typeArr) {
            Type c2 = m60110c(c);
            if (c2 != null) {
                if (c2 instanceof Class) {
                    Class cls = (Class) c2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m60111d(c2);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static ParameterizedType m60101a(Class<?> cls, Type... typeArr) {
        return new C18204e(C18190a.f49562c.mo47006a(cls), cls, typeArr);
    }

    /* renamed from: a */
    public static void m60106a(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                C17439m.m57977a(!cls2.isPrimitive(), "Primitive type '%s' used as %s", (Object) cls2, (Object) str);
            }
        }
    }

    /* renamed from: b */
    private static <D extends GenericDeclaration> TypeVariable<D> m60109b(D d, String str, Type[] typeArr) {
        return (TypeVariable) C18175c.m60058a(TypeVariable.class, new C18206g(new C18205f(d, str, typeArr)));
    }

    /* renamed from: a */
    static ParameterizedType m60102a(Type type, Class<?> cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return m60101a(cls, typeArr);
        }
        C17439m.m57962a(typeArr);
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57976a(z, "Owner type for unenclosed %s", (Object) cls);
        return new C18204e(type, cls, typeArr);
    }

    /* renamed from: a */
    static <D extends GenericDeclaration> TypeVariable<D> m60105a(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m60109b(d, str, typeArr);
    }
}
