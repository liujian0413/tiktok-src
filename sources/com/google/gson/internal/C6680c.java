package com.google.gson.internal;

import com.google.gson.C6608g;
import com.google.gson.JsonIOException;
import com.google.gson.internal.p278a.C6621b;
import com.google.gson.p277b.C6597a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.internal.c */
public final class C6680c {

    /* renamed from: a */
    private final Map<Type, C6608g<?>> f19127a;

    /* renamed from: b */
    private final C6621b f19128b = C6621b.m20530a();

    public final String toString() {
        return this.f19127a.toString();
    }

    public C6680c(Map<Type, C6608g<?>> map) {
        this.f19127a = map;
    }

    /* renamed from: a */
    private <T> C6697f<T> m20693a(Class<? super T> cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f19128b.mo16058a(declaredConstructor);
            }
            return new C6697f<T>() {
                /* renamed from: a */
                public final T mo16122a() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (InstantiationException e) {
                        StringBuilder sb = new StringBuilder("Failed to invoke ");
                        sb.append(declaredConstructor);
                        sb.append(" with no args");
                        throw new RuntimeException(sb.toString(), e);
                    } catch (InvocationTargetException e2) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke ");
                        sb2.append(declaredConstructor);
                        sb2.append(" with no args");
                        throw new RuntimeException(sb2.toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> C6697f<T> mo16120a(C6597a<T> aVar) {
        final Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        final C6608g gVar = (C6608g) this.f19127a.get(type);
        if (gVar != null) {
            return new C6697f<T>() {
                /* renamed from: a */
                public final T mo16122a() {
                    return gVar.mo15993a(type);
                }
            };
        }
        final C6608g gVar2 = (C6608g) this.f19127a.get(cls);
        if (gVar2 != null) {
            return new C6697f<T>() {
                /* renamed from: a */
                public final T mo16122a() {
                    return gVar2.mo15993a(type);
                }
            };
        }
        C6697f<T> a = m20693a(cls);
        if (a != null) {
            return a;
        }
        C6697f<T> a2 = m20694a(type, cls);
        if (a2 != null) {
            return a2;
        }
        return m20695b(type, cls);
    }

    /* renamed from: b */
    private <T> C6697f<T> m20695b(final Type type, final Class<? super T> cls) {
        return new C6697f<T>() {

            /* renamed from: d */
            private final C6703j f19145d = C6703j.m20728a();

            /* renamed from: a */
            public final T mo16122a() {
                try {
                    return this.f19145d.mo16131a(cls);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(type);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        };
    }

    /* renamed from: a */
    private <T> C6697f<T> m20694a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        return new TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        if (type instanceof ParameterizedType) {
                            Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type instanceof Class) {
                                return EnumSet.noneOf((Class) type);
                            }
                            StringBuilder sb = new StringBuilder("Invalid EnumSet type: ");
                            sb.append(type.toString());
                            throw new JsonIOException(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                        sb2.append(type.toString());
                        throw new JsonIOException(sb2.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        return new ArrayDeque();
                    }
                };
            }
            return new C6697f<T>() {
                /* renamed from: a */
                public final T mo16122a() {
                    return new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        return new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        return new ConcurrentHashMap();
                    }
                };
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        return new TreeMap();
                    }
                };
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C6597a.get(((ParameterizedType) type).getActualTypeArguments()[0]).rawType)) {
                return new C6697f<T>() {
                    /* renamed from: a */
                    public final T mo16122a() {
                        return new LinkedTreeMap();
                    }
                };
            }
            return new C6697f<T>() {
                /* renamed from: a */
                public final T mo16122a() {
                    return new LinkedHashMap();
                }
            };
        }
    }
}
