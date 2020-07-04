package com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.d */
public final class C34015d {
    @C6593c(mo15949a = "music_info")

    /* renamed from: a */
    public final Music f88717a;
    @C6593c(mo15949a = "aweme_list")

    /* renamed from: b */
    public final List<Aweme> f88718b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f88718b, (java.lang.Object) r3.f88718b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.music.ui.viewmodel.d r3 = (com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d) r3
            com.ss.android.ugc.aweme.music.model.Music r0 = r2.f88717a
            com.ss.android.ugc.aweme.music.model.Music r1 = r3.f88717a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r2.f88718b
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.f88718b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Music music = this.f88717a;
        int i = 0;
        int hashCode = (music != null ? music.hashCode() : 0) * 31;
        List<Aweme> list = this.f88718b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarMusicStruct(musicInfo=");
        sb.append(this.f88717a);
        sb.append(", awemeList=");
        sb.append(this.f88718b);
        sb.append(")");
        return sb.toString();
    }
}
