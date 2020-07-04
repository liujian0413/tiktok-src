package com.facebook.imagepipeline.animated.p713b;

import android.net.Uri;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13308h;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p716c.C13570h;
import com.facebook.imagepipeline.p716c.C13570h.C13575c;
import com.facebook.imagepipeline.p720g.C13645c;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.facebook.imagepipeline.animated.b.c */
public final class C13530c {

    /* renamed from: a */
    public final C13265a f35877a;

    /* renamed from: b */
    private final C13570h<C13265a, C13645c> f35878b;

    /* renamed from: c */
    private final C13575c<C13265a> f35879c = new C13575c<C13265a>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33076a(C13265a aVar, boolean z) {
            C13530c.this.mo33073a(aVar, z);
        }
    };

    /* renamed from: d */
    private final LinkedHashSet<C13265a> f35880d = new LinkedHashSet<>();

    /* renamed from: com.facebook.imagepipeline.animated.b.c$a */
    static class C13533a implements C13265a {

        /* renamed from: a */
        private final C13265a f35884a;

        /* renamed from: b */
        private final int f35885b;

        /* renamed from: a */
        public final String mo32489a() {
            return null;
        }

        public final int hashCode() {
            return (this.f35884a.hashCode() * 1013) + this.f35885b;
        }

        public final String toString() {
            return C13303f.m38930a((Object) this).mo32569a("imageCacheKey", (Object) this.f35884a).mo32568a("frameIndex", this.f35885b).toString();
        }

        /* renamed from: a */
        public final boolean mo32490a(Uri uri) {
            return this.f35884a.mo32490a(uri);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C13533a)) {
                return false;
            }
            C13533a aVar = (C13533a) obj;
            if (this.f35885b != aVar.f35885b || !this.f35884a.equals(aVar.f35884a)) {
                return false;
            }
            return true;
        }

        public C13533a(C13265a aVar, int i) {
            this.f35884a = aVar;
            this.f35885b = i;
        }
    }

    /* renamed from: b */
    private synchronized C13265a m39803b() {
        C13265a aVar;
        aVar = null;
        Iterator it = this.f35880d.iterator();
        if (it.hasNext()) {
            aVar = (C13265a) it.next();
            it.remove();
        }
        return aVar;
    }

    /* renamed from: a */
    public final C13326a<C13645c> mo33070a() {
        C13326a<C13645c> b;
        do {
            C13265a b2 = m39803b();
            if (b2 == null) {
                return null;
            }
            b = this.f35878b.mo33134b(b2);
        } while (b == null);
        return b;
    }

    /* renamed from: d */
    private C13533a m39804d(int i) {
        return new C13533a(this.f35877a, i);
    }

    /* renamed from: a */
    public final C13326a<C13645c> mo33071a(int i) {
        return this.f35878b.mo33128a(m39804d(i));
    }

    /* renamed from: b */
    public final boolean mo33074b(int i) {
        return this.f35878b.mo33136c(m39804d(i));
    }

    /* renamed from: c */
    public final void mo33075c(final int i) {
        if (i != -1) {
            this.f35878b.mo33133b((C13308h<K>) new C13308h<C13265a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public boolean mo32572a(C13265a aVar) {
                    if (new C13533a(C13530c.this.f35877a, i).equals(aVar)) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public C13530c(C13265a aVar, C13570h<C13265a, C13645c> hVar) {
        this.f35877a = aVar;
        this.f35878b = hVar;
    }

    /* renamed from: a */
    public final C13326a<C13645c> mo33072a(int i, C13326a<C13645c> aVar) {
        return this.f35878b.mo33130a(m39804d(i), aVar, this.f35879c);
    }

    /* renamed from: a */
    public final synchronized void mo33073a(C13265a aVar, boolean z) {
        if (z) {
            this.f35880d.add(aVar);
        } else {
            this.f35880d.remove(aVar);
        }
    }
}
