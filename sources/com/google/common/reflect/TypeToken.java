package com.google.common.reflect;

import com.google.common.base.C17428h;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.collect.C17742ar;
import com.google.common.collect.C17757bc;
import com.google.common.collect.C17839bx;
import com.google.common.collect.C17896ch;
import com.google.common.collect.C17995dt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.C17584a;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.C17622a;
import com.google.common.primitives.C18147e;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class TypeToken<T> extends C18176d<T> implements Serializable {
    public final Type runtimeType;
    private transient C18178f typeResolver;

    public class TypeSet extends C17757bc<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        private transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet interfaces() {
            return new C18159c(this);
        }

        public TypeSet classes() {
            return new C18158b();
        }

        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> a = C17742ar.m59037a((Iterable<E>) C18162e.f49529a.mo46969a(TypeToken.this)).mo45889a((C17440n<? super E>) C18168f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo45888a();
            this.types = a;
            return a;
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection<? extends E>) C18162e.f49530b.mo46968a((Iterable<? extends K>) TypeToken.this.getRawTypes()));
        }

        TypeSet() {
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$a */
    static class C18157a {

        /* renamed from: a */
        private final Type[] f49521a;

        /* renamed from: b */
        private final boolean f49522b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo46966a(Type type) {
            for (Type of : this.f49521a) {
                if (TypeToken.m60008of(of).isSubtypeOf(type) == this.f49522b) {
                    return this.f49522b;
                }
            }
            if (!this.f49522b) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo46967b(Type type) {
            TypeToken of = TypeToken.m60008of(type);
            for (Type isSubtypeOf : this.f49521a) {
                if (of.isSubtypeOf(isSubtypeOf) == this.f49522b) {
                    return this.f49522b;
                }
            }
            if (!this.f49522b) {
                return true;
            }
            return false;
        }

        C18157a(Type[] typeArr, boolean z) {
            this.f49521a = typeArr;
            this.f49522b = z;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$b */
    final class C18158b extends TypeSet {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private transient ImmutableSet<TypeToken<? super T>> f49524b;

        public final TypeSet classes() {
            return this;
        }

        public final TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        public final Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection<? extends E>) C18162e.f49530b.mo46970a().mo46968a((Iterable<? extends K>) TypeToken.this.getRawTypes()));
        }

        public final Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f49524b;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> a = C17742ar.m59037a((Iterable<E>) C18162e.f49529a.mo46970a().mo46969a(TypeToken.this)).mo45889a((C17440n<? super E>) C18168f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo45888a();
            this.f49524b = a;
            return a;
        }

        private C18158b() {
            super();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$c */
    final class C18159c extends TypeSet {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final transient TypeSet f49526b;

        /* renamed from: c */
        private transient ImmutableSet<TypeToken<? super T>> f49527c;

        public final TypeSet interfaces() {
            return this;
        }

        public final TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        public final Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f49527c;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> a = C17742ar.m59037a((Iterable<E>) this.f49526b).mo45889a((C17440n<? super E>) C18168f.INTERFACE_ONLY).mo45888a();
            this.f49527c = a;
            return a;
        }

        public final Set<Class<? super T>> rawTypes() {
            return C17742ar.m59037a((Iterable<E>) C18162e.f49530b.mo46968a((Iterable<? extends K>) TypeToken.this.getRawTypes())).mo45889a((C17440n<? super E>) new C17440n<Class<?>>() {
                /* renamed from: a */
                private static boolean m60024a(Class<?> cls) {
                    return cls.isInterface();
                }

                public final /* synthetic */ boolean apply(Object obj) {
                    return m60024a((Class) obj);
                }
            }).mo45888a();
        }

        C18159c(TypeSet typeSet) {
            super();
            this.f49526b = typeSet;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$d */
    static final class C18161d<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        C18161d(Type type) {
            super(type);
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$e */
    static abstract class C18162e<K> {

        /* renamed from: a */
        static final C18162e<TypeToken<?>> f49529a = new C18162e<TypeToken<?>>() {
            /* renamed from: a */
            private static Class<?> m60033a(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            /* renamed from: b */
            private static Iterable<? extends TypeToken<?>> m60034b(TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            /* renamed from: c */
            private static TypeToken<?> m60035c(TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final /* synthetic */ Object mo46973d(Object obj) {
                return m60035c((TypeToken) obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ Class mo46971b(Object obj) {
                return m60033a((TypeToken) obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final /* synthetic */ Iterable mo46972c(Object obj) {
                return m60034b((TypeToken) obj);
            }
        };

        /* renamed from: b */
        static final C18162e<Class<?>> f49530b = new C18162e<Class<?>>() {
            /* renamed from: a */
            private static Class<?> m60039a(Class<?> cls) {
                return cls;
            }

            /* renamed from: c */
            private static Class<?> m60041c(Class<?> cls) {
                return cls.getSuperclass();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ Class mo46971b(Object obj) {
                return m60039a((Class) obj);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final /* synthetic */ Object mo46973d(Object obj) {
                return m60041c((Class) obj);
            }

            /* renamed from: b */
            private static Iterable<? extends Class<?>> m60040b(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final /* synthetic */ Iterable mo46972c(Object obj) {
                return m60040b((Class) obj);
            }
        };

        /* renamed from: com.google.common.reflect.TypeToken$e$a */
        static class C18167a<K> extends C18162e<K> {

            /* renamed from: c */
            private final C18162e<K> f49534c;

            C18167a(C18162e<K> eVar) {
                super();
                this.f49534c = eVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Class<?> mo46971b(K k) {
                return this.f49534c.mo46971b(k);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public Iterable<? extends K> mo46972c(K k) {
                return this.f49534c.mo46972c(k);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final K mo46973d(K k) {
                return this.f49534c.mo46973d(k);
            }
        }

        private C18162e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Class<?> mo46971b(K k);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract Iterable<? extends K> mo46972c(K k);

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract K mo46973d(K k);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C18162e<K> mo46970a() {
            return new C18167a<K>(this) {
                /* access modifiers changed from: 0000 */
                /* renamed from: c */
                public final Iterable<? extends K> mo46972c(K k) {
                    return ImmutableSet.m58649of();
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final ImmutableList<K> mo46968a(Iterable<? extends K> iterable) {
                    C17584a builder = ImmutableList.builder();
                    for (Object next : iterable) {
                        if (!mo46971b(next).isInterface()) {
                            builder.mo45403b(next);
                        }
                    }
                    return super.mo46968a((Iterable<? extends K>) builder.mo45418a());
                }
            };
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ImmutableList<K> mo46969a(K k) {
            return mo46968a((Iterable<? extends K>) ImmutableList.m58537of(k));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public ImmutableList<K> mo46968a(Iterable<? extends K> iterable) {
            HashMap c = C17839bx.m59349c();
            for (Object a : iterable) {
                m60025a((K) a, (Map<? super K, Integer>) c);
            }
            return m60026a((Map<K, V>) c, (Comparator<? super V>) C17896ch.m59497b().mo46226a());
        }

        /* renamed from: a */
        private static <K, V> ImmutableList<K> m60026a(final Map<K, V> map, final Comparator<? super V> comparator) {
            return new C17896ch<K>() {
                public final int compare(K k, K k2) {
                    return comparator.compare(map.get(k), map.get(k2));
                }
            }.mo46249b(map.keySet());
        }

        /* renamed from: a */
        private int m60025a(K k, Map<? super K, Integer> map) {
            Integer num = (Integer) map.get(k);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = mo46971b(k).isInterface();
            for (Object a : mo46972c(k)) {
                isInterface = Math.max(isInterface, m60025a((K) a, map));
            }
            Object d = mo46973d(k);
            if (d != null) {
                isInterface = Math.max(isInterface, m60025a((K) d, map));
            }
            int i = isInterface + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$f */
    enum C18168f implements C17440n<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            public final /* synthetic */ boolean apply(Object obj) {
                return m60050a((TypeToken) obj);
            }

            /* renamed from: a */
            private static boolean m60050a(TypeToken<?> typeToken) {
                if ((typeToken.runtimeType instanceof TypeVariable) || (typeToken.runtimeType instanceof WildcardType)) {
                    return false;
                }
                return true;
            }
        },
        INTERFACE_ONLY {
            public final /* synthetic */ boolean apply(Object obj) {
                return m60051a((TypeToken) obj);
            }

            /* renamed from: a */
            private static boolean m60051a(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeSet getTypes() {
        return new TypeSet<>();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public String toString() {
        return C18187h.m60108b(this.runtimeType);
    }

    private boolean isWrapper() {
        return C18147e.m59985a().contains(this.runtimeType);
    }

    public final TypeToken<?> getComponentType() {
        Type c = C18187h.m60110c(this.runtimeType);
        if (c == null) {
            return null;
        }
        return m60008of(c);
    }

    public final Class<? super T> getRawType() {
        return (Class) getRawTypes().iterator().next();
    }

    public final boolean isArray() {
        if (getComponentType() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return m60008of(new C18178f().mo46995b(this.runtimeType));
    }

    protected TypeToken() {
        boolean z;
        this.runtimeType = capture();
        if (!(this.runtimeType instanceof TypeVariable)) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", (Object) this.runtimeType);
    }

    private Type getOwnerTypeIfPresent() {
        if (this.runtimeType instanceof ParameterizedType) {
            return ((ParameterizedType) this.runtimeType).getOwnerType();
        }
        if (this.runtimeType instanceof Class) {
            return ((Class) this.runtimeType).getEnclosingClass();
        }
        return null;
    }

    public ImmutableSet<Class<? super T>> getRawTypes() {
        final C17622a builder = ImmutableSet.builder();
        new C18186g() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46962a(Class<?> cls) {
                builder.mo45403b(cls);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46959a(ParameterizedType parameterizedType) {
                builder.mo45403b((Class) parameterizedType.getRawType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46958a(GenericArrayType genericArrayType) {
                builder.mo45403b(C18187h.m60099a(TypeToken.m60008of(genericArrayType.getGenericComponentType()).getRawType()));
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
        }.mo47005a(this.runtimeType);
        return builder.mo45556a();
    }

    public final boolean isPrimitive() {
        if (!(this.runtimeType instanceof Class) || !((Class) this.runtimeType).isPrimitive()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final TypeToken<T> rejectTypeVariables() {
        new C18186g() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46958a(GenericArrayType genericArrayType) {
                mo47005a(genericArrayType.getGenericComponentType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46959a(ParameterizedType parameterizedType) {
                mo47005a(parameterizedType.getActualTypeArguments());
                mo47005a(parameterizedType.getOwnerType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46960a(TypeVariable<?> typeVariable) {
                StringBuilder sb = new StringBuilder();
                sb.append(TypeToken.this.runtimeType);
                sb.append("contains a type variable and is not safe for the operation");
                throw new IllegalArgumentException(sb.toString());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo46961a(WildcardType wildcardType) {
                mo47005a(wildcardType.getLowerBounds());
                mo47005a(wildcardType.getUpperBounds());
            }
        }.mo47005a(this.runtimeType);
        return this;
    }

    public final TypeToken<T> unwrap() {
        if (isWrapper()) {
            return m60007of(C18147e.m59987b((Class) this.runtimeType));
        }
        return this;
    }

    public final TypeToken<T> wrap() {
        if (isPrimitive()) {
            return m60007of(C18147e.m59984a((Class) this.runtimeType));
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final TypeToken<? super T> getGenericSuperclass() {
        if (this.runtimeType instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) this.runtimeType).getBounds()[0]);
        }
        if (this.runtimeType instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) this.runtimeType).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return resolveSupertype(genericSuperclass);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        if (this.runtimeType instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) this.runtimeType).getBounds());
        }
        if (this.runtimeType instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) this.runtimeType).getUpperBounds());
        }
        C17584a builder = ImmutableList.builder();
        for (Type resolveSupertype : getRawType().getGenericInterfaces()) {
            builder.mo45403b(resolveSupertype(resolveSupertype));
        }
        return builder.mo45418a();
    }

    private static C18157a any(Type[] typeArr) {
        return new C18157a(typeArr, true);
    }

    private static C18157a every(Type[] typeArr) {
        return new C18157a(typeArr, false);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return C18196c.JAVA7.mo47012a(type);
    }

    /* renamed from: of */
    public static <T> TypeToken<T> m60007of(Class<T> cls) {
        return new C18161d(cls);
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) C17439m.m57962a(type);
    }

    /* renamed from: of */
    public static TypeToken<?> m60008of(Type type) {
        return new C18161d(type);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> resolveType = resolveType(type);
        resolveType.typeResolver = this.typeResolver;
        return resolveType;
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> of = m60008of(type);
        if (of.getRawType().isInterface()) {
            return null;
        }
        return of;
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        return m60008of(newArrayClassOrGenericArrayType(getComponentType().getSubtype(cls.getComponentType()).runtimeType));
    }

    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        return m60008of(newArrayClassOrGenericArrayType(((TypeToken) C17439m.m57964a(getComponentType(), "%s isn't a super type of %s", (Object) cls, (Object) this)).getSupertype(cls.getComponentType()).runtimeType));
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        C17995dt it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom((Class) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final C18172b<T, T> constructor(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57977a(z, "%s not declared by %s", (Object) constructor, (Object) getRawType());
        return new C18173a<T>(constructor) {
            /* renamed from: a */
            public final TypeToken<T> mo46955a() {
                return TypeToken.this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type[] mo46956b() {
                return TypeToken.this.resolveInPlace(super.mo46956b());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(mo46955a());
                sb.append("(");
                sb.append(C17428h.m57934a(", ").mo44917a((Object[]) mo46956b()));
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeToken)) {
            return false;
        }
        return this.runtimeType.equals(((TypeToken) obj).runtimeType);
    }

    public final boolean isSupertypeOf(Type type) {
        return m60008of(type).isSubtypeOf(getType());
    }

    public final C18172b<T, Object> method(Method method) {
        C17439m.m57977a(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", (Object) method, (Object) this);
        return new C18174b<T>(method) {
            /* renamed from: a */
            public final TypeToken<T> mo46955a() {
                return TypeToken.this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type[] mo46956b() {
                return TypeToken.this.resolveInPlace(super.mo46956b());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(mo46955a());
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(super.toString());
                return sb.toString();
            }
        };
    }

    public Type[] resolveInPlace(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = resolveType(typeArr[i]).getType();
        }
        return typeArr;
    }

    public final TypeToken<?> resolveType(Type type) {
        C17439m.m57962a(type);
        C18178f fVar = this.typeResolver;
        if (fVar == null) {
            fVar = C18178f.m60059a(this.runtimeType);
            this.typeResolver = fVar;
        }
        return m60008of(fVar.mo46995b(type));
    }

    protected TypeToken(Class<?> cls) {
        Type capture = super.capture();
        if (capture instanceof Class) {
            this.runtimeType = capture;
        } else {
            this.runtimeType = m60007of(cls).resolveType(capture).runtimeType;
        }
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        C17584a builder = ImmutableList.builder();
        for (Type of : typeArr) {
            TypeToken of2 = m60008of(of);
            if (of2.getRawType().isInterface()) {
                builder.mo45403b(of2);
            }
        }
        return builder.mo45418a();
    }

    /* renamed from: is */
    private boolean m60006is(Type type) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (!every(wildcardType.getUpperBounds()).mo46967b(this.runtimeType) || !every(wildcardType.getLowerBounds()).mo46966a(this.runtimeType)) {
            return false;
        }
        return true;
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = ((TypeToken) it.next()).getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && m60008of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        if (this.runtimeType instanceof Class) {
            Class cls = (Class) this.runtimeType;
            if (!cls.isArray()) {
                return false;
            }
            return m60007of(cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        } else if (this.runtimeType instanceof GenericArrayType) {
            return m60008of(((GenericArrayType) this.runtimeType).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        } else {
            return false;
        }
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        return new C18178f().mo46992a(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).mo46995b(genericType.runtimeType);
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class rawType = m60008of((Type) parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!resolveType(typeParameters[i]).m60006is(actualTypeArguments[i])) {
                return false;
            }
        }
        if (Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType())) {
            return true;
        }
        return false;
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        if (this.runtimeType instanceof Class) {
            Class cls = (Class) this.runtimeType;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(Object[].class);
            }
            return m60008of(genericArrayType.getGenericComponentType()).isSubtypeOf((Type) cls.getComponentType());
        } else if (this.runtimeType instanceof GenericArrayType) {
            return m60008of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        } else {
            return false;
        }
    }

    static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return m60008of(C18187h.m60103a(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            type = null;
        } else {
            type = toGenericType(cls.getEnclosingClass()).runtimeType;
        }
        if (typeParameters.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return m60008of((Type) C18187h.m60102a(type, cls, (Type[]) typeParameters));
        }
        return m60007of(cls);
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        boolean z;
        if (!(this.runtimeType instanceof TypeVariable)) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57976a(z, "Cannot get subtype of type variable <%s>", (Object) this);
        if (this.runtimeType instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) this.runtimeType).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        C17439m.m57977a(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", (Object) cls, (Object) this);
        return m60008of(resolveTypeArgsForSubclass(cls));
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        C17439m.m57977a(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", (Object) cls, (Object) this);
        if (this.runtimeType instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) this.runtimeType).getBounds());
        }
        if (this.runtimeType instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) this.runtimeType).getUpperBounds());
        }
        if (cls.isArray()) {
            return getArraySupertype(cls);
        }
        return resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final boolean isSubtypeOf(Type type) {
        C17439m.m57962a(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).mo46967b(this.runtimeType);
        }
        if (this.runtimeType instanceof WildcardType) {
            return any(((WildcardType) this.runtimeType).getUpperBounds()).mo46966a(type);
        }
        if (this.runtimeType instanceof TypeVariable) {
            if (this.runtimeType.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).mo46966a(type)) {
                return true;
            }
            return false;
        } else if (this.runtimeType instanceof GenericArrayType) {
            return m60008of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        } else {
            if (type instanceof Class) {
                return someRawTypeIsSubclassOf((Class) type);
            }
            if (type instanceof ParameterizedType) {
                return isSubtypeOfParameterizedType((ParameterizedType) type);
            }
            if (type instanceof GenericArrayType) {
                return isSubtypeOfArrayType((GenericArrayType) type);
            }
            return false;
        }
    }

    public final <X> TypeToken<T> where(C18177e<X> eVar, Class<X> cls) {
        return where(eVar, m60007of(cls));
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return m60008of(typeArr[0]).getSubtype(cls);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls);
        sb.append(" isn't a subclass of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type of : typeArr) {
            TypeToken of2 = m60008of(of);
            if (of2.isSubtypeOf((Type) cls)) {
                return of2.getSupertype(cls);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls);
        sb.append(" isn't a super type of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public final <X> TypeToken<T> where(C18177e<X> eVar, TypeToken<X> typeToken) {
        return new C18161d(new C18178f().mo46993a((Map<C18183c, ? extends Type>) ImmutableMap.m58577of(new C18183c(eVar.f49542a), typeToken.runtimeType)).mo46995b(this.runtimeType));
    }
}
