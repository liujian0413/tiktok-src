package com.p280ss.android.ugc.aweme.unlogin;

import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.unlogin.a */
public final class C42756a {

    /* renamed from: a */
    public final List<ContentLanguage> f111086a;

    /* renamed from: b */
    public final List<ContentLanguage> f111087b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f111087b, (java.lang.Object) r3.f111087b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.unlogin.C42756a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.unlogin.a r3 = (com.p280ss.android.ugc.aweme.unlogin.C42756a) r3
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage> r0 = r2.f111086a
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage> r1 = r3.f111086a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage> r0 = r2.f111087b
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage> r3 = r3.f111087b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.unlogin.C42756a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<ContentLanguage> list = this.f111086a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ContentLanguage> list2 = this.f111087b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentLanguageResult(selected=");
        sb.append(this.f111086a);
        sb.append(", unselect=");
        sb.append(this.f111087b);
        sb.append(")");
        return sb.toString();
    }

    public C42756a(List<? extends ContentLanguage> list, List<? extends ContentLanguage> list2) {
        this.f111086a = list;
        this.f111087b = list2;
    }
}
