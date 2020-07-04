package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41511a;
import com.p280ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a */
public final class C40361a {

    /* renamed from: a */
    private Context f104914a;

    /* renamed from: b */
    private Effect f104915b;

    /* renamed from: c */
    private LinearLayout f104916c;

    /* renamed from: d */
    private RemoteImageView f104917d;

    /* renamed from: e */
    private DmtTextView f104918e;

    /* renamed from: f */
    private DmtTextView f104919f;

    /* renamed from: g */
    private Map<String, CommerceSticker> f104920g = new HashMap();

    /* renamed from: a */
    private void m129083a(LinearLayout linearLayout) {
        this.f104916c = linearLayout;
        this.f104917d = (RemoteImageView) linearLayout.findViewById(R.id.a0f);
        this.f104918e = (DmtTextView) linearLayout.findViewById(R.id.a0e);
        this.f104919f = (DmtTextView) linearLayout.findViewById(R.id.a0h);
    }

    C40361a(LinearLayout linearLayout, Context context) {
        this.f104914a = context;
        m129083a(linearLayout);
    }

    /* renamed from: a */
    private void m129084a(CommerceSticker commerceSticker, boolean z) {
        if (commerceSticker == null) {
            this.f104916c.setVisibility(8);
            return;
        }
        C42962b.f111525a.mo104671a("show_toast", C22984d.m75611a().mo59973a("toast_type", "prop").mo59973a("prop_id", commerceSticker.getId()).mo59973a("enter_from", "video_shoot_page").f60753a);
        this.f104916c.setVisibility(0);
        UrlModel screenIcon = commerceSticker.getScreenIcon();
        if (screenIcon != null) {
            this.f104917d.setVisibility(0);
            C41511a.m132233a(this.f104917d, screenIcon);
        } else {
            this.f104917d.setVisibility(8);
        }
        this.f104918e.setText(commerceSticker.getScreenDesc());
        long expireTime = commerceSticker.getExpireTime();
        String format = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(1000 * expireTime));
        if (expireTime == 0 || TextUtils.isEmpty(format) || !z) {
            this.f104919f.setVisibility(8);
            return;
        }
        this.f104919f.setVisibility(0);
        this.f104919f.setText(this.f104914a.getString(R.string.crw, new Object[]{format}));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo100359a(Effect effect, int i) {
        if (effect == null || i == 0 || !effect.isBusiness()) {
            this.f104916c.setVisibility(8);
            return false;
        } else if (this.f104920g.containsKey(effect.getEffectId())) {
            m129084a((CommerceSticker) this.f104920g.get(effect.getEffectId()), C40496bh.m129465j(effect));
            return true;
        } else {
            this.f104915b = effect;
            String effectId = effect.getEffectId();
            C1592h.m7853a((Callable<TResult>) new C40473b<TResult>(effectId)).mo6876a((C1591g<TResult, TContinuationResult>) new C40503c<TResult,TContinuationResult>(this, effectId, effect), C1592h.f5958b);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo100358a(String str, Effect effect, C1592h hVar) throws Exception {
        if (!TextUtils.equals(this.f104915b.getEffectId(), str)) {
            return null;
        }
        if (hVar.mo6887c() || hVar.mo6889d()) {
            m129084a((CommerceSticker) this.f104920g.get(str), C40496bh.m129465j(effect));
            return null;
        }
        try {
            CommerceSticker commerceSticker = ((NewFaceStickerBean) ((NewFaceStickerListBean) hVar.mo6890e()).mStickers.get(0)).commerceSticker;
            this.f104920g.put(str, commerceSticker);
            m129084a(commerceSticker, C40496bh.m129465j(effect));
        } catch (Exception unused) {
        }
        return null;
    }
}
