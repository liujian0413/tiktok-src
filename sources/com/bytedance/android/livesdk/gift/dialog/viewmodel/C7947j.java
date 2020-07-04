package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.model.Prop;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.j */
final /* synthetic */ class C7947j implements C7326g {

    /* renamed from: a */
    private final GiftViewModel f21515a;

    /* renamed from: b */
    private final Prop f21516b;

    /* renamed from: c */
    private final long f21517c;

    C7947j(GiftViewModel giftViewModel, Prop prop, long j) {
        this.f21515a = giftViewModel;
        this.f21516b = prop;
        this.f21517c = j;
    }

    public final void accept(Object obj) {
        this.f21515a.mo20787a(this.f21516b, this.f21517c, (Throwable) obj);
    }
}
