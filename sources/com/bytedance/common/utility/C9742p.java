package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.p563c.C10769e;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings.GlobalTips;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.common.utility.p */
final class C9742p {
    /* renamed from: a */
    static void m28719a(Context context, int i) {
        if (context != null) {
            String str = null;
            if (C37562ao.m120324a().f97973d != null) {
                str = (String) GlobalTips.buildGlobalTipsMap(C37562ao.m120324a().f97973d).get(i);
            }
            if (TextUtils.isEmpty(str)) {
                str = context.getString(i);
            }
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                C10761a.m31410e(context, str).mo25750a();
            } else {
                C10769e.m31437b().mo25760a(context, str, 1).mo25761a();
            }
        }
    }

    /* renamed from: a */
    static void m28720a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
