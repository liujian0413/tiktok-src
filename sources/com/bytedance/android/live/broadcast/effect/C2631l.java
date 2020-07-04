package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.android.live.broadcast.effect.l */
final /* synthetic */ class C2631l implements C7328l {

    /* renamed from: a */
    static final C7328l f8435a = new C2631l();

    private C2631l() {
    }

    /* renamed from: a */
    public final boolean mo9283a(Object obj) {
        return ((FilterModel) obj).getEffect().getTags().contains("new");
    }
}
