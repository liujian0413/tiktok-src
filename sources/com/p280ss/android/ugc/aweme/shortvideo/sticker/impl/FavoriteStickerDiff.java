package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.p029v7.util.C1143a.C1145a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerDiff */
public class FavoriteStickerDiff extends C1145a {

    /* renamed from: a */
    private Effect f105562a;

    /* renamed from: b */
    private List<StickerWrapper> f105563b;

    /* renamed from: c */
    private List<StickerWrapper> f105564c;

    /* renamed from: a */
    public final int mo248a() {
        return this.f105563b.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f105564c.size();
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        return ((StickerWrapper) this.f105563b.get(i)).f104908a.getEffectId().equals(((StickerWrapper) this.f105564c.get(i2)).f104908a.getEffectId());
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        if (this.f105562a == null || ((StickerWrapper) this.f105563b.get(i)).f104908a.getEffectId().equals(this.f105562a.getEffectId()) == ((StickerWrapper) this.f105564c.get(i2)).f104908a.getEffectId().equals(this.f105562a.getEffectId())) {
            return true;
        }
        return false;
    }

    public FavoriteStickerDiff(Effect effect, List<StickerWrapper> list, List<StickerWrapper> list2) {
        this.f105562a = effect;
        this.f105563b = list;
        this.f105564c = list2;
    }
}
