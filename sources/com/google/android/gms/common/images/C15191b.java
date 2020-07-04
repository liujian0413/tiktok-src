package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C15265q;

/* renamed from: com.google.android.gms.common.images.b */
final class C15191b {

    /* renamed from: a */
    public final Uri f39309a;

    public C15191b(Uri uri) {
        this.f39309a = uri;
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f39309a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15191b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C15265q.m44381a(((C15191b) obj).f39309a, this.f39309a);
    }
}
