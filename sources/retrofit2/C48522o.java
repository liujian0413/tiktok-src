package retrofit2;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import okhttp3.ResponseBody;
import okio.Buffer;

/* renamed from: retrofit2.o */
final class C48522o {

    /* renamed from: a */
    static final Type[] f123720a = new Type[0];

    /* renamed from: retrofit2.o$a */
    static final class C48523a implements GenericArrayType {

        /* renamed from: a */
        private final Type f123721a;

        public final Type getGenericComponentType() {
            return this.f123721a;
        }

        public final int hashCode() {
            return this.f123721a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C48522o.m150316b(this.f123721a));
            sb.append("[]");
            return sb.toString();
        }

        C48523a(Type type) {
            this.f123721a = type;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C48522o.m150314a((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: retrofit2.o$b */
    static final class C48524b implements ParameterizedType {

        /* renamed from: a */
        private final Type f123722a;

        /* renamed from: b */
        private final Type f123723b;

        /* renamed from: c */
        private final Type[] f123724c;

        public final Type getOwnerType() {
            return this.f123722a;
        }

        public final Type getRawType() {
            return this.f123723b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f123724c.clone();
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f123724c) ^ this.f123723b.hashCode()) ^ C48522o.m150302a((Object) this.f123722a);
        }

        public final String toString() {
            if (this.f123724c.length == 0) {
                return C48522o.m150316b(this.f123723b);
            }
            StringBuilder sb = new StringBuilder((this.f123724c.length + 1) * 30);
            sb.append(C48522o.m150316b(this.f123723b));
            sb.append("<");
            sb.append(C48522o.m150316b(this.f123724c[0]));
            for (int i = 1; i < this.f123724c.length; i++) {
                sb.append(", ");
                sb.append(C48522o.m150316b(this.f123724c[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C48522o.m150314a((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        C48524b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                boolean z2 = true;
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Class) type2).getEnclosingClass() != null) {
                    z2 = false;
                }
                if (z != z2) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                C48522o.m150306a(type3, "typeArgument == null");
                C48522o.m150318c(type3);
            }
            this.f123722a = type;
            this.f123723b = type2;
            this.f123724c = (Type[]) typeArr.clone();
        }
    }

    /* renamed from: retrofit2.o$c */
    static final class C48525c implements WildcardType {

        /* renamed from: a */
        private final Type f123725a;

        /* renamed from: b */
        private final Type f123726b;

        public final Type[] getLowerBounds() {
            if (this.f123726b == null) {
                return C48522o.f123720a;
            }
            return new Type[]{this.f123726b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f123725a};
        }

        public final int hashCode() {
            int i;
            if (this.f123726b != null) {
                i = this.f123726b.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f123725a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f123726b != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C48522o.m150316b(this.f123726b));
                return sb.toString();
            } else if (this.f123725a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C48522o.m150316b(this.f123725a));
                return sb2.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C48522o.m150314a((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        C48525c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C48522o.m150318c(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f123726b = typeArr2[0];
                        this.f123725a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                C48522o.m150318c(typeArr[0]);
                this.f123726b = null;
                this.f123725a = typeArr[0];
            } else {
                throw new NullPointerException();
            }
        }
    }

    /* renamed from: a */
    static boolean m150314a(Type type, Type type2) {
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
                if (!m150313a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
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
    private static boolean m150313a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    private static Type m150310a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = m150305a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type b = m150317b(type, cls, a);
        if (!(b instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) b).getActualTypeArguments()[m150303a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    static boolean m150315a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static ResponseBody m150311a(ResponseBody responseBody) throws IOException {
        Buffer buffer = new Buffer();
        responseBody.source().readAll(buffer);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    /* renamed from: a */
    static <T> void m150312a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: a */
    static int m150302a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: b */
    static String m150316b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: c */
    static void m150318c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    static Type m150320e(Type type) {
        if (type instanceof ParameterizedType) {
            return m150307a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: a */
    private static Class<?> m150305a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    static Class<?> m150304a(Type type) {
        while (true) {
            m150306a((T) type, "type == null");
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m150304a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(type.getClass().getName());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    /* renamed from: d */
    static boolean m150319d(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type d : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (m150319d(d)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
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
        return false;
    }

    /* renamed from: a */
    private static int m150303a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    static <T> T m150306a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static Type m150307a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new IllegalArgumentException(sb.toString());
        }
        Type type = actualTypeArguments[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    /* renamed from: b */
    private static Type m150317b(Type type, Class<?> cls, Class<?> cls2) {
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
    static Type m150308a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m150309a(type, cls, m150317b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static Type m150309a(Type type, Class<?> cls, Type type2) {
        boolean z;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type a = m150310a(type, cls, typeVariable);
            if (a == typeVariable) {
                return a;
            }
            type2 = a;
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class componentType = cls2.getComponentType();
                Type a2 = m150309a(type, cls, (Type) componentType);
                if (componentType == a2) {
                    return cls2;
                }
                return new C48523a(a2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type a3 = m150309a(type, cls, genericComponentType);
            if (genericComponentType == a3) {
                return genericArrayType;
            }
            return new C48523a(a3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type a4 = m150309a(type, cls, ownerType);
            if (a4 != ownerType) {
                z = true;
            } else {
                z = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type a5 = m150309a(type, cls, actualTypeArguments[i]);
                if (a5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = a5;
                }
            }
            if (z) {
                return new C48524b(a4, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        } else if (!(type2 instanceof WildcardType)) {
            return type2;
        } else {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type a6 = m150309a(type, cls, lowerBounds[0]);
                if (a6 != lowerBounds[0]) {
                    return new C48525c(new Type[]{Object.class}, new Type[]{a6});
                }
            } else if (upperBounds.length == 1) {
                Type a7 = m150309a(type, cls, upperBounds[0]);
                if (a7 != upperBounds[0]) {
                    return new C48525c(new Type[]{a7}, f123720a);
                }
            }
            return wildcardType;
        }
    }
}
