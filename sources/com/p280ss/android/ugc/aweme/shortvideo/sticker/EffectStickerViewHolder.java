package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter.C40836b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40573c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.aweme.utils.C42937ar;
import com.p280ss.android.ugc.aweme.utils.C43058dj;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder */
public class EffectStickerViewHolder extends EffectStickerBaseViewHolder implements OnClickListener {

    /* renamed from: j */
    public C40836b f104815j;

    /* renamed from: e */
    private boolean m128909e() {
        if (this.f104781f.f104789g != 1 || !m128911g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m128910f() {
        return C40881d.m130626a(this.f104781f.mo100221b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo100242d() {
        if (this.f104780e.getParent() != null) {
            this.f104780e.performClick();
        }
    }

    /* renamed from: h */
    private boolean m128912h() {
        Effect effect = mo100202b().f104908a;
        if (effect == null || (effect.getEffectType() != 1 && !effect.getTags().contains("hw_beauty"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo100195a() {
        super.mo100195a();
        this.f104777b.mo103508c(false);
        if (this.f104781f != null) {
            this.f104781f.mo100225b(mo100202b().f104908a, this.f104779d, null);
        }
    }

    /* renamed from: g */
    private boolean m128911g() {
        Effect effect = (Effect) ((CurUseStickerViewModel) C0069x.m159a((FragmentActivity) this.f104778c).mo147a(CurUseStickerViewModel.class)).mo101274a().getValue();
        if (effect == null || mo100202b() == null || mo100202b().f104908a == null) {
            return false;
        }
        if (effect.equals(mo100202b().f104908a) || TextUtils.equals(effect.getParentId(), mo100202b().f104908a.getEffectId())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo100186a(Effect effect) {
        super.mo100186a(effect);
        mo100202b().f104913f = true;
    }

    /* renamed from: c */
    private void m128906c(boolean z) {
        this.f104781f.f104788f = false;
        if (z && this.f104781f.f104783a == null) {
            this.f104780e.post(new C40822k(this));
        }
    }

    /* renamed from: c */
    private boolean m128907c(StickerWrapper stickerWrapper) {
        boolean a = C42937ar.m136295a(C35574k.m114859a().mo70091f().mo93344c(Property.AutoApplySticker));
        boolean a2 = C40496bh.m129437a(stickerWrapper);
        boolean c = C40496bh.m129450c(stickerWrapper);
        if ((!a || m128909e() || m128910f()) && !a2 && !c) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m128908d(boolean z) {
        if (this.f104781f.f104788f && m128907c(mo100202b())) {
            C35574k.m114859a().mo70091f().mo93339a(Property.AutoApplySticker, System.currentTimeMillis());
            m128906c(z);
        }
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
                } else {
                    this.f104777b.mo103502a(false, 8388693);
                    this.f104781f.mo100225b(effect, this.f104779d, this.f104781f.mo100207a(this.f104782g, this.f104779d));
                }
            }
            int adapterPosition = getAdapterPosition();
            if (this.f104815j != null && -1 != adapterPosition) {
                this.f104815j.mo101107a(adapterPosition, true);
            }
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int adapterPosition = getAdapterPosition();
        if (-1 != adapterPosition) {
            if (this.f104815j != null) {
                this.f104815j.mo101107a(adapterPosition, false);
            }
            C40573c.m129707a(this.f104778c, mo100202b().f104908a);
            C43058dj.m136603a(mo100202b().f104908a);
            if (this.f104777b.mo103504a()) {
                mo100204b(false);
            }
            if (this.f104781f != null && mo100202b().f104910c != 2 && !C40496bh.m129455d(this.f104781f.f104783a)) {
                if (this.f104781f.mo100230c(mo100202b().f104908a)) {
                    this.f104781f.mo100224b(mo100202b().f104908a);
                    mo100201a(false);
                } else if (mo100202b().f104908a == null || mo100202b().f104908a.getEffectType() != 2) {
                    this.f104781f.f104787e.mo70631a(mo100202b().f104908a.getId(), mo100202b().f104908a.getTagsUpdatedAt(), C40821j.f106153a);
                    if (m128912h()) {
                        mo100202b().f104910c = 1;
                        this.f104777b.mo103509d();
                        mo100205c();
                        mo100201a(true);
                        this.f104781f.mo100225b(mo100202b().f104908a, this.f104779d, null);
                        return;
                    }
                    this.f104781f.mo100213a(mo100202b(), (C40951b) this);
                } else {
                    C40494bf.m129425a(mo100202b().f104908a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100187a(Effect effect, C43726c cVar) {
        super.mo100187a(effect, cVar);
        if (effect.getEffectId().equals(mo100202b().f104908a.getEffectId())) {
            C10761a.m31392b(this.f104778c, (int) R.string.az_, 0).mo25750a();
        }
    }

    public EffectStickerViewHolder(View view, EffectStickerManager effectStickerManager, List<StickerWrapper> list) {
        super(view, effectStickerManager, list);
        view.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo100241a(StickerWrapper stickerWrapper, List<StickerWrapper> list, int i, boolean z) {
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
            if (this.f104781f.mo100230c(stickerWrapper.f104908a)) {
                mo100201a(true);
            } else {
                mo100201a(false);
            }
            this.itemView.setContentDescription(stickerWrapper.f104908a.getName());
            m128908d(z);
        }
    }
}
