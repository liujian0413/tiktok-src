package com.facebook.cache.p683a;

import android.content.Context;
import com.facebook.cache.common.C13268d;
import com.facebook.cache.common.C13269e;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.internal.C13311k;
import com.facebook.common.p684a.C13273b;
import com.facebook.common.p684a.C13274c;
import java.io.File;

/* renamed from: com.facebook.cache.a.c */
public final class C13244c {

    /* renamed from: a */
    public final int f35081a;

    /* renamed from: b */
    public final String f35082b;

    /* renamed from: c */
    public final C13310j<File> f35083c;

    /* renamed from: d */
    public final long f35084d;

    /* renamed from: e */
    public final long f35085e;

    /* renamed from: f */
    public final long f35086f;

    /* renamed from: g */
    public final C13258h f35087g;

    /* renamed from: h */
    public final CacheErrorLogger f35088h;

    /* renamed from: i */
    public final CacheEventListener f35089i;

    /* renamed from: j */
    public final C13273b f35090j;

    /* renamed from: k */
    public final Context f35091k;

    /* renamed from: l */
    public final boolean f35092l;

    /* renamed from: com.facebook.cache.a.c$a */
    public static class C13246a {

        /* renamed from: a */
        public int f35093a;

        /* renamed from: b */
        public String f35094b;

        /* renamed from: c */
        public C13310j<File> f35095c;

        /* renamed from: d */
        public long f35096d;

        /* renamed from: e */
        public long f35097e;

        /* renamed from: f */
        public long f35098f;

        /* renamed from: g */
        public C13258h f35099g;

        /* renamed from: h */
        public CacheErrorLogger f35100h;

        /* renamed from: i */
        public CacheEventListener f35101i;

        /* renamed from: j */
        public C13273b f35102j;

        /* renamed from: k */
        public boolean f35103k;

        /* renamed from: l */
        public final Context f35104l;

        /* renamed from: a */
        public final C13244c mo32458a() {
            boolean z;
            if (this.f35095c == null && this.f35104l == null) {
                z = false;
            } else {
                z = true;
            }
            C13307g.m38948b(z, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f35095c == null && this.f35104l != null) {
                this.f35095c = new C13310j<File>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public File mo29879b() {
                        return C13246a.this.f35104l.getApplicationContext().getCacheDir();
                    }
                };
            }
            return new C13244c(this);
        }

        /* renamed from: a */
        public final C13246a mo32454a(long j) {
            this.f35096d = j;
            return this;
        }

        /* renamed from: a */
        public final C13246a mo32455a(C13273b bVar) {
            this.f35102j = bVar;
            return this;
        }

        /* renamed from: a */
        public final C13246a mo32456a(File file) {
            this.f35095c = C13311k.m38954a(file);
            return this;
        }

        /* renamed from: a */
        public final C13246a mo32457a(String str) {
            this.f35094b = str;
            return this;
        }

        private C13246a(Context context) {
            this.f35093a = 1;
            this.f35094b = "image_cache";
            this.f35096d = 41943040;
            this.f35097e = 10485760;
            this.f35098f = 2097152;
            this.f35099g = new C13242b();
            this.f35104l = context;
        }
    }

    /* renamed from: a */
    public static C13246a m38715a(Context context) {
        return new C13246a(context);
    }

    private C13244c(C13246a aVar) {
        CacheErrorLogger cacheErrorLogger;
        CacheEventListener cacheEventListener;
        C13273b bVar;
        this.f35081a = aVar.f35093a;
        this.f35082b = (String) C13307g.m38940a(aVar.f35094b);
        this.f35083c = (C13310j) C13307g.m38940a(aVar.f35095c);
        this.f35084d = aVar.f35096d;
        this.f35085e = aVar.f35097e;
        this.f35086f = aVar.f35098f;
        this.f35087g = (C13258h) C13307g.m38940a(aVar.f35099g);
        if (aVar.f35100h == null) {
            cacheErrorLogger = C13268d.m38807a();
        } else {
            cacheErrorLogger = aVar.f35100h;
        }
        this.f35088h = cacheErrorLogger;
        if (aVar.f35101i == null) {
            cacheEventListener = C13269e.m38808a();
        } else {
            cacheEventListener = aVar.f35101i;
        }
        this.f35089i = cacheEventListener;
        if (aVar.f35102j == null) {
            bVar = C13274c.m38814a();
        } else {
            bVar = aVar.f35102j;
        }
        this.f35090j = bVar;
        this.f35091k = aVar.f35104l;
        this.f35092l = aVar.f35103k;
    }
}
