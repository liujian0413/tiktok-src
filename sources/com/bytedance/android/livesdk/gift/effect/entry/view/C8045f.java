package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8028c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.f */
final /* synthetic */ class C8045f implements C7326g {

    /* renamed from: a */
    private final PortraitNobleEnterTrayView f21890a;

    /* renamed from: b */
    private final C8028c f21891b;

    C8045f(PortraitNobleEnterTrayView portraitNobleEnterTrayView, C8028c cVar) {
        this.f21890a = portraitNobleEnterTrayView;
        this.f21891b = cVar;
    }

    public final void accept(Object obj) {
        this.f21890a.mo20964a(this.f21891b, (Bitmap) obj);
    }
}
