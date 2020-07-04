package com.bytedance.android.live.base.p123sp;

import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.base.sp.c */
final /* synthetic */ class C2386c implements C7326g {

    /* renamed from: a */
    static final C7326g f7875a = new C2386c();

    private C2386c() {
    }

    public final void accept(Object obj) {
        TTLiveSettingUtil.update.onNext((Boolean) obj);
    }
}
