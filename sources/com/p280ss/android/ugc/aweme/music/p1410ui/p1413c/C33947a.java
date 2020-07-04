package com.p280ss.android.ugc.aweme.music.p1410ui.p1413c;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.music.p1410ui.api.MusicAwemeApi;
import com.p280ss.android.ugc.aweme.music.p1410ui.api.MusicAwemeApi.C33942a;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34013b;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.music.ui.c.a */
public final class C33947a extends C11789a<C33949b, List<? extends C34015d>, C33949b, C34013b> {

    /* renamed from: a */
    public static final C33948a f88578a = new C33948a(null);

    /* renamed from: b */
    private final MusicAwemeApi f88579b = C33942a.m109395a();

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c.a$a */
    public static final class C33948a {
        private C33948a() {
        }

        public /* synthetic */ C33948a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static C33949b m109399a(C33949b bVar) {
        C7573i.m23587b(bVar, "req");
        return bVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m109399a((C33949b) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C7492s<C34013b> mo29350a(C33949b bVar) {
        C7573i.m23587b(bVar, "req");
        return this.f88579b.queryRecommendMusicAwemeList(bVar.f88580a, bVar.f88581b, bVar.f88582c, bVar.f88583d);
    }

    /* renamed from: a */
    private static List<C34015d> m109400a(C33949b bVar, C34013b bVar2) {
        C7573i.m23587b(bVar, "req");
        C7573i.m23587b(bVar2, "resp");
        List<C34015d> list = bVar2.f88714c;
        if (list == null) {
            return C7525m.m23461a();
        }
        return list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m109400a((C33949b) obj, (C34013b) obj2);
    }
}
