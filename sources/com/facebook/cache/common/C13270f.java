package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.C13307g;

/* renamed from: com.facebook.cache.common.f */
public final class C13270f implements C13265a {

    /* renamed from: a */
    final String f35164a;

    /* renamed from: a */
    public final String mo32489a() {
        return this.f35164a;
    }

    public final String toString() {
        return this.f35164a;
    }

    public final int hashCode() {
        return this.f35164a.hashCode();
    }

    public C13270f(String str) {
        this.f35164a = (String) C13307g.m38940a(str);
    }

    /* renamed from: a */
    public final boolean mo32490a(Uri uri) {
        return this.f35164a.contains(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13270f)) {
            return false;
        }
        return this.f35164a.equals(((C13270f) obj).f35164a);
    }
}
