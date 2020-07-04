package com.bytedance.android.p109c.p112b;

import android.util.Base64;
import android.util.LruCache;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.c.b.i */
public final class C2307i {

    /* renamed from: a */
    public static final C2309a f7614a = new C2309a();

    /* renamed from: b */
    public static transient boolean f7615b = false;

    /* renamed from: com.bytedance.android.c.b.i$a */
    static final class C2309a {

        /* renamed from: a */
        private LruCache<String, C2289d> f7616a;

        /* renamed from: b */
        private String f7617b;

        /* renamed from: c */
        private int f7618c;

        private C2309a() {
            this.f7616a = new LruCache<String, C2289d>(8) {
                /* renamed from: a */
                private static void m9920a(boolean z, String str, C2289d dVar, C2289d dVar2) {
                    dVar.mo8102b();
                }

                /* access modifiers changed from: protected */
                public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
                    m9920a(z, (String) obj, (C2289d) obj2, (C2289d) obj3);
                }
            };
        }

        /* renamed from: a */
        public final void mo8118a(String str, int i) {
            this.f7617b = str;
            this.f7618c = i;
        }

        /* renamed from: a */
        public final C2289d mo8117a(String str, boolean z) {
            C2289d dVar = (C2289d) this.f7616a.get(str);
            if (dVar != null) {
                if (dVar.f7581b == z) {
                    return dVar;
                }
                dVar.mo8102b();
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f7617b);
                sb.append(File.separator);
                sb.append(new String(Base64.encode(str.getBytes(), 2)));
                dVar = new C2289d(sb.toString(), this.f7618c, z);
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder("Failed to create DataStore: ");
                sb2.append(str);
                C2286b.m9841a((Throwable) new IllegalStateException(sb2.toString(), e));
            }
            if (dVar == null) {
                return new C2289d();
            }
            this.f7616a.put(str, dVar);
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.c.b.i$b */
    public static final class C2311b {

        /* renamed from: a */
        private String f7620a;

        /* renamed from: b */
        private int f7621b;

        /* renamed from: c */
        private int f7622c;

        /* renamed from: d */
        private int f7623d;

        /* renamed from: e */
        private boolean f7624e;

        /* renamed from: f */
        private C2312a f7625f;

        /* renamed from: com.bytedance.android.c.b.i$b$a */
        public interface C2312a {
            /* renamed from: a */
            void mo8087a(int i, String str);

            /* renamed from: a */
            void mo8088a(int i, String str, Throwable th);
        }

        private C2311b() {
            this.f7621b = 64;
            this.f7622c = C2295h.f7585a;
            this.f7623d = C2295h.f7586b;
        }

        /* renamed from: a */
        public final void mo8123a() {
            boolean z;
            if (C2307i.f7615b) {
                C2286b.m9841a((Throwable) new IllegalStateException("SuperKV must not be initialized twice!"));
            }
            if (this.f7625f != null) {
                C2286b.f7577c = this.f7625f;
            }
            if (this.f7621b <= 0) {
                C2286b.m9841a((Throwable) new IllegalArgumentException("Cache capacity must > 128"));
            }
            if (this.f7622c <= 128) {
                C2286b.m9841a((Throwable) new IllegalArgumentException("Initial file size must > 128"));
            }
            File file = new File(this.f7620a);
            if (!file.exists()) {
                file.mkdir();
            }
            C2307i.f7614a.mo8118a(this.f7620a, this.f7621b);
            if (this.f7621b > 0) {
                z = true;
            } else {
                z = false;
            }
            C2289d.f7580a = z;
            C2286b.f7576b = this.f7624e;
            C2295h.f7585a = this.f7622c;
            C2295h.f7586b = this.f7623d;
            C2307i.f7615b = true;
        }

        /* renamed from: a */
        public final C2311b mo8120a(C2312a aVar) {
            this.f7625f = aVar;
            return this;
        }

        /* renamed from: a */
        public final C2311b mo8121a(String str) {
            this.f7620a = str;
            return this;
        }

        /* renamed from: a */
        public final C2311b mo8122a(boolean z) {
            this.f7624e = false;
            return this;
        }
    }

    /* renamed from: b */
    private static void m9917b() {
        if (!f7615b) {
            throw new IllegalStateException("SuperKV must be initialized before using.");
        }
    }

    /* renamed from: a */
    public static C2311b m9916a() {
        return new C2311b();
    }

    /* renamed from: a */
    public static C2291e m9914a(String str) {
        return m9915a(str, false);
    }

    /* renamed from: a */
    private static C2291e m9915a(String str, boolean z) {
        m9917b();
        return f7614a.mo8117a(str, false);
    }
}
