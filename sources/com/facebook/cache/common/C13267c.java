package com.facebook.cache.common;

import android.net.Uri;
import java.util.List;

/* renamed from: com.facebook.cache.common.c */
public final class C13267c implements C13265a {

    /* renamed from: a */
    public final List<C13265a> f35161a;

    public final int hashCode() {
        return this.f35161a.hashCode();
    }

    /* renamed from: a */
    public final String mo32489a() {
        return ((C13265a) this.f35161a.get(0)).mo32489a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiCacheKey:");
        sb.append(this.f35161a.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo32490a(Uri uri) {
        for (int i = 0; i < this.f35161a.size(); i++) {
            if (((C13265a) this.f35161a.get(i)).mo32490a(uri)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13267c)) {
            return false;
        }
        return this.f35161a.equals(((C13267c) obj).f35161a);
    }
}
