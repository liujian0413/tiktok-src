package com.bytedance.android.livesdk.gift.effect.doodle;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.m */
final /* synthetic */ class C7995m implements OnClickListener {

    /* renamed from: a */
    private final DoodleGiftViewHolder f21678a;

    /* renamed from: b */
    private final C8139f f21679b;

    C7995m(DoodleGiftViewHolder doodleGiftViewHolder, C8139f fVar) {
        this.f21678a = doodleGiftViewHolder;
        this.f21679b = fVar;
    }

    public final void onClick(View view) {
        this.f21678a.mo20868a(this.f21679b, view);
    }
}
