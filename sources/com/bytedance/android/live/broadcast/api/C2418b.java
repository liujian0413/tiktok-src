package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.api.b */
public final class C2418b {

    /* renamed from: a */
    public static final String f7950a;

    /* renamed from: b */
    public static final String f7951b = C3358ac.m12515a((int) R.string.eqj);

    /* renamed from: c */
    public static final String f7952c = C3358ac.m12515a((int) R.string.eql);

    /* renamed from: d */
    public static final String f7953d = C3358ac.m12515a((int) R.string.eqg);

    static {
        String str;
        if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo10240a()).booleanValue()) {
            str = C3358ac.m12515a((int) R.string.eqi);
        } else {
            str = C3358ac.m12515a((int) R.string.eqk);
        }
        f7950a = str;
    }
}
