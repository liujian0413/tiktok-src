package com.bytedance.android.livesdk.feed.services;

import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.network.GsonProvider;
import com.bytedance.android.livesdk.feed.p229d.C5971a;
import com.google.gson.C6600e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.feed.services.b */
public class C6115b {

    /* renamed from: a */
    private static volatile C6115b f18056a;

    /* renamed from: b */
    private final Map<Class<?>, C6117a<?>> f18057b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.livesdk.feed.services.b$a */
    static final class C6117a<T> {

        /* renamed from: a */
        public C6118b<T> f18058a;

        /* renamed from: b */
        public Object f18059b;

        private C6117a(C6118b<T> bVar) {
            this.f18058a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.services.b$b */
    public interface C6118b<T> {

        /* renamed from: com.bytedance.android.livesdk.feed.services.b$b$a */
        public static final class C6119a<R> {

            /* renamed from: a */
            public R f18060a;

            /* renamed from: b */
            boolean f18061b;

            private C6119a() {
            }

            /* renamed from: a */
            public final C6119a<R> mo14778a() {
                this.f18061b = true;
                return this;
            }

            /* renamed from: a */
            public final C6119a<R> mo14779a(R r) {
                this.f18060a = r;
                return this;
            }
        }

        /* renamed from: a */
        C6119a<T> mo14736a(C6119a<T> aVar);
    }

    /* renamed from: a */
    private static C6115b m19058a() {
        if (f18056a == null) {
            synchronized (C6115b.class) {
                if (f18056a == null) {
                    f18056a = new C6115b();
                }
            }
        }
        return f18056a;
    }

    private C6115b() {
        m19056a(C5980f.class, (C6118b<T>) new C6114a<T>());
        m19056a(C5971a.class, (C6118b<T>) new C6122e<T>());
        m19056a(C6600e.class, (C6118b<T>) new GsonProvider<T>());
    }

    /* renamed from: b */
    private <T> T m19061b(Class<T> cls) {
        return m19060a(cls, true);
    }

    /* renamed from: c */
    private <T> C6117a<T> m19062c(Class<T> cls) {
        return (C6117a) this.f18057b.get(cls);
    }

    /* renamed from: a */
    static <T> T m19059a(Class<T> cls) {
        return m19058a().m19061b(cls);
    }

    /* renamed from: a */
    private <T> C6117a<T> m19056a(Class<T> cls, C6118b<T> bVar) {
        C6117a<T> aVar = new C6117a<>(bVar);
        this.f18057b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C6119a m19057a(Class cls, C6119a aVar) {
        try {
            return aVar.mo14779a(cls.newInstance());
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder("Requested class isn't registered in FeedImplProvider and its nullary constructor isn't accessible: ");
            sb.append(cls.getName());
            sb.append(".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb.toString());
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder("Requested class isn't registered in FeedImplProvider and doesn't have public non-param constructor: ");
            sb2.append(cls.getName());
            sb2.append(".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: a */
    private <T> T m19060a(Class<T> cls, boolean z) {
        C6117a c = m19062c(cls);
        if (c == null) {
            c = m19056a(cls, (C6118b<T>) new C6120c<T>(cls));
        }
        C6119a a = c.f18058a.mo14736a(new C6119a());
        if (!a.f18061b) {
            return a.f18060a;
        }
        if (c.f18059b == null) {
            synchronized (C6115b.class) {
                if (c.f18059b == null) {
                    c.f18059b = a.f18060a;
                }
            }
        }
        return c.f18059b;
    }
}
