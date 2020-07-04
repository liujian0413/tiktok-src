package com.p280ss.android.ugc.aweme.services.sticker;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.p1634b.C41846a;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.StickerServiceImpl */
public final class StickerServiceImpl implements C41846a {
    public final boolean filterPinnedSticker(FragmentActivity fragmentActivity, Effect effect) {
        boolean z;
        C7573i.m23587b(fragmentActivity, "host");
        C7573i.m23587b(effect, "effect");
        C0063u a = C0069x.m159a(fragmentActivity).mo147a(EffectStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ho…kerViewModel::class.java)");
        ShortVideoContext d = ((EffectStickerViewModel) a).mo101285a().mo101195d();
        if (d == null || (!d.mo96142d() && !d.mo96144e())) {
            z = false;
        } else {
            z = true;
        }
        if (C40496bh.m129455d(effect) && z) {
            return false;
        }
        C22200c e = C35574k.m114859a().mo70073G().mo57092e();
        if (!C40496bh.m129470o(effect) || e == null || e.mo58567j()) {
            return true;
        }
        return false;
    }
}
