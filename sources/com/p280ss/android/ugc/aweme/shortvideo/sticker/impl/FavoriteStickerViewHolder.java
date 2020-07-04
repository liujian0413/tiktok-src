package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerBaseViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40573c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerViewHolder */
public class FavoriteStickerViewHolder extends EffectStickerBaseViewHolder implements OnClickListener {
    /* renamed from: a */
    public final void mo100195a() {
        super.mo100195a();
        this.f104777b.mo103508c(false);
        if (this.f104781f != null) {
            this.f104781f.mo100225b(mo100202b().f104908a, this.f104779d, null);
        }
    }

    /* renamed from: a */
    public final void mo100186a(Effect effect) {
        super.mo100186a(effect);
        mo100202b().f104913f = true;
    }

    /* renamed from: b */
    public final void mo100188b(Effect effect) {
        super.mo100188b(effect);
        if (effect.getEffectId().equals(mo100202b().f104908a.getEffectId())) {
            mo100201a(true);
            if (this.f104781f != null) {
                if (EffectStickerManager.m128854a(mo100202b().f104908a, mo100202b())) {
                    this.f104777b.mo103502a(true, 8388693);
                    this.f104781f.mo100217a(mo100202b().f104908a, (C40951b) this);
                    mo100202b().f104913f = true;
                    return;
                }
                this.f104777b.mo103502a(false, 8388693);
                this.f104781f.mo100225b(effect, this.f104779d, this.f104781f.mo100207a(this.f104782g, this.f104779d));
            }
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40573c.m129707a(this.f104778c, mo100202b().f104908a);
        if (mo100202b().f104910c != 2 && this.f104781f != null) {
            if (this.f104781f.mo100230c(mo100202b().f104908a)) {
                this.f104781f.mo100224b(mo100202b().f104908a);
                mo100201a(false);
                return;
            }
            this.f104781f.f104787e.mo70631a(mo100202b().f104908a.getId(), mo100202b().f104908a.getTagsUpdatedAt(), (C43770t) new C43770t() {
                /* renamed from: a */
                public final void mo9402a() {
                }
            });
            if (mo100202b().f104908a == null || mo100202b().f104908a.getEffectType() != 1) {
                this.f104781f.mo100213a(mo100202b(), (C40951b) this);
                return;
            }
            mo100202b().f104910c = 1;
            this.f104777b.mo103509d();
            mo100205c();
            mo100201a(true);
            this.f104781f.mo100225b(mo100202b().f104908a, this.f104779d, null);
        }
    }

    /* renamed from: a */
    public final void mo100187a(Effect effect, C43726c cVar) {
        super.mo100187a(effect, cVar);
    }

    public FavoriteStickerViewHolder(EffectStickerManager effectStickerManager, View view, List<StickerWrapper> list) {
        super(view, effectStickerManager, list);
        view.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo100730a(StickerWrapper stickerWrapper, List<StickerWrapper> list, int i) {
        if (stickerWrapper != null && !C6307b.m19566a((Collection<T>) list)) {
            mo100200a(StickerWrapper.m129062a(stickerWrapper, (C27481e) this.f104781f.f104787e));
            mo100201a(false);
            this.f104779d = i;
            mo100205c();
            this.f104777b.mo103499a((String) mo100202b().f104908a.getIconUrl().getUrlList().get(0));
            this.f104781f.f104787e.mo70634a(mo100202b().f104908a.getId(), mo100202b().f104908a.getTags(), mo100202b().f104908a.getTagsUpdatedAt(), (C43765o) new C43765o() {
                /* renamed from: a */
                public final void mo9278a() {
                }

                /* renamed from: b */
                public final void mo9279b() {
                }
            });
            if (this.f104781f.mo100230c(stickerWrapper.f104908a)) {
                mo100201a(true);
            } else {
                mo100201a(false);
            }
        }
    }
}
