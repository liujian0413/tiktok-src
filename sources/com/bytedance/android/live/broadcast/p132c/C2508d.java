package com.bytedance.android.live.broadcast.p132c;

import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.effect.C2616e.C2617a;
import com.bytedance.android.live.broadcast.effect.p135a.C2582a.C2584a;
import com.bytedance.android.live.broadcast.p124a.C2406a;
import com.bytedance.android.live.broadcast.p124a.C2407b.C2409b;
import com.bytedance.android.live.broadcast.p132c.C2503a.C2505a;
import com.bytedance.android.live.broadcast.p134e.C2564d;
import com.bytedance.android.live.broadcast.p134e.C2564d.C2565a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.broadcast.c.d */
public class C2508d {

    /* renamed from: a */
    private static volatile C2508d f8094a;

    /* renamed from: b */
    private final Map<Class<?>, C2510a<?>> f8095b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.live.broadcast.c.d$a */
    static final class C2510a<T> {

        /* renamed from: a */
        public C2511b<T> f8096a;

        /* renamed from: b */
        public C2512a<T> f8097b;

        /* renamed from: c */
        public Object f8098c;

        private C2510a(C2511b<T> bVar) {
            this.f8096a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.c.d$b */
    public interface C2511b<T> {

        /* renamed from: com.bytedance.android.live.broadcast.c.d$b$a */
        public static final class C2512a<R> {

            /* renamed from: a */
            public R f8099a;

            /* renamed from: b */
            boolean f8100b;

            private C2512a() {
            }

            /* renamed from: a */
            public final C2512a<R> mo9080a() {
                this.f8100b = true;
                return this;
            }

            /* renamed from: a */
            public final C2512a<R> mo9081a(R r) {
                this.f8099a = r;
                return this;
            }
        }

        /* renamed from: a */
        C2512a<T> mo8847a(C2512a<T> aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.c.d$c */
    public static final class C2513c {

        /* renamed from: a */
        private C2508d f8101a;

        private C2513c(C2508d dVar) {
            this.f8101a = dVar;
        }

        /* renamed from: a */
        public final <T> C2510a<T> mo9082a(Class<T> cls, C2511b<T> bVar) {
            return this.f8101a.mo9079a(cls, bVar);
        }
    }

    /* renamed from: a */
    private static C2508d m10403a() {
        if (f8094a == null) {
            synchronized (C2508d.class) {
                if (f8094a == null) {
                    f8094a = new C2508d();
                }
            }
        }
        return f8094a;
    }

    private C2508d() {
        mo9079a(C2421c.class, (C2511b<T>) new C2584a<T>());
        mo9079a(C2588b.class, (C2511b<T>) new C2617a<T>());
        mo9079a(C2506b.class, (C2511b<T>) new C2505a<T>());
        mo9079a(C2564d.class, (C2511b<T>) new C2565a<T>());
        mo9079a(C2406a.class, (C2511b<T>) new C2409b<T>());
        ((C2503a) m10408c(C2506b.class)).mo9073a(new C2513c());
    }

    /* renamed from: c */
    private <T> T m10408c(Class<T> cls) {
        return m10405a(cls, true);
    }

    /* renamed from: d */
    private <T> T m10409d(Class<T> cls) {
        return m10405a(cls, false);
    }

    /* renamed from: a */
    public static <T> T m10404a(Class<T> cls) {
        return m10403a().m10408c(cls);
    }

    /* renamed from: b */
    public static <T> T m10407b(Class<T> cls) {
        return m10403a().m10409d(cls);
    }

    /* renamed from: e */
    private <T> C2510a<T> m10410e(Class<T> cls) {
        return (C2510a) this.f8095b.get(cls);
    }

    /* renamed from: b */
    private <T> C2510a<T> m10406b(Class<T> cls, C2511b<T> bVar) {
        C2510a<T> aVar = new C2510a<>(bVar);
        aVar.f8097b = aVar.f8096a.mo8847a(new C2512a());
        aVar.f8098c = aVar.f8096a.mo8847a(aVar.f8097b).f8099a;
        this.f8095b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    public final <T> C2510a<T> mo9079a(Class<T> cls, C2511b<T> bVar) {
        C2510a<T> aVar = new C2510a<>(bVar);
        this.f8095b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C2512a m10402a(Class cls, C2512a aVar) {
        try {
            return aVar.mo9081a(cls.newInstance());
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
    private <T> T m10405a(Class<T> cls, boolean z) {
        C2510a e = m10410e(cls);
        if (e == null) {
            if (!z) {
                return null;
            }
            e = m10406b(cls, new C2514e(cls));
        }
        if (e.f8097b == null || !e.f8097b.f8100b) {
            e.f8097b = e.f8096a.mo8847a(new C2512a());
        }
        if (e.f8097b.f8100b) {
            if (e.f8098c == null) {
                synchronized (C2508d.class) {
                    if (e.f8098c == null) {
                        e.f8098c = e.f8097b.f8099a;
                    }
                }
            }
            return e.f8098c;
        }
        Object obj = e.f8097b.f8099a;
        e.f8097b = null;
        return obj;
    }
}
