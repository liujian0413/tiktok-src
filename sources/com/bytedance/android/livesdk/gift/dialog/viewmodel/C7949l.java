package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.C8149d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.l */
final /* synthetic */ class C7949l implements C7326g {

    /* renamed from: a */
    private final GiftViewModel f21519a;

    /* renamed from: b */
    private final long f21520b;

    /* renamed from: c */
    private final long f21521c;

    /* renamed from: d */
    private final long f21522d;

    /* renamed from: e */
    private final C8149d f21523e;

    /* renamed from: f */
    private final int f21524f;

    C7949l(GiftViewModel giftViewModel, long j, long j2, long j3, C8149d dVar, int i) {
        this.f21519a = giftViewModel;
        this.f21520b = j;
        this.f21521c = j2;
        this.f21522d = j3;
        this.f21523e = dVar;
        this.f21524f = i;
    }

    public final void accept(Object obj) {
        this.f21519a.mo20781a(this.f21520b, this.f21521c, this.f21522d, this.f21523e, this.f21524f, (C3479d) obj);
    }
}
