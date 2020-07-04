package com.p280ss.android.ugc.aweme.shortvideo.guide;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.guide.C39990e.C39991a;
import com.p280ss.android.ugc.aweme.shortvideo.guide.p1576a.C39977a;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.guide.c */
public final class C39981c implements C39992f {
    private C39981c() {
    }

    /* renamed from: a */
    public static C39981c m127866a() {
        return new C39981c();
    }

    /* renamed from: a */
    public final C39990e mo99438a(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null) {
            return new C39991a();
        }
        ExtraParams extraParams = null;
        if (!TextUtils.isEmpty(faceStickerBean.getExtra())) {
            extraParams = (ExtraParams) C35574k.m114859a().mo70085S().mo15974a(faceStickerBean.getExtra(), ExtraParams.class);
        }
        if (extraParams != null && extraParams.isGifValid()) {
            return new C39982d(faceStickerBean);
        }
        if (faceStickerBean.getTags().contains("strong_beat")) {
            return new C39974a(faceStickerBean);
        }
        return new C39977a(faceStickerBean);
    }
}
