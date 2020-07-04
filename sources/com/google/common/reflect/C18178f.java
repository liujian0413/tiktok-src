package com.google.common.reflect;

import com.google.common.base.C17428h;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.collect.C17839bx;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.C17591a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.reflect.f */
public final class C18178f {

    /* renamed from: a */
    private final C18181b f49543a;

    /* renamed from: com.google.common.reflect.f$a */
    static final class C18180a extends C18186g {

        /* renamed from: a */
        private static final C18184d f49546a = new C18184d();

        /* renamed from: b */
        private final Map<C18183c, Type> f49547b = C17839bx.m59349c();

        private C18180a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46960a(TypeVariable<?> typeVariable) {
            mo47005a(typeVariable.getBounds());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46961a(WildcardType wildcardType) {
            mo47005a(wildcardType.getUpperBounds());
        }

        /* renamed from: a */
        static ImmutableMap<C18183c, Type> m60074a(Type type) {
            C18180a aVar = new C18180a();
            aVar.mo47005a(f49546a.mo47003a(type));
            return ImmutableMap.copyOf(aVar.f49547b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46962a(Class<?> cls) {
            mo47005a(cls.getGenericSuperclass());
            mo47005a(cls.getGenericInterfaces());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46959a(ParameterizedType parameterizedType) {
            boolean z;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (typeParameters.length == actualTypeArguments.length) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57981b(z);
            for (int i = 0; i < typeParameters.length; i++) {
                m60075a(new C18183c(typeParameters[i]), actualTypeArguments[i]);
            }
            mo47005a(cls);
            mo47005a(parameterizedType.getOwnerType());
        }

        /* renamed from: a */
        private void m60075a(C18183c cVar, Type type) {
            if (!this.f49547b.containsKey(cVar)) {
                Type type2 = type;
                while (type2 != null) {
                    if (cVar.mo46999b(type2)) {
                        while (type != null) {
                            type = (Type) this.f49547b.remove(C18183c.m60084a(type));
                        }
                        return;
                    }
                    type2 = (Type) this.f49547b.get(C18183c.m60084a(type2));
                }
                this.f49547b.put(cVar, type);
            }
        }
    }

    /* renamed from: com.google.common.reflect.f$b */
    static class C18181b {

        /* renamed from: a */
        private final ImmutableMap<C18183c, Type> f49548a;

        C18181b() {
            this.f49548a = ImmutableMap.m58576of();
        }

        private C18181b(ImmutableMap<C18183c, Type> immutableMap) {
            this.f49548a = immutableMap;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Type mo46997a(final TypeVariable<?> typeVariable) {
            return mo46998a(typeVariable, new C18181b() {
                /* renamed from: a */
                public final Type mo46998a(TypeVariable<?> typeVariable, C18181b bVar) {
                    if (typeVariable.getGenericDeclaration().equals(typeVariable.getGenericDeclaration())) {
                        return typeVariable;
                    }
                    return this.mo46998a(typeVariable, bVar);
                }
            });
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C18181b mo46996a(Map<C18183c, ? extends Type> map) {
            C17591a builder = ImmutableMap.builder();
            builder.mo45377a((Map<? extends K, ? extends V>) this.f49548a);
            for (Entry entry : map.entrySet()) {
                C18183c cVar = (C18183c) entry.getKey();
                Type type = (Type) entry.getValue();
                C17439m.m57976a(!cVar.mo46999b(type), "Type variable %s bound to itself", (Object) cVar);
                builder.mo45375a(cVar, type);
            }
            return new C18181b(builder.mo45379b());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Type mo46998a(TypeVariable<?> typeVariable, C18181b bVar) {
            Type type = (Type) this.f49548a.get(new C18183c(typeVariable));
            if (type != null) {
                return new C18178f(bVar).mo46995b(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a = new C18178f(bVar).mo46994a(bounds);
            if (!C18203d.f49571a || !Arrays.equals(bounds, a)) {
                return C18187h.m60105a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
            }
            return typeVariable;
        }
    }

    /* renamed from: com.google.common.reflect.f$c */
    static final class C18183c {

        /* renamed from: a */
        private final TypeVariable<?> f49552a;

        public final String toString() {
            return this.f49552a.toString();
        }

        public final int hashCode() {
            return C17434j.m57954a(this.f49552a.getGenericDeclaration(), this.f49552a.getName());
        }

        C18183c(TypeVariable<?> typeVariable) {
            this.f49552a = (TypeVariable) C17439m.m57962a(typeVariable);
        }

        /* renamed from: a */
        static C18183c m60084a(Type type) {
            if (type instanceof TypeVariable) {
                return new C18183c((TypeVariable) type);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo46999b(Type type) {
            if (type instanceof TypeVariable) {
                return m60085a((TypeVariable) type);
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C18183c) {
                return m60085a(((C18183c) obj).f49552a);
            }
            return false;
        }

        /* renamed from: a */
        private boolean m60085a(TypeVariable<?> typeVariable) {
            if (!this.f49552a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) || !this.f49552a.getName().equals(typeVariable.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.reflect.f$d */
    static class C18184d {

        /* renamed from: a */
        private final AtomicInteger f49553a;

        /* renamed from: a */
        private C18184d m60087a() {
            return new C18184d(this.f49553a);
        }

        C18184d() {
            this(new AtomicInteger());
        }

        private C18184d(AtomicInteger atomicInteger) {
            this.f49553a = atomicInteger;
        }

        /* renamed from: a */
        private C18184d m60088a(final TypeVariable<?> typeVariable) {
            return new C18184d(this.f49553a) {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final TypeVariable<?> mo47004a(Type[] typeArr) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                    linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.mo47004a((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        /* renamed from: b */
        private Type m60089b(Type type) {
            if (type == null) {
                return null;
            }
            return mo47003a(type);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public TypeVariable<?> mo47004a(Type[] typeArr) {
            StringBuilder sb = new StringBuilder("capture#");
            sb.append(this.f49553a.incrementAndGet());
            sb.append("-of ? extends ");
            sb.append(C17428h.m57933a('&').mo44917a((Object[]) typeArr));
            return C18187h.m60105a(C18184d.class, sb.toString(), typeArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Type mo47003a(Type type) {
            C17439m.m57962a(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return C18187h.m60103a(m60087a().mo47003a(((GenericArrayType) type).getGenericComponentType()));
            } else if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = m60088a(typeParameters[i]).mo47003a(actualTypeArguments[i]);
                }
                return C18187h.m60102a(m60087a().m60089b(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    return mo47004a(wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }
    }

    /* renamed from: a */
    public final Type[] mo46994a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo46995b(typeArr[i]);
        }
        return typeArr2;
    }

    public C18178f() {
        this.f49543a = new C18181b();
    }

    private C18178f(C18181b bVar) {
        this.f49543a = bVar;
    }

    /* renamed from: a */
    static C18178f m60059a(Type type) {
        return new C18178f().mo46993a((Map<C18183c, ? extends Type>) C18180a.m60074a(type));
    }

    /* renamed from: a */
    private Type m60062a(GenericArrayType genericArrayType) {
        return C18187h.m60103a(mo46995b(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: b */
    public final Type mo46995b(Type type) {
        C17439m.m57962a(type);
        if (type instanceof TypeVariable) {
            return this.f49543a.mo46997a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m60061a((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m60062a((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            return m60063a((WildcardType) type);
        }
        return type;
    }

    /* renamed from: a */
    private ParameterizedType m60061a(ParameterizedType parameterizedType) {
        Type type;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            type = null;
        } else {
            type = mo46995b(ownerType);
        }
        return C18187h.m60102a(type, (Class) mo46995b(parameterizedType.getRawType()), mo46994a(parameterizedType.getActualTypeArguments()));
    }

    /* renamed from: a */
    private WildcardType m60063a(WildcardType wildcardType) {
        return new C18207h(mo46994a(wildcardType.getLowerBounds()), mo46994a(wildcardType.getUpperBounds()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18178f mo46993a(Map<C18183c, ? extends Type> map) {
        return new C18178f(this.f49543a.mo46996a(map));
    }

    /* renamed from: a */
    public static <T> T m60060a(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" is not a ");
            sb.append(cls.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final C18178f mo46992a(Type type, Type type2) {
        HashMap c = C17839bx.m59349c();
        m60064a(c, (Type) C17439m.m57962a(type), (Type) C17439m.m57962a(type2));
        return mo46993a((Map<C18183c, ? extends Type>) c);
    }

    /* renamed from: a */
    public static void m60064a(final Map<C18183c, Type> map, Type type, final Type type2) {
        if (!type.equals(type2)) {
            new C18186g() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo46960a(TypeVariable<?> typeVariable) {
                    map.put(new C18183c(typeVariable), type2);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo46962a(Class<?> cls) {
                    if (!(type2 instanceof WildcardType)) {
                        StringBuilder sb = new StringBuilder("No type mapping from ");
                        sb.append(cls);
                        sb.append(" to ");
                        sb.append(type2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo46958a(GenericArrayType genericArrayType) {
                    boolean z;
                    if (!(type2 instanceof WildcardType)) {
                        Type c = C18187h.m60110c(type2);
                        if (c != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C17439m.m57976a(z, "%s is not an array type.", (Object) type2);
                        C18178f.m60064a(map, genericArrayType.getGenericComponentType(), c);
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo46959a(ParameterizedType parameterizedType) {
                    boolean z;
                    if (!(type2 instanceof WildcardType)) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) C18178f.m60060a(ParameterizedType.class, (Object) type2);
                        if (!(parameterizedType.getOwnerType() == null || parameterizedType2.getOwnerType() == null)) {
                            C18178f.m60064a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                        }
                        C17439m.m57977a(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", (Object) parameterizedType, (Object) type2);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                        if (actualTypeArguments.length == actualTypeArguments2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C17439m.m57977a(z, "%s not compatible with %s", (Object) parameterizedType, (Object) parameterizedType2);
                        for (int i = 0; i < actualTypeArguments.length; i++) {
                            C18178f.m60064a(map, actualTypeArguments[i], actualTypeArguments2[i]);
                        }
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo46961a(WildcardType wildcardType) {
                    boolean z;
                    if (type2 instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Type[] upperBounds2 = wildcardType2.getUpperBounds();
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                        if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C17439m.m57977a(z, "Incompatible type: %s vs. %s", (Object) wildcardType, (Object) type2);
                        for (int i = 0; i < upperBounds.length; i++) {
                            C18178f.m60064a(map, upperBounds[i], upperBounds2[i]);
                        }
                        for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                            C18178f.m60064a(map, lowerBounds[i2], lowerBounds2[i2]);
                        }
                    }
                }
            }.mo47005a(type);
        }
    }
}
