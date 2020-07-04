package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.Prop;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.i */
final /* synthetic */ class C7946i implements C7326g {

    /* renamed from: a */
    private final GiftViewModel f21511a;

    /* renamed from: b */
    private final Prop f21512b;

    /* renamed from: c */
    private final long f21513c;

    /* renamed from: d */
    private final long f21514d;

    C7946i(GiftViewModel giftViewModel, Prop prop, long j, long j2) {
        this.f21511a = giftViewModel;
        this.f21512b = prop;
        this.f21513c = j;
        this.f21514d = j2;
    }

    public final void accept(Object obj) {
        this.f21511a.mo20786a(this.f21512b, this.f21513c, this.f21514d, (C3479d) obj);
    }
}
