package com.p280ss.android.ugc.aweme.music.model;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCategory */
public final class MusicCategory {
    public final String categoryId;
    public final String categoryName;

    public MusicCategory() {
        this(null, null, 3, null);
    }

    public MusicCategory(String str) {
        this(str, null, 2, null);
    }

    public static /* synthetic */ MusicCategory copy$default(MusicCategory musicCategory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicCategory.categoryName;
        }
        if ((i & 2) != 0) {
            str2 = musicCategory.categoryId;
        }
        return musicCategory.copy(str, str2);
    }

    public final MusicCategory copy(String str, String str2) {
        return new MusicCategory(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.categoryId, (java.lang.Object) r3.categoryId) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.music.model.MusicCategory
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.music.model.MusicCategory r3 = (com.p280ss.android.ugc.aweme.music.model.MusicCategory) r3
            java.lang.String r0 = r2.categoryName
            java.lang.String r1 = r3.categoryName
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.categoryId
            java.lang.String r3 = r3.categoryId
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.music.model.MusicCategory.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.categoryName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.categoryId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicCategory(categoryName=");
        sb.append(this.categoryName);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(")");
        return sb.toString();
    }

    public MusicCategory(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }

    public /* synthetic */ MusicCategory(String str, String str2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        this(str, str2);
    }
}
