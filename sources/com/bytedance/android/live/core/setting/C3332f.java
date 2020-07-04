package com.bytedance.android.live.core.setting;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.LoginGuideConfig;
import com.bytedance.android.live.core.utils.C3358ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.core.setting.f */
public final class C3332f {
    /* renamed from: b */
    public static String m12428b() {
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) CoreSettingKeys.LOGIN_GUIDE.mo10240a();
        if (loginGuideConfig == null) {
            return null;
        }
        return loginGuideConfig.getImageUrlFromFollow();
    }

    /* renamed from: a */
    public static String m12427a() {
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) CoreSettingKeys.LOGIN_GUIDE.mo10240a();
        if (loginGuideConfig == null || TextUtils.isEmpty(loginGuideConfig.getFromFollow())) {
            return C3358ac.m12515a((int) R.string.eff);
        }
        return loginGuideConfig.getFromFollow();
    }
}
