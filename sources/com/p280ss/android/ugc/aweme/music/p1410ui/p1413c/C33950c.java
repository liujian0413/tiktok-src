package com.p280ss.android.ugc.aweme.music.p1410ui.p1413c;

import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34013b;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.music.ui.c.c */
public final class C33950c extends C11994b {

    /* renamed from: a */
    private C33947a f88584a = new C33947a();

    /* renamed from: a */
    private C7492s<C34013b> m109406a(String str, long j, int i, int i2) {
        C33947a aVar = this.f88584a;
        C33949b bVar = new C33949b(str, j, i, i2);
        C7492s<C34013b> a = aVar.mo29357c(bVar).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "mRecommendMusicAwemeList…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ C7492s m109405a(C33950c cVar, String str, long j, int i, int i2, int i3, Object obj) {
        int i4;
        int i5;
        if ((i3 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            i4 = 10;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            i5 = 1;
        } else {
            i5 = i2;
        }
        return cVar.m109406a(str, j2, i4, i5);
    }
}
