package com.bytedance.ies.bullet.core.kit;

import android.net.Uri;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.r */
public final class C10397r {

    /* renamed from: a */
    public final Uri f28126a;

    /* renamed from: b */
    public final C10403b f28127b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f28127b, (java.lang.Object) r3.f28127b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.core.kit.C10397r
            if (r0 == 0) goto L_0x001d
            com.bytedance.ies.bullet.core.kit.r r3 = (com.bytedance.ies.bullet.core.kit.C10397r) r3
            android.net.Uri r0 = r2.f28126a
            android.net.Uri r1 = r3.f28126a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bytedance.ies.bullet.core.model.a.b r0 = r2.f28127b
            com.bytedance.ies.bullet.core.model.a.b r3 = r3.f28127b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.core.kit.C10397r.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Uri uri = this.f28126a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        C10403b bVar = this.f28127b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KitProcessUnit(uri=");
        sb.append(this.f28126a);
        sb.append(", providerFactory=");
        sb.append(this.f28127b);
        sb.append(")");
        return sb.toString();
    }

    public C10397r(Uri uri, C10403b bVar) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "providerFactory");
        this.f28126a = uri;
        this.f28127b = bVar;
    }
}
