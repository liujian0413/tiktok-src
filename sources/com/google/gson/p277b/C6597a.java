package com.google.gson.p277b;

import com.google.gson.internal.C6619a;
import com.google.gson.internal.C6623b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.b.a */
public class C6597a<T> {
    final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return C6623b.m20552d(this.type);
    }

    protected C6597a() {
        this.type = getSuperclassTypeParameter(getClass());
        this.rawType = C6623b.m20551c(this.type);
        this.hashCode = this.type.hashCode();
    }

    public static <T> C6597a<T> get(Class<T> cls) {
        return new C6597a<>(cls);
    }

    public boolean isAssignableFrom(C6597a<?> aVar) {
        return isAssignableFrom(aVar.type);
    }

    public static C6597a<?> get(Type type2) {
        return new C6597a<>(type2);
    }

    public static C6597a<?> getArray(Type type2) {
        return new C6597a<>(C6623b.m20539a(type2));
    }

    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C6623b.m20548b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6597a) || !C6623b.m20547a(this.type, ((C6597a) obj).type)) {
            return false;
        }
        return true;
    }

    C6597a(Type type2) {
        this.type = C6623b.m20548b((Type) C6619a.m20527a(type2));
        this.rawType = C6623b.m20551c(this.type);
        this.hashCode = this.type.hashCode();
    }

    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        if (this.type instanceof Class) {
            return this.rawType.isAssignableFrom(C6623b.m20551c(type2));
        }
        if (this.type instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) this.type, new HashMap());
        }
        if (!(this.type instanceof GenericArrayType)) {
            throw buildUnexpectedTypeError(this.type, Class.class, ParameterizedType.class, GenericArrayType.class);
        } else if (!this.rawType.isAssignableFrom(C6623b.m20551c(type2)) || !isAssignableFrom(type2, (GenericArrayType) this.type)) {
            return false;
        } else {
            return true;
        }
    }

    public static C6597a<?> getParameterized(Type type2, Type... typeArr) {
        return new C6597a<>(C6623b.m20540a((Type) null, type2, typeArr));
    }

    private static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        } else if (type2 instanceof Class) {
            r1 = (Class) type2;
            while (r1.isArray()) {
                r1 = r1.getComponentType();
            }
            type2 = r1;
        }
        return isAssignableFrom(type2, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static AssertionError buildUnexpectedTypeError(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb.append(name.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    private static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        if (type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())))) {
            return true;
        }
        return false;
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        while (true) {
            if (type2 == null) {
                return false;
            }
            if (parameterizedType.equals(type2)) {
                return true;
            }
            Class c = C6623b.m20551c(type2);
            ParameterizedType parameterizedType2 = null;
            if (type2 instanceof ParameterizedType) {
                parameterizedType2 = (ParameterizedType) type2;
            }
            if (parameterizedType2 != null) {
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                TypeVariable[] typeParameters = c.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    Type type3 = actualTypeArguments[i];
                    TypeVariable typeVariable = typeParameters[i];
                    while (type3 instanceof TypeVariable) {
                        type3 = (Type) map.get(((TypeVariable) type3).getName());
                    }
                    map.put(typeVariable.getName(), type3);
                }
                if (typeEquals(parameterizedType2, parameterizedType, map)) {
                    return true;
                }
            }
            for (Type isAssignableFrom : c.getGenericInterfaces()) {
                if (isAssignableFrom(isAssignableFrom, parameterizedType, new HashMap(map))) {
                    return true;
                }
            }
            type2 = c.getGenericSuperclass();
            map = new HashMap<>(map);
        }
    }
}
