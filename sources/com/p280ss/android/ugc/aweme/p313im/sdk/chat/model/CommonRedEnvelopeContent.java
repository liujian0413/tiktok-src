package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32026d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CommonRedEnvelopeContent */
public final class CommonRedEnvelopeContent extends BaseRedEnvelopeContent {
    public CommonRedEnvelopeContent() {
        String string = C6399b.m19921a().getString(R.string.brr);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…plan_common_red_envelope)");
        setRedEnvelopeTitle(string);
    }

    public final void tryInit() {
        String str;
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
        C32025c iMSetting = f.getIMSetting();
        C7573i.m23582a((Object) iMSetting, "AwemeImManager.instance().proxy.imSetting");
        C32026d dVar = iMSetting.f83742e;
        if (dVar == null || TextUtils.isEmpty(dVar.f83777w)) {
            str = C6399b.m19921a().getString(R.string.bsm);
        } else {
            str = dVar.f83777w;
        }
        this.msgHint = str;
    }
}
