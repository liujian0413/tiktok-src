package com.bytedance.android.live.core.setting;

import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.core.setting.k */
final /* synthetic */ class C3337k implements C7326g {

    /* renamed from: a */
    private final C33231 f10091a;

    C3337k(C33231 r1) {
        this.f10091a = r1;
    }

    public final void accept(Object obj) {
        this.f10091a.notifyItemChanged(((Integer) obj).intValue());
    }
}
