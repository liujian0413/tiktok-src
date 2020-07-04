package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.util.ae */
public final class C17350ae {
    /* renamed from: a */
    public static boolean m57784a(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /* renamed from: a */
    public static boolean m57785a(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    /* renamed from: a */
    public static Type m57782a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    /* renamed from: a */
    public static Type m57783a(List<Type> list, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = m57780a((Type) list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                if (type instanceof TypeVariable) {
                    Type a = m57783a(list, (TypeVariable) type);
                    if (a != null) {
                        return a;
                    }
                }
                return type;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Class<?> m57774a(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    /* renamed from: c */
    public static Type m57787c(Type type) {
        return m57781a(type, Iterable.class, 0);
    }

    /* renamed from: d */
    public static Type m57788d(Type type) {
        return m57781a(type, Map.class, 1);
    }

    /* renamed from: a */
    public static <T> T m57778a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw m57776a((Exception) e, cls);
        } catch (InstantiationException e2) {
            throw m57776a((Exception) e2, cls);
        }
    }

    /* renamed from: b */
    public static Type m57786b(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: a */
    public static <T> Iterable<T> m57777a(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class cls = obj.getClass();
        C17384w.m57852a(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return new Iterator<T>() {

                    /* renamed from: a */
                    final int f48264a = Array.getLength(obj);

                    /* renamed from: b */
                    int f48265b = 0;

                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }

                    public final boolean hasNext() {
                        if (this.f48265b < this.f48264a) {
                            return true;
                        }
                        return false;
                    }

                    public final T next() {
                        if (hasNext()) {
                            Object obj = obj;
                            int i = this.f48265b;
                            this.f48265b = i + 1;
                            return Array.get(obj, i);
                        }
                        throw new NoSuchElementException();
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static Class<?> m57775a(List<Type> list, Type type) {
        boolean z;
        if (type instanceof TypeVariable) {
            type = m57783a(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m57775a(list, m57786b(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m57774a((ParameterizedType) type);
        }
        if (type == null) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57852a(z, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    /* renamed from: a */
    private static IllegalArgumentException m57776a(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    /* renamed from: a */
    public static Object m57779a(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            Array.set(newInstance, i, obj);
            i = i2;
        }
        return newInstance;
    }

    /* renamed from: a */
    private static ParameterizedType m57780a(Type type, Class<?> cls) {
        Class<?> cls2;
        Type[] genericInterfaces;
        Class cls3;
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            while (type != null && type != Object.class) {
                if (type instanceof Class) {
                    cls2 = (Class) type;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Class<?> a = m57774a(parameterizedType);
                    if (a == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        for (Type type2 : a.getGenericInterfaces()) {
                            if (type2 instanceof Class) {
                                cls3 = (Class) type2;
                            } else {
                                cls3 = m57774a((ParameterizedType) type2);
                            }
                            if (cls.isAssignableFrom(cls3)) {
                                type = type2;
                                break;
                            }
                        }
                    }
                    cls2 = a;
                }
                type = cls2.getGenericSuperclass();
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Type m57781a(Type type, Class<?> cls, int i) {
        ParameterizedType a = m57780a(type, cls);
        if (a == null) {
            return null;
        }
        Type type2 = a.getActualTypeArguments()[i];
        if (type2 instanceof TypeVariable) {
            Type a2 = m57783a(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
            if (a2 != null) {
                return a2;
            }
        }
        return type2;
    }
}
