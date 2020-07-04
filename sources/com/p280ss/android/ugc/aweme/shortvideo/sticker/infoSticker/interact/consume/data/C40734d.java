package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d */
public final class C40734d {

    /* renamed from: a */
    public List<User> f105909a;

    /* renamed from: b */
    public C40733c f105910b;

    /* renamed from: c */
    public List<User> f105911c;

    /* renamed from: d */
    public C40733c f105912d;

    public C40734d() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    public final void mo100952a(C40733c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.f105910b = cVar;
    }

    /* renamed from: b */
    public final void mo100953b(C40733c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.f105912d = cVar;
    }

    private C40734d(List<User> list, C40733c cVar, List<User> list2, C40733c cVar2) {
        C7573i.m23587b(cVar, "loadMoreParamsLeft");
        C7573i.m23587b(cVar2, "loadMoreParamsRight");
        this.f105909a = list;
        this.f105910b = cVar;
        this.f105911c = list2;
        this.f105912d = cVar2;
    }

    public /* synthetic */ C40734d(List list, C40733c cVar, List list2, C40733c cVar2, int i, C7571f fVar) {
        this(null, new C40733c(0, false), null, new C40733c(0, false));
    }
}
