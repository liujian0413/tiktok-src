package com.bytedance.android.livesdk.p428w;

import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.browser.p193c.C3982e.C3986c;
import com.bytedance.android.livesdk.browser.shorturl.C4222a;
import com.bytedance.android.livesdk.browser.shorturl.ShortUrlService.C4221a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5737c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5743h.C5745a;
import com.bytedance.android.livesdk.live.provider.C8402a;
import com.bytedance.android.livesdk.live.provider.C8402a.C8403a;
import com.bytedance.android.livesdk.live.provider.GsonProvider;
import com.bytedance.android.livesdk.p428w.C9162a.C9164a;
import com.bytedance.android.livesdk.p428w.C9179k.C9181a;
import com.bytedance.android.livesdk.p430x.C9278a.C9279a;
import com.bytedance.android.livesdk.schema.LiveActionHandlerImpl.C8920a;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdkapi.depend.live.C9338l;
import com.google.gson.C6600e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.w.h */
public class C9171h {

    /* renamed from: a */
    private static volatile C9171h f24889a;

    /* renamed from: b */
    private final Map<Class<?>, C9173a<?>> f24890b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.livesdk.w.h$a */
    static final class C9173a<T> {

        /* renamed from: a */
        public C9174b<T> f24891a;

        /* renamed from: b */
        public C9175a<T> f24892b;

        /* renamed from: c */
        public Object f24893c;

        private C9173a(C9174b<T> bVar) {
            this.f24891a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.w.h$b */
    public interface C9174b<T> {

        /* renamed from: com.bytedance.android.livesdk.w.h$b$a */
        public static final class C9175a<R> {

            /* renamed from: a */
            public volatile R f24894a;

            /* renamed from: b */
            volatile boolean f24895b;

            private C9175a() {
            }

            /* renamed from: a */
            public final C9175a<R> mo22387a() {
                this.f24895b = true;
                return this;
            }

            /* renamed from: a */
            public final C9175a<R> mo22388a(R r) {
                this.f24894a = r;
                return this;
            }
        }

        /* renamed from: a */
        C9175a<T> mo11528a(C9175a<T> aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.w.h$c */
    public static final class C9176c {

        /* renamed from: a */
        private C9171h f24896a;

        private C9176c(C9171h hVar) {
            this.f24896a = hVar;
        }

        /* renamed from: a */
        public final <T> C9173a<T> mo22389a(Class<T> cls, C9174b<T> bVar) {
            return this.f24896a.mo22386a(cls, bVar);
        }
    }

    /* renamed from: a */
    private static C9171h m27288a() {
        if (f24889a == null) {
            synchronized (C9171h.class) {
                if (f24889a == null) {
                    f24889a = new C9171h();
                }
            }
        }
        return f24889a;
    }

    private C9171h() {
        mo22386a(C6600e.class, (C9174b<T>) new GsonProvider<T>());
        mo22386a(C3972b.class, (C9174b<T>) new C3986c<T>());
        mo22386a(C4222a.class, (C9174b<T>) new C4221a<T>());
        mo22386a(C8402a.class, (C9174b<T>) new C8403a<T>());
        mo22386a(C5737c.class, (C9174b<T>) new C5745a<T>());
        mo22386a(C9338l.class, (C9174b<T>) new C9279a<T>());
        mo22386a(C8931a.class, (C9174b<T>) new C8920a<T>());
        mo22386a(C9170g.class, (C9174b<T>) new C9181a<T>());
        m27293c(C9170g.class);
        C9179k.m27313a(new C9176c());
        mo22386a(C9167d.class, (C9174b<T>) new C9164a<T>());
        ((C9162a) m27293c(C9167d.class)).mo22356a(new C9176c());
    }

    /* renamed from: c */
    private <T> T m27293c(Class<T> cls) {
        return m27290a(cls, true);
    }

    /* renamed from: d */
    private <T> T m27294d(Class<T> cls) {
        return m27290a(cls, false);
    }

    /* renamed from: a */
    public static <T> T m27289a(Class<T> cls) {
        return m27288a().m27293c(cls);
    }

    /* renamed from: b */
    public static <T> T m27292b(Class<T> cls) {
        return m27288a().m27294d(cls);
    }

    /* renamed from: e */
    private <T> C9173a<T> m27295e(Class<T> cls) {
        return (C9173a) this.f24890b.get(cls);
    }

    /* renamed from: b */
    private <T> C9173a<T> m27291b(Class<T> cls, C9174b<T> bVar) {
        C9173a<T> aVar = new C9173a<>(bVar);
        aVar.f24892b = aVar.f24891a.mo11528a(new C9175a());
        aVar.f24893c = aVar.f24891a.mo11528a(aVar.f24892b).f24894a;
        this.f24890b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    public final <T> C9173a<T> mo22386a(Class<T> cls, C9174b<T> bVar) {
        C9173a<T> aVar = new C9173a<>(bVar);
        this.f24890b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ C9175a m27287a(Class cls, C9175a aVar) {
        try {
            return aVar.mo22388a(cls.newInstance());
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
    private <T> T m27290a(Class<T> cls, boolean z) {
        C9173a e = m27295e(cls);
        if (e == null) {
            if (!z) {
                return null;
            }
            e = m27291b(cls, new C9177i(cls));
        }
        if (e.f24892b == null || !e.f24892b.f24895b) {
            e.f24892b = e.f24891a.mo11528a(new C9175a());
        }
        if (e.f24892b.f24895b) {
            if (e.f24893c == null) {
                synchronized (C9171h.class) {
                    if (e.f24893c == null) {
                        e.f24893c = e.f24892b.f24894a;
                    }
                }
            }
            return e.f24893c;
        }
        Object obj = e.f24892b.f24894a;
        e.f24892b = null;
        return obj;
    }
}
