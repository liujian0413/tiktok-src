package com.facebook.imagepipeline.p716c;

import android.net.Uri;
import com.C1642a;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.C13334a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;

/* renamed from: com.facebook.imagepipeline.c.c */
public final class C13558c implements C13265a {

    /* renamed from: a */
    public final String f35932a;

    /* renamed from: b */
    public final Object f35933b;

    /* renamed from: c */
    public final long f35934c;

    /* renamed from: d */
    private final String f35935d;

    /* renamed from: e */
    private final C13596d f35936e;

    /* renamed from: f */
    private final C13597e f35937f;

    /* renamed from: g */
    private final C13594b f35938g;

    /* renamed from: h */
    private final C13265a f35939h;

    /* renamed from: i */
    private final int f35940i;

    /* renamed from: a */
    public final String mo32489a() {
        return this.f35935d;
    }

    public final int hashCode() {
        return this.f35940i;
    }

    public final String toString() {
        return C1642a.m8035a(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f35935d, this.f35936e, this.f35937f, this.f35938g, this.f35939h, this.f35932a, Integer.valueOf(this.f35940i)});
    }

    /* renamed from: a */
    public final boolean mo32490a(Uri uri) {
        return mo32489a().contains(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13558c)) {
            return false;
        }
        C13558c cVar = (C13558c) obj;
        if (this.f35940i != cVar.f35940i || !this.f35935d.equals(cVar.f35935d) || !C13303f.m38932a(this.f35936e, cVar.f35936e) || !C13303f.m38932a(this.f35937f, cVar.f35937f) || !C13303f.m38932a(this.f35938g, cVar.f35938g) || !C13303f.m38932a(this.f35939h, cVar.f35939h) || !C13303f.m38932a(this.f35932a, cVar.f35932a)) {
            return false;
        }
        return true;
    }

    public C13558c(String str, C13596d dVar, C13597e eVar, C13594b bVar, C13265a aVar, String str2, Object obj) {
        int i;
        this.f35935d = (String) C13307g.m38940a(str);
        this.f35936e = dVar;
        this.f35937f = eVar;
        this.f35938g = bVar;
        this.f35939h = aVar;
        this.f35932a = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        if (dVar != null) {
            i = dVar.hashCode();
        } else {
            i = 0;
        }
        this.f35940i = C13334a.m39027a((Object) valueOf, (Object) Integer.valueOf(i), (Object) Integer.valueOf(eVar.hashCode()), (Object) this.f35938g, (Object) this.f35939h, (Object) str2);
        this.f35933b = obj;
        this.f35934c = RealtimeSinceBootClock.get().now();
    }
}
