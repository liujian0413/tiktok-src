package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.model.C8149d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.m */
final /* synthetic */ class C7950m implements C7326g {

    /* renamed from: a */
    private final GiftViewModel f21525a;

    /* renamed from: b */
    private final long f21526b;

    /* renamed from: c */
    private final long f21527c;

    /* renamed from: d */
    private final C8149d f21528d;

    /* renamed from: e */
    private final int f21529e;

    C7950m(GiftViewModel giftViewModel, long j, long j2, C8149d dVar, int i) {
        this.f21525a = giftViewModel;
        this.f21526b = j;
        this.f21527c = j2;
        this.f21528d = dVar;
        this.f21529e = i;
    }

    public final void accept(Object obj) {
        this.f21525a.mo20782a(this.f21526b, this.f21527c, this.f21528d, this.f21529e, (Throwable) obj);
    }
}
