package com.facebook.common.references;

import com.facebook.common.internal.C13300b;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.common.references.a */
public final class C13326a<T> implements Closeable, Cloneable {

    /* renamed from: a */
    private static Class<C13326a> f35232a = C13326a.class;

    /* renamed from: d */
    private static final C13329c<Closeable> f35233d = new C13329c<Closeable>() {
        /* renamed from: a */
        private static void m39007a(Closeable closeable) {
            try {
                C13300b.m38926a(closeable, true);
            } catch (IOException unused) {
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo32582a(Object obj) {
            m39007a((Closeable) obj);
        }
    };

    /* renamed from: b */
    private boolean f35234b;

    /* renamed from: c */
    private final SharedReference<T> f35235c;

    /* renamed from: d */
    public final synchronized boolean mo32614d() {
        boolean z;
        if (!this.f35234b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized C13326a<T> clone() {
        C13307g.m38947b(mo32614d());
        return new C13326a<>(this.f35235c);
    }

    /* renamed from: c */
    public final synchronized C13326a<T> mo32611c() {
        if (!mo32614d()) {
            return null;
        }
        return clone();
    }

    public final void close() {
        synchronized (this) {
            if (!this.f35234b) {
                this.f35234b = true;
                this.f35235c.mo32608c();
            }
        }
    }

    /* renamed from: e */
    public final int mo32615e() {
        if (mo32614d()) {
            return System.identityHashCode(this.f35235c.mo32606a());
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f35234b) {
                    super.finalize();
                    return;
                }
                C13286a.m38851b(f35232a, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f35235c)), this.f35235c.mo32606a().getClass().getName());
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized T mo32609a() {
        C13307g.m38947b(!this.f35234b);
        return this.f35235c.mo32606a();
    }

    /* renamed from: c */
    public static void m39001c(C13326a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    private C13326a(SharedReference<T> sharedReference) {
        this.f35235c = (SharedReference) C13307g.m38940a(sharedReference);
        sharedReference.mo32607b();
    }

    /* renamed from: a */
    public static <T extends Closeable> C13326a<T> m38995a(T t) {
        if (t == null) {
            return null;
        }
        return new C13326a<>(t, f35233d);
    }

    /* renamed from: b */
    public static <T> C13326a<T> m39000b(C13326a<T> aVar) {
        if (aVar != null) {
            return aVar.mo32611c();
        }
        return null;
    }

    /* renamed from: a */
    public static <T> List<C13326a<T>> m38997a(Collection<C13326a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (C13326a b : collection) {
            arrayList.add(m39000b(b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m38998a(Iterable<? extends C13326a<?>> iterable) {
        if (iterable != null) {
            for (C13326a c : iterable) {
                m39001c(c);
            }
        }
    }

    /* renamed from: a */
    public static boolean m38999a(C13326a<?> aVar) {
        if (aVar == null || !aVar.mo32614d()) {
            return false;
        }
        return true;
    }

    private C13326a(T t, C13329c<T> cVar) {
        this.f35235c = new SharedReference<>(t, cVar);
    }

    /* renamed from: a */
    public static <T> C13326a<T> m38996a(T t, C13329c<T> cVar) {
        if (t == null) {
            return null;
        }
        return new C13326a<>(t, cVar);
    }
}
