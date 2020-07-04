package com.google.gson.internal;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.b */
public final class C6623b {

    /* renamed from: a */
    static final Type[] f18982a = new Type[0];

    /* renamed from: com.google.gson.internal.b$a */
    static final class C6624a implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f18983a;

        public final Type getGenericComponentType() {
            return this.f18983a;
        }

        public final int hashCode() {
            return this.f18983a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C6623b.m20552d(this.f18983a));
            sb.append("[]");
            return sb.toString();
        }

        public C6624a(Type type) {
            this.f18983a = C6623b.m20548b(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C6623b.m20547a((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    static final class C6625b implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f18984a;

        /* renamed from: b */
        private final Type f18985b;

        /* renamed from: c */
        private final Type[] f18986c;

        public final Type getOwnerType() {
            return this.f18984a;
        }

        public final Type getRawType() {
            return this.f18985b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f18986c.clone();
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f18986c) ^ this.f18985b.hashCode()) ^ C6623b.m20536a((Object) this.f18984a);
        }

        public final String toString() {
            int length = this.f18986c.length;
            if (length == 0) {
                return C6623b.m20552d(this.f18985b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C6623b.m20552d(this.f18985b));
            sb.append("<");
            sb.append(C6623b.m20552d(this.f18986c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C6623b.m20552d(this.f18986c[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C6623b.m20547a((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public C6625b(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C6619a.m20528a(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C6623b.m20548b(type);
            }
            this.f18984a = type3;
            this.f18985b = C6623b.m20548b(type2);
            this.f18986c = (Type[]) typeArr.clone();
            int length = this.f18986c.length;
            for (int i = 0; i < length; i++) {
                C6619a.m20527a(this.f18986c[i]);
                C6623b.m20554f(this.f18986c[i]);
                Type[] typeArr2 = this.f18986c;
                typeArr2[i] = C6623b.m20548b(typeArr2[i]);
            }
        }
    }

    /* renamed from: com.google.gson.internal.b$c */
    static final class C6626c implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f18987a;

        /* renamed from: b */
        private final Type f18988b;

        public final Type[] getLowerBounds() {
            if (this.f18988b == null) {
                return C6623b.f18982a;
            }
            return new Type[]{this.f18988b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f18987a};
        }

        public final int hashCode() {
            int i;
            if (this.f18988b != null) {
                i = this.f18988b.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f18987a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f18988b != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C6623b.m20552d(this.f18988b));
                return sb.toString();
            } else if (this.f18987a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C6623b.m20552d(this.f18987a));
                return sb2.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C6623b.m20547a((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public C6626c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C6619a.m20528a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C6619a.m20528a(z2);
            if (typeArr2.length == 1) {
                C6619a.m20527a(typeArr2[0]);
                C6623b.m20554f(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z3 = false;
                }
                C6619a.m20528a(z3);
                this.f18988b = C6623b.m20548b(typeArr2[0]);
                this.f18987a = Object.class;
                return;
            }
            C6619a.m20527a(typeArr[0]);
            C6623b.m20554f(typeArr[0]);
            this.f18988b = null;
            this.f18987a = C6623b.m20548b(typeArr[0]);
        }
    }

    /* renamed from: a */
    private static boolean m20546a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m20547a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (!m20546a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return false;
                }
                return true;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                GenericArrayType genericArrayType = (GenericArrayType) type2;
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = genericArrayType.getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    return false;
                }
                return true;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Type m20545a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = m20538a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m20542a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m20537a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    public static GenericArrayType m20539a(Type type) {
        return new C6624a(type);
    }

    /* renamed from: a */
    static int m20536a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: d */
    public static String m20552d(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: e */
    public static Type m20553e(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: f */
    static void m20554f(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        C6619a.m20528a(z);
    }

    /* renamed from: g */
    private static WildcardType m20555g(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C6626c(typeArr, f18982a);
    }

    /* renamed from: h */
    private static WildcardType m20556h(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C6626c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: a */
    private static Class<?> m20538a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m20548b(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m20548b(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.b$b r0 = new com.google.gson.internal.b$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.b$c r0 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C6623b.m20548b(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: c */
    public static Class<?> m20551c(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                C6619a.m20528a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m20551c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    if (type == null) {
                        str = TEVideoRecorder.FACE_BEAUTY_NULL;
                    } else {
                        str = type.getClass().getName();
                    }
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return (Class) type;
    }

    /* renamed from: a */
    private static int m20537a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public static Type[] m20550b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = m20549b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    public static Type m20541a(Type type, Class<?> cls) {
        Type b = m20549b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    private static Type m20549b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C6619a.m20528a(cls2.isAssignableFrom(cls));
        return m20543a(type, cls, m20542a(type, cls, cls2));
    }

    /* renamed from: a */
    public static ParameterizedType m20540a(Type type, Type type2, Type... typeArr) {
        return new C6625b(type, type2, typeArr);
    }

    /* renamed from: a */
    private static Type m20542a(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int i = 0;
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (interfaces[i] == cls2) {
                        return cls.getGenericInterfaces()[i];
                    } else {
                        if (cls2.isAssignableFrom(interfaces[i])) {
                            genericSuperclass = cls.getGenericInterfaces()[i];
                            superclass = interfaces[i];
                            break;
                        }
                        i++;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    /* renamed from: a */
    public static Type m20543a(Type type, Class<?> cls, Type type2) {
        return m20544a(type, cls, type2, new HashSet());
    }

    /* renamed from: a */
    private static Type m20544a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        boolean z;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m20545a(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class componentType = cls2.getComponentType();
                Type a = m20544a(type, cls, componentType, collection);
                if (componentType == a) {
                    return cls2;
                }
                return m20539a(a);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type a2 = m20544a(type, cls, genericComponentType, collection);
            if (genericComponentType == a2) {
                return genericArrayType;
            }
            return m20539a(a2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type a3 = m20544a(type, cls, ownerType, collection);
            if (a3 != ownerType) {
                z = true;
            } else {
                z = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type a4 = m20544a(type, cls, actualTypeArguments[i], collection);
                if (a4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = a4;
                }
            }
            if (z) {
                return m20540a(a3, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        } else if (!(type2 instanceof WildcardType)) {
            return type2;
        } else {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type a5 = m20544a(type, cls, lowerBounds[0], collection);
                if (a5 != lowerBounds[0]) {
                    return m20556h(a5);
                }
            } else if (upperBounds.length == 1) {
                Type a6 = m20544a(type, cls, upperBounds[0], collection);
                if (a6 != upperBounds[0]) {
                    return m20555g(a6);
                }
            }
            return wildcardType;
        }
    }
}
