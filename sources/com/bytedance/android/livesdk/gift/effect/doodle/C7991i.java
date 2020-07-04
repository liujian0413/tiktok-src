package com.bytedance.android.livesdk.gift.effect.doodle;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.i */
final /* synthetic */ class C7991i implements C7326g {

    /* renamed from: a */
    private final DoodleGiftDialogFragment f21673a;

    /* renamed from: b */
    private final C8169b f21674b;

    /* renamed from: c */
    private final long f21675c;

    C7991i(DoodleGiftDialogFragment doodleGiftDialogFragment, C8169b bVar, long j) {
        this.f21673a = doodleGiftDialogFragment;
        this.f21674b = bVar;
        this.f21675c = j;
    }

    public final void accept(Object obj) {
        this.f21673a.mo20848a(this.f21674b, this.f21675c, (C3479d) obj);
    }
}
