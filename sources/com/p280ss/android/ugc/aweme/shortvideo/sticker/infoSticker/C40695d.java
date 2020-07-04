package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.google.common.base.C17427g;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.d */
public final class C40695d implements C17427g<ProviderEffect, Effect> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m130138a((ProviderEffect) obj);
    }

    /* renamed from: a */
    public static Effect m130138a(ProviderEffect providerEffect) {
        Effect effect = new Effect();
        effect.setEffectId(providerEffect.f113502id);
        effect.setName(providerEffect.title);
        effect.setUnzipPath(providerEffect.path);
        effect.setEffectType(10);
        return effect;
    }
}
