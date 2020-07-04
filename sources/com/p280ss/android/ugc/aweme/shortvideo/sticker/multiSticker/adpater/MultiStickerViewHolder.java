package com.p280ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40494bf;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerBaseViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40573c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerViewHolder */
public class MultiStickerViewHolder extends EffectStickerBaseViewHolder implements OnClickListener {

    /* renamed from: j */
    private List<StickerWrapper> f106173j;

    /* renamed from: e */
    private void m130460e() {
        this.itemView.setOnClickListener(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo101092d() {
        if (this.f104780e != null && this.f104780e.getParent() != null) {
            this.f104780e.performClick();
        }
    }

    /* renamed from: f */
    private void m130461f() {
        if (mo100202b().f104908a != null && mo100202b().f104908a.getEffectType() == 2) {
            C40494bf.m129425a(mo100202b().f104908a);
        } else if (mo100202b().f104910c != 2) {
            this.f104781f.mo100213a(mo100202b(), (C40951b) this);
        }
    }

    /* renamed from: a */
    public final void mo100186a(Effect effect) {
        super.mo100186a(effect);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40573c.m129707a(this.f104778c, mo100202b().f104908a);
        m130461f();
    }

    /* renamed from: b */
    public final void mo100188b(Effect effect) {
        super.mo100188b(effect);
        if (effect.getEffectId().equals(mo100202b().f104908a.getEffectId())) {
            this.f104779d = getAdapterPosition();
            mo100201a(true);
            this.f104781f.mo100225b(effect, this.f104779d, this.f104781f.mo100220b(this.f106173j, this.f104779d));
        }
    }

    MultiStickerViewHolder(View view, EffectStickerManager effectStickerManager) {
        super(view, effectStickerManager, null);
        mo100199a(view);
        mo100198a(view.getContext());
        this.f104781f = effectStickerManager;
        m130460e();
    }

    /* renamed from: a */
    public final void mo100196a(Effect effect, int i) {
        if (TextUtils.equals(effect.getEffectId(), mo100202b().f104908a.getEffectId())) {
            mo100202b().f104910c = 5;
            this.f104777b.mo103494a(i);
            mo100205c();
        }
    }

    /* renamed from: a */
    public final void mo100187a(Effect effect, C43726c cVar) {
        super.mo100187a(effect, cVar);
        if (effect.getEffectId().equals(mo100202b().f104908a.getEffectId())) {
            C10761a.m31392b(this.f104778c, (int) R.string.az_, 0).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo101091a(StickerWrapper stickerWrapper, boolean z, List<StickerWrapper> list) {
        if (stickerWrapper != null) {
            this.f106173j = list;
            mo100200a(StickerWrapper.m129077b(stickerWrapper, (C27481e) this.f104781f.f104787e));
            mo100201a(false);
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
            if (z) {
                this.f104780e.post(new C40827a(this));
            }
        }
    }
}
