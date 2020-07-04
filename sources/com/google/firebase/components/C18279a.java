package com.google.firebase.components;

import com.google.android.gms.common.internal.C15267r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
public final class C18279a<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f49686a;

    /* renamed from: b */
    public final Set<C18285e> f49687b;

    /* renamed from: c */
    public final C18283c<T> f49688c;

    /* renamed from: d */
    public final Set<Class<?>> f49689d;

    /* renamed from: e */
    private final int f49690e;

    /* renamed from: com.google.firebase.components.a$a */
    public static class C18281a<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f49693a;

        /* renamed from: b */
        private final Set<C18285e> f49694b;

        /* renamed from: c */
        private int f49695c;

        /* renamed from: d */
        private C18283c<T> f49696d;

        /* renamed from: e */
        private Set<Class<?>> f49697e;

        /* renamed from: a */
        public final C18281a<T> mo47157a() {
            return m60277a(1);
        }

        /* renamed from: b */
        public final C18281a<T> mo47160b() {
            return m60277a(2);
        }

        /* renamed from: c */
        public final C18279a<T> mo47161c() {
            boolean z;
            if (this.f49696d != null) {
                z = true;
            } else {
                z = false;
            }
            C15267r.m44391a(z, (Object) "Missing required property: factory.");
            C18279a aVar = new C18279a(new HashSet(this.f49693a), new HashSet(this.f49694b), this.f49695c, this.f49696d, this.f49697e, 0);
            return aVar;
        }

        /* renamed from: a */
        private C18281a<T> m60277a(int i) {
            boolean z;
            if (this.f49695c == 0) {
                z = true;
            } else {
                z = false;
            }
            C15267r.m44391a(z, (Object) "Instantiation type has already been set.");
            this.f49695c = i;
            return this;
        }

        /* renamed from: a */
        public final C18281a<T> mo47158a(C18283c<T> cVar) {
            this.f49696d = (C18283c) C15267r.m44385a(cVar, (Object) "Null factory");
            return this;
        }

        /* renamed from: a */
        public final C18281a<T> mo47159a(C18285e eVar) {
            C15267r.m44385a(eVar, (Object) "Null dependency");
            C15267r.m44395b(!this.f49693a.contains(eVar.f49698a), "Components are not allowed to depend on interfaces they themselves provide.");
            this.f49694b.add(eVar);
            return this;
        }

        private C18281a(Class<T> cls, Class<? super T>... clsArr) {
            this.f49693a = new HashSet();
            this.f49694b = new HashSet();
            this.f49695c = 0;
            this.f49697e = new HashSet();
            C15267r.m44385a(cls, (Object) "Null interface");
            this.f49693a.add(cls);
            for (Class<? super T> a : clsArr) {
                C15267r.m44385a(a, (Object) "Null interface");
            }
            Collections.addAll(this.f49693a, clsArr);
        }

        /* synthetic */ C18281a(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m60269a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public final boolean mo47154b() {
        if (this.f49690e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo47153a() {
        if (this.f49690e == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f49686a.toArray()));
        sb.append(">{");
        sb.append(this.f49690e);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f49687b.toArray()));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> C18281a<T> m60266a(Class<T> cls) {
        return new C18281a<>(cls, new Class[0], 0);
    }

    /* renamed from: a */
    private static <T> C18281a<T> m60267a(Class<T> cls, Class<? super T>... clsArr) {
        return new C18281a<>(cls, clsArr, 0);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C18279a<T> m60268a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m60267a(cls, clsArr).mo47158a(C18287g.m60290a((Object) t)).mo47161c();
    }

    private C18279a(Set<Class<? super T>> set, Set<C18285e> set2, int i, C18283c<T> cVar, Set<Class<?>> set3) {
        this.f49686a = Collections.unmodifiableSet(set);
        this.f49687b = Collections.unmodifiableSet(set2);
        this.f49690e = i;
        this.f49688c = cVar;
        this.f49689d = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ C18279a(Set set, Set set2, int i, C18283c cVar, Set set3, byte b) {
        this(set, set2, i, cVar, set3);
    }
}
