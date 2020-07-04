package com.bytedance.android.live.livepullstream.p165a;

import com.bytedance.android.live.room.C3483b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.livesdk.p224e.C5888a.C5890a;
import com.bytedance.android.livesdk.player.C8757b.C8760a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.livepullstream.a.b */
public class C3442b {

    /* renamed from: a */
    private static volatile C3442b f10253a;

    /* renamed from: b */
    private final Map<Class<?>, C3444a<?>> f10254b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.live.livepullstream.a.b$a */
    static final class C3444a<T> {

        /* renamed from: a */
        public C3445b<T> f10255a;

        /* renamed from: b */
        public C3446a<T> f10256b;

        /* renamed from: c */
        public Object f10257c;

        private C3444a(C3445b<T> bVar) {
            this.f10255a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.livepullstream.a.b$b */
    public interface C3445b<T> {

        /* renamed from: com.bytedance.android.live.livepullstream.a.b$b$a */
        public static final class C3446a<R> {

            /* renamed from: a */
            public R f10258a;

            /* renamed from: b */
            boolean f10259b;

            private C3446a() {
            }

            /* renamed from: a */
            public final C3446a<R> mo10426a() {
                this.f10259b = true;
                return this;
            }

            /* renamed from: a */
            public final C3446a<R> mo10427a(R r) {
                this.f10258a = r;
                return this;
            }
        }

        /* renamed from: a */
        C3446a<T> mo10425a(C3446a<T> aVar);
    }

    private C3442b() {
        m12756a(C3491h.class, (C3445b<T>) new C8760a<T>());
        m12756a(C3483b.class, (C3445b<T>) new C5890a<T>());
    }

    /* renamed from: a */
    private static C3442b m12758a() {
        if (f10253a == null) {
            synchronized (C3442b.class) {
                if (f10253a == null) {
                    f10253a = new C3442b();
                }
            }
        }
        return f10253a;
    }

    /* renamed from: b */
    private <T> T m12762b(Class<T> cls) {
        return m12760a(cls, true);
    }

    /* renamed from: c */
    private <T> C3444a<T> m12763c(Class<T> cls) {
        return (C3444a) this.f10254b.get(cls);
    }

    /* renamed from: a */
    public static <T> T m12759a(Class<T> cls) {
        return m12758a().m12762b(cls);
    }

    /* renamed from: a */
    private <T> C3444a<T> m12756a(Class<T> cls, C3445b<T> bVar) {
        C3444a<T> aVar = new C3444a<>(bVar);
        this.f10254b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: b */
    private <T> C3444a<T> m12761b(Class<T> cls, C3445b<T> bVar) {
        C3444a<T> aVar = new C3444a<>(bVar);
        aVar.f10256b = aVar.f10255a.mo10425a(new C3446a());
        aVar.f10257c = aVar.f10255a.mo10425a(aVar.f10256b).f10258a;
        this.f10254b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C3446a m12757a(Class cls, C3446a aVar) {
        try {
            return aVar.mo10427a(cls.newInstance());
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder("Requested class isn't registered in LiveImplProvider and its nullary constructor isn't accessible: ");
            sb.append(cls.getName());
            sb.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb.toString());
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder("Requested class isn't registered in LiveImplProvider and doesn't have public non-param constructor: ");
            sb2.append(cls.getName());
            sb2.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: a */
    private <T> T m12760a(Class<T> cls, boolean z) {
        C3444a c = m12763c(cls);
        if (c == null) {
            c = m12761b(cls, new C3447c(cls));
        }
        if (c.f10256b == null || !c.f10256b.f10259b) {
            c.f10256b = c.f10255a.mo10425a(new C3446a());
        }
        if (c.f10256b.f10259b) {
            if (c.f10257c == null) {
                synchronized (C3442b.class) {
                    if (c.f10257c == null) {
                        c.f10257c = c.f10256b.f10258a;
                    }
                }
            }
            return c.f10257c;
        }
        Object obj = c.f10256b.f10258a;
        c.f10256b = null;
        return obj;
    }
}
