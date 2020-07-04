package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ap */
final /* synthetic */ class C40391ap implements C0053p {

    /* renamed from: a */
    private final StickerModule f104984a;

    /* renamed from: b */
    private final Effect f104985b;

    C40391ap(StickerModule stickerModule, Effect effect) {
        this.f104984a = stickerModule;
        this.f104985b = effect;
    }

    public final void onChanged(Object obj) {
        this.f104984a.mo100289a(this.f104985b, (C40949u) obj);
    }
}
