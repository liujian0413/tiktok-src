package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40573c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder */
public class EffectGameViewHolder extends EffectStickerBaseViewHolder implements OnClickListener {
    /* renamed from: a */
    public final void mo100186a(Effect effect) {
        super.mo100186a(effect);
    }

    /* renamed from: b */
    public final void mo100188b(Effect effect) {
        super.mo100188b(effect);
        if (TextUtils.equals(effect.getEffectId(), mo100202b().f104908a.getEffectId())) {
            this.f104781f.mo100215a(effect, this.f104779d);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40573c.m129707a(this.f104778c, mo100202b().f104908a);
        if (mo100202b().f104910c != 2) {
            this.f104781f.f104787e.mo70631a(mo100202b().f104908a.getId(), mo100202b().f104908a.getTagsUpdatedAt(), C40567f.f105407a);
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
        if (TextUtils.equals(effect.getEffectId(), mo100202b().f104908a.getEffectId())) {
            C10761a.m31392b(this.f104778c, (int) R.string.az_, 0).mo25750a();
        }
    }

    public EffectGameViewHolder(View view, EffectStickerManager effectStickerManager, List<StickerWrapper> list) {
        super(view, effectStickerManager, list);
        view.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo100185a(StickerWrapper stickerWrapper, List<StickerWrapper> list, int i, boolean z) {
        if (stickerWrapper != null && !C6307b.m19566a((Collection<T>) list)) {
            mo100200a(StickerWrapper.m129062a(stickerWrapper, (C27481e) this.f104781f.f104787e));
            mo100201a(false);
            this.f104779d = i;
            mo100205c();
            if (mo100202b().f104908a.getIconUrl() != null && !C6311g.m19573a(mo100202b().f104908a.getIconUrl().getUrlList())) {
                this.f104777b.mo103499a((String) mo100202b().f104908a.getIconUrl().getUrlList().get(0));
            }
            this.f104781f.f104787e.mo70634a(mo100202b().f104908a.getId(), mo100202b().f104908a.getTags(), mo100202b().f104908a.getTagsUpdatedAt(), (C43765o) new C43765o() {
                /* renamed from: a */
                public final void mo9278a() {
                }

                /* renamed from: b */
                public final void mo9279b() {
                }
            });
            this.f104781f.f104788f = false;
            this.itemView.setContentDescription(stickerWrapper.f104908a.getName());
        }
    }
}
