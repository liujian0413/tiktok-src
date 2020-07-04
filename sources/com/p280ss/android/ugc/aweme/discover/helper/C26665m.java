package com.p280ss.android.ugc.aweme.discover.helper;

import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.m */
public final class C26665m {

    /* renamed from: a */
    public final String f70302a;

    /* renamed from: b */
    public final MusicModel f70303b;

    public C26665m() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f70303b, (java.lang.Object) r3.f70303b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.helper.C26665m
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.helper.m r3 = (com.p280ss.android.ugc.aweme.discover.helper.C26665m) r3
            java.lang.String r0 = r2.f70302a
            java.lang.String r1 = r3.f70302a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r2.f70303b
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r3.f70303b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.helper.C26665m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f70302a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MusicModel musicModel = this.f70303b;
        if (musicModel != null) {
            i = musicModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToVideoProgress(musicFilePath=");
        sb.append(this.f70302a);
        sb.append(", musicModel=");
        sb.append(this.f70303b);
        sb.append(")");
        return sb.toString();
    }

    public C26665m(String str, MusicModel musicModel) {
        this.f70302a = str;
        this.f70303b = musicModel;
    }

    private /* synthetic */ C26665m(String str, MusicModel musicModel, int i, C7571f fVar) {
        this(null, null);
    }
}
